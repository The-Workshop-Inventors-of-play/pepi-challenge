package internal.coding.challenge.pepi.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @NotNull
    String name;

    @NotNull
    @Min(0)
    Integer reward;

    Boolean base = false;
}
