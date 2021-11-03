package Task1;

public class Main {
    public static void main(String[] args) {
        final Address address = new Address("Lviv");

        try {
            final User user = new User("De n", "K KK", -19, Sex.MALE, address);
        }
        catch (MyException e){
            System.out.println(e.getMessage() + '\n' + e.getHttpCode());
        }
    }
}
