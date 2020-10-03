package enpacsulation;

public class PlayerTO {
	
	public PlayerTO() {
		
	}
	
	public PlayerTO(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "PlayerTO [id=" + id + ", name=" + name + "]";
	}
	
	public String tostring() {
		return "Hai Da "+ name;
	}

	private int id;
	private String name;

}
