public class Main {
    public static void main(String[] args) {

       User user1 = new User();
       user1.setFirstName("Hellen");
       user1.setLastName("John");
       user1.setUserName("Hellen01");
       user1.createUser("user_xml.xml");


        User user2 = new User();
        user2.setFirstName("Ella");
        user2.setLastName("Err");
        user2.setUserName("Err1");
        user2.createUser("user2_xml.xml");

        User u = User.showAllUsers("user_xml.xml");
        System.out.println(u);

    }
}
