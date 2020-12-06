package ro.digitalnation.proiect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class ClassTrack {
	
//	@Autowired
//	private AboutRepository aboutRepository;
//	@Autowired
//	private ConsortiumRepository consortiumRepository;
	@Autowired
	private ContactRepository contactRepository;
//	@Autowired
//	private NewsRepository newsRepository;
//	@Autowired
//	private ProjectRepository projectRepository;
	
	
		
	@GetMapping("/abouttitlu")
	public String getabouttitlu() {
		return "Introduction";
	}
	
	@GetMapping("/abouttext")
	public String getabouttext() {
		return "Text despre about";
	}

	@GetMapping("/projecttitlu")
	public String getprojecttitlu() {
		return "Introduction";
	}
	
	@GetMapping("/projecttext")
	public String getprojecttext() {
		return "Text despre project";
	}
	
	@GetMapping("/consortiumtitlu")
	public String getconsortiumtitlu() {
		return "Introduction despre Consortium";
	}
	
	@GetMapping("/consortiumtext")
	public String getconsortiumtext() {
		return "Text despre Consortium";
	}
	
	@GetMapping("/newstitlu")
	public String getnewstitlu() {
		return "News Title";
	}
	
	@GetMapping("/newstext")
	public String getnewstext() {
		return "News Text";
	}
	
	@GetMapping("/newsdata")
	public String getnewsdata() {
		return "News data";
	}
	
	
	@GetMapping("/contact")
	public String getContact() {
		return "contact.jsp";
	}
	
	@PostMapping("/addContact" )
	public String addContact(Contact a) {
		System.out.println(a);
		contactRepository.save(a);
		return "contact.jsp";
	}
	
	
	
	
	}
	
	
	
	
	


