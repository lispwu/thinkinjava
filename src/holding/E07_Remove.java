package holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User {
    private static int counter;
    private int count = counter++;
    public String toString(){
        return "User " + count;
    }
}

public class E07_Remove {
    public static void main(String[] args){
        User[] user = new User[10];
        for(int i = 0;i < user.length;i++){
            user[i] = new User();
        }
        List<User> list = new ArrayList<>(Arrays.asList(user));
        System.out.println("list: " + list);
        List<User> subSet = list.subList(3,7);
        System.out.println("subSet: " + subSet);
        subSet.clear();
        System.out.println("list: " + list);
    }
}
