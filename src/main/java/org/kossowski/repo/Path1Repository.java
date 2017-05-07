package org.kossowski.repo;

import org.kossowski.domain.Path1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Path1Repository  extends JpaRepository<Path1, Integer>{
	
	public Path1 findByIdWniosku( Integer id );
	public Path1 findByIdWnioskodawcy( Integer id );

}
