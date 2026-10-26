package celestial;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class rrCH implements Comparator<rdn_3> {
   public int id_class(rdn_3 var1, rdn_3 var2) {
      return ComparisonChain.start().compareTrueFirst(var1.id_public(), var2.id_public()).result();
   }
}
