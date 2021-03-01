//özelliklerin(değişkenlerin) default değerleri
class cat{
    String name;
    String color;
    int age;
    int hungry;
    
     void eatFood(int foodVal) {
        this.hungry += foodVal;
    }
}
public static void main(String[] args) {
    Cat cat1 = new Cat();
    System.out.println(cat1.name + "\n"
                + cat1.color + "\n"
                + cat1.age + "\n"
                + cat1.hungry + "\n");
}