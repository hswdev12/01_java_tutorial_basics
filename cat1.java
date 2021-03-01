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
    
}public class constructor_example {

    public static void main(String[] args) {
        // main method
        
        //kedi nesnemiz
        Cat cat1 = new Cat();
        
        System.out.println(cat1.name + "\n"
                + cat1.color + "\n"
                + cat1.age + "\n"
                + cat1.hungry + "\n");
    }
}