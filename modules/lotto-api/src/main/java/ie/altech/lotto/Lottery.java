package ie.altech.lotto;

import ie.altech.lotto.ticket.Row;
import ie.altech.lotto.ticket.RowContext;

import java.util.HashSet;
import java.util.Set;

public class Lottery implements Shuffler {

    private Bucket bucket;
    private Bucket bonusBucket;
    private Row row;
    private RowContext context;

    public Lottery(RowContext context){
        this.context = context;
        bucket = loadBucket(context.getMin(), context.getMax(), context.getSize());
        bonusBucket = loadBucket(context.getBonusMin(), context.getBonusMax(), context.getBonusSize());
    }

    @Override
    public Bucket loadBucket(int min, int max, int size) {
        Set<Integer> bucketSet = new HashSet<>();
        for(int i = context.getMin(); i <= context.getMax(); i++){
            bucketSet.add(i);
        }
        Bucket b = new Bucket();
        b.setBucket(bucketSet);
        return b;
    }

    @Override
    public int pickNumber(Bucket bucket) {
        return 0;
    }

    @Override
    public Row addNumberToTheRow(Row row, int number) {
        return null;
    }

    @Override
    public Row completeRow(RowContext context) {
        this.row = new Row();
        for(int i = 0; i < context.getSize(); i++){
            row.addRowNumber(bucket.retrieveNumber(context.getMax()));
        }
        for(int i = 0; i < context.getBonusSize(); i++){
            row.addLuckyStarNumber(bonusBucket.retrieveNumber(context.getBonusMax()));
        }
        return row;
    }

    @Override
    public Bucket shuffle(Bucket bucket) {
        return null;
    }
}
