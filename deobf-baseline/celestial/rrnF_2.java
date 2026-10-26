package celestial;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public interface rrnF_2 extends MinecraftAccessor {
   default boolean id_class(xc_3 var1) {
      return false;
   }

   default Pair<rrTA, rrTA> id_class(an_3 var1, PX var2) {
      ((List)rrTT.id_break[1]).clear();
      List var3 = this.id_class(var1, var1.rN());
      ((List)rrTT.id_break[1]).addAll(var3);
      Object var4 = new rrTn_1(var1.id_new(1.0F));
      PX var5 = var2.id_byte();
      double var6 = Double.MAX_VALUE;

      for (rrTA var9 : var3) {
         PX var10 = PJ.id_class(var9);
         double var11 = 0.0;
         var11 += PJ.id_class(var2.id_protected(), var10.id_protected());
         var11 += PJ.id_break(var2.id_throws(), var10.id_throws());
         if (var11 < var6) {
            var6 = var11;
            var4 = var9;
         }
      }

      return Pair.of(var4, var4);
   }

   default float id_class(rjU_2 var1, rjU_2 var2) {
      double var3 = var2.id_break - var1.id_break;
      double var5 = var2.id_protected - var1.id_protected;
      return (float)(Math.atan2(var5, var3) * 180.0 / Math.PI - 90.0);
   }

   default Pair<rrTA, rrTA> id_class(rrTV var1, PX var2) {
      ((List)rrTT.id_break[1]).clear();
      rfl_3 var3 = var1.id_class();
      List var4 = this.id_class(var1, var3);
      Object var5 = new rrTn_1(var3.id_case());
      ((List)rrTT.id_break[1]).addAll(var4);
      double var6 = Double.MAX_VALUE;

      for (rrTA var9 : var4) {
         double var10 = 0.0;
         if (var10 < var6) {
            var6 = var10;
            var5 = var9;
         }
      }

      return Pair.of(var5, var5);
   }

   default boolean id_class(PX var1) {
      return true;
   }

   default List<rrTA> id_class(an_3 var1, rfl_3 var2) {
      ArrayList var3 = new ArrayList();
      rjU_2 var4 = ((cb_3)id_import.id_class[57]).id_new(1.0F);
      float var5 = 0.08F;
      float var6 = 0.0F;
      float var7 = 0.0F;
      double var8 = var2.id_class + (double)var5;
      double var10 = var2.id_protected - (double)var5;
      double var12 = var2.id_byte + (double)var5;
      double var14 = var2.id_case - (double)var5;
      double var16 = var10 - var8;
      double var18 = var16 / 2.0;
      double var20 = (var2.id_throws - var2.id_break) / 12.0;

      for (double var22 = var2.id_break; var22 < var2.id_throws; var22 += var20) {
         if (!(var22 < var1.re() + (double)var7) && !(var22 > var2.id_throws - (double)var6)) {
            for (double var24 = 0.0; var24 < var16; var24 += var18) {
               rrTn_1 var26 = new rrTn_1(new rjU_2(var8, var22, var12 + var24));
               var3.add(var26);
               rrTn_1 var27 = new rrTn_1(new rjU_2(var10, var22, var12 + var24));
               var3.add(var27);
               rrTn_1 var28 = new rrTn_1(new rjU_2(var8 + var24, var22, var12));
               var3.add(var28);
               rrTn_1 var29 = new rrTn_1(new rjU_2(var8 + var24, var22, var14));
               var3.add(var29);
            }

            rrTn_1 var31 = new rrTn_1(new rjU_2(var10, var22, var14));
            var3.add(var31);
         }
      }

      ArrayList var30 = new ArrayList();
      boolean var23 = this.aC_();
      boolean var32 = !var23 || var3.stream().anyMatch(var3x -> var3x.id_class(var4, var1, var1xx -> !this.id_class(var1xx)));

      for (rrTA var33 : var3) {
         rjU_2 var34 = var33.rr();
         if (!var23 || !var32 || var33.id_class(var4, var1, var1x -> !this.id_class(var1x))) {
            rfo_3 var35 = rhj_3.id_class((cb_3)id_import.id_class[57], var1, var4, var34, 3.0);
            if (var35 != null) {
               var30.add(var33);
            }
         }
      }

      return var30.isEmpty() ? var3 : var30;
   }

   default List<rrTA> id_class(rrTV var1, rfl_3 var2) {
      ArrayList var3 = new ArrayList();
      rjU_2 var4 = ((cb_3)id_import.id_class[57]).id_new(1.0F);
      float var5 = 0.08F;
      float var6 = 0.0F;
      float var7 = 0.0F;
      double var8 = var2.id_class + (double)var5;
      double var10 = var2.id_protected - (double)var5;
      double var12 = var2.id_byte + (double)var5;
      double var14 = var2.id_case - (double)var5;
      double var16 = var10 - var8;
      double var18 = var16 / 2.0;
      double var20 = (var2.id_throws - var2.id_break) / 12.0;

      for (double var22 = var2.id_break; var22 < var2.id_throws; var22 += var20) {
         if (!(var22 < var2.id_break + (double)var7) && !(var22 > var2.id_throws - (double)var6)) {
            for (double var24 = 0.0; var24 < var16; var24 += var18) {
               rrTn_1 var26 = new rrTn_1(new rjU_2(var8, var22, var12 + var24));
               var3.add(var26);
               rrTn_1 var27 = new rrTn_1(new rjU_2(var10, var22, var12 + var24));
               var3.add(var27);
               rrTn_1 var28 = new rrTn_1(new rjU_2(var8 + var24, var22, var12));
               var3.add(var28);
               rrTn_1 var29 = new rrTn_1(new rjU_2(var8 + var24, var22, var14));
               var3.add(var29);
            }

            rrTn_1 var31 = new rrTn_1(new rjU_2(var10, var22, var14));
            var3.add(var31);
         }
      }

      ArrayList var30 = new ArrayList();
      boolean var23 = this.aC_();
      boolean var32 = !var23 || var3.stream().anyMatch(var3x -> var3x.id_class(var4, var1, var1xx -> !this.id_class(var1xx)));

      for (rrTA var33 : var3) {
         if (!var23 || !var32 || var33.id_class(var4, var1, var1x -> !this.id_class(var1x))) {
            var30.add(var33);
         }
      }

      return var30.isEmpty() ? var3 : var30;
   }

   default boolean id_break(PX var1) {
      return true;
   }

   float id_break();

   default float id_break(rjU_2 var1, rjU_2 var2) {
      double var3 = var2.id_break - var1.id_break;
      double var5 = var2.id_byte - var1.id_byte;
      double var7 = var2.id_protected - var1.id_protected;
      return (float)(-Math.atan2(var5, Math.sqrt(var3 * var3 + var7 * var7)) * 180.0 / Math.PI);
   }

   rrTp_1 id_catch();

   float id_private();

   default boolean az_() {
      return false;
   }

   default rrTH aE_() {
      return this.aA_();
   }

   default rrTf_1 aL_() {
      return null;
   }

   default boolean aC_() {
      return true;
   }

   default boolean aG_() {
      return false;
   }

   default float aD_() {
      return 1.0F;
   }

   default rrTq_1 aB_() {
      return null;
   }

   default rrTj_1 aF_() {
      return null;
   }

   default rrTH aA_() {
      return (var0, var1, var2) -> {
         float var3 = rfU_2.id_catch(var1 - var0);
         if (var3 > var2) {
            return var0 + var2;
         } else {
            return var3 < -var2 ? var0 - var2 : var1;
         }
      };
   }
}
