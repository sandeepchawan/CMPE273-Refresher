public class Oil {

	private final String oilName;
	private int litres;
	
    public Oil(String oilName, int litres) {
        this.oilName = oilName;
        this.litres = litres;
    }
    
    public String getOilName() {
        return oilName;
    }
    
    public boolean consumeOneLitre(final String consumer) {
        if(litres == 0) {
            System.out.println("No oil to consume");
            return false;
        }
        litres--;
        System.out.println("Consumed one litre, for: " + consumer + ", remaining: " + litres);
        return true;
    }
    
    public synchronized boolean consumeNLitres(final int n, final String consumer) {
        if(litres < n) {
            System.out.println("Not enough litres, requested: " + n + ", but only left were: " + litres);
            return false;
        }
        System.out.println("Requested oil for litres: " + n + " from consumer: " + consumer);
        for(int i=0; i<n; ++i) {
            boolean result = consumeOneLitre(consumer);
            if(result == false) {
                return false;
            }
        }
        System.out.println("Completed the request for oil: " + n + " from consumer: " + consumer);
        System.out.println();
        return true;
    }
}
