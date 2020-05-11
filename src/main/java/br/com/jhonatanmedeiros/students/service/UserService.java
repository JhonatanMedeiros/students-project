package br.com.jhonatanmedeiros.students.service;

import br.com.jhonatanmedeiros.students.model.UserModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jhonatan Hardt de Medeiros<https://jhonatanmedeiros.com>
 */
public class UserService {
    
    public static void create(UserModel user){
        
    }
    
    public static void update(UserModel user){
        
    }
    
    public static List<UserModel> getAll(){
        List<UserModel> userList = new ArrayList<>();
        
        UserModel user1 = new UserModel("Jhonatan 1", "123123", "09/05/1998", "454545", "12121", "course", "M");
        UserModel user2 = new UserModel("Jhonatan 2", "123123", "09/05/1998", "454545", "12121", "course", "M");
        UserModel user3 = new UserModel("Jhonatan 3", "123123", "09/05/1998", "454545", "12121", "course", "M");
        UserModel user4 = new UserModel("Jhonatan 4", "123123", "09/05/1998", "454545", "12121", "course", "M");
        UserModel user5 = new UserModel("Jhonatan 5", "123123", "09/05/1998", "454545", "12121", "course", "M");
        
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        
        return userList;
    }
    
    public static void delete(UserModel user){
        
    }
    
    
}
