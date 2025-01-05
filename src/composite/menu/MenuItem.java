package composite.menu;

import lombok.Getter;

@Getter
public class MenuItem extends MenuComponet{

    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    //leaf 블록
    public String getName(){
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public void print(){
        System.out.println(name + " " + description + " " + vegetarian + " " + price);
    }
}
