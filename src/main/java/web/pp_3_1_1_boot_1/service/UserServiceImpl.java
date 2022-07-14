package web.pp_3_1_1_boot_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.pp_3_1_1_boot_1.model.User;
import web.pp_3_1_1_boot_1.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    @Override
    public void add(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public void edit(User user) {
        userRepository.save(user);
    }

    @Override
    public User getById(long id) {
        return userRepository.getReferenceById(id);
    }
}
