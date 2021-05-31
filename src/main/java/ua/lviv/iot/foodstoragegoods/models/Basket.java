package ua.lviv.iot.foodstoragegoods.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.NonNull;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Basket extends TraditionalFoodStorageItem {
    @NonNull
    private int numberOfHandles;

    public Basket(final double sizeInLiters, final double weightInGrams,
                  final double priceInUah, final Colour colour,
                  final Material material, final Country countryOfOrigin,
                  final Utility utility, final int numberOfHandles) {
        super(sizeInLiters, weightInGrams, priceInUah, colour, material, countryOfOrigin, utility);
        this.setNumberOfHandles(numberOfHandles);
    }
}
