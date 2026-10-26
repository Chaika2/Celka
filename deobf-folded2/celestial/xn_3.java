package celestial;

import java.util.Optional;
import java.util.Random;

public class xn_3 extends dB_2 implements kd_3 {
   protected static final rjC_2 id_volatile = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 7.0, 16.0);
   public static final rCN id_final = rCT.id_continue;
   public static final rCN id_package = rCT.id_goto;
   public static final rCN id_int = rCT.id_throw;
   public static final rCc_1 id_new = rCT.id_strictfp;
   private static final rjC_2 id_continue = xd_3.id_class(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   private final boolean id_super;
   private final int id_this;

   public static void id_byte(rRg_1 var0, rfH_2 var1, xc_3 var2) {
      if (var0.id_import()) {
         for (int var3 = 0; var3 < 20; var3++) {
            id_class((rYB)var0, var1, var2.id_byte(id_package), true);
         }
      }

      ryO_2 var4 = var0.id_class(var1);
      if (var4 instanceof rHc_1) {
         ((rHc_1)var4).id_catch();
      }
   }

   public xn_3(boolean var1, int var2, Jq_1 var3) {
      super(var3);
      this.id_super = var1;
      this.id_this = var2;
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(id_final, Boolean.valueOf(true))
            .id_class(id_package, Boolean.valueOf(false))
            .id_class(id_int, Boolean.valueOf(false))
            .id_class(id_new, rpr_3.NORTH)
      );
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(var2.id_class(var1.id_byte(id_new)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_new, var2.id_class(var1.id_byte(id_new)));
   }

   @Override
   public void id_class(rYB var1, xc_3 var2, rff_3 var3, rhf_3 var4) {
      if (!var1.id_continue && var4.Pz()) {
         an_3 var5 = var4.id_else();
         boolean var6 = var5 == null || var5 instanceof rhd_3 || var1.B().id_break(rRu_1.id_break);
         if (var6 && !var2.id_byte(id_final) && !var2.id_byte(id_int)) {
            rfH_2 var7 = var3.id_class();
            var1.id_class(var7, var2.id_class(rCT.id_continue, Boolean.valueOf(true)), 11);
         }
      }
   }

   public static void id_class(rYB var0, rfH_2 var1, boolean var2, boolean var3) {
      Random var4 = var0.id_long();
      rLO var5 = var2 ? rLQ.x : rLQ.J;
      var0.id_break(
         var5,
         true,
         (double)var1.b_() + 0.5 + var4.nextDouble() / 3.0 * (double)(var4.nextBoolean() ? 1 : -1),
         (double)var1.c_() + var4.nextDouble() + var4.nextDouble(),
         (double)var1.d_() + 0.5 + var4.nextDouble() / 3.0 * (double)(var4.nextBoolean() ? 1 : -1),
         0.0,
         0.07,
         0.0
      );
      if (var3) {
         var0.id_class(
            rLQ.id_double,
            (double)var1.b_() + 0.25 + var4.nextDouble() / 2.0 * (double)(var4.nextBoolean() ? 1 : -1),
            (double)var1.c_() + 0.4,
            (double)var1.d_() + 0.25 + var4.nextDouble() / 2.0 * (double)(var4.nextBoolean() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      if (var2.id_class(var3) instanceof rHc_1 var8) {
         rdn_3 var9 = var4.id_protected(var5);
         Optional var10 = var8.id_class(var9);
         if (var10.isPresent()) {
            if (!var2.id_continue
               && var8.id_class(((rhx_3)var4.id_implements[18]).id_protected ? var9.id_implements() : var9, ((rkC_2)var10.get()).id_throws())) {
               var4.id_break(rlB_2.L);
               return ryZ_2.SUCCESS;
            }

            return ryZ_2.CONSUME;
         }
      }

      return ryZ_2.PASS;
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHc_1();
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_final, id_package, id_int, id_new);
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_volatile;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.id_byte(id_int)) {
         var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
      }

      return var2 == rpr_3.DOWN ? var1.id_class(id_package, Boolean.valueOf(this.id_volatile(var3))) : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      boolean var4 = var2.id_break(var3).id_class() == rXG.id_byte;
      return this.id_continue()
         .id_class(id_int, Boolean.valueOf(var4))
         .id_class(id_package, Boolean.valueOf(this.id_volatile(var2.id_byte(var3.id_break()))))
         .id_class(id_final, Boolean.valueOf(!var4))
         .id_class(id_new, var1.id_case());
   }

   public static boolean id_class(rYB var0, rfH_2 var1) {
      for (int var2 = 1; var2 <= 5; var2++) {
         rfH_2 var3 = var1.id_catch(var2);
         xc_3 var4 = var0.id_byte(var3);
         if (id_private(var4)) {
            return true;
         }

         boolean var5 = rjw_3.id_byte(id_continue, var4.id_break(var0, var1, rjm_3.id_break()), rjN_2.id_implements);
         if (var5) {
            xc_3 var6 = var0.id_byte(var3.id_break());
            return id_private(var6);
         }
      }

      return false;
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var1.id_byte(id_final)) {
         if (var4.nextInt(10) == 0) {
            var2.id_class(
               (double)var3.b_() + 0.5,
               (double)var3.c_() + 0.5,
               (double)var3.d_() + 0.5,
               rqn_3.ru,
               rqL_2.BLOCKS,
               0.5F + var4.nextFloat(),
               var4.nextFloat() * 0.7F + 0.6F,
               false
            );
         }

         if (this.id_super && var4.nextInt(5) == 0) {
            for (int var5 = 0; var5 < var4.nextInt(1) + 1; var5++) {
               var2.id_class(
                  rLQ.id_default,
                  (double)var3.b_() + 0.5,
                  (double)var3.c_() + 0.5,
                  (double)var3.d_() + 0.5,
                  (double)(var4.nextFloat() / 2.0F),
                  5.0E-5,
                  (double)(var4.nextFloat() / 2.0F)
               );
            }
         }
      }
   }

   @Override
   public boolean id_class(rRg_1 var1, rfH_2 var2, xc_3 var3, rXE var4) {
      if (!var3.id_byte(rCT.id_throw) && var4.id_class() == rXG.id_byte) {
         boolean var5 = var3.id_byte(id_final);
         if (var5) {
            if (!var1.id_import()) {
               var1.id_class((rhd_3)null, var2, rqn_3.SY, rqL_2.BLOCKS, 1.0F, 1.0F);
            }

            id_byte(var1, var2, var3);
         }

         var1.id_class(var2, var3.id_class(id_int, Boolean.valueOf(true)).id_class(id_final, Boolean.valueOf(false)), 3);
         var1.id_extends().id_class(var2, var4.id_class(), var4.id_class().id_class(var1));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (!var4.q() && var1.id_byte(id_final) && var4 instanceof iB_2 && !eA_2.id_implements((iB_2)var4)) {
         var4.id_break(rye_3.id_class, (float)this.id_this);
      }

      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var1.id_class(var4.id_break())) {
         ryO_2 var6 = var2.id_class(var3);
         if (var6 instanceof rHc_1) {
            rXn_1.id_class(var2, var3, ((rHc_1)var6).id_class());
         }

         super.id_break(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public rXE id_throws(xc_3 var1) {
      return var1.id_byte(id_int) ? rXG.id_byte.id_class(false) : super.id_throws(var1);
   }

   public static boolean id_implements(xc_3 var0) {
      return var0.id_class(rls_3.l, var0x -> var0x.id_break(rCT.id_throw) && var0x.id_break(rCT.id_continue))
         && !var0.id_byte(rCT.id_throw)
         && !var0.id_byte(rCT.id_continue);
   }

   public static boolean id_private(xc_3 var0) {
      return var0.id_break(id_final) && var0.id_class(rls_3.l) && var0.id_byte(id_final);
   }

   private boolean id_volatile(xc_3 var1) {
      return var1.id_class(xu_3.Ey);
   }
}
