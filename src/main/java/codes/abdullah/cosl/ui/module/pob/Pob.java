package codes.abdullah.cosl.ui.module.pob;

import java.time.LocalDate;
import java.util.Set;

public class Pob {
	private Set<Person> all;
	private LocalDate date;
	public Set<Person> getAll() {
		return all;
	}
	public void setAll(Set<Person> all) {
		this.all = all;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
