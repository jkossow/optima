package org.kossowski.repo;

import java.util.List;

import org.kossowski.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public List<User> findByNazwiskoIsNotNullAndImieIsNotNull();

}
