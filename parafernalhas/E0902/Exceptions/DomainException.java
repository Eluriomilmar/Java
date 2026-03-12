package parafernalhas.E0902.Exceptions;

public class DomainException extends Exception {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}