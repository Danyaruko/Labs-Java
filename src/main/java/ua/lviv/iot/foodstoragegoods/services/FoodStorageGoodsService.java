package ua.lviv.iot.foodstoragegoods.services;

import org.springframework.stereotype.Service;
import ua.lviv.iot.foodstoragegoods.models.Basket;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
public class FoodStorageGoodsService {
    private AtomicInteger id = new AtomicInteger(0);
    private Map<Integer, Basket> basketsMap = new HashMap<Integer,Basket>();

    public List<Basket> getBaskets() {
        return basketsMap.values().stream().collect(Collectors.toList());
    }

    public Basket getBasketById(final Integer id) {
        return basketsMap.get(id);
    }

    public Basket createBasket(final Basket basket) {
        basket.setId(id.incrementAndGet());
        basketsMap.put(basket.getId(), basket);
        return basket;
    }

    public Basket updateBasketById(final Integer id, Basket basket) {
        basket.setId(id);
        return basketsMap.put(id, basket);
    }

    public Basket deleteBasketById(final Integer id) {
        return basketsMap.remove(id);
    }
}
