package in.ril;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ril.entity.EmpDetails;
import in.ril.repo.EmpServRepository;

@RestController
@RequestMapping("/emp")
public class EmpServController {

	@Autowired
	private EmpServRepository repo;
	
	@PostMapping("/create")
	public String create(@RequestBody EmpDetails emp)
	{
		
		try {
		repo.save(emp);
		return "insertion success";
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return "insertion failed :::: Error Message ==>"+ex.getMessage();
		}

	}
	
	@GetMapping("/find/{empId}")
	public EmpDetails findEmployee(@PathVariable("empId")String empId)
	{
		try {
			return repo.findById(empId).get();
		}
		catch(Exception ex) {
			return  null;
		}
	}
	
	@GetMapping("/findAll")
	public List findAll() {
		return repo.findAll();
	}
}
