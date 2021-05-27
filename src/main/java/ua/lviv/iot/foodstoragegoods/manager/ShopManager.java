package ua.lviv.iot.foodstoragegoods.manager;

import ua.lviv.iot.foodstoragegoods.models.FoodStorageGood;
import ua.lviv.iot.foodstoragegoods.models.Material;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShopManager {
    private List<FoodStorageGood> goods;

    public  ShopManager() {
        this.goods = new ArrayList<FoodStorageGood>();
    }

    public  ShopManager(final List<FoodStorageGood> goods) {
        this.goods = goods;
    }

    public void addGoods(final List<FoodStorageGood> goodsToAdd) {
        goods.addAll(goodsToAdd);
    }

    public void removeGoodByIndex(final int index) {
        goods.remove(index);
    }

    public void clearGoodsList() {
        goods.clear();
    }

    public FoodStorageGood getGoodByIndex(final int index) {
        return goods.get(index);
    }

    public List<FoodStorageGood> getAllGoods() {
        return this.goods;
    }

    public void sortByWeight(final SortOrder sortOrder) {
        if (sortOrder == SortOrder.ASC) {
            goods.sort(Comparator.comparing(FoodStorageGood::getWeightInGrams));
        } else {
            goods.sort(Comparator.comparing(FoodStorageGood::getWeightInGrams).reversed());
        }
    }

    public void sortByColour(final SortOrder sortOrder) {
        if (sortOrder == SortOrder.ASC) {
            goods.sort(Comparator.comparing(FoodStorageGood::getColour));
        } else {
            goods.sort(Comparator.comparing(FoodStorageGood::getColour).reversed());
        }
    }

    public List<FoodStorageGood> searchByMaterial(final Material material) {
        return this.goods.stream().filter(good -> good.getMaterial().equals(material)).collect(Collectors.toList());
    }
}
