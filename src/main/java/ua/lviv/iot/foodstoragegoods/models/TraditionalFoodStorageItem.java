package ua.lviv.iot.foodstoragegoods.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class TraditionalFoodStorageItem extends FoodStorageGood {
    protected Utility utility;

    public TraditionalFoodStorageItem(final double sizeInLiters, final double weightInGrams,
                                      final double priceInUah, final Colour colour,
                                      final Material material, final Country countryOfOrigin,
                                      final Utility utility) {
        super(sizeInLiters, weightInGrams, priceInUah, colour, material, countryOfOrigin);
        this.setUtility(utility);
    }
}
