class PALINDROME {
    public static void main(String args[]) {
        int num = 121; 
        int org = num;
        int rem, rev = 0;
        
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        
        if (rev == org) {
            System.out.println(org + " is a palindrome");
        } else {
            System.out.println(org + " is not a palindrome");
        }
    }
}
