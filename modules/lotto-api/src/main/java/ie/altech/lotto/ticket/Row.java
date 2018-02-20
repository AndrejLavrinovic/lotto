package ie.altech.lotto.ticket;

import ie.altech.lotto.ticket.util.Helper;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
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

    public void addLuckyStarNumber(int number){
        luckyStars.add(number);
    }

    public void sortRow(){
        Helper.getRowSorted(this.row);
    }

    public String toString(){
        String line = "";
        Iterator<Integer> rowIterator = row.iterator();
        Iterator<Integer> bonusIterator = luckyStars.iterator();
        if (!row.isEmpty() && !luckyStars.isEmpty()) {
            line += " [ ";
            while(rowIterator.hasNext()){
                line += String.format("%d ", rowIterator.next());
            }
            line += " -  ";
            while(bonusIterator.hasNext()){
                line += String.format("%s ", bonusIterator.next());
            }
            line += "] ";
        }
        return line;
    }
}
