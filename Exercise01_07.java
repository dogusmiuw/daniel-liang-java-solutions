class Exercise01_07 {
    public static void main(String[] args) {
        int boundary = 123123;
        double result = 1;
        for(int i = 3, j = 0; i <= boundary; j++){
            if(j % 2 == 0)
                result -= 1.0/i;
            else
                result += 1.0/i;
            i += 2;
        }
        result = 4 * result;
        System.out.println("Result = " +result);
    }
}
