package composite;

import composite.menu.*;

public class ClientMain {

    public static void main(String[] args) {

        MenuComponet pancakeHouse = new Menu("팬케이크 하우스 메뉴", "아침메뉴");
        MenuComponet diner = new Menu("식당메뉴", "저녘메뉴");
        MenuComponet cafe = new Menu("카페", "커피");
        MenuComponet dessert = new Menu("디저트", "단거");

        MenuComponet all = new Menu("전체", "전체");
        all.add(pancakeHouse);
        all.add(diner);
        all.add(cafe);
        
        diner.add(new MenuItem("파스타", "미나리 스파게티", true, 10.0));
        diner.add(dessert);

        dessert.add(new MenuItem("애플파이", "단거", true, 11.0));

        Waitress waitress = new Waitress(all);
        waitress.printMenu();

    }


}
