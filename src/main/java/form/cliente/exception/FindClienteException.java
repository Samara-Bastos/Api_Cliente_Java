package form.cliente.exception;

public class FindClienteException extends RuntimeException   {
    private static final long serialVersionUID = 1L;

    public FindClienteException(String ex){
        super(ex);
    }
}