package celestial;

import java.util.Random;

public class WH extends xF_2 implements kJ_2, kX_2 {
   protected static final rjC_2 id_volatile = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   protected WH(Jq_1 var1) {
      super(var1);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_volatile;
   }

   @Override
   public boolean id_class(rRg_1 var1, rfH_2 var2, xc_3 var3, rXE var4) {
      return false;
   }

   @Override
   public void id_class(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      xc_3 var5 = xu_3.rP.id_continue();
      xc_3 var6 = var5.id_class(zu_3.id_final, rCf_1.UPPER);
      rfH_2 var7 = var3.id_final();
      if (var1.id_byte(var7).id_class(xu_3.id_try)) {
         var1.id_class(var3, var5, 2);
         var1.id_class(var7, var6, 2);
      }
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, rXs_1 var4) {
      return false;
   }

   @Override
   public boolean id_class(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rXE var2 = var1.id_int().id_break(var1.id_class());
      return var2.id_class(rlG_2.id_break) && var2.id_throws() == 8 ? super.id_class(var1) : null;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      xc_3 var7 = super.id_class(var1, var2, var3, var4, var5, var6);
      if (!var7.id_catch()) {
         var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
      }

      return var7;
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return true;
   }

   @Override
   public rXE id_throws(xc_3 var1) {
      return rXG.id_byte.id_class(false);
   }

   @Override
   protected boolean id_catch(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.id_protected(var2, var3, rpr_3.UP) && !var1.id_class(xu_3.bV);
   }
}
