package celestial;

import java.util.Map;
import java.util.Map.Entry;

public class IZ {
   private final rqO_2 class_;
   private final Map<rqO_2, Float> break_;

   public IZ(rqO_2 var1, Map<rqO_2, Float> var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public rqO_2 class_() {
      return this.class_;
   }

   boolean class_(rdn_3 var1, gm_3 var2, iB_2 var3) {
      rdb_3 var4 = var1.break_();

      for (Entry var6 : this.break_.entrySet()) {
         rdE_2 var7 = rdv_3.class_(var4, (rqO_2)var6.getKey());
         if (var7 == null || var7.call(var1, var2, var3) < (Float)var6.getValue()) {
            return false;
         }
      }

      return true;
   }
}
