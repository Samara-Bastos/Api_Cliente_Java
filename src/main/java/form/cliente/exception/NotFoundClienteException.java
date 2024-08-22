package form.cliente.exception;

public class NotFoundClienteException extends RuntimeException  {
    public NotFoundClienteException(String ex){
        super(ex);
    }
}