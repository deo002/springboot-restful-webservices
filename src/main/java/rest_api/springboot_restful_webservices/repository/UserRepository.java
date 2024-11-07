package rest_api.springboot_restful_webservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rest_api.springboot_restful_webservices.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
