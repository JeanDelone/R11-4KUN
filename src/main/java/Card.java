import java.util.ArrayList;

public class Card {

    private String[] colors = {"RED", "BLUE", "BLACK", "YELLOW"};

    private boolean isJoker;
    private boolean isFirst;
    private String color;
    private int number;

    Card(String color, int number, boolean isFirst,boolean isJoker){
        this.color = color;
        this.number = number;
        this.isFirst = isFirst;
        this.isJoker = isJoker;
    }


    @Override
    public String toString(){
        return "(" + this.color + ", " + this.number + ")";
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(!(o instanceof Card)){
            return false;
        }

        Card card = (Card)o;
        return color.equals(card.color) &&
                number == card.number &&
                isFirst == card.isFirst;
    }

}
