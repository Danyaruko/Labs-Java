package ua.lviv.iot.foodstoragegoods.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodStorageGood {
    @NonNull
    protected double sizeInLiters;

    @NonNull
    protected double weightInGrams;

    @NonNull
    protected double priceInUah;

    @NonNull
    protected Colour colour;

    @NonNull
    protected Material material;

    @NonNull
    protected Country countryOfOrigin;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    protected Integer id;

    public FoodStorageGood(final double sizeInLiters, final  double weightInGrams, final double priceInUah,
                           final Colour colour, final Material material, final Country countryOfOrigin){
        this(sizeInLiters, weightInGrams, priceInUah, colour, material, countryOfOrigin, null);
    }
}
