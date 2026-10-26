package celestial;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class rrCH implements Comparator<rdn_3> {
   public int class_(rdn_3 var1, rdn_3 var2) {
      return ComparisonChain.start().compareTrueFirst(var1.public_(), var2.public_()).result();
   }
}
