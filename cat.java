//https://medium.com/@kahil_kubilay/java-oop-temelleri-5ebd0b7d062b

class Cat {
    
    String name;
    String color;
    int age;
    int hungry;
    
    void eatFood(int foodVal) {
        this.hungry += foodVal;
    }
        
}

public class FirstClass {

    public static void main(String[] args) {
        
        Cat cat1 = new Cat();
        
        cat1.name = "Tarcin";
        cat1.color = "yellow";
        cat1.age = 3;
        cat1.hungry = 2;
        
        System.out.println("Kedinin ismi: " + cat1.name + "\nKedinin yaşı: " + cat1.age + "\nKedinin rengi: " + cat1.color);
        System.out.println("Kedinin açlık durumu: " + cat1.hungry);
        
        cat1.eatFood(3);
        
        System.out.println("Kedinin açlık durumu: " + cat1.hungry);

    }
}