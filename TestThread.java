public class TestThread extends Thread {
	int c=0;
    public void run() {
	for (int i=1;i<=10;i++)
	{
        	try {
   		c++;
		System.out.println("Count :"+c);
		this.sleep(1000);
   		} 
		catch (Exception e) {
   			System.out.println(e);
   	}	}
    }

    public static void main(String args[]) {
        TestThread t=new TestThread();
	t.start();
    }

}
  