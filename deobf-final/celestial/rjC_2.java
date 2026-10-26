package celestial;

import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.ArrayList;
import java.util.List;

public abstract class rjC_2 {
   protected final rjp_3 class_;
   private rjC_2[] break_;

   public double byte_(rpB_2 var1) {
      int var2 = this.class_.break_(var1);
      return var2 <= 0 ? Double.NEGATIVE_INFINITY : this.class_(var1, var2);
   }

   public rjC_2 byte_() {
      rjC_2[] var1 = new rjC_2[]{rjw_3.class_()};
      this.break_((var1x, var3, var5, var7, var9, var11) -> var1[0] = rjw_3.break_(var1[0], rjw_3.class_(var1x, var3, var5, var7, var9, var11), rjN_2.package_));
      return var1[0];
   }

   rjC_2(rjp_3 var1) {
      this.class_ = var1;
   }

   @Override
   public String toString() {
      return this.break_() ? "EMPTY" : "VoxelShape[" + this.class_() + "]";
   }

   protected double class_(ryF_2 var1, rfl_3 var2, double var3) {
      if (this.break_()) {
         return var3;
      } else if (Math.abs(var3) < 1.0E-7) {
         return 0.0;
      } else {
         ryF_2 var5 = var1.class_();
         rpB_2 var6 = var5.class_(rpB_2.X);
         rpB_2 var7 = var5.class_(rpB_2.Y);
         rpB_2 var8 = var5.class_(rpB_2.Z);
         double var9 = var2.break_(var6);
         double var11 = var2.class_(var6);
         int var13 = this.class_(var6, var11 + 1.0E-7);
         int var14 = this.class_(var6, var9 - 1.0E-7);
         int var15 = Math.max(0, this.class_(var7, var2.class_(var7) + 1.0E-7));
         int var16 = Math.min(this.class_.byte_(var7), this.class_(var7, var2.break_(var7) - 1.0E-7) + 1);
         int var17 = Math.max(0, this.class_(var8, var2.class_(var8) + 1.0E-7));
         int var18 = Math.min(this.class_.byte_(var8), this.class_(var8, var2.break_(var8) - 1.0E-7) + 1);
         int var19 = this.class_.byte_(var6);
         if (var3 > 0.0) {
            for (int var20 = var14 + 1; var20 < var19; var20++) {
               for (int var21 = var15; var21 < var16; var21++) {
                  for (int var22 = var17; var22 < var18; var22++) {
                     if (this.class_.class_(var5, var20, var21, var22)) {
                        double var23 = this.class_(var6, var20) - var9;
                        if (var23 >= -1.0E-7) {
                           var3 = Math.min(var3, var23);
                        }

                        return var3;
                     }
                  }
               }
            }
         } else if (var3 < 0.0) {
            for (int var25 = var13 - 1; var25 >= 0; var25--) {
               for (int var26 = var15; var26 < var16; var26++) {
                  for (int var27 = var17; var27 < var18; var27++) {
                     if (this.class_.class_(var5, var25, var26, var27)) {
                        double var28 = this.class_(var6, var25 + 1) - var11;
                        if (var28 <= 1.0E-7) {
                           var3 = Math.max(var3, var28);
                        }

                        return var3;
                     }
                  }
               }
            }
         }

         return var3;
      }
   }

   public double class_(rpB_2 var1, rfl_3 var2, double var3) {
      return this.class_(ryF_2.class_(var1, rpB_2.X), var2, var3);
   }

   public rjC_2 class_(rpr_3 var1) {
      if (!this.break_() && this != rjw_3.break_()) {
         if (this.break_ != null) {
            rjC_2 var2 = this.break_[var1.ordinal()];
            if (var2 != null) {
               return var2;
            }
         } else {
            this.break_ = new rjC_2[6];
         }

         rjC_2 var3 = this.break_(var1);
         this.break_[var1.ordinal()] = var3;
         return var3;
      } else {
         return this;
      }
   }

   public rff_3 class_(rjU_2 var1, rjU_2 var2, rfH_2 var3, boolean var4) {
      if (this.break_()) {
         return null;
      } else {
         rjU_2 var5 = var2.protected_(var1);
         if (var5.catch_() < 1.0E-7) {
            return null;
         } else {
            rjU_2 var6 = var1.throws_(var5.class_(0.001));
            return !var4 && this.break_(var6.break_ - (double)var3.b_(), var6.byte_ - (double)var3.c_(), var6.protected_ - (double)var3.d_())
               ? new rff_3(var6, rpr_3.class_(var5.break_, var5.byte_, var5.protected_).case_(), var3, true)
               : rfl_3.class_(this.protected_(), var1, var2, var3);
         }
      }
   }

