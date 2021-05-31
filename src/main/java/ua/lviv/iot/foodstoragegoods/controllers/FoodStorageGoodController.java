package ua.lviv.iot.foodstoragegoods.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.foodstoragegoods.models.Basket;
import ua.lviv.iot.foodstoragegoods.services.FoodStorageGoodsService;

import java.util.List;

@RestController
@RequestMapping(path = "/baskets")
public class FoodStorageGoodController {

    @Autowired
    private FoodStorageGoodsService basketsService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Basket> getBasketById(@PathVariable Integer id) {
        Basket presentBasket = basketsService.getBasketById(id);
        if (presentBasket != null) {
            return ResponseEntity.ok(presentBasket);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Basket>> getBaskets() {
        return ResponseEntity.ok(basketsService.getBaskets());
    }

    @PostMapping
    public Basket createBasket(@RequestBody Basket basket) {
        return basketsService.createBasket(basket);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Basket> updateBasketById(@PathVariable Integer id, @RequestBody Basket basket) {
        Basket presentBasket = basketsService.getBasketById(id);
        if (presentBasket != null) {
            ResponseEntity.ok(basketsService.updateBasketById(id, basket));
            return ResponseEntity.ok(basket);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @CrossOrigin
    @DeleteMapping(path = "{id}")
    public ResponseEntity<Basket> deleteBasketById(@PathVariable Integer id) {
        Basket presentBasket = basketsService.getBasketById(id);
        if (presentBasket != null) {
            return ResponseEntity.ok(basketsService.deleteBasketById(id));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
