package semantic.com.example.semantic_web.exception_employee;

import java.util.Date;

public class ExceptionResponseClass {
    //timestamp
    private final Date timestamp;
    //message
    private final String message;
    //detail
    private final String details;

    public ExceptionResponseClass(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
