package ie.altech.lotto;

import ie.altech.lotto.ticket.DrawType;

import java.util.*;

public class Rules {

    private List<Integer> lottoSet;

    public Rules(){
        lottoSet = new ArrayList<>(Arrays.asList(1, 47, 6, 1, 47, 1));
    }

    public List<Integer> getLottoSet(){
        return lottoSet;
    }

    public Rules lottoSet(List<Integer> lottoSet){
        this.lottoSet = lottoSet;
        return this;
    }

    public int getMin(){
        if (!lottoSet.isEmpty() && lottoSet.size() == 6) {
            return lottoSet.get(0);
        }
        return -1;
    }

    public int getMax(){
        if (!lottoSet.isEmpty() && lottoSet.size() == 6) {
            return lottoSet.get(1);
        }
        return -1;
    }

    public int getSize(){
        if (!lottoSet.isEmpty() && lottoSet.size() == 6) {
            return lottoSet.get(2);
        }
        return -1;
    }

    public int getBonusMin(){
        if (!lottoSet.isEmpty() && lottoSet.size() == 6) {
            return lottoSet.get(3);
        }
        return -1;
    }

    public int getBonusMax(){
        if (!lottoSet.isEmpty() && lottoSet.size() == 6) {
            return lottoSet.get(4);
        }
        return -1;
    }

    public int getBonusSize(){
        if (!lottoSet.isEmpty() && lottoSet.size() == 6) {
            return lottoSet.get(5);
        }
        return -1;
    }
}
