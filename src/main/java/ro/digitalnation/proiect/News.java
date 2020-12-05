package ro.digitalnation.proiect;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class News {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String titlu, text, data;
	
	public News() {}
	public News(String titlu, String text, String data) {
		super();
		this.setTitlu(titlu);
		this.setText(text);
		this.setData(data);}
	
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getTitlu() {
		return titlu;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

}
