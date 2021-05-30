package ua.lviv.iot;

import ua.lviv.iot.foodstoragegoods.manager.ShopManager;
import ua.lviv.iot.foodstoragegoods.manager.SortOrder;
import ua.lviv.iot.foodstoragegoods.models.*;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        Basket lukoshko = new Basket(20, 500, 100, Colour.WOOD, Material.WOOD_BARK,
                                     Country.RUSSIA, Utility.OUTDOOR_ALLOWED, 2);
        Barrel bertha = new Barrel(200, 15000, 500, Colour.BLUE, Material.WOOD,
                                   Country.BULGARIA, Utility.DECORATIVE, Material.METAL);
        Lunchbox boksik = new Lunchbox(2, 200, 80, Colour.RED, Material.PLASTIC,
                                       Country.WESTERN_SAHARA, 4, "Dinosaur");
        Lunchbox contentainer = new Lunchbox(0.5, 400, 100, Colour.SILVER, Material.METAL,
                                             Country.SWEDEN, 2, "Dinosaur");
        ShopManager serega = new ShopManager();

        serega.addGoods(Arrays.asList(lukoshko, bertha, boksik, contentainer));
        System.out.println("\nInitial list of food storage goods:");
        serega.getAllGoods().forEach(System.out::println);

        System.out.println("\nList sorted by colour:");
        serega.sortByColour(SortOrder.ASC);
        serega.getAllGoods().forEach(System.out::println);

        System.out.println("\nList sorted by weight(descending):");
        serega.sortByWeight(SortOrder.DESC);
        serega.getAllGoods().forEach(System.out::println);

        System.out.println("\nList of all metallic goods:");
        serega.searchByMaterial(Material.METAL).forEach(System.out::println);
    }
}
