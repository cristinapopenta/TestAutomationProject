package Homework.Homework03;

public class Draw {
        public static void main(String[] args) {
            if (args.length == 1) {
                printShapeName("FULL Square: ");
                drawFullShape(Integer.parseInt(args[0]));

                printShapeName("Empty SQUARE");
                drawShapeOutline(Integer.parseInt(args[0]));

                printShapeName("Corner SQUARE");
                drawShapeCorners(Integer.parseInt(args[0]));


            } else if (args.length == 2) {
                printShapeName("FULL Rectangle: ");
                drawFullShape(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

                printShapeName("Empty RECTANGLE");
                drawShapeOutline(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

                printShapeName("Corner RECTANGLE");
                drawShapeCorners(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            } else {
                System.out.println("Please add 1 or 2 arguments only");
            }
            System.out.println();
            System.out.println("-------------------");
            System.out.println();

        }

        private static void drawShapeOutline(int width, int height) {
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    if (i == 0 || i == (width - 1) || j == 0 || j == (height - 1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

    private static void drawShapeOutline(int squareSide) {
        drawShapeOutline(squareSide,squareSide);
    }
    private static void drawShapeCorners(int width, int height) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (
                        ((i == 0) && (j==0)) || ((i == 0) && (j==height-1)) ||
                        ((i == width-1) && (j==0)) || ((i == width-1) && (j==height-1))
                    ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void drawShapeCorners(int squareSide) {
        drawShapeCorners(squareSide,squareSide);

    }

        private static void drawFullShape(int squareSide) {
            drawFullShape(squareSide, squareSide);
        }

        private static void drawFullShape(int width, int height) {
            for (int i = 0; i < width; i++) {
                printEntireLine(height);
                System.out.println();
            }

        }

        private static void printShapeName(String shapeName) {
            System.out.println();
            System.out.println(shapeName);
            System.out.println();
        }

        private static void printEntireLine(int numarColoane) {
            for (int j = 0; j < numarColoane; j++) {
                System.out.print("* ");
            }
        }

}
