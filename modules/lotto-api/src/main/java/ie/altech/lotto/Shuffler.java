package ie.altech.lotto;

import ie.altech.lotto.ticket.DrawTypes;

public interface Shuffler {
    Bucket fillUpBucket(DrawTypes type);
    int pickNumber();

}
