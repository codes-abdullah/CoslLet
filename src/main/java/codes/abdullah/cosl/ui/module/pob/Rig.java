package codes.abdullah.cosl.ui.module.pob;

import java.time.LocalDate;

public class Rig {
	private String name;
	private LocalDate arrivalDate;
	private int room;
	private int lifeboat;
	private int liferaft;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public int getLifeboat() {
		return lifeboat;
	}

	public void setLifeboat(int lifeboat) {
		this.lifeboat = lifeboat;
	}

	public int getLiferaft() {
		return liferaft;
	}

	public void setLiferaft(int liferaft) {
		this.liferaft = liferaft;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

}
