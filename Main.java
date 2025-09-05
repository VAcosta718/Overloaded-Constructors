public class Main {
    public static void main(String[] args) {

        User user1 = new User("Omniman");
        User user2 = new User("Spiderman", "PeterP@outlook.com");
        User user3 = new User("Bruce", "Batman@Gotham.com", 55);
        User user4 = new User();

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
