public class Main {

    public static void main(String[] args){

        Card[] board1 = {
                new Card("red", 1, true, false),
                new Card("red", 2, true, false),
                new Card("red", 3, true, false),
                new Card("red", 4, true, false),
                new Card("red", 5, true, false),
                new Card("red", 6, true, false),

                new Card("blue", 1, true, false),
                new Card("blue", 2, true, false),
                new Card("blue", 3, true, false),

                new Card("black", 1, true, false),
                new Card("black", 2, true, false),
                new Card("black", 3, true, false),
        };

        for(int i = 0; i < board1.length; i++){
            System.out.print(board1[i]);
        }

        for (Card card : board1) {
            System.out.println(card);
        }



    }
}
