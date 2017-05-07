package org.kossowski.repo;

import java.util.List;

import org.kossowski.domain.Wniosek;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WniosekRepository  extends JpaRepository<Wniosek, Integer>{

	public List<Wniosek> findByBank( Integer bank );
	
	
	
}
