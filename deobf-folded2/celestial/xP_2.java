package celestial;

import java.util.Random;

public class xP_2 extends xd_3 implements kX_2 {
   protected static final rjC_2 id_volatile = xd_3.id_class(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   protected static final rjC_2 id_final = xd_3.id_class(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   protected static final rjC_2 id_package = xd_3.id_class(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final rCm_1 id_int = rCT.h;
   public static final rCu_1<rCy_1> id_new = rCT.o;
   public static final rCm_1 id_continue = rCT.y;

   @Override
   public Jp_1 id_byte() {
      return Jp_1.XZ;
   }

   public xP_2(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_int, Integer.valueOf(0)).id_class(id_new, rCy_1.NONE).id_class(id_continue, Integer.valueOf(0)));
   }

   @Override
   public boolean id_class(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      int var5 = this.id_class(var1, var2);
      int var6 = this.id_break(var1, var2);
      return var5 + var6 + 1 < 16 && var1.id_byte(var2.id_break(var5)).id_byte(id_continue) != 1;
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var1.id_byte(id_continue) == 0 && var4.nextInt(3) == 0 && var2.id_finally(var3.id_final()) && var2.id_class(var3.id_final(), 0) >= 9) {
         int var5 = this.id_break(var2, var3) + 1;
         if (var5 < 16) {
            this.id_class(var1, var2, var3, var4, var5);
         }
      }
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      return var2.id_byte(var3.id_break()).id_class(rls_3.M);
   }

   protected int id_class(rRq_1 var1, rfH_2 var2) {
      int var3 = 0;

      while (var3 < 16 && var1.id_byte(var2.id_break(var3 + 1)).id_class(xu_3.hs)) {
         var3++;
      }

      return var3;
   }

   protected void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4, int var5) {
      xc_3 var6 = var2.id_byte(var3.id_break());
      rfH_2 var7 = var3.id_catch(2);
      xc_3 var8 = var2.id_byte(var7);
      rCy_1 var9 = rCy_1.NONE;
      if (var5 >= 1) {
         if (!var6.id_class(xu_3.hs) || var6.id_byte(id_new) == rCy_1.NONE) {
            var9 = rCy_1.SMALL;
         } else if (var6.id_class(xu_3.hs) && var6.id_byte(id_new) != rCy_1.NONE) {
            var9 = rCy_1.LARGE;
            if (var8.id_class(xu_3.hs)) {
               var2.id_class(var3.id_break(), var6.id_class(id_new, rCy_1.SMALL), 3);
               var2.id_class(var7, var8.id_class(id_new, rCy_1.NONE), 3);
            }
         }
      }

      int var10 = var1.id_byte(id_int) != 1 && !var8.id_class(xu_3.hs) ? 0 : 1;
      int var11 = (var5 < 11 || !(var4.nextFloat() < 0.25F)) && var5 != 15 ? 0 : 1;
      var2.id_class(
         var3.id_final(), this.id_continue().id_class(id_int, Integer.valueOf(var10)).id_class(id_new, var9).id_class(id_continue, Integer.valueOf(var11)), 3
      );
   }

   @Override
   public float id_class(xc_3 var1, rhd_3 var2, rRq_1 var3, rfH_2 var4) {
      return var2.ss().id_break() instanceof rkx_3 ? 1.0F : super.id_class(var1, var2, var3, var4);
   }

   @Override
   public void id_class(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      int var5 = this.id_class(var1, var3);
      int var6 = this.id_break(var1, var3);
      int var7 = var5 + var6 + 1;
      int var8 = 1 + var2.nextInt(2);

      for (int var9 = 0; var9 < var8; var9++) {
         rfH_2 var10 = var3.id_break(var5);
         xc_3 var11 = var1.id_byte(var10);
         if (var7 >= 16 || var11.id_byte(id_continue) == 1 || !var1.id_finally(var10.id_final())) {
            return;
         }

         this.id_class(var11, var1, var10, var2, var7);
         var5++;
         var7++;
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rXE var2 = var1.id_int().id_break(var1.id_class());
      if (!var2.id_byte()) {
         return null;
      } else {
         xc_3 var3 = var1.id_int().id_byte(var1.id_class().id_break());
         if (!var3.id_class(rls_3.M)) {
            return null;
         } else if (var3.id_class(xu_3.hS)) {
            return this.id_continue().id_class(id_int, Integer.valueOf(0));
         } else if (var3.id_class(xu_3.hs)) {
            int var5 = var3.id_byte(id_int) > 0 ? 1 : 0;
            return this.id_continue().id_class(id_int, Integer.valueOf(var5));
         } else {
            xc_3 var4 = var1.id_int().id_byte(var1.id_class().id_final());
            return !var4.id_class(xu_3.hs) && !var4.id_class(xu_3.hS) ? xu_3.hS.id_continue() : this.id_continue().id_class(id_int, var4.id_byte(id_int));
         }
      }
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rjC_2 var5 = var1.id_byte(id_new) == rCy_1.LARGE ? id_final : id_volatile;
      rjU_2 var6 = var1.id_class(var3);
      return var5.id_class(var6.id_break, var6.id_byte, var6.id_protected);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (!var1.id_class(var4, var5)) {
         var4.id_finally().id_class(var5, this, 1);
      }

      if (var2 == rpr_3.UP && var3.id_class(xu_3.hs) && var3.id_byte(id_int) > var1.id_byte(id_int)) {
         var4.id_class(var5, var1.id_class(id_int), 2);
      }

      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_int, id_new, id_continue);
   }

   protected int id_break(rRq_1 var1, rfH_2 var2) {
      int var3 = 0;

      while (var3 < 16 && var1.id_byte(var2.id_catch(var3 + 1)).id_class(xu_3.hs)) {
         var3++;
      }

      return var3;
   }

   @Override
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rjU_2 var5 = var1.id_class(var3);
      return id_package.id_class(var5.id_break, var5.id_byte, var5.id_protected);
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (!var1.id_class(var2, var3)) {
         var2.id_break(var3, true);
      }
   }

   @Override
   public boolean a_(xc_3 var1) {
      return var1.id_byte(id_continue) == 0;
   }

   @Override
   public boolean a_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return true;
   }
}
