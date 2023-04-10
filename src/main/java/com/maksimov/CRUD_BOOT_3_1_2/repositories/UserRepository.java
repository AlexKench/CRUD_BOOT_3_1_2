package com.maksimov.CRUD_BOOT_3_1_2.repositories;



import com.maksimov.CRUD_BOOT_3_1_2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
