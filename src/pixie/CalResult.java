package pixie;

	/*
	 * errCode = 0: calculation success, please get the result by result field
	 * errCode = 1: calculation fail, please get error message by message field
	 */

public class CalResult {
	private int ErrCode;
	private String Message;
	private int Result;
	
	
	public int getErrCode() {
		return ErrCode;
	}
	public void setErrCode(int errCode) {
		this.ErrCode = errCode;
	}
	
	
	public String getMessage (){
		return Message;
	}
	public void setMessage (String message){
		this.Message = message;
	}
	
	public int getResult (){
		return Result;
	}
	public void setResult (int result){
		this.Result = result;
	}
	
	

}
