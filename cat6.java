class Cat{
    
    public String name;
    public String color;
    public int age;
    public int hungry;
    
    void eatFood(int foodVal) {
        this.hungry += foodVal;
    }
    
}

class VanCat extends Cat{
    //Kalıtım yoluyla VanCat nesnemizi oluşturduk
}

class BlueRussiaCat extends Cat{
    //Kalıtım yoluyla BlueRussiaCat nesnemizi oluşturduk
}

class PersianCat extends Cat{
    //Kalıtım yoluyla PersianCat nesnemizi oluşturduk
}

public class inhertitance_ex {

    public static void main(String[] args) {
        // main method
        
    }

}



public static void main(String[] args) {
        // main method
        
        VanCat cat1 = new VanCat();
        BlueRussiaCat cat2 = new BlueRussiaCat();
        PersianCat cat3 = new PersianCat();
        
        cat1.name = "Tarçın";
        cat2.color = "blue";
        cat3.age = 3;
        
        System.out.println(cat1.name);
        System.out.println(cat2.color);
        System.out.println(cat3.age);

    }