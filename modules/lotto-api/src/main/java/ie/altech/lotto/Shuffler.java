package ie.altech.lotto;

import ie.altech.lotto.ticket.DrawType;
import ie.altech.lotto.ticket.Row;
import ie.altech.lotto.ticket.RowContext;

public interface Shuffler {

    Bucket loadBucket(int min, int max, int size);

    int pickNumber(Bucket bucket);

    Row addNumberToTheRow(Row row, int number);

    Row completeRow(RowContext context);

    Bucket shuffle(Bucket bucket);

}
