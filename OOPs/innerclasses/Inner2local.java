class Outer
{
  int count;
  public void display()
  {
    for(int i=0;i<5;i++)
    {
      class Inner
      {
        public void show()
        {
          System.out.println("Inside inner "+(count++));
        }
      }
      Inner in=new Inner();
      in.show();
    }
  }
}

class Inner2local
{
  public static void main(String[] args)
  {
    Outer ot = new Outer();
    ot.display();
  }
}