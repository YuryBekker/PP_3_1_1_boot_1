package web.pp_3_1_1_boot_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.pp_3_1_1_boot_1.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
