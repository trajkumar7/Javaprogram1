class Exap{
  public static void main(String args[]){
    String st=null;
    try{
    System.out.println(st.length());
    }
    catch(NullPointerException s)
      {
         System.out.println(s);
        s.printStackTrace();
        
      }
     System.out.println("exception handl");
  }
}