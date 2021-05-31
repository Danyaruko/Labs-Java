package ua.lviv.iot.foodstoragegoods.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Barrel extends TraditionalFoodStorageItem {
    private Material hoopMaterial;

    public Barrel(final double sizeInLiters, final double weightInGrams,
                  final double priceInUah, final Colour colour,
                  final Material material, final Country countryOfOrigin,
                  final Utility utility, final Material hoopMaterial) {
        super(sizeInLiters, weightInGrams, priceInUah, colour, material, countryOfOrigin, utility);
        this.setHoopMaterial(hoopMaterial);
    }
}
