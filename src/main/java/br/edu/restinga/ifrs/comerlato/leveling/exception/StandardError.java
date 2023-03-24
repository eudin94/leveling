package br.edu.restinga.ifrs.comerlato.leveling.exception;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class StandardError {

    @Schema(example = "2023-02-28T17:45:51.559662")
    private final LocalDateTime timestamp;

    @Schema(example = "404")
    private final Integer status;

    @Schema(example = "Not found")
    private final String error;

    @Schema(example = "Object not found")
    private final String message;

    @Schema(example = "/api/requested-uri")
    private final String path;
}