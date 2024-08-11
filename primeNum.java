package Tutorial3;

public class primeNum {
	public static void main(String[] args) {
	        
		for (int i = 2; i <= 100; i++) {
			boolean isPrime = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
	                }
	            }
			if (isPrime) {
	                System.out.print(i + " ");
			}
			else {
				continue;
	            }
	        }
	    }
	}


