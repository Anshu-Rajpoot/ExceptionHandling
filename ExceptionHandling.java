
class ExceptionHandling{
    public static void main(String[] args) {
       
        int a=2;
        int b=0;
        try{
        int c=a/b;
        }
        catch(Exception e){
        System.out.println("Exception Caught");
        }       
    }
}