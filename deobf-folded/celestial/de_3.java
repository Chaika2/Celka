package celestial;

import java.util.Random;

public class de_3 extends xd_3 {
   protected static final rjC_2 id_volatile = dy_3.id_final;

   protected de_3(Jq_1 var1) {
      super(var1);
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_volatile;
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      xc_3 var4 = var2.id_byte(var3.id_final());
      return !var4.id_byte().id_break() || var4.id_break() instanceof dq_3;
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return !this.id_continue().id_class((rRR)var1.id_int(), var1.id_class())
         ? xd_3.id_class(this.id_continue(), xu_3.id_finally.id_continue(), var1.id_int(), var1.id_class())
         : super.id_class(var1);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 == rpr_3.UP && !var1.id_class(var4, var5)) {
         var4.id_finally().id_class(var5, this, 1);
      }

      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      dy_3.id_byte(var1, var2, var3);
   }

   @Override
   public boolean id_break(xc_3 var1) {
      return true;
   }
}
