package ua.lviv.iot.foodstoragegoods.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Lunchbox extends FoodStorageGood {
    private int numberOfSections;
    private String printOnTheTop;

    public Lunchbox(final double sizeInLiters, final double weightInGrams,
                    final double priceInUah, final Colour colour,
                    final Material material, final Country countryOfOrigin,
                    final int numberOfSections, final String printOnTheTop) {
        super(sizeInLiters, weightInGrams, priceInUah, colour, material, countryOfOrigin);
        this.setNumberOfSections(numberOfSections);
        this.setPrintOnTheTop(printOnTheTop);
    }
}
