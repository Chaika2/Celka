package celestial;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public interface rrnF_2 extends MinecraftAccessor {
   default boolean class_(xc_3 var1) {
      return false;
   }

   default Pair<rrTA, rrTA> class_(an_3 var1, PX var2) {
      ((List)rrTT.break_[1]).clear();
      List var3 = this.class_(var1, var1.rN());
      ((List)rrTT.break_[1]).addAll(var3);
      Object var4 = new rrTn_1(var1.new_(1.0F));
      PX var5 = var2.byte_();
      double var6 = Double.MAX_VALUE;

      for (rrTA var9 : var3) {
         PX var10 = PJ.class_(var9);
         double var11 = 0.0;
         var11 += PJ.class_(var2.protected_(), var10.protected_());
         var11 += PJ.break_(var2.throws_(), var10.throws_());
         if (var11 < var6) {
            var6 = var11;
            var4 = var9;
         }
      }

      return Pair.of(var4, var4);
   }

   default float class_(rjU_2 var1, rjU_2 var2) {
      double var3 = var2.break_ - var1.break_;
      double var5 = var2.protected_ - var1.protected_;
      return (float)(Math.atan2(var5, var3) * 180.0 / Math.PI - 90.0);
   }

   default Pair<rrTA, rrTA> class_(rrTV var1, PX var2) {
      ((List)rrTT.break_[1]).clear();
      rfl_3 var3 = var1.class_();
      List var4 = this.class_(var1, var3);
      Object var5 = new rrTn_1(var3.case_());
      ((List)rrTT.break_[1]).addAll(var4);
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

   default boolean class_(PX var1) {
      return true;
   }

   default List<rrTA> class_(an_3 var1, rfl_3 var2) {
      ArrayList var3 = new ArrayList();
      rjU_2 var4 = ((cb_3)import_.class_[57]).new_(1.0F);
      float var5 = 0.08F;
      float var6 = 0.0F;
      float var7 = 0.0F;
      double var8 = var2.class_ + (double)var5;
      double var10 = var2.protected_ - (double)var5;
      double var12 = var2.byte_ + (double)var5;
      double var14 = var2.case_ - (double)var5;
      double var16 = var10 - var8;
      double var18 = var16 / 2.0;
      double var20 = (var2.throws_ - var2.break_) / 12.0;

      for (double var22 = var2.break_; var22 < var2.throws_; var22 += var20) {
         if (!(var22 < var1.re() + (double)var7) && !(var22 > var2.throws_ - (double)var6)) {
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
      boolean var32 = !var23 || var3.stream().anyMatch(var3x -> var3x.class_(var4, var1, var1xx -> !this.class_(var1xx)));

      for (rrTA var33 : var3) {
         rjU_2 var34 = var33.rr();
         if (!var23 || !var32 || var33.class_(var4, var1, var1x -> !this.class_(var1x))) {
            rfo_3 var35 = rhj_3.class_((cb_3)import_.class_[57], var1, var4, var34, 3.0);
            if (var35 != null) {
               var30.add(var33);
            }
         }
      }

      return var30.isEmpty() ? var3 : var30;
   }

   default List<rrTA> class_(rrTV var1, rfl_3 var2) {
      ArrayList var3 = new ArrayList();
      rjU_2 var4 = ((cb_3)import_.class_[57]).new_(1.0F);
      float var5 = 0.08F;
      float var6 = 0.0F;
      float var7 = 0.0F;
      double var8 = var2.class_ + (double)var5;
      double var10 = var2.protected_ - (double)var5;
      double var12 = var2.byte_ + (double)var5;
      double var14 = var2.case_ - (double)var5;
      double var16 = var10 - var8;
      double var18 = var16 / 2.0;
      double var20 = (var2.throws_ - var2.break_) / 12.0;

      for (double var22 = var2.break_; var22 < var2.throws_; var22 += var20) {
         if (!(var22 < var2.break_ + (double)var7) && !(var22 > var2.throws_ - (double)var6)) {
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
      boolean var32 = !var23 || var3.stream().anyMatch(var3x -> var3x.class_(var4, var1, var1xx -> !this.class_(var1xx)));

      for (rrTA var33 : var3) {
         if (!var23 || !var32 || var33.class_(var4, var1, var1x -> !this.class_(var1x))) {
            var30.add(var33);
         }
      }

      return var30.isEmpty() ? var3 : var30;
   }

   default boolean break_(PX var1) {
      return true;
   }

   float break_();

   default float break_(rjU_2 var1, rjU_2 var2) {
      double var3 = var2.break_ - var1.break_;
      double var5 = var2.byte_ - var1.byte_;
      double var7 = var2.protected_ - var1.protected_;
      return (float)(-Math.atan2(var5, Math.sqrt(var3 * var3 + var7 * var7)) * 180.0 / Math.PI);
   }

   rrTp_1 catch_();

   float private_();

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
         float var3 = rfU_2.catch_(var1 - var0);
         if (var3 > var2) {
            return var0 + var2;
         } else {
            return var3 < -var2 ? var0 - var2 : var1;
         }
      };
   }
}
