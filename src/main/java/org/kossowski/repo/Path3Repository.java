package org.kossowski.repo;

import org.kossowski.domain.Path3;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Path3Repository extends JpaRepository<Path3, Integer>{
	
	public Path3 findByIdWniosku( Integer id );
	public Path3 findByIdWnioskodawcy( Integer id );

}
