package internal.coding.challenge.pepi.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.NotNull;

import lombok.Value;

@Value
public class Route {

    @NotNull
    List<String> cities;

    @NotNull
    Integer totalCost;

    @NotNull
    Integer totalReward;

    public static Route initial(@NotNull String city) {
        return new Route(List.of(city), 0, 0);
    }

    public Route withNextStep(@NotNull String city, int cost, int reward) {
        List<String> newCities = new ArrayList<>(this.cities);
        newCities.add(city);
        return new Route(newCities, this.totalCost + cost, this.totalReward + reward);
    }

    @JsonIgnore
    public int getTotalScore() {
        return totalReward - totalCost;
    }

    @JsonIgnore
    public int getLength() {
        return cities.size() - 1;
    }
}
