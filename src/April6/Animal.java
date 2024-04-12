package April6;

public class Animal {

    String colour;
    String name;
    double weight;

    Animal(){
        colour = "black";
        name="Dog";
        weight = 20.3;
    }

    public void charAnimal(){
        System.out.println("Animal name is: "+name);
        System.out.println("Animal colour is: "+colour);
        System.out.println("Animal weight is: "+weight);
    }
    public void makeSound(){
        System.out.println(name+ " is making sound");
    }

    public void animalWalk(){
        System.out.println(name+" is walking");
    }

}
