package ro.digitalnation.proiect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
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
		return "About.html";
	}
	
	@GetMapping("/abouttext")
	public String getabouttext() {
		return "About.html";
	}

	@GetMapping("/projecttitlu")
	public String getprojecttitlu() {
		return "Project.html";
	}
	
	@GetMapping("/projecttext")
	public String getprojecttext() {
		return "Project.html";
	}
	
	@GetMapping("/consortiumtitlu")
	public String getconsortiumtitlu() {
		return "Consortium.html";
	}
	
	@GetMapping("/consortiumtext")
	public String getconsortiumtext() {
		return "Consortium.html";
	}
	
	@GetMapping("/newstitlu")
	public String getnewstitlu() {
		return "News.html";
	}
	
	@GetMapping("/newstext")
	public String getnewstext() {
		return "News.html";
	}
	
	@GetMapping("/newsdata")
	public String getnewsdata() {
		return "News.html";
	}
	
	
	@GetMapping("/contact")
	public String getContact() {
		return "contact.html";
	}
	
	@PostMapping("/addContact" )
	public String addContact(Contact a) {
		System.out.println(a);
		contactRepository.save(a);
		return "contact.html";
	}
	
	
	
	
	}
	
	
	
	
	


