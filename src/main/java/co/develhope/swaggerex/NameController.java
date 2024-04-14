package co.develhope.swaggerex;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;
    @RestController
    @RequestMapping("/v1")
    public class NameController {
        @GetMapping("/{name}")
        @Operation(summary = "Return user's name input")
        public String getName(@Parameter(description = "The user request param") @PathVariable("name")String name){
            return name;
        }
        @ApiResponses(value ={
                @ApiResponse(responseCode ="200", description = "return input name", content ={
                        @Content(mediaType = "application/String")
                })
        })
        @PostMapping("/reverse")
        @Operation(summary = "Return user's name reversed")
        public String reverseName(@Parameter(description = "The user request body") @RequestParam String name){
            return new StringBuilder(name).reverse().toString();
        }
}
