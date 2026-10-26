package celestial;

import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.ArrayList;
import java.util.List;

public abstract class rjC_2 {
   protected final rjp_3 id_class;
   private rjC_2[] id_break;

   public double id_byte(rpB_2 var1) {
      int var2 = this.id_class.id_break(var1);
      return var2 <= 0 ? Double.NEGATIVE_INFINITY : this.id_class(var1, var2);
   }

   public rjC_2 id_byte() {
      rjC_2[] var1 = new rjC_2[]{rjw_3.id_class()};
      this.id_break(
         (var1x, var3, var5, var7, var9, var11) -> var1[0] = rjw_3.id_break(var1[0], rjw_3.id_class(var1x, var3, var5, var7, var9, var11), rjN_2.id_package)
      );
      return var1[0];
   }

   rjC_2(rjp_3 var1) {
      this.id_class = var1;
   }

   @Override
   public String toString() {
      return this.id_break() ? "EMPTY" : "VoxelShape[" + this.id_class() + "]";
   }

   protected double id_class(ryF_2 var1, rfl_3 var2, double var3) {
      if (this.id_break()) {
         return var3;
      } else if (Math.abs(var3) < 1.0E-7) {
         return 0.0;
      } else {
         ryF_2 var5 = var1.id_class();
         rpB_2 var6 = var5.id_class(rpB_2.X);
         rpB_2 var7 = var5.id_class(rpB_2.Y);
         rpB_2 var8 = var5.id_class(rpB_2.Z);
         double var9 = var2.id_break(var6);
         double var11 = var2.id_class(var6);
         int var13 = this.id_class(var6, var11 + 1.0E-7);
         int var14 = this.id_class(var6, var9 - 1.0E-7);
         int var15 = Math.max(0, this.id_class(var7, var2.id_class(var7) + 1.0E-7));
         int var16 = Math.min(this.id_class.id_byte(var7), this.id_class(var7, var2.id_break(var7) - 1.0E-7) + 1);
         int var17 = Math.max(0, this.id_class(var8, var2.id_class(var8) + 1.0E-7));
         int var18 = Math.min(this.id_class.id_byte(var8), this.id_class(var8, var2.id_break(var8) - 1.0E-7) + 1);
         int var19 = this.id_class.id_byte(var6);
         if (var3 > 0.0) {
            for (int var20 = var14 + 1; var20 < var19; var20++) {
               for (int var21 = var15; var21 < var16; var21++) {
                  for (int var22 = var17; var22 < var18; var22++) {
                     if (this.id_class.id_class(var5, var20, var21, var22)) {
                        double var23 = this.id_class(var6, var20) - var9;
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
                     if (this.id_class.id_class(var5, var25, var26, var27)) {
                        double var28 = this.id_class(var6, var25 + 1) - var11;
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

   public double id_class(rpB_2 var1, rfl_3 var2, double var3) {
      return this.id_class(ryF_2.id_class(var1, rpB_2.X), var2, var3);
   }

   public rjC_2 id_class(rpr_3 var1) {
      if (!this.id_break() && this != rjw_3.id_break()) {
         if (this.id_break != null) {
            rjC_2 var2 = this.id_break[var1.ordinal()];
            if (var2 != null) {
               return var2;
            }
         } else {
            this.id_break = new rjC_2[6];
         }

         rjC_2 var3 = this.id_break(var1);
         this.id_break[var1.ordinal()] = var3;
         return var3;
      } else {
         return this;
      }
   }

   public rff_3 id_class(rjU_2 var1, rjU_2 var2, rfH_2 var3, boolean var4) {
      if (this.id_break()) {
         return null;
      } else {
         rjU_2 var5 = var2.id_protected(var1);
         if (var5.id_catch() < 1.0E-7) {
            return null;
         } else {
            rjU_2 var6 = var1.id_throws(var5.id_class(0.001));
            return !var4 && this.id_break(var6.id_break - (double)var3.b_(), var6.id_byte - (double)var3.c_(), var6.id_protected - (double)var3.d_())
               ? new rff_3(var6, rpr_3.id_class(var5.id_break, var5.id_byte, var5.id_protected).id_case(), var3, true)
               : rfl_3.id_class(this.id_protected(), var1, var2, var3);
         }
      }
   }

   protected int id_class(rpB_2 var1, double var2) {
      return rfU_2.id_class(0, this.id_class.id_byte(var1) + 1, var4 -> {
         if (var4 < 0) {
            return false;
         } else {
            return var4 > this.id_class.id_byte(var1) ? true : var2 < this.id_class(var1, var4);
         }
      }) - 1;
   }

   public rfl_3 id_class() {
      return !this.id_break()
         ? new rfl_3(
            this.id_break(rpB_2.X), this.id_break(rpB_2.Y), this.id_break(rpB_2.Z), this.id_byte(rpB_2.X), this.id_byte(rpB_2.Y), this.id_byte(rpB_2.Z)
         )
         : rfl_3.id_class(rjU_2.id_class);
   }

   protected double id_class(rpB_2 var1, int var2) {
      return this.id_class(var1).getDouble(var2);
   }

   public void id_class(rjI_2 var1) {
      this.id_class
         .id_class(
            (var2, var3, var4, var5, var6, var7) -> var1.consume(
                  this.id_class(rpB_2.X, var2),
                  this.id_class(rpB_2.Y, var3),
                  this.id_class(rpB_2.Z, var4),
                  this.id_class(rpB_2.X, var5),
                  this.id_class(rpB_2.Y, var6),
                  this.id_class(rpB_2.Z, var7)
               ),
            true
         );
   }

   protected abstract DoubleList id_class(rpB_2 var1);

   public rjC_2 id_class(double var1, double var3, double var5) {
      return (rjC_2)(this.id_break()
         ? rjw_3.id_class()
         : new rjl_3(this.id_class, new rjF_2(this.id_class(rpB_2.X), var1), new rjF_2(this.id_class(rpB_2.Y), var3), new rjF_2(this.id_class(rpB_2.Z), var5)));
   }

   public double id_class(rpB_2 var1, double var2, double var4) {
      rpB_2 var6 = ryF_2.FORWARD.id_class(var1);
      rpB_2 var7 = ryF_2.BACKWARD.id_class(var1);
      int var8 = this.id_class(var6, var2);
      int var9 = this.id_class(var7, var4);
      int var10 = this.id_class.id_class(var1, var8, var9);
      return var10 <= 0 ? Double.NEGATIVE_INFINITY : this.id_class(var1, var10);
   }

   public boolean id_break() {
      return this.id_class.id_class();
   }

   public double id_break(rpB_2 var1) {
      int var2 = this.id_class.id_class(var1);
      return var2 >= this.id_class.id_byte(var1) ? Double.POSITIVE_INFINITY : this.id_class(var1, var2);
   }

   private rjC_2 id_break(rpr_3 var1) {
      rpB_2 var2 = var1.id_final();
      rpG_2 var3 = var1.id_throws();
      DoubleList var4 = this.id_class(var2);
      if (var4.size() == 2 && DoubleMath.fuzzyEquals(var4.getDouble(0), 0.0, 1.0E-7) && DoubleMath.fuzzyEquals(var4.getDouble(1), 1.0, 1.0E-7)) {
         return this;
      } else {
         int var5 = this.id_class(var2, var3 == rpG_2.POSITIVE ? 0.9999999 : 1.0E-7);
         return new rjn_3(this, var2, var5);
      }
   }

   public void id_break(rjI_2 var1) {
      DoubleList var2 = this.id_class(rpB_2.X);
      DoubleList var3 = this.id_class(rpB_2.Y);
      DoubleList var4 = this.id_class(rpB_2.Z);
      this.id_class
         .id_break(
            (var4x, var5, var6, var7, var8, var9) -> var1.consume(
                  var2.getDouble(var4x), var3.getDouble(var5), var4.getDouble(var6), var2.getDouble(var7), var3.getDouble(var8), var4.getDouble(var9)
               ),
            true
         );
   }

   protected boolean id_break(double var1, double var3, double var5) {
      return this.id_class.id_byte(this.id_class(rpB_2.X, var1), this.id_class(rpB_2.Y, var3), this.id_class(rpB_2.Z, var5));
   }

   public List<rfl_3> id_protected() {
      ArrayList var1 = Lists.newArrayList();
      this.id_break((var1x, var3, var5, var7, var9, var11) -> var1.add(new rfl_3(var1x, var3, var5, var7, var9, var11)));
      return var1;
   }
}
