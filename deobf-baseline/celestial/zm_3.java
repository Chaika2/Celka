package celestial;

import java.util.Random;

public class zm_3 extends xd_3 {
   private static final rCm_1 id_volatile = rCT.H;

   @Override
   public boolean id_byte(xc_3 var1) {
      return true;
   }

   public zm_3(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(0)));
   }

   @Override
   public int id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var1.id_byte(id_volatile);
   }

   @Override
   public void id_class(rYB var1, xc_3 var2, rff_3 var3, rhf_3 var4) {
      int var5 = id_class((rRg_1)var1, var2, var3, (an_3)var4);
      if (var4.id_else() instanceof rhN_2 var7) {
         var7.id_break(rlB_2.T);
         Oo_1.id_short.id_class(var7, var4, var3.id_case(), var5);
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var2.id_import() && !var1.id_class(var4.id_break()) && var1.id_byte(id_volatile) > 0 && !var2.id_finally().id_class(var3, this)) {
         var2.id_class(var3, var1.id_class(id_volatile, Integer.valueOf(0)), 18);
      }
   }

   private static int id_class(rff_3 var0, rjU_2 var1) {
      rpr_3 var2 = var0.id_break();
      double var3 = Math.abs(rfU_2.id_catch(var1.id_break) - 0.5);
      double var5 = Math.abs(rfU_2.id_catch(var1.id_byte) - 0.5);
      double var7 = Math.abs(rfU_2.id_catch(var1.id_protected) - 0.5);
      rpB_2 var9 = var2.id_final();
      double var10;
      if (var9 == rpB_2.Y) {
         var10 = Math.max(var3, var7);
      } else if (var9 == rpB_2.Z) {
         var10 = Math.max(var3, var5);
      } else {
         var10 = Math.max(var5, var7);
      }

      return Math.max(1, rfU_2.id_throws(15.0 * rfU_2.id_class((0.5 - var10) / 0.5, 0.0, 1.0)));
   }

   private static void id_class(rRg_1 var0, xc_3 var1, int var2, rfH_2 var3, int var4) {
      var0.id_class(var3, var1.id_class(id_volatile, Integer.valueOf(var2)), 3);
      var0.id_finally().id_class(var3, var1.id_break(), var4);
   }

   private static int id_class(rRg_1 var0, xc_3 var1, rff_3 var2, an_3 var3) {
      int var4 = id_class(var2, var2.id_case());
      int var5 = var3 instanceof rhm_3 ? 20 : 8;
      if (!var0.id_finally().id_class(var2.id_class(), var1.id_break())) {
         id_class(var0, var1, var4, var2.id_class(), var5);
      }

      return var4;
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var1.id_byte(id_volatile) != 0) {
         var2.id_class(var3, var1.id_class(id_volatile, Integer.valueOf(0)), 3);
      }
   }
}
