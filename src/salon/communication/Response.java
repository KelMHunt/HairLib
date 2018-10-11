package salon.communication;

public class Response 
{
	private boolean success;
	private String errorMsg;
	private Object data;
	
	public Response()
	{
		success=true;
		errorMsg="";
		data=null;
	}
	public Response(boolean success, String errorMsg, Object data)
	{
		this.success=true;
		this.errorMsg=errorMsg;
		this.data=data;
	}
	public Response(boolean success)
	{
		this.success=success;
		this.errorMsg="";
		this.data=null;
	}
	public Response(String errorMsg)
	{
		this.success=true;
		this.errorMsg=errorMsg;
		this.data=null;
	}
	public Response(Object data)
	{
		this.success=true;
		this.errorMsg="";
		this.data=data;
	}
	@Override
	public String toString() {
		return "Response [success=" + success + ", errorMsg=" + errorMsg
				+ ", data=" + data + "]";
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
