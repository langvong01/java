package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUserDefineObjectExample {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Rajeev",25));
        users.add(new User("John",34));
        users.add(new User("Steve",30));
        users.add(new User("Angel",29));
        users.forEach(user -> {
            System.out.println("Name : "+ user.getName() + ", Age: "+user.getAge());
        });
    }
}
