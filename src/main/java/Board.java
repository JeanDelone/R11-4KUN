import java.util.ArrayList;

public class Board {

    ArrayList<Card[]> mainBoard;
    ArrayList<Card> disassembledBoard;
    ArrayList<Card[]> possibleBoards;



    Board(ArrayList<Card[]> mainBoard){
        this.mainBoard = mainBoard;

    }

    public void addToBoard(Card[] setOfCards){
        this.mainBoard.add(setOfCards);
        for (int i = 0; i < setOfCards.length; i++) {
            this.disassembledBoard.add(setOfCards[i]);
        }
    }

//    private ArrayList<ArrayList<Card>> possibleSets(){
//        this.possibleBoards.clear();
//    }

    boolean isValidGroup(Card[] group){
        if (group.length < 3 || group.length > 14){
            return false;
        }
        if (group[0].color.equals(group[group.length - 1].color)){

            for (Card card : group) {
                if (!(card.color.equals(group[0].color))) {
                    return false;
                }
                }
            for (int i = 0; i < group.length - 1; i++) {
                    if(!(group[i].number +1 == group[i++].number)){
                        return false;
                    }
                }

        }
        else{
            if (group.length > 4){
                return false;
            }
            for (Card card : group){
                if(card.number != group[0].number){
                    return false;
                }

            }
            for (int i = 0; i < group.length; i++) {
                for (int j = i + 1 ; j < group.length; j++) {
                    if (group[i].color.equals(group[j].color))
                    {
                        return false;
                    }
                }
            }

        }
        return true;
    }

    boolean canCardBeAdded(Card[] group, Card card){
        if (group.length == 0){
            return true;
        }
        if (!(card.color.equals(group[0].color))){
            for (Card karta : group){
                if(karta.color.equals(card.color) || karta.number != card.number){
                    return false;
                }
            }
            return true;
        }
//        else{
//            for (Card karta : group){
//                if(karta.color.equals((card.color))){
//                    return false;
//                }
//            }
//            group.sort
//        }
        return false;
    }


    private void calculatePossibleBoards(){

    }

}

