package ua.lviv.iot.foodstoragegoods.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodStorageGood {
    protected double sizeInLiters;
    protected double weightInGrams;
    protected double priceInUah;
    protected Colour colour;
    protected Material material;
    protected Country countryOfOrigin;
}
