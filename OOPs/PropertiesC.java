import java.util.Properties;
import java.util.Set;
import java.util.Iterator;
// import java.util.String;
public class PropertiesC {

   public static void main(String args[]) {
      Properties State = new Properties();
      Set capital;
      String str;
      
      State.put("MP", "bhopal");
      State.put("GUJRAT", "ahemdabad");
      State.put("JNK", "jammu and kashmir");
      State.put("ANDRA PRDESH", "hydrabad");
      State.put("MAHARASTRA", "Mumbai");

      
      capital = State.keySet();   // get set-view of keys
      Iterator itr = capital.iterator();
      
      while(itr.hasNext()) {
         str = (String) itr.next();
         System.out.println("The capital of " + str + " is " + 
            State.getProperty(str) + ".");
      }     
      System.out.println();

      // look for state not in list -- specify default
      str = State.getProperty("rajasthan", "Not Found");
      System.out.println("The capital of rajasthan is " + str + ".");
   }
}