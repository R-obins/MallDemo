package cn.store.service.ex;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 4702489653158371174L;
	public UserNotFoundException(){
		
	}
	public UserNotFoundException(String message){
		super(message);
	}
	
}
