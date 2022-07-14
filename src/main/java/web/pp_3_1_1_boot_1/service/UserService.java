package web.pp_3_1_1_boot_1.service;


import web.pp_3_1_1_boot_1.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void add(User user);
    void delete(User user);
    void edit(User user);
    User getById(long id);
}
