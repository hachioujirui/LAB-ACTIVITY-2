public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Toyota", "Corolla", 2020);
        Vehicle vehicle2 = new Vehicle("Ford", "Mustang", 1965);
        Vehicle vehicle3 = new Vehicle("Honda", "Civic", 2015);

        System.out.println("Vehicle 1:");
        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());
        System.out.println();

        System.out.println("Vehicle 2:");
        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());
        System.out.println();

        System.out.println("Vehicle 3:");
        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
    }
}
