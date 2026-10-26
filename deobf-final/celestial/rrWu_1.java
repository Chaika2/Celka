package celestial;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class rrWu_1 {
   private static final Map<aI_2, Integer> class_ = new HashMap<>();
   private static final Map<String, Integer> break_ = new HashMap<>();
   private static final Map<String, Integer> byte_ = new HashMap<>();

   static {
      for (aI_2 var1 : rVL.transient_) {
         int var2 = rVL.transient_.class_(var1);
         rqO_2 var3 = rVL.transient_.break_(var1);
         String var4 = var3.toString();
         String var5 = var3.break_();
         if (class_.containsKey(var1)) {
            rrbb_3.protected_("Duplicate entity type: " + var1 + ", id1: " + class_.get(var1) + ", id2: " + var2);
         }

         if (break_.containsKey(var4)) {
            rrbb_3.protected_("Duplicate entity location: " + var4 + ", id1: " + break_.get(var4) + ", id2: " + var2);
         }

         if (byte_.containsKey(var4)) {
            rrbb_3.protected_("Duplicate entity name: " + var5 + ", id1: " + byte_.get(var5) + ", id2: " + var2);
         }

         class_.put(var1, var2);
         break_.put(var4, var2);
         byte_.put(var5, var2);
      }
   }

   public static int class_(String var0) {
      Integer var1 = break_.get(var0);
      return var1 == null ? -1 : var1;
   }

   public static int class_(an_3 var0) {
      return var0 == null ? -1 : class_(var0.BC());
   }

   public static int class_(aI_2 var0) {
      Integer var1 = class_.get(var0);
      return var1 == null ? -1 : var1;
   }

   public static int break_(String var0) {
      var0 = var0.toLowerCase(Locale.ROOT);
      Integer var1 = byte_.get(var0);
      return var1 == null ? -1 : var1;
   }
}
