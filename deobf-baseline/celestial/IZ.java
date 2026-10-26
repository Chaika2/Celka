package celestial;

import java.util.Map;
import java.util.Map.Entry;

public class IZ {
   private final rqO_2 id_class;
   private final Map<rqO_2, Float> id_break;

   public IZ(rqO_2 var1, Map<rqO_2, Float> var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public rqO_2 id_class() {
      return this.id_class;
   }

   boolean id_class(rdn_3 var1, gm_3 var2, iB_2 var3) {
      rdb_3 var4 = var1.id_break();

      for (Entry var6 : this.id_break.entrySet()) {
         rdE_2 var7 = rdv_3.id_class(var4, (rqO_2)var6.getKey());
         if (var7 == null || var7.call(var1, var2, var3) < (Float)var6.getValue()) {
            return false;
         }
      }

      return true;
   }
}
