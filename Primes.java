public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean [] isPrime = new boolean[n];
        for (int i=2; i<n; i++){
            isPrime[i]= true;
        }
        int p=2;
        while (p * p < n){
            if(isPrime[p]){
                for (int i= p*p; i<n; i+=p){
                    isPrime[i] = false;
                }
            }
            p++;
        }
        int count=0;
        for (int i=2; i<n; i++){
            if (isPrime[i]==true){
                System.out.println(i);
                count++;
            }
        }
        int precentage = (count * 100) / n;
        System.out.println("There are "+ count + " primes between 2 and " + n + " ("+ precentage +"% are primes)");
    }
}