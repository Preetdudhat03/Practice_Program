//A multithreaded program implementing rennable interface to find leap year between 1950 to 2000
//create two threads and devided task equaly
class LeapYear {
	int start,end;
	Thread t;
	LeapYear(int start,int end,String name)
	{
		this.start = start;
		this.end = end;
		RunClass RC = new RunClass(start,end);
		t = new Thread(RC,name);
		t.start();
	}
	public static void main(String[] args){
		LeapYear ly1 = new LeapYear(1950,1975,"Thread 1 ");
		LeapYear ly2 = new LeapYear(1976,2000,"Thread 2 ");

		try{
		ly1.t.join();
		ly2.t.join();
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}
} 

class RunClass implements Runnable{
	int start,end,count;
	RunClass(int start,int end){
		this.start = start;
		this.end = end;
	}
	public void run(){
		for(int i=start;i<=end;i++){
			if(i%4 == 0){
				if(i%100 == 0){
					if(i%400 == 0){
						System.out.println(i + Thread.currentThread().getName());
					}
				}
				else
					System.out.println(i + Thread.currentThread().getName());
			}
		}
	}
}