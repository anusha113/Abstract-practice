public class Driver
{
    public static void main(String[] args) {
        HDFC fc=new HDFC();
       int hdfcRate= fc.getRateOfInterest();
        System.out.println(hdfcRate);

        ICICI ic =new ICICI();
        int iciciRate= ic.getRateOfInterest();
        System.out.println(iciciRate);
    }
}
