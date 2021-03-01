//kedi nesnemiz
class Cat{
      
    public String name;
    public String color;
    private int age;
    int hungry;
    //main constructor
    public Cat() {
        this.name = "isim degeri girilmedi.";
        this.color = "renk degeri girilmedi.";
        this.age = 0;
        this.hungry = 0;
    }
    
    //parameters constructor
    public Cat(String name, String color, int age, int hungry) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.hungry = hungry;
    }
   
    //getter age
    public int getAge(){
        return age; 
    }
    //setter age
    public void setAge(int age){
        this.age = age;
    }
}
public class constructor_example {

    public static void main(String[] args) {
        // main method
        Cat cat1 = new Cat();
       
        cat1.setAge(2);   
        System.out.println(cat1.getAge());     
    }
}