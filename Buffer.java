class Buffer
  {
    public static void main(String args[])
    {
     StringBuffer sb=new StringBuffer("bitlabs");
     // sb.delete(3,6); //Begining indexposition and end index position
      String s="Learning made easy at bitLabs";
      System.out.println(sb.replace(1,2,"hai"));
      System.out.println(sb); 

     System.out.println(s.length()); 
    }
  }