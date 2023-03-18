public class Levels {
    private int level;

    public Levels() {
        level = 1;
    }

    public int[][] nextLevel() {
        int[][] desktop = null;
        switch (level) {
            case 1:
                desktop = getFirstLevel();
                break;
            case 2:
                desktop = getSecondLevel();
                break;
            case 3:
                desktop = getThirdLevel();
                break;
            case 4:
                desktop = getFourthLevel();
                break;
            case 5:
                desktop = getFifthLevel();
                break;
            case 6:
                desktop = getSixthLevel();
                break;
            case 7:
                desktop = getSeventh();
                break;
            case 8:
                desktop = getEighth();
                break;
            case 9:
                desktop = getNinth();
                break;
            case 10:
                desktop = getTenth();
                break;
            default:
                level = 1;
                desktop = getFirstLevel();
        }
        level = level + 1;
        return desktop;
    }

    private int[][] getFirstLevel() {
        int[][] array = new int[][]
                {
                        {6, 6, 2, 2, 2, 6, 6, 6, 6},
                        {6, 6, 2, 4, 2, 6, 6, 6, 6},
                        {6, 6, 2, 0, 2, 2, 2, 2, 6},
                        {2, 2, 2, 3, 1, 3, 4, 2, 6},
                        {2, 4, 0, 3, 0, 2, 2, 2, 6},
                        {2, 2, 2, 2, 3, 2, 6, 6, 6},
                        {6, 6, 6, 2, 4, 2, 6, 6, 6},
                        {6, 6, 6, 2, 2, 2, 6, 6, 6},
                };
        return array;
    }

    private int[][] getSecondLevel() {
        int[][] array = new int[][]
                {
                        {2, 2, 2, 2, 2, 6, 6, 6, 6},
                        {2, 0, 0, 0, 2, 6, 6, 6, 6},
                        {2, 0, 3, 1, 2, 6, 2, 2, 2},
                        {2, 0, 3, 3, 2, 6, 2, 4, 2},
                        {2, 2, 2, 0, 2, 2, 2, 4, 2},
                        {6, 2, 2, 0, 0, 0, 0, 4, 2},
                        {6, 2, 0, 0, 0, 2, 0, 0, 2},
                        {6, 2, 0, 0, 0, 2, 2, 2, 2},
                        {6, 2, 2, 2, 2, 2, 6, 6, 6},
                };
        return array;
    }

    private int[][] getThirdLevel() {
        int[][] array = new int[][]
                {
                        {6, 2, 2, 2, 2, 6},
                        {2, 2, 0, 0, 2, 6},
                        {2, 0, 1, 3, 2, 6},
                        {2, 2, 3, 0, 2, 2},
                        {2, 2, 0, 3, 0, 2},
                        {2, 4, 3, 0, 0, 2},
                        {2, 4, 4, 0, 4, 2},
                        {2, 2, 2, 2, 2, 2},
                };
        return array;
    }

    private int[][] getFourthLevel() {
        int[][] array = new int[][]
                {
                        {6, 6, 6, 6, 2, 2, 2, 2, 2, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6},
                        {6, 6, 6, 6, 2, 0, 0, 0, 2, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6},
                        {6, 6, 6, 6, 2, 3, 0, 0, 2, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6},
                        {6, 6, 2, 2, 2, 0, 0, 3, 2, 2, 6, 6, 6, 6, 6, 6, 6, 6, 6},
                        {6, 6, 2, 0, 0, 3, 0, 3, 0, 2, 6, 6, 6, 6, 6, 6, 6, 6, 6},
                        {2, 2, 2, 0, 2, 0, 2, 2, 0, 2, 6, 6, 6, 2, 2, 2, 2, 2, 2},
                        {2, 0, 0, 0, 2, 0, 2, 2, 0, 2, 2, 2, 2, 2, 0, 0, 4, 4, 2},
                        {2, 0, 3, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 2},
                        {2, 2, 2, 2, 2, 0, 2, 2, 2, 0, 2, 1, 2, 2, 0, 0, 4, 4, 2},
                        {6, 6, 6, 6, 2, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                        {6, 6, 6, 6, 2, 2, 2, 2, 2, 2, 2, 6, 6, 6, 6, 6, 6, 6, 6},
                };
        return array;
    }

    private int[][] getFifthLevel() {
        int[][] array = new int[][]
                {
                        {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                        {2, 1, 0, 0, 2, 2, 0, 0, 0, 0, 2, 2, 4, 4, 4, 4, 2},
                        {2, 0, 3, 0, 2, 2, 0, 3, 3, 0, 2, 2, 4, 3, 0, 4, 2},
                        {2, 0, 0, 3, 0, 3, 0, 0, 0, 3, 0, 0, 3, 0, 3, 4, 2},
                        {2, 0, 3, 0, 2, 2, 0, 3, 3, 0, 2, 2, 4, 3, 0, 4, 2},
                        {2, 0, 0, 0, 2, 2, 0, 0, 0, 0, 2, 2, 4, 4, 4, 4, 2},
                        {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                };
        return array;
    }

    private int[][] getSixthLevel() {
        int[][] array = new int[][]
                {
                        {2, 2, 2, 2, 2, 2, 2, 2, 2},
                        {2, 1, 0, 0, 2, 0, 0, 4, 2},
                        {2, 0, 3, 0, 2, 3, 3, 0, 2},
                        {2, 0, 0, 4, 0, 4, 0, 0, 2},
                        {2, 2, 2, 0, 2, 0, 2, 2, 2},
                        {2, 0, 0, 4, 0, 4, 0, 0, 2},
                        {2, 0, 3, 3, 2, 3, 3, 0, 2},
                        {2, 4, 0, 0, 2, 0, 0, 4, 2},
                        {2, 2, 2, 2, 2, 2, 2, 2, 2},
                };
        return array;
    }

    private int[][] getSeventh() {
        int[][] array = new int[][]
                {
                        {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 6, 6},
                        {2, 4, 4, 0, 0, 2, 0, 0, 0, 0, 0, 2, 2, 2},
                        {2, 4, 4, 0, 0, 2, 0, 3, 0, 0, 3, 0, 0, 2},
                        {2, 4, 4, 0, 0, 2, 3, 2, 2, 2, 2, 0, 0, 2},
                        {2, 4, 4, 0, 0, 0, 0, 1, 0, 2, 2, 0, 0, 2},
                        {2, 4, 4, 0, 0, 2, 0, 2, 0, 0, 3, 0, 2, 2},
                        {2, 2, 2, 2, 2, 2, 0, 2, 2, 3, 0, 3, 0, 2},
                        {6, 6, 2, 0, 3, 0, 0, 3, 0, 3, 0, 3, 0, 2},
                        {6, 6, 2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2},
                        {6, 6, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                };
        return array;

    }

    private int[][] getEighth() {
        int[][] array = new int[][]
                {
                        {6, 6, 6, 6, 6, 6, 6, 6, 2, 2, 2, 2, 2, 2, 2, 2, 6},
                        {6, 6, 6, 6, 6, 6, 6, 6, 2, 0, 0, 0, 1, 0, 0, 2, 6},
                        {6, 6, 6, 6, 6, 6, 6, 6, 2, 0, 3, 2, 3, 0, 2, 2, 6},
                        {6, 6, 6, 6, 6, 6, 6, 6, 2, 0, 3, 0, 0, 3, 2, 6, 6},
                        {6, 6, 6, 6, 6, 6, 6, 6, 2, 2, 3, 0, 3, 0, 2, 6, 6},
                        {2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 3, 0, 2, 0, 2, 2, 2},
                        {2, 4, 4, 4, 4, 0, 0, 2, 2, 0, 3, 0, 0, 3, 0, 0, 2},
                        {2, 2, 4, 4, 4, 0, 0, 0, 0, 3, 0, 0, 3, 0, 0, 0, 2},
                        {2, 4, 4, 4, 4, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                        {2, 2, 2, 2, 2, 2, 2, 2, 6, 6, 6, 6, 6, 6, 6, 6, 6},
                };
        return array;
    }

    private int[][] getNinth() {
        int[][] array = new int[][]
                {
                        {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 2, 2, 2, 2, 2, 2, 2, 2},
                        {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 2, 0, 0, 4, 4, 4, 4, 2},
                        {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 4, 4, 4, 4, 2},
                        {2, 0, 0, 0, 0, 2, 0, 0, 3, 0, 3, 0, 0, 0, 4, 4, 4, 4, 2},
                        {2, 0, 3, 3, 3, 2, 3, 0, 0, 3, 0, 2, 0, 0, 4, 4, 4, 4, 2},
                        {2, 0, 0, 3, 0, 0, 0, 0, 0, 3, 0, 2, 0, 0, 4, 4, 4, 4, 2},
                        {2, 0, 3, 3, 0, 2, 3, 0, 3, 0, 3, 2, 2, 2, 2, 2, 2, 2, 2},
                        {2, 0, 0, 3, 0, 2, 0, 0, 0, 0, 0, 2, 6, 6, 6, 6, 6, 6, 6},
                        {2, 2, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 6, 6, 6, 6, 6, 6, 6},
                        {2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 2, 6, 6, 6, 6, 6, 6, 6, 6},
                        {2, 0, 0, 0, 0, 0, 3, 0, 0, 0, 2, 2, 6, 6, 6, 6, 6, 6, 6},
                        {2, 0, 0, 3, 3, 2, 3, 3, 0, 0, 1, 2, 6, 6, 6, 6, 6, 6, 6},
                        {2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 2, 2, 6, 6, 6, 6, 6, 6, 6},
                        {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 6, 6, 6, 6, 6, 6, 6, 6},
                };
        return array;
    }

    private int [][] getTenth() {
        int[][] array = new int[][]
                {
                        {6, 6, 6, 6, 6, 6, 6, 6, 2, 2, 2, 2, 2, 6, 6, 6, 6},
                        {6, 6, 6, 6, 6, 6, 6, 6, 2, 0, 0, 0, 2, 2, 2, 2, 2},
                        {6, 6, 6, 6, 6, 6, 6, 6, 2, 0, 2, 3, 2, 2, 0, 0, 2},
                        {6, 6, 6, 6, 6, 6, 6, 6, 2, 0, 0, 0, 0, 0, 3, 0, 2},
                        {2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 2, 2, 2, 0, 0, 0, 2},
                        {2, 4, 4, 4, 4, 0, 0, 2, 2, 0, 3, 0, 0, 3, 2, 2, 2},
                        {2, 4, 4, 4, 4, 0, 0, 0, 0, 3, 0, 3, 3, 0, 2, 2, 6},
                        {2, 4, 4, 4, 4, 0, 0, 2, 2, 3, 0, 0, 3, 0, 1, 2, 6},
                        {2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 3, 0, 0, 2, 2, 6},
                        {6, 6, 6, 6, 6, 6, 6, 6, 2, 0, 3, 0, 3, 0, 0, 2, 6},
                        {6, 6, 6, 6, 6, 6, 6, 6, 2, 2, 2, 0, 2, 2, 0, 2, 6},
                        {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 2, 0, 0, 0, 0, 2, 6},
                        {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 2, 2, 2, 2, 2, 2, 6},
                };
        return array;
    }

    /////////////////////////////////

    //  For read from a file


//   Exmple   private int[][] getSixthLevel() {
//            String text = readLevelFromFile("levels/level3.sok");
//            int[][] desktop = getDesktopFromString(text);
//            return desktop;
//        }
//        private static String readLevelFromFile(String fileName) {
//            String textFromFile = "";
//            try {
//                FileInputStream in =
//                        new FileInputStream(fileName);
//                int unicode;
//                while ((unicode = in.read()) != -1) {
//                    char symbol = (char) unicode;
//                    if (('0' <= symbol && symbol <= '9')
//                            || (symbol == '\n')) {
//                        textFromFile = textFromFile + symbol;
//                    }
//                }// while
//            } catch (FileNotFoundException fne) {
//                System.out.println("Hey, Error!!! " + fne);
//            } catch (IOException ioe) {
//                System.out.println("Hey, Error!!! " + ioe);
//            }
//            return textFromFile;
//        }
//        private static int[][] getDesktopFromString(String text) {
//            int row = 1;
//            for (int i = 0; i < text.length(); i++) {
//                char element = text.charAt(i);
//                if (element == '\n') {
//                    row = row + 1;
//                }
//            }
//            int[][] desktop = new int[row][];
//
//            int column = 0;
//            int a = 0;
//            for (int i = 0; i < text.length(); i++) {
//                char element = text.charAt(i);
//                if (element == '\n') {
//                    desktop[a] = new int[column];
//                    a = a + 1;
//                    column = 0;
//                } else {
//                    column = column + 1;
//                }
//                if (i == text.length() - 1) {
//                    desktop[a] = new int[column];
//                }
//            }
}
