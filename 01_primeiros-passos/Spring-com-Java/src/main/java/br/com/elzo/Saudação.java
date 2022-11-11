package br.com.elzo;

public class Saudação {
	
	private final long id;
	private final String content;
	
	public Saudação(long id, String content) {
		
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
	

}
