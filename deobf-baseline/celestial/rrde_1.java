package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrde_1 implements rrXV {
   private Map<String, rrdp_1> id_class = new HashMap<>();

   @Override
   public rrXt_1 id_byte(String var1) {
      return this.id_class.get(var1);
   }

   public rrde_1(rrdD[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         rrdD var3 = var1[var2];
         if (var3 instanceof rrkr_1 var4) {
            rrdp_1 var5 = new rrdp_1(var4);
            this.id_class.put(var3.id_class(), var5);
         }
      }
   }
}
