package celestial;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class rdR_2 extends rdb_3 {
   private static final Map<rqA_2, rdR_2> id_class = Maps.newHashMap();
   private final int id_break;
   private final rqA_2 id_byte;

   protected rdR_2(int var1, rqA_2 var2, rdO_2 var3) {
      super(var3);
      this.id_break = var1;
      this.id_byte = var2;
      id_class.put(this.id_byte, this);
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      xc_3 var4 = var2.id_byte(var3);
      if (var4.id_class(xu_3.Pj) && !var4.id_byte(kz_3.id_volatile)) {
         rdn_3 var5 = var1.id_volatile();
         if (!var2.id_continue) {
            ((kz_3)xu_3.Pj).id_class(var2, var3, var4, var5);
            var2.id_class((rhd_3)null, 1010, var3, rdb_3.id_class(this));
            var5.id_catch(1);
            rhd_3 var6 = var1.id_final();
            if (var6 != null) {
               var6.id_break(rlB_2.W);
            }
         }

         return ryZ_2.id_class(var2.id_continue);
      } else {
         return ryZ_2.PASS;
      }
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      var3.add(this.id_private().id_class(rgF_2.GRAY));
   }

   public static rdR_2 id_class(rqA_2 var0) {
      return id_class.get(var0);
   }

   public int id_catch() {
      return this.id_break;
   }

   public rqA_2 id_return() {
      return this.id_byte;
   }

   public rVi_1 id_private() {
      return new rgn_3(this.id_break() + ".desc");
   }
}
