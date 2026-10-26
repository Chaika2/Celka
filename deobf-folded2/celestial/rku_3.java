package celestial;

import java.util.Map;

public class rku_3 extends rxJ_2 {
   protected final xd_3 id_class;

   @Override
   public xc_3 id_byte(rxx_3 var1) {
      xc_3 var2 = this.id_class.id_class(var1);
      xc_3 var3 = null;
      rYB var4 = var1.id_int();
      rfH_2 var5 = var1.id_class();

      for (rpr_3 var9 : var1.id_throws()) {
         if (var9 != rpr_3.UP) {
            xc_3 var10 = var9 == rpr_3.DOWN ? this.id_catch().id_class(var1) : var2;
            if (var10 != null && var10.id_class((rRR)var4, var5)) {
               var3 = var10;
               break;
            }
         }
      }

      return var3 != null && var4.id_class(var3, var5, rjm_3.id_break()) ? var3 : null;
   }

   public rku_3(xd_3 var1, xd_3 var2, rdO_2 var3) {
      super(var1, var3);
      this.id_class = var2;
   }

   @Override
   public void id_class(Map<xd_3, rdb_3> var1, rdb_3 var2) {
      super.id_class(var1, var2);
      var1.put(this.id_class, var2);
   }
}
