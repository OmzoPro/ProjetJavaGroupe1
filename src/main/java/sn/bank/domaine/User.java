package sn.bank.domaine;


public class User {
	private Client client= new Client();
	private Agent agent= new Agent();
	
	
	private String iduser;
	private String login;
	private String password;
	private String role;
	private int idClient;
	private int idAgent;
	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public User(String login, String password, String role) {
		super();
		this.login = login;
		this.password = password;
		this.role = role;
	}

	public User(String iduser, String login, String password, String role) {
		super();
		this.iduser = iduser;
		this.login = login;
		this.password = password;
		this.role = role;
	}	
	

	public User(String login, String password, int idAgent) {
		super();
		this.login = login;
		this.password = password;
		this.idAgent = idAgent;
	}

	public User(String login, String password, String role, int idClient, int idAgent) {
		super();
		this.login = login;
		this.password = password;
		this.role = role;
		this.idClient = idClient;
		this.idAgent = idAgent;
	}

	public User() {
		super();
	}

	public String getIduser() {
		return iduser;
	}

	public void setIduser(String iduser) {
		this.iduser = iduser;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public int getIdAgent() {
		return idAgent;
	}

	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}


	@Override
	public String toString() {
		return "User [iduser=" + iduser + ", login=" + login + ", password=" + password + ", role=" + role
				+ ", idClient=" + idClient + ", idAgent=" + idAgent + "]";
	}



	public User Client(String nomClient, String prenomClient, String adresseClient, int telephoneClient,
			String emailClient, String naissanceClient, String dateCreaClient, Double cniClient, String sexeClient) {
		// TODO Auto-generated method stub
		return null;
	}

	public User Agent(int idAgence, String nomAgent, String prenomAgent, String adresseAgent, int telephoneAgent,
			String naissanceAgent, String dateCreaAgent, String sexeAgent, String emailAgent, String gradeAgent) {
		// TODO Auto-generated method stub
		return null;
	}


}
