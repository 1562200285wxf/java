package inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ColorBananer implements PricateT<Bananer>{

    private static String color = "red";
    @Override
    public boolean test(Bananer bananer) {
        return color.equals(bananer.getColor());
    }
}
