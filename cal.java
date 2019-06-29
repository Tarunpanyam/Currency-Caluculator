public class CurrencyConverter {
     
	    // Currency exchange rates of different currencies relative to 1 US dollar
        static double[] exchangeRates;
		
		void setExchangeRates(double[] rates) {
			exchangeRates = rates;
		}
		
		void updateExchangeRate(int arrayIndex, double newVal) {
			exchangeRates[arrayIndex] = newVal;
		}
		
		double getExchangeRate(int arrayIndex) {
			return exchangeRates[arrayIndex];
		}
		
		double computeTransferAmount(int arrayIndex, double amount) {
			return amount * getExchangeRate(arrayIndex);
		}
       
        static void printCurrencies() {
    	     System.out.println("\nrupee: " + exchangeRates[0]);
    	     System.out.println("dirham: " + exchangeRates[1]);
    	     System.out.println("real: " + exchangeRates[2]);
    	     System.out.println("chilean_peso: " + exchangeRates[3]);
    	     System.out.println("mexican_peso: " + exchangeRates[4]);
    	     System.out.println("_yen: " + exchangeRates[5]);
    	     System.out.println("$australian: " + exchangeRates[exchangeRates.length-1]);
        }
    	   
        public static void main(String[] args) {
    	     CurrencyConverter cc = new CurrencyConverter();
			 
			 // Jan 1st
			 double[] rates = {63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};
			 cc.setExchangeRates(rates);
			 
    	     cc.printCurrencies();
			 
			 rates = new double[]{65.0, 5.0, 3.0, 595.5, 18.0, 107.0, 2.0};
			 cc.setExchangeRates(rates);
			 
    	     cc.printCurrencies();
			 
			 cc.updateExchangeRate(0, 66.0);
			 cc.printCurrencies();
			 
			 double amount = cc.computeTransferAmount(0, 1000);
			 System.out.println("\nTransferred amount: " + amount);
        }
    }
