package rafael.victorio.uolhostbackend.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class ControlerExceptionHandler {

    @ExceptionHandler
    public ResponseEntity threatNoSuchElement(NoSuchElementException exception){
        ExceptionDto dto = new ExceptionDto("Essa lista não possui mais usuários disponíveis.", "400");
        return ResponseEntity.badRequest().body(dto);

    }
}
