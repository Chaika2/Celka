package celestial;

import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

public class rrzE_2 extends Properties {
   private Set<Object> class_ = new LinkedHashSet<>();

   @Override
   public synchronized Object put(Object var1, Object var2) {
      if (var1 instanceof String) {
         var1 = ((String)var1).trim();
      }

      if (var2 instanceof String) {
         var2 = ((String)var2).trim();
      }

      this.class_.add(var1);
      return super.put(var1, var2);
   }

   @Override
   public synchronized Enumeration<Object> keys() {
      return Collections.enumeration(this.keySet());
   }

   @Override
   public Set<Object> keySet() {
      Set var1 = super.keySet();
      this.class_.retainAll(var1);
      return Collections.unmodifiableSet(this.class_);
   }
}
