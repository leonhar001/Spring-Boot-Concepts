package leonhar001.github.sbexercices.models;

public class Client {
	
	private int id;
	private String name;
	private String register;
	
	public Client(int id, String name, String register) {
		super();
		this.id = id;
		this.name = name;
		this.register = register;
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

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}
	
	
}
