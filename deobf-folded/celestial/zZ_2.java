package celestial;

import java.util.Random;

public class zZ_2 extends xd_3 {
   protected static final rjC_2 id_int = xd_3.id_class(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);
   protected final rLx_1 id_new;

   protected zZ_2(Jq_1 var1, rLx_1 var2) {
      super(var1);
      this.id_new = var2;
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      return id_class(var2, var3.id_break(), rpr_3.UP);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      double var5 = (double)var3.b_() + 0.5;
      double var7 = (double)var3.c_() + 0.7;
      double var9 = (double)var3.d_() + 0.5;
      var2.id_class(rLQ.id_double, var5, var7, var9, 0.0, 0.0, 0.0);
      var2.id_class(this.id_new, var5, var7, var9, 0.0, 0.0, 0.0);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_int;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2 == rpr_3.DOWN && !this.id_class(var1, var4, var5) ? xu_3.id_class.id_continue() : super.id_class(var1, var2, var3, var4, var5, var6);
   }
}
