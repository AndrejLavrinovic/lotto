package ie.altech.lotto.ticket;

import ie.altech.lotto.ticket.util.Helper;

import java.util.HashSet;
import java.util.Set;

public class Row {
    private Set<Integer> row;
    private Set<Integer> luckyStars;

    public Row(){
        row = new HashSet<>();
        luckyStars = new HashSet<>();
    }

    public void addRowNumber(int number){
        row.add(number);
    }

    public void sortRow(){
        Helper.getRowSorted(this.row);
    }
}
