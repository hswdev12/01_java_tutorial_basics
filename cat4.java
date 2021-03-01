//kedi nesnemiz
class Cat{
    
    String name;
    String color;
    int age;
    int hungry;
    
    void eatFood(int foodVal) {
        this.hungry += foodVal;
    }
    
    //constructor methodumuz
    public Cat() {
        this.name = "değer girilmedi";
        this.color = "değer girilmedi";
        this.age = 0;
        this.hungry = 0;
    }
    //farklı constructor methodumuz
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //farklı constructor methodumuz  
    public Cat(String name, String color, int age, int hungry){
        this.name = name;
        this.color = color;
        this.age = age;
        this.hungry = hungry;
    }
    }
public class constructor_example {

    public static void main(String[] args) {
        // main method
        
        //kedi nesnemiz
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat2.name = "Tarcin";
        cat2.age = 2; 
       
        System.out.println(cat1.name + "\n"
                + cat1.color + "\n"
                + cat1.age + "\n"
               + cat1.hungry + "\n");
        System.out.println(cat2.name + "\n"
                + cat2.color + "\n"
                + cat2.age + "\n"
                + cat2.hungry + "\n");
        System.out.println(cat3.name + "\n"
                + cat3.color + "\n"
                + cat3.age + "\n"
                + cat3.hungry + "\n");
    }
}