package br.edu.restinga.ifrs.comerlato.leveling.controller;

import br.edu.restinga.ifrs.comerlato.leveling.dto.ContactDTO;
import br.edu.restinga.ifrs.comerlato.leveling.exception.StandardError;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

public interface ContactController {

    @Operation(summary = "Returns a list of contacts")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Contact list retrieved!",
                    content = {@Content(
                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                            array = @ArraySchema(schema = @Schema(implementation = ContactDTO.class))
                    )})
    })
    @ResponseStatus(OK)
    @GetMapping("list")
    List<ContactDTO> getContacts();

    @Operation(summary = "Register a new contact")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "201",
                    description = "Contact saved!",
                    content = {@Content(
                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = ContactDTO.class)
                    )}),
            @ApiResponse(
                    responseCode = "422",
                    description = "Error processing contact information!",
                    content = {@Content(
                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = StandardError.class)
                    )})
    })
    @ResponseStatus(CREATED)
    @PostMapping("register")
    ContactDTO saveContact(@RequestParam("name") final String name,
                           @RequestParam("email") final String email,
                           @RequestParam("phoneNumbers") final List<String> phoneNumbers);
}
