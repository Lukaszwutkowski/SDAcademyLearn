package shop;

import java.time.LocalDate;

public interface Product {

    Double getPrice();

    Boolean isAvaible(LocalDate localDate);
}
