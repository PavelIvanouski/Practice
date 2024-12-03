package by.it_academy.practice.practice22_1.practiceSlide17;

import java.util.UUID;

public class Pie {
    private UUID id;
    private float price;

    public Pie(float price) {
        this.id = UUID.randomUUID();
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pie{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}