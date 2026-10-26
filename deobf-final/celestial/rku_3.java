package celestial;

import java.util.Map;

public class rku_3 extends rxJ_2 {
   protected final xd_3 class_;

   @Override
   public xc_3 byte_(rxx_3 var1) {
      xc_3 var2 = this.class_.class_(var1);
      xc_3 var3 = null;
      rYB var4 = var1.int_();
      rfH_2 var5 = var1.class_();

      for (rpr_3 var9 : var1.throws_()) {
         if (var9 != rpr_3.UP) {
            xc_3 var10 = var9 == rpr_3.DOWN ? this.catch_().class_(var1) : var2;
            if (var10 != null && var10.class_((rRR)var4, var5)) {
               var3 = var10;
               break;
            }
         }
      }

      return var3 != null && var4.class_(var3, var5, rjm_3.break_()) ? var3 : null;
   }

   public rku_3(xd_3 var1, xd_3 var2, rdO_2 var3) {
      super(var1, var3);
      this.class_ = var2;
   }

   @Override
   public void class_(Map<xd_3, rdb_3> var1, rdb_3 var2) {
      super.class_(var1, var2);
      var1.put(this.class_, var2);
   }
}
