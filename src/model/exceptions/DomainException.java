package model.exceptions;

// extends Exception <-- compilador obriga a tratar
// extends RuntimeException <-- o compilador não obriga a tratar
public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}


