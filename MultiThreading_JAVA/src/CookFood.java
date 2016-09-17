public class CookFood {
	
    public void waitFor(int mSec) {
        try {
            Thread.sleep(mSec);
        } catch(InterruptedException ignored) {
            
        }
    }

	//Lets assume DAL requires 5 litres of Oil for cooking
	public void cookDal(Oil totalOil) {
        totalOil.consumeNLitres(1, "DAL");
        waitFor(300);
        totalOil.consumeNLitres(2, "DAL");
        waitFor(400);
        totalOil.consumeNLitres(2, "DAL");

	}
	
	//Lets assume Curry requires 5 litres of Oil for cooking
	public void cookCurry(Oil totalOil) {
        totalOil.consumeNLitres(2, "CURRY");
        waitFor(300);
        totalOil.consumeNLitres(1, "CURRY");
        waitFor(200);
        totalOil.consumeNLitres(1, "CURRY");
        totalOil.consumeNLitres(1, "CURRY");
	}


	public static void main(String[] args) throws InterruptedException {
		
		final CookFood cook = new CookFood();
		final Oil oil = new Oil("sunflower", 10);
		
		Thread dalThread = new Thread (new Runnable()
		{
			public void run() {
				
                cook.cookDal(oil);
			}
		});
		
		
		Thread curryThread = new Thread (new Runnable()
		{
			public void run() {
                cook.cookCurry(oil);
			}
		});
		
		dalThread.start();
		curryThread.start();
		
		dalThread.join();
		curryThread.join();
	
	}
}