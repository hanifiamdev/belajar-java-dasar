package hanifiamdev.com.data;

import hanifiamdev.com.annotation.Fancy;

@Fancy(name="Car", tags = {"application", "java"})
public interface Car extends HasBrand {

    void drive(); // otomatis public abstract

    int getTier();

    default boolean isBig() {
        return false;
    }
}
