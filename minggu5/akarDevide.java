public class akarDevide {
   
        public static double sqrtDivideConquer(double x) {
            if (x == 0 || x == 1) return x;
            double low = 0, high = x, mid;
            double epsilon = 0.0001; // Toleransi error
            while (high - low > epsilon) {
                mid = (low + high) / 2;
                if (mid * mid > x)
                    high = mid;
                else
                    low = mid;
            }
            return (low + high) / 2;
        }
    
        public static void main(String[] args) {
            double number = 25; // Ganti dengan angka yang ingin dihitung akarnya
            double squareRoot = sqrtDivideConquer(number);
            System.out.println("Akar dari " + number + " adalah: " + squareRoot);
        }
    
}
