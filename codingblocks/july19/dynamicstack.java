package july19;

public class dynamicstack  extends stack
{
	public dynamicstack(int cap)
	{
		super(cap);
	}
	
	public void push(int val) throws Exception
	{  if(this.tos==this.data.length-1)
	{
		int []oa= this.data;
		this.data=new int [2*oa.length];
		
		for(int i=0;i<oa.length;i++)
		{
			this.data[i]=oa[i];
		}
	}
	
	this.tos++;
	this.data[this.tos]=val;
		
	}

}
