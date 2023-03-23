package br.edu.restinga.ifrs.comerlato.leveling.exception.handler;

import br.edu.restinga.ifrs.comerlato.leveling.exception.StandardError;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

import static java.time.LocalDateTime.now;

@Log4j2
@ControllerAdvice
@RequiredArgsConstructor
public class ErrorHandler {

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<StandardError> errorResponseStatus(final ResponseStatusException ex, final HttpServletRequest req) {
        return ResponseEntity
                .status(ex.getStatusCode())
                .body(StandardError.builder()
                        .timestamp(now())
                        .status(ex.getStatusCode().value())
                        .path(req.getRequestURI())
                        .error(ex.getMessage())
                        .message(ex.getReason())
                        .build());
    }


}
