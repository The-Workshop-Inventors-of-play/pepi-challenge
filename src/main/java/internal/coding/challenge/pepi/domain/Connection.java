package internal.coding.challenge.pepi.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Connection {

    @NotNull
    String from;

    @NotNull
    String to;

    @NotNull
    @Min(0)
    Integer cost;
}
