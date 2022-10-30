package pro.sky.hwspring.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
@SessionScope
public class ShopCart {
    private final Set<Integer> itemIds;

    public ShopCart() {
        this.itemIds = new HashSet<>();
    }

    @PostConstruct
    public void init() {
        System.out.println("ShopCart class is here!");
    }

    public void add(Set<Integer> itemIds) {
        this.itemIds.addAll(itemIds);
    }

    public Set<Integer> getItemIds() {
        return itemIds;
    }
}
