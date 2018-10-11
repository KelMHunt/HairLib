package salon.communication;

public class Request 
{
	private String action;//stores method/procedure to be called
	private Object obj;//data to send
	
	public Request() 
	{
		this.action = "";
		this.obj = null;
	}
	
	public Request(String action) 
	{
		this.action = action;
		this.obj = null;
	}
	public Request(String action, Object obj) 
	{
		this.action = action;
		this.obj = obj;
	}
	public String getAction() 
	{
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Request [action=" + action + ", obj=" + obj + "]";
	}
	
}
