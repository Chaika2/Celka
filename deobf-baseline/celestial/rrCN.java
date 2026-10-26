package celestial;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class rrCN implements Comparator<rdn_3> {
   public int id_class(rdn_3 var1, rdn_3 var2) {
      return ComparisonChain.start().compare(var2.id_char(), var1.id_char()).result();
   }
}
