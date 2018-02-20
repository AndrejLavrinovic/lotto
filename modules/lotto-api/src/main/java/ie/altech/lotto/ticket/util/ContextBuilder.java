package ie.altech.lotto.ticket.util;

import ie.altech.lotto.Rules;
import ie.altech.lotto.ticket.DrawType;
import ie.altech.lotto.ticket.RowContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContextBuilder {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContextBuilder.class);

    private static final Rules LOTTO = new Rules();

    public ContextBuilder(){}

    public static RowContext build(DrawType type){
        RowContext context = null;

        LOGGER.info("Draw Type is : " + type.name());

        if (DrawType.LOTTO.equals(type)) {
            context = new RowContext(LOTTO);
        }
        return context;
    }
}
