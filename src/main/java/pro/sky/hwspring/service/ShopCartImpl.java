package pro.sky.hwspring.service;

import pro.sky.hwspring.model.ShopCart;

import javax.annotation.PostConstruct;
import java.util.Set;

public class ShopCartImpl implements ShopCartService {
    private final ShopCart shopCart;

    public ShopCartImpl(ShopCart shopCart) {
        this.shopCart = shopCart;
    }

    @PostConstruct
    public void init() {
        System.out.println("Service is here!!!");
    }

    @Override
    public void add(Set<Integer> itemIds) {
        if (shopCart == null) {
            ShopCart shopCart = new ShopCart();
        }
        shopCart.add(itemIds);
    }

    @Override
    public Set<Integer> get() {
        return shopCart.getItemIds();
    }
}
