package org.kossowski.repo;

import org.kossowski.domain.Path2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Path2Repository extends JpaRepository<Path2, Integer>{
	
	public Path2 findByIdWniosku( Integer id );
	public Path2 findByIdWnioskodawcy( Integer id );

}
