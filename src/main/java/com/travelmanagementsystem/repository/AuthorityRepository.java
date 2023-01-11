package com.travelmanagementsystem.repository;

import com.travelmanagementsystem.domain.Authority;
import com.travelmanagementsystem.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {

    Authority findByName(String authority);

}
