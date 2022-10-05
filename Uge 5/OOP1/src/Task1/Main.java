package Task1;

public class Main {

    static Car ford= new Car("Ford","Focus",1999,"Cabriolet");
    static Car mercedes = new Car("Mercedes", "G63", 2023, "Coupe");
    static Driver julle= new Driver("Julius", 18);
    public static void main(String[] args) {

        ford.setDriver(julle);
        System.out.println(ford.getDriver());
        System.out.println(ford.toString());
        System.out.println(julle.toString());

        mercedes.setDriver(julle);
        System.out.println(mercedes.getDriver());
        System.out.println(mercedes.toString());
        System.out.println(julle.toString());
    }

}