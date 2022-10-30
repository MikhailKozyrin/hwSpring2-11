package pro.sky.hwspring.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.hwspring.model.ShopCart;

import java.util.Set;

@RestController
@RequestMapping("/order")
public class ShopCartController {
    private final ShopCart shopCart;

    public ShopCartController(ShopCart shopCart) {
        this.shopCart = shopCart;
    }

    @GetMapping(path = "/add")
    public void addItem(@RequestParam(value = "ids") Set<Integer> itemIds) {
        shopCart.add(itemIds);
    }

    public Object getItems() {
        return shopCart.getItemIds();
    }
}
