
public class ParseException extends Exception {

    private String msg;

    public ParseException(){
        super();
    }

    public ParseException(String msg) {
        super(msg);
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Exception in thread \"" + Thread.currentThread().getName() + "\" " + this.getClass().getName() +
                ": For input string: \"" + this.msg + "\"";
    }
}
