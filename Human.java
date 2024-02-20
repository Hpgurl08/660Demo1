public class Human {
    // 2 attributes for Human Super Class
    protected String character = "Happy";
    protected String ageGroup = "18 to 21";

    // 2 methods for Human Super Class
    public void living(){
        System.out.println("This human lives in Ohio");
    }

    public void favouriteDestination(){
        System.out.println("This human likes to visit Maldives");
    }

}
class Body extends Human {
    // 2 attributes for Body Sub Class
    private int arm = 2;
    private  int legs = 2;

    // 2 methods for Body Sub Class
    public void gender(){
        System.out.println("This human is a Male and has "+ arm + " Arms and " + legs + " Legs.");
    }
    public void realAge(){
        System.out.println("He has an age of 17");
    }
}

class College extends Body {
    // 2 attributes for College Sub Class
    private String student = "Standford University";
    private  String collegeAddress = "Stanford, California, U.S. (adjacent to Palo Alto)";

    // 2 methods for College Sub Class
    public void collegeName(){
        System.out.println("This human is a Student in " + student);
    }
    public void address(){
        System.out.println("The Student address is "+ collegeAddress);
    }
}
class DailyRoutine extends College{
    // 2 attributes for DailyRoutine Sub Class
    private String wakeUp = "6 AM";
    private String sleep = "11 PM";
    // 2 methods for DailyRoutine Sub Class
    public void fitness(){
        System.out.println("He walks daily 5 miles.");
        System.out.println("His sleep cycle is  Waking Up at "+wakeUp + " and sleeping at " + sleep);
    }
    public void eatingHabits(){
        System.out.println("He eats healthy and balanced diets.");
    }
}

// Tester class
 class Main {
    // main method
    public static void main(String[] args){
        // object created for Sub class DailyRoutine
        DailyRoutine human = new DailyRoutine();
        System.out.println("The Human is very " + human.character);
        System.out.println("The Human has an Age Group in between: " + human.ageGroup);
        human.gender();
        human.realAge();
        human.collegeName();
        human.address();
        human.fitness();
        human.eatingHabits();
        human.living();
        human.favouriteDestination();
    }
}

