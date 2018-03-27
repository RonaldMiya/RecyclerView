package rmiya.com.farzanfood.models;

/**
 * Created by Ronald Miya de la Cruz on 27/03/2018.
 */

public class Food {

    private Integer id;
    private String name;
    private String tiempo;
    private String category;
    private double price;
    private String picture;

    public Food() {

    }

    public Food(Integer id, String name, String tiempo, String category, double price, String picture) {
        this.id = id;
        this.name = name;
        this.tiempo = tiempo;
        this.category = category;
        this.price = price;
        this.picture = picture;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tiempo='" + tiempo + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                '}';
    }
}
