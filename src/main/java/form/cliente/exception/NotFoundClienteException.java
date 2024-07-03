package form.cliente.exception;

public class NotFoundClienteException extends RuntimeException  {
    private static final long serialVersionUID = 1L;

    public NotFoundClienteException(String ex){
        super(ex);
    }
}