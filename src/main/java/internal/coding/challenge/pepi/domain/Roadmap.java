package internal.coding.challenge.pepi.domain;

import java.util.Set;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Roadmap {

    @NotNull
    Set<City> cities;

    @NotNull
    Set<Connection> connections;

}
