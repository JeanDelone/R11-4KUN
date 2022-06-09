public class Card {

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
    public boolean equals(Object o){
        if(o == this){
            return true
        }
        if(!(o instanceof Card)){
            return false
        }

        Card card = (Card)o;
        return color.equals(card.color) &&
                number == card.number &&
                isFirst == card.isFirst;
    }

}
