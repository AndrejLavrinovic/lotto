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

import ie.altech.lotto.Rules;

public class RowContext {
    private int min;
    private int max;
    private int bonusMin;
    private int bonusMax;
    private int size;
    private int bonusSize;
    private DrawType type = DrawType.LOTTO;

    public RowContext(int min, int max, int size){
        this.min = min;
        this.max = max;
        this.size = size;
    }

    public RowContext(int min, int max, int size, int bonusMin, int bonusMax, int bonusSize){
        this(min, max, size);
        this.bonusMin = bonusMin;
        this.bonusMax = bonusMax;
        this.bonusSize = bonusSize;
    }

    public RowContext(Rules rule){
        init(rule);
    }

    public void setMin(int min){ this.min = min; }
    public void setMax(int max){ this.max = max; }
    public void setBonusMin(int bonusMin){ this.bonusMin = bonusMin; }
    public void setBonusMax(int bonusMax){ this.bonusMax = bonusMax; }
    public void setSize(int size) {this.size = size; }
    public void setBonusSize(int bonusSize){ this.bonusSize = bonusSize; }
    public void setType(DrawType type){ this.type = type; }

    public int getMin(){ return this.min; }
    public int getMax(){ return this.max; }
    public int getBonusMin(){ return this.bonusMin; }
    public int getBonusMax(){ return this.bonusMax; }
    public int getSize(){ return this.size; }
    public int getBonusSize(){ return this.bonusSize; }
    public DrawType getType(){ return this.type; }

    public RowContext min(int min){
        this.min = min;
        return this;
    }

    public RowContext max(int max){
        this.max = max;
        return this;
    }

    public RowContext bonusMin(int bonusMin){
        this.bonusMin = bonusMin;
        return this;
    }

    public RowContext bonusMax(int bonusMax){
        this.bonusMax = bonusMax;
        return this;
    }

    public RowContext size(int size){
        this.size = size;
        return this;
    }

    public RowContext bonusSize(int bonusSize){
        this.bonusSize = bonusSize;
        return this;
    }

    public RowContext type(DrawType type){
        this.type = type;
        return this;
    }

    public void init(Rules rule){
        this.min = rule.getMin();
        this.max = rule.getMax();
        this.size = rule.getSize();
        this.bonusMin = rule.getBonusMin();
        this.bonusMax = rule.getBonusMax();
        this.bonusSize = rule.getBonusSize();
    }
}
