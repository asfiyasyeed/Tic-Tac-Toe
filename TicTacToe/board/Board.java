package TicTacToe.board;

public class Board { private int size;
    private char matrix[][];

    public Board(int size, char deafulSymbol) {
        this.setSize(size);
        setMatrix(new char [size][size]);

        for(int i=0;i<size;i++) {
            for(int j=0;j<size; j++) {
                getMatrix()[i][j] = deafulSymbol;
            }
        }

        
    }

    public char[][] getMatrix() {
        return matrix;
        
    }

    public void setMatrix(char matrix[][]) {
        this.matrix = matrix;
        
    }

    public int getSize() {
        return size;
        
    }

    public void setSize(int size) {
        this.size = size;
        
    }

    public void setDefaultSymbol(char symbol) { // Another way to intialise with default Symbol
        for(int i=0;i<getSize();i++) {
            for(int j=0;j<getSize(); j++) {
                getMatrix()[i][j] = symbol;
            }
        }
    }
    

    public void printBoardConfig() {
        int sz = this.getSize();

        for(int i=0;i<sz;i++) {
            for(int j=0;j<sz;j++) {
                System.out.print(getMatrix()[i][j] + " ");
            }
            System.out.println();
        }
    }

    
}
