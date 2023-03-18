import javax.swing.*;

public class Model {
    private Viewer viewer;

    private int[][] desktop;
    private int indexX;
    private int indexY;
    private int[][] arrayIndexes;
    private boolean isReady;
    private Levels levels;


    public Model(Viewer viewer) {
        this.viewer = viewer;
        isReady = true;
        levels = new Levels();
        desktop = levels.nextLevel();
        initialization();
    }

    public boolean isReady() {
        return isReady;
    }

    private void initialization() {
//        indexX = 2;
//        indexY = 2;

        int one = 0;
        int three = 0;
        int four = 0;

        for (int i = 0; i < desktop.length; i++) {
            for (int j = 0; j < desktop[i].length; j++) {
                if (desktop[i][j] == 1) {
                    one = one + 1;
                    indexX = i;
                    indexY = j;

                } else if (desktop[i][j] == 3) {
                    three = three + 1;
                } else if (desktop[i][j] == 4) {
                    four = four + 1;
                }
            }
        }
        if (one != 1) {
            isReady = false;
            return;
        }
        if (three == 0 && four == 0) {
            isReady = false;
            return;
        }
        if (three != four) {
            isReady = false;
            return;
        }

        arrayIndexes  = new int[2][four];
        int y = 0;
        for (int i = 0; i < desktop.length; i++) {
            for (int j = 0; j < desktop[i].length; j++) {
                if (desktop[i][j] == 4) {
                  arrayIndexes[0][y] = i;
                  arrayIndexes[1][y] = j;
                  y = y + 1;
                }
            }
        }


    }

    public void move(String direction) {

        switch (direction) {
            case "Left":
                moveLeft();
                break;
            case "Up":
                moveUp();
                break;
            case "Right":
                moveRight();
                break;
            case "Down":
                moveDown();
                break;
            default:
                return;
        }
        checkGoal();
        viewer.update();
        won();

    }

    private void won() {
        boolean isWon = true;
        for (int a = 0; a < arrayIndexes[0].length; a++) {
            int x = arrayIndexes[0][a];
            int y = arrayIndexes[1][a];
            if (desktop[x][y] != 3) {
                isWon = false;
                break;
            }
        }
        if (isWon) {
            javax.swing.JOptionPane.showMessageDialog(viewer.getFrame(),"You are win");
            desktop = levels.nextLevel();
            initialization();
            viewer.update();
        }
    }

    private void checkGoal() {
        for (int j = 0; j < arrayIndexes[0].length; j++) {
             int a = arrayIndexes[0][j];
             int b = arrayIndexes[1][j];
             if (desktop[a][b] == 0) {
                 desktop[a][b] = 4;
                 break;
            }
        }
    }

    private void moveLeft() {
        if(desktop[indexX][indexY - 1] == 3) {
            if (desktop[indexX][indexY - 2] == 0 || desktop[indexX][indexY - 2] == 4) {
                desktop[indexX][indexY - 1] = 0;
                desktop[indexX][indexY - 2] = 3;
            }
        }
        if (desktop[indexX][indexY - 1] == 0 || desktop[indexX][indexY - 1] == 4) {
            desktop[indexX][indexY] = 0;
            indexY = indexY - 1;
            desktop[indexX][indexY] = 1;
        }
    }
    private void moveUp() {
        if(desktop[indexX - 1][indexY] == 3) {
            if (desktop[indexX - 2][indexY] == 0 || desktop[indexX - 2][indexY] == 4) {
                desktop[indexX - 1][indexY] = 0;
                desktop[indexX - 2][indexY] = 3;
            }
        }
        if (desktop[indexX - 1][indexY] == 0 || desktop[indexX -1][indexY] == 4) {
            desktop[indexX][indexY] = 0;
            indexX = indexX - 1;
            desktop[indexX][indexY] = 1;
        }
    }
    private void moveRight() {
        if(desktop[indexX][indexY + 1] == 3) {
            if (desktop[indexX][indexY + 2] == 0 || desktop[indexX][indexY + 2] == 4) {
                desktop[indexX][indexY + 1] = 0;
                desktop[indexX][indexY + 2] = 3;
            }
        }
        if (desktop[indexX][indexY + 1] == 0 || desktop[indexX][indexY + 1] == 4) {
            desktop[indexX][indexY] = 0;
            indexY = indexY + 1;
            desktop[indexX][indexY] = 1;
        }
    }
    private void moveDown() {
        if(desktop[indexX + 1][indexY] == 3) {
            if (desktop[indexX + 2][indexY] == 0 || desktop[indexX + 2][indexY] == 4) {
                desktop[indexX + 1][indexY] = 0;
                desktop[indexX + 2][indexY] = 3;
            }
        }
        if (desktop[indexX + 1][indexY] == 0 || desktop[indexX + 1][indexY] == 4) {
            desktop[indexX][indexY] = 0;
            indexX = indexX + 1;
            desktop[indexX][indexY] = 1;
        }
    }

    public int[][] getDesktop() {
        return desktop;
    }

    public void printDesktop() {
        for (int i = 0; i < desktop.length; i++) {
            for (int j = 0; j < desktop[i].length; j++) {
                System.out.print(desktop[i][j] + "");
            }
            System.out.println();

        }
    }

}

