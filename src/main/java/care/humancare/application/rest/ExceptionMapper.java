package care.humancare.application.rest;

import care.humancare.exceptions.HumanCareException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice(annotations = RestController.class)
public class ExceptionMapper {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(HumanCareException.class)
    public Map<String, String> toResponse(HumanCareException exception) {
        Map<String, String> map = new HashMap<>();
        map.put("message", exception.getMessage());
        return map;
    }

}
