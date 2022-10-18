package advancedtest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> itemList = new ArrayList<>();

    public Basket() {
    }

    public T getItem(int index) {
        return itemList.get(index);
    }

    public void addToBasket(T item) throws BasketFullException {
        if (itemList.size() >= 10) {
            throw new BasketFullException("Basket is full");
        } else {
            itemList.add(item);
        }

    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (itemList.size() == 0) {
            throw new BasketEmptyException("Basket is empty");
        } else {
            itemList.remove(item);
        }
    }

}
