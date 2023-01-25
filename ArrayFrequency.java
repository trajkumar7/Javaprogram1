//Frequency of elements in the array.
class ArrayFrequency
  {
    public static void main(String args[])
    {
      int a[]={2,3,2,1,4,3,2};
      int count;
      int n=a.length;
      boolean visited[]=new boolean[n];
      for(int i=0;i<n;i++)
        {
          visited[i]=false;
        }
    System.out.println("the array elements are");
      for(int i=0;i<a.length;i++)
        {
          count=1;
          if(visited[i]==true)
            continue;
          for(int j=i+1;j<a.length;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                visited[j]=true;
              }
            }
          System.out.println("the frequency of "+a[i]+ "-------------"+count);
        }
    }
  }

// unic or distinct elements in array
/*class ArrayFrequency
  {
    public static void main(String args[])
    {
      int a[]={2,3,2,1,4,3,2};
      int count;
      int n=a.length;
      boolean visited[]=new boolean[n];
      for(int i=0;i<n;i++)
        {
          visited[i]=false;
        }
    System.out.println("the array elements are");
      for(int i=0;i<a.length;i++)
        {
          count=1;
          if(visited[i]==true)
            continue;
          for(int j=i+1;j<a.length;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                visited[j]=true;
              }
            }
         if (count==1){
           System.out.println(a[i]);
         }
        }
    }
  }*/