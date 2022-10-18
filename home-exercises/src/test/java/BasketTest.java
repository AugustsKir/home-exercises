import advancedtest.exercise2.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {


    @Test
    void testApples() throws BasketFullException {
        Basket<Apples> applesBasket = new Basket<>();
        Apples apple = new Apples();
        applesBasket.addToBasket(apple);
        Assertions.assertNotNull(applesBasket.getItem(0));
    }

    @Test
    void testMushroom() throws BasketFullException {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        Mushroom mushroom = new Mushroom();
        mushroomBasket.addToBasket(mushroom);
        Assertions.assertNotNull(mushroomBasket.getItem(0));
    }

    @Test
    void testFullBasket() {
        Basket<Apples> applesBasket = new Basket<>();
        applesBasket.setCurrentCount(11);
        Apples apple = new Apples();
        Throwable exception = Assertions.assertThrows(BasketFullException.class, () -> applesBasket.addToBasket(apple));
        Assertions.assertEquals("Basket is full", exception.getMessage());
    }

    @Test
    void testEmptyBasket() {
        Basket<Apples> applesBasket = new Basket<>();
        Apples apple = new Apples();
        Throwable exception = Assertions.assertThrows(BasketEmptyException.class, () -> applesBasket.removeFromBasket(apple));
        Assertions.assertEquals("Basket is empty", exception.getMessage());
    }

}
