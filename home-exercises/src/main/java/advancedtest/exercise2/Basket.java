package advancedtest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private T items;
    private int currentCount = 0;
    List<T> itemList = new ArrayList<>();

    public Basket() {
    }
    public T getItem(int index) {
        return itemList.get(index);
    }

    public void addToBasket(T item) throws BasketFullException {
        if (currentCount >= 10) {
            throw new BasketFullException("Basket is full");
        } else {
            itemList.add(item);
            currentCount++;
        }

    }
    public void removeFromBasket(T item) throws BasketEmptyException {
        if (currentCount <= 0) {
            throw new BasketEmptyException("Basket is empty");
        } else {
            itemList.remove(item);
            currentCount--;
        }
    }

    public int getCurrentCount() { // testa nolukos
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }
}
