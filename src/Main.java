public class Main {
    public static void main(String[] args) {
        Cat thor = new Cat();
        Cat rambo = new Cat();
        //System.out.println("Hello world!");
        /*
       Defining Thor cat
        */
        thor.name = "Thor";
        thor.age = 3;
        thor.breed = "Russian Blue";
        thor.color = "Brown";

        thor.sleep();

       /*
       Defining Rambo cat
        */
        rambo.name = "Rambo";
        rambo.age = 4;
        rambo.breed = "Maine Coon";
        rambo.color = "Brown";

        rambo.play();
    }

}