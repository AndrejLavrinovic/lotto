/**
 * Class represents row context ot the draw. It contains all metadata required to set a row.
 * Depend of type ot the draw it may or may not contain lucky-stars or other properties.
 *
 * <p>
 * Row of numbers must be initialised with at least three params - min, max, size.
 * Additional features must be initialized with additional parameters.
 * </p>
 *
 * @author Andrej Lavrinovic
 */

package ie.altech.lotto.ticket;

public class RowContext {
    private int numberMin;
    private int numberMax;
    private int luckStarsMin;
    private int luckyStrsMax;
    private int numbersSize;
    private int luckyStartsSize;
    private DrawTypes type = DrawTypes.LOTTO;

    public RowContext(int numberMin, int numberMax, int numbersSize){
        this.numberMin = numberMin;
        this.numberMax = numberMax;
        this.luckyStartsSize = numbersSize;
    }

    public RowContext(int numberMin, int numberMax, int numbersSize, int luckStarsMin, int luckyStrsMax, int luckyStartsSize){
        this(numberMin, numberMax, numbersSize);
        this.luckStarsMin = luckStarsMin;
        this.luckyStrsMax = luckyStrsMax;
        this.luckyStartsSize = luckyStartsSize;
    }

    public void setNumberMin(int numberMin){ this.numberMin = numberMin; }
    public void setNumberMax(int numberMax){ this.numberMax = numberMax; }
    public void setLuckStarsMin(int luckStarsMin){ this.luckStarsMin = luckStarsMin; }
    public void setLuckyStrsMax(int luckyStrsMax){ this.luckyStrsMax = luckyStrsMax; }
    public void setNumbersSize(int numbersSize) {this.numbersSize = numbersSize; }
    public void setLuckyStartsSize(int luckyStartsSize){ this.luckyStartsSize = luckyStartsSize; }
    public void setType(DrawTypes type){ this.type = type; }

    public int getNumberMin(){ return this.numberMin; }
    public int getNumberMax(){ return this.numberMax; }
    public int getLuckStarsMin(){ return this.luckStarsMin; }
    public int getLuckyStrsMax(){ return this.luckyStrsMax; }
    public int getNumbersSize(){ return this.numbersSize; }
    public int getLuckyStartsSize(){ return this.luckyStartsSize; }
    public DrawTypes getType(){ return this.type; }
}
