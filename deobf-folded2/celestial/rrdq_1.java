package celestial;

import java.util.Map;

public class rrdq_1 implements rrXV {
   private Map<String, String> id_class = null;

   @Override
   public rrXt_1 id_byte(String var1) {
      String var2 = "defined_";
      if (var1.startsWith(var2)) {
         String var5 = var1.substring(var2.length());
         return this.id_class.containsKey(var5) ? new rrXl_1(rrXq_1.TRUE, (rrXt_1[])null) : new rrXl_1(rrXq_1.FALSE, (rrXt_1[])null);
      } else {
         while (this.id_class.containsKey(var1)) {
            String var3 = this.id_class.get(var1);
            if (var3 == null || var3.equals(var1)) {
               break;
            }

            var1 = var3;
         }

         int var4 = rrbb_3.id_class(var1, Integer.MIN_VALUE);
         if (var4 == Integer.MIN_VALUE) {
            rrbb_3.id_protected("Unknown macro value: " + var1);
            return new rrXv_1(0.0F);
         } else {
            return new rrXv_1((float)var4);
         }
      }
   }

   public rrdq_1(Map<String, String> var1) {
      this.id_class = var1;
   }
}
