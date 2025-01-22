import java.util.Arrays;

public class Main {
    public static int boardSize = 8;
    static Figure[][] board = new Figure[boardSize][];
    public static int playerInfoSize = 10;
    static String [][] playerInfo = new String[playerInfoSize][];
    static String borderHorizontal[] = {"A","B","C","D","E","F","G","H"};
    static String borderVertical[] = {"1","2","3","4","5","6","7","8"};
    public static void main(String[] args) {
        createBoard(boardSize);
        showBoard(boardSize);

    }

        public static void createBoard(int size) {

            board[0] = new Figure[]{
                    new Figure(FigureColor.WHITE, FigureType.ROOK),
                    new Figure(FigureColor.WHITE, FigureType.HORSE),
                    new Figure(FigureColor.WHITE, FigureType.ELEPHANT),
                    new Figure(FigureColor.WHITE, FigureType.KING),
                    new Figure(FigureColor.WHITE, FigureType.QUEEN),
                    new Figure(FigureColor.WHITE, FigureType.ELEPHANT),
                    new Figure(FigureColor.WHITE, FigureType.HORSE),
                    new Figure(FigureColor.WHITE, FigureType.ROOK)
            };
            board[size - 1] = new Figure[]{
                    new Figure(FigureColor.BLACK, FigureType.ROOK),
                    new Figure(FigureColor.BLACK, FigureType.HORSE),
                    new Figure(FigureColor.BLACK, FigureType.ELEPHANT),
                    new Figure(FigureColor.BLACK, FigureType.KING),
                    new Figure(FigureColor.BLACK, FigureType.QUEEN),
                    new Figure(FigureColor.BLACK, FigureType.ELEPHANT),
                    new Figure(FigureColor.BLACK, FigureType.HORSE),
                    new Figure(FigureColor.BLACK, FigureType.ROOK)
            };
            board[1] = new Figure[size];
            board[size - 2] = new Figure[size];

            for (int i = 0; i < size; i++){
                board[1][i] = new Figure(FigureColor.WHITE, FigureType.PAWN);
                board[6][i] = new Figure(FigureColor.BLACK, FigureType.PAWN);
            }
            for (int i = 2; i < size - 2; i++){
                board[i] = new Figure[size];
            }
        }
        public static void showBoard(int size){
            for (int row = 0; row < size; row++) {
                for (int cell = 0; cell < size; cell++) {
                    Figure figure = board[row][cell];
                    System.out.print(figure == null ? "--" : figure);
                    System.out.print(cell < size - 1 ? " " : "\n");
                }
            }
        };

}

