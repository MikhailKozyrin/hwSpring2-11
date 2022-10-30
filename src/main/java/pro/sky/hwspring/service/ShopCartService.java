package pro.sky.hwspring.service;

import java.util.Set;

public interface ShopCartService {
    void add(Set<Integer> itemIds);
    Set<Integer> get();
}
