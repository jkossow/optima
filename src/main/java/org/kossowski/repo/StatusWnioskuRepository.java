package org.kossowski.repo;

import java.util.List;

import org.kossowski.domain.StatusWniosku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StatusWnioskuRepository extends JpaRepository<StatusWniosku, Integer> {
	
	@Query(" select s from StatusWniosku s  where s.id = 1")
	public StatusWniosku getInitialStatus();
	
	@Query( "select s from StatusWniosku s where s.id in (1,400,401,402,403)")
	public List<StatusWniosku> statusyOptima();

}
