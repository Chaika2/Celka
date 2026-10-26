package celestial;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class rrCA implements Comparator<rdn_3> {
   public int class_(rdn_3 var1, rdn_3 var2) {
      return ComparisonChain.start().compare(var2.char_(), var1.char_()).result();
   }
}
