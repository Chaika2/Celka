package celestial;

import java.util.Optional;
import java.util.Random;

public abstract class Jj_1 extends xd_3 {
   private final float id_final;
   protected static final rjC_2 id_volatile = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public Jj_1(Jq_1 var1, float var2) {
      super(var1);
      this.id_final = var2;
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var4.id_class(var1.id_break())) {
         if (id_class(var2)) {
            Optional var6 = WB.id_class(var2, var3, rpB_2.X);
            if (var6.isPresent()) {
               ((WB)var6.get()).id_break();
               return;
            }
         }

         if (!var1.id_class((rRR)var2, var3)) {
            var2.id_class(var3, false);
         }
      }
   }

   private static boolean id_class(rYB var0) {
      return var0.E() == rYB.id_byte || var0.E() == rYB.id_protected;
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, rhd_3 var4) {
      if (!var1.id_import()) {
         var1.id_class((rhd_3)null, 1009, var2, 0);
      }
   }

   public static boolean id_class(rYB var0, rfH_2 var1, rpr_3 var2) {
      xc_3 var3 = var0.id_byte(var1);
      return !var3.id_catch() ? false : id_class(var0, var1).id_class((rRR)var0, var1) || id_break(var0, var1, var2);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (!var4.q()) {
         var4.id_protected(var4.ru() + 1);
         if (var4.ru() == 0) {
            var4.id_case(8);
         }

         var4.id_break(rye_3.id_class, this.id_final);
      }

      super.id_class(var1, var2, var3, var4);
   }

   public static xc_3 id_class(rRq_1 var0, rfH_2 var1) {
      rfH_2 var2 = var1.id_break();
      xc_3 var3 = var0.id_byte(var2);
      return Wa_1.id_class(var3.id_break()) ? xu_3.rK.id_continue() : ((dt_3)xu_3.ro).id_break(var0, var1);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_volatile;
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var4.nextInt(24) == 0) {
         var2.id_class(
            (double)var3.b_() + 0.5,
            (double)var3.c_() + 0.5,
            (double)var3.d_() + 0.5,
            rqn_3.Sd,
            rqL_2.BLOCKS,
            1.0F + var4.nextFloat(),
            var4.nextFloat() * 0.7F + 0.3F,
            false
         );
      }

      rfH_2 var5 = var3.id_break();
      xc_3 var6 = var2.id_byte(var5);
      if (!this.id_catch(var6) && !var6.id_protected(var2, var5, rpr_3.UP)) {
         if (this.id_catch(var2.id_byte(var3.id_byte()))) {
            for (int var14 = 0; var14 < 2; var14++) {
               double var19 = (double)var3.b_() + var4.nextDouble() * 0.1F;
               double var24 = (double)var3.c_() + var4.nextDouble();
               double var29 = (double)var3.d_() + var4.nextDouble();
               var2.id_class(rLQ.id_short, var19, var24, var29, 0.0, 0.0, 0.0);
            }
         }

         if (this.id_catch(var2.id_byte(var3.id_extends()))) {
            for (int var15 = 0; var15 < 2; var15++) {
               double var20 = (double)(var3.b_() + 1) - var4.nextDouble() * 0.1F;
               double var25 = (double)var3.c_() + var4.nextDouble();
               double var30 = (double)var3.d_() + var4.nextDouble();
               var2.id_class(rLQ.id_short, var20, var25, var30, 0.0, 0.0, 0.0);
            }
         }

         if (this.id_catch(var2.id_byte(var3.id_private()))) {
            for (int var16 = 0; var16 < 2; var16++) {
               double var21 = (double)var3.b_() + var4.nextDouble();
               double var26 = (double)var3.c_() + var4.nextDouble();
               double var31 = (double)var3.d_() + var4.nextDouble() * 0.1F;
               var2.id_class(rLQ.id_short, var21, var26, var31, 0.0, 0.0, 0.0);
            }
         }

         if (this.id_catch(var2.id_byte(var3.id_protected()))) {
            for (int var17 = 0; var17 < 2; var17++) {
               double var22 = (double)var3.b_() + var4.nextDouble();
               double var27 = (double)var3.c_() + var4.nextDouble();
               double var32 = (double)(var3.d_() + 1) - var4.nextDouble() * 0.1F;
               var2.id_class(rLQ.id_short, var22, var27, var32, 0.0, 0.0, 0.0);
            }
         }

         if (this.id_catch(var2.id_byte(var3.id_final()))) {
            for (int var18 = 0; var18 < 2; var18++) {
               double var23 = (double)var3.b_() + var4.nextDouble();
               double var28 = (double)(var3.c_() + 1) - var4.nextDouble() * 0.1F;
               double var33 = (double)var3.d_() + var4.nextDouble();
               var2.id_class(rLQ.id_short, var23, var28, var33, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int var7 = 0; var7 < 3; var7++) {
            double var8 = (double)var3.b_() + var4.nextDouble();
            double var10 = (double)var3.c_() + var4.nextDouble() * 0.5 + 0.5;
            double var12 = (double)var3.d_() + var4.nextDouble();
            var2.id_class(rLQ.id_short, var8, var10, var12, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return id_class(var1.id_int(), var1.id_class());
   }

   private static boolean id_break(rYB var0, rfH_2 var1, rpr_3 var2) {
      if (!id_class(var0)) {
         return false;
      } else {
         rfw_3 var3 = var1.id_new();
         boolean var4 = false;

         for (rpr_3 var8 : rpr_3.values()) {
            if (var0.id_byte(var3.id_class(var1).id_class(var8)).id_class(xu_3.rg)) {
               var4 = true;
               break;
            }
         }

         if (!var4) {
            return false;
         } else {
            rpB_2 var9 = var2.id_final().id_protected() ? var2.id_private().id_final() : rpb_3.HORIZONTAL.id_break(var0.id_int);
            return WB.id_class(var0, var1, var9).isPresent();
         }
      }
   }

   protected abstract boolean id_catch(xc_3 var1);
}