   protected int class_(rpB_2 var1, double var2) {
      return rfU_2.class_(0, this.class_.byte_(var1) + 1, var4 -> {
         if (var4 < 0) {
            return false;
         } else {
            return var4 > this.class_.byte_(var1) ? true : var2 < this.class_(var1, var4);
         }
      }) - 1;
   }

   public rfl_3 class_() {
      return !this.break_()
         ? new rfl_3(this.break_(rpB_2.X), this.break_(rpB_2.Y), this.break_(rpB_2.Z), this.byte_(rpB_2.X), this.byte_(rpB_2.Y), this.byte_(rpB_2.Z))
         : rfl_3.class_(rjU_2.class_);
   }

   protected double class_(rpB_2 var1, int var2) {
      return this.class_(var1).getDouble(var2);
   }

   public void class_(rjI_2 var1) {
      this.class_
         .class_(
            (var2, var3, var4, var5, var6, var7) -> var1.consume(
                  this.class_(rpB_2.X, var2),
                  this.class_(rpB_2.Y, var3),
                  this.class_(rpB_2.Z, var4),
                  this.class_(rpB_2.X, var5),
                  this.class_(rpB_2.Y, var6),
                  this.class_(rpB_2.Z, var7)
               ),
            true
         );
   }

   protected abstract DoubleList class_(rpB_2 var1);

   public rjC_2 class_(double var1, double var3, double var5) {
      return (rjC_2)(this.break_()
         ? rjw_3.class_()
         : new rjl_3(this.class_, new rjF_2(this.class_(rpB_2.X), var1), new rjF_2(this.class_(rpB_2.Y), var3), new rjF_2(this.class_(rpB_2.Z), var5)));
   }

   public double class_(rpB_2 var1, double var2, double var4) {
      rpB_2 var6 = ryF_2.FORWARD.class_(var1);
      rpB_2 var7 = ryF_2.BACKWARD.class_(var1);
      int var8 = this.class_(var6, var2);
      int var9 = this.class_(var7, var4);
      int var10 = this.class_.class_(var1, var8, var9);
      return var10 <= 0 ? Double.NEGATIVE_INFINITY : this.class_(var1, var10);
   }

   public boolean break_() {
      return this.class_.class_();
   }

   public double break_(rpB_2 var1) {
      int var2 = this.class_.class_(var1);
      return var2 >= this.class_.byte_(var1) ? Double.POSITIVE_INFINITY : this.class_(var1, var2);
   }

   private rjC_2 break_(rpr_3 var1) {
      rpB_2 var2 = var1.final_();
      rpG_2 var3 = var1.throws_();
      DoubleList var4 = this.class_(var2);
      if (var4.size() == 2 && DoubleMath.fuzzyEquals(var4.getDouble(0), 0.0, 1.0E-7) && DoubleMath.fuzzyEquals(var4.getDouble(1), 1.0, 1.0E-7)) {
         return this;
      } else {
         int var5 = this.class_(var2, var3 == rpG_2.POSITIVE ? 0.9999999 : 1.0E-7);
         return new rjn_3(this, var2, var5);
      }
   }

   public void break_(rjI_2 var1) {
      DoubleList var2 = this.class_(rpB_2.X);
      DoubleList var3 = this.class_(rpB_2.Y);
      DoubleList var4 = this.class_(rpB_2.Z);
      this.class_
         .break_(
            (var4x, var5, var6, var7, var8, var9) -> var1.consume(
                  var2.getDouble(var4x), var3.getDouble(var5), var4.getDouble(var6), var2.getDouble(var7), var3.getDouble(var8), var4.getDouble(var9)
               ),
            true
         );
   }

   protected boolean break_(double var1, double var3, double var5) {
      return this.class_.byte_(this.class_(rpB_2.X, var1), this.class_(rpB_2.Y, var3), this.class_(rpB_2.Z, var5));
   }

   public List<rfl_3> protected_() {
      ArrayList var1 = Lists.newArrayList();
      this.break_((var1x, var3, var5, var7, var9, var11) -> var1.add(new rfl_3(var1x, var3, var5, var7, var9, var11)));
      return var1;
   }
}
