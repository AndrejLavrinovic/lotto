package ie.altech.lotto;

import java.util.Random;
import java.util.Set;

public class Bucket {

    private Set<Integer> bucket;

    public Set<Integer> getBucket(){ return this.bucket; }

    public void setBucket(Set<Integer> bucket){ this.bucket = bucket; }

    public Bucket bucket(Set<Integer> bucket){
        this.bucket = bucket;
        return this;
    }

    public int retrieveNumber(int max){
        int number = 0;
        do{
            number = new Random().nextInt(max) + 1;
        } while(!bucket.contains(number));
        bucket.remove(number);
        return number;
    }
}
