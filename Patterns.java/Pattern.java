
public class Pattern {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 1; i <= size; ++i) {
            // for(int k=size-i; k>0; k--) {
            // 	System.out.print(" ");
            // }
            for (int j = 1; j <= size + 1 - i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
        for(int i=1; i<=size; ++i) {
			for(int k=1; k<i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=size+1-i; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
    }

