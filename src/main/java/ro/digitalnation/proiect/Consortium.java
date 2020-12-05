package ro.digitalnation.proiect;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consortium {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String titlu, text;
	
	public Consortium() {}
	
	public Consortium(String titlu, String text) {
		super();
		this.setTitlu(titlu);
		this.setText(text);
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
