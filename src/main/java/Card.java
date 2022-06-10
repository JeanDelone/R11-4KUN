import java.util.ArrayList;

public class Card {

    private String[] colors = {"RED", "BLUE", "BLACK", "YELLOW"};

    protected boolean isJoker;
    protected boolean isFirst;
    protected String color;
    protected int number;
    protected boolean fromHand;

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
