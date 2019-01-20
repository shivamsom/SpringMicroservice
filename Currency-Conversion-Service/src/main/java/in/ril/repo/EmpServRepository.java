package in.ril.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ril.entity.EmpDetails;

public interface EmpServRepository extends JpaRepository<EmpDetails,String> {

	
	
}
