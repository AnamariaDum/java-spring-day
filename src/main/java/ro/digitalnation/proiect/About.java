package ro.digitalnation.proiect;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class About {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String titlu, text;
	
	public About() {}
	
	public About(String titlu, String text) {
		super();
		this.setTitlu(titlu);
		this.setText(text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}



}
