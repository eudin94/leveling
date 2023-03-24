package br.edu.restinga.ifrs.comerlato.leveling.util.validator;

import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY;

public class ContactValidator {

    public static void validateContactRequest(final String name, final String email, final List<String> phoneNumbers) {
        if (!isValidName(name)) {
            throw new ResponseStatusException(UNPROCESSABLE_ENTITY, "Invalid name!");
        }
        if (!isValidEmail(email)) {
            throw new ResponseStatusException(UNPROCESSABLE_ENTITY, "Invalid email!");
        }
        if (!isValidPhoneNumber(phoneNumbers)) {
            throw new ResponseStatusException(UNPROCESSABLE_ENTITY, "Invalid phone number!");
        }
    }

    public static Boolean isValidName(final String name) {
        return name.matches("^[a-z ,.'-]+$");
    }

    public static Boolean isValidEmail(final String email) {
        return email.matches("^\\w+(-?\\w+)*@\\w+(-?\\w+)*(\\.\\w{2,3})+$");
    }

    public static Boolean isValidPhoneNumber(final List<String> phoneNumbers) {
        return phoneNumbers.stream()
                .allMatch(pn -> pn.matches("^(?:(?:\\+|00)?(55)\\s?)?(?:\\(?([1-9][0-9])\\)?\\s?)?(?:((?:9\\d|[2-9])\\d{3})\\-?(\\d{4}))$"));
    }
}
