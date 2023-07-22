
class Datatype{
        static byte a;  //values betweeen -128 to 127
        short b; //-32,768 to 32,767 
        int c; //-2,147,483,648 to 2,147,483,647 
        float d;  //1.4e–045 to 3.4e+038
        long e;
        double f;
        char h;
        boolean i;
     
    public  void initialization(){
         a=2;  //values betweeen -128 to 127
         b=5; //-32,768 to 32,767 
        c=1222; //-2,147,483,648 to 2,147,483,647 
        d=1.4f;  //1.4e–045 to 3.4e+038
        e=1223;
        f=2324434;
        h='A';
        i=true;
    }

    public  void Assignment(){
        a=12; 
        b=3800;
        c=123344554;
        d=1.3f;
        e=12332434;
        f=1221323.334343;
        h='a';
        i=false;
    }

    public  void printAll() {
          System.out.println(a);
          System.out.println(b);
          System.out.println(c);
          System.out.println(d);
          System.out.println(e);
          System.out.println(f);
          System.out.println(h);
          System.out.println(i);
         }

    public static void main(String args[]){
        Datatype d=new Datatype();
        d.initialization();
        d.printAll();
        d.Assignment();
        d. printAll();
       
    }
        
}