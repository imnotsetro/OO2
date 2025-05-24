import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class UpperCaseFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        return record.getMessage().toUpperCase() + System.lineSeparator();
    }
}