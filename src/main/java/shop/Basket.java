package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


public class Basket {



    private final Map<Product, AtomicInteger> productList = new HashMap<>();

   // private final List<Product> productList = new ArrayList<>();

    public void add(Product product, Integer quantity)
    {
        if (productList.containsKey(product)) {
            productList.get(product).getAndAdd(quantity);
        } else {
            productList.put(product, new AtomicInteger(quantity));
        }
    }

    public void remove(Product product, Integer quantity){
       if (productList.containsKey(product) && productList.get(product).get()<=quantity){
           productList.remove(product);
       } else if (productList.containsKey(product)) {
           productList.get(product).getAndAdd(-quantity);
       }
    }

    public List<Product> getProductList(){
        return new ArrayList<>(productList.keySet());
    }

    @Override
    public String toString() {
        return "Basket{" +
                "productList=" + productList +
                '}';
    }
}
