package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException{
	
	/* Made for handle the errors from the form window
	 * In the DepartmentForm, we have Id and Name...
	 * ...which means that we must handle two erros.
	 */
	
	
	private static final long serialVersionUID = 1L;
	
	// First String: id or name. Second String: Error messege
	private Map<String, String> errors = new HashMap<>();

	public ValidationException(String msg) {
		super(msg);
	}
	
	public Map<String, String> getErrors(){
		return errors;
	}
	
	public void addError(String fieldName, String errorMessege) {
		errors.put(fieldName, errorMessege);
	}

}
