package rest_api.springboot_restful_webservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rest_api.springboot_restful_webservices.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
