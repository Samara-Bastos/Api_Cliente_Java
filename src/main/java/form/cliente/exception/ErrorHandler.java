package form.cliente.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(NotFoundClienteException.class)
    public ResponseEntity<String> handleErrorNotFoundClienteException(NotFoundClienteException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }

    @ExceptionHandler(FindClienteException.class)
    public ResponseEntity<String> handleErrorFindClienteException(FindClienteException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
}