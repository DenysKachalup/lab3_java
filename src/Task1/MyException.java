package Task1;

import java.util.List;

public class MyException extends RuntimeException{
    HttpCode httpCode;

    public MyException(String message) {
        super(message);
    }

    public MyException(List<String> message, HttpCode httpCode) {
        super(message.toString());
        this.httpCode = httpCode;
    }

    public HttpCode getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(HttpCode httpCode) {
        this.httpCode = httpCode;
    }
}
