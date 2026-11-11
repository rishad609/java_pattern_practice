public class qn1{
  public static void main(String [] args){
    int timeM = 3456789;
      //1 year=365days=365*24h=365*24*60minutes= 525600minutes
      // 1 days=24*60 minutes = 1440minutes
    int timeD1= timeM/1440;
    int timeY = timeD1/365;
    int timeD = timeD1%365;
    System.out.println("NASA TIME CONVERTER");
    System.out.println( timeM+" is approximately " +timeY+ " years and"+timeD+"days");    
  }
}