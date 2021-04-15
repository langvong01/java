package ADF2.Task07.LambdaDemo;

import ADF2.Task07.LambdaModel.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingLambdaExample {
    /**
     * Examples of how  to use Lambda Expressinon
     * Get users
     * @return a list of user
     */
    private static List<User> getUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User("Peter", 5000,33));
        users.add(new User("Beter", 1000,30));
        users.add(new User("Deter", 2000,31));
        users.add(new User("Ceter", 3000,32));
        users.add(new User("Feter", 4000,34));
        return  users;
    }

    public  void  showUserInfoSortByName(){
        List<User> users = getUsers();
        System.out.println("Before Sort");
        for (User user:users){
            System.out.println(user);
        }
        System.out.println("After Sort");
        // sort by age
        //System.out.println("Sort by age: ");
         //users.sort((User user1, User user2)-> user1.getAge()-user2.getAge());
        //sort by name
        System.out.println("Sort by name");
        users.sort((User user1 , User user2)-> user1.getName().compareTo(user2.getName()));
        users.forEach((user)-> System.out.println(user));
    }
    public void  showUserInfoSortBySalary(){
        List<User> users = getUsers();
        System.out.println("Before Sort");
        for (User user : users){
            System.out.println(user);
        }
        System.out.println("After sort");
        //sort by salary
       users.sort(new Comparator<User>() {
           @Override
           public int compare(User o1, User o2) {
               return (int) (o1.getSalary()-o2.getSalary());
           }
       });
       users.forEach((user)-> System.out.println(user));
    }
    public  void showUserInfoSortBySalaryReverse(){
        List<User> users = getUsers();
        System.out.println("Before Sort");
        for (User user:users){
            System.out.println(user);
        }
        System.out.println("After Sort");

        //Sort by salary
        Comparator <User> salaryComparator = (o1, o2)-> (int) (o1.getSalary() - o2.getSalary());
        users.sort(salaryComparator.reversed());
        //display data
        System.out.println("Sort by salary , reserve order");
        users.forEach((user -> System.out.println(user)));
    }
}
