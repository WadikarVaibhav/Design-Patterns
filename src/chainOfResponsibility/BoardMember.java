package chainOfResponsibility;

public abstract class BoardMember {

	protected BoardMember successor;
	
	public void setSuccessor(BoardMember successor) {
		this.successor = successor;
	}
	
	public abstract void organizeEvent(Event event);
	
}
