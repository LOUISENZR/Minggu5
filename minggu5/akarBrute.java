public class akarBrute {
        public static double sqrtBruteForce(double x) {
            if (x == 0 || x == 1) return x;
            
            double result = 1;
            double epsilon = 0.0001; // Toleransi error
            while (Math.abs(result * result - x) > epsilon) {
                result = (result + x / result) / 2;
            }
            return result;
        }
    
        public static void main(String[] args) {
            double number = 25; // Ganti dengan angka yang ingin dihitung akarnya
            double squareRoot = sqrtBruteForce(number);
            System.out.println("Akar dari " + number + " adalah: " + squareRoot);
        }
    
}
