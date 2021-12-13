package task1;

public class Login {
    public static void main(String[] args) throws MyException {
        Address address1 = new Address("Canada", "Vancouver", "Green", 17);
        User user = new User("Yura", "Some", 19, address1);
        user.validate();
        System.out.println(user);
    }
}