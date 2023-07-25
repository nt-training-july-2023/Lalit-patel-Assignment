class Outer
{
  int cnt;
  public void display()
  {
    Inner in = new Inner();
    in.show();
  }

  class Inner
  {
    public void show()
    {
    cnt++;
      System.out.println("Inside inner "+(cnt));
    }
  }
}

class Inner1
{
  public static void main(String[] args)
  {
    Outer ot = new Outer();
    Outer.Inner in = ot.new Inner();
    in.show();
  }
}