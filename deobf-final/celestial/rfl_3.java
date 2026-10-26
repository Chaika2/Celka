package celestial;

import java.util.Optional;
import org.apache.commons.lang3.tuple.Pair;

public class rfl_3 implements rrTR {
   public final double class_;
   public final double break_;
   public final double byte_;
   public final double protected_;
   public final double throws_;
   public final double case_;

   public double byte_(rfl_3 var1, double var2) {
      if (var1.protected_ > this.class_ && var1.class_ < this.protected_ && var1.throws_ > this.break_ && var1.break_ < this.throws_) {
         if (var2 > 0.0 && var1.case_ <= this.byte_) {
            double var6 = this.byte_ - var1.case_;
            if (var6 < var2) {
               var2 = var6;
            }
         } else if (var2 < 0.0 && var1.byte_ >= this.case_) {
            double var4 = this.case_ - var1.byte_;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public Optional<Pair<rpr_3, rjU_2>> byte_(rjU_2 var1, rjU_2 var2) {
      double[] var3 = new double[]{1.0};
      double var4 = var2.break_ - var1.break_;
      double var6 = var2.byte_ - var1.byte_;
      double var8 = var2.protected_ - var1.protected_;
      rpr_3 var10 = class_(this, var1, var3, null, var4, var6, var8);
      if (var10 == null) {
         return Optional.empty();
      } else {
         double var11 = var3[0];
         return Optional.of(Pair.of(var10, var1.break_(var11 * var4, var11 * var6, var11 * var8)));
      }
   }

   public rfl_3 byte_(double var1, double var3, double var5) {
      double var7 = this.class_ - var1;
      double var9 = this.break_ - var3;
      double var11 = this.byte_ - var5;
      double var13 = this.protected_ + var1;
      double var15 = this.throws_ + var3;
      double var17 = this.case_ + var5;
      return new rfl_3(var7, var9, var11, var13, var15, var17);
   }

   public double byte_() {
      return this.throws_ - this.break_;
   }

   public boolean byte_(rfl_3 var1) {
      return this.class_(var1.class_, var1.break_, var1.byte_, var1.protected_, var1.throws_, var1.case_);
   }

   public rfl_3 byte_(rjU_2 var1) {
      return this.byte_(var1.break_, var1.byte_, var1.protected_);
   }

   public rfl_3(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.class_ = Math.min(var1, var7);
      this.break_ = Math.min(var3, var9);
      this.byte_ = Math.min(var5, var11);
      this.protected_ = Math.max(var1, var7);
      this.throws_ = Math.max(var3, var9);
      this.case_ = Math.max(var5, var11);
   }

   public rfl_3(rfH_2 var1, rfH_2 var2) {
      this((double)var1.b_(), (double)var1.c_(), (double)var1.d_(), (double)var2.b_(), (double)var2.c_(), (double)var2.d_());
   }

   public rfl_3(rfH_2 var1) {
      this((double)var1.b_(), (double)var1.c_(), (double)var1.d_(), (double)(var1.b_() + 1), (double)(var1.c_() + 1), (double)(var1.d_() + 1));
   }

   public rfl_3(rjU_2 var1, rjU_2 var2) {
      this(var1.break_, var1.byte_, var1.protected_, var2.break_, var2.byte_, var2.protected_);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof rfl_3 var2) {
         if (Double.compare(var2.class_, this.class_) != 0) {
            return false;
         } else if (Double.compare(var2.break_, this.break_) != 0) {
            return false;
         } else if (Double.compare(var2.byte_, this.byte_) != 0) {
            return false;
         } else if (Double.compare(var2.protected_, this.protected_) != 0) {
            return false;
         } else {
            return Double.compare(var2.throws_, this.throws_) != 0 ? false : Double.compare(var2.case_, this.case_) == 0;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "AABB[" + this.class_ + ", " + this.break_ + ", " + this.byte_ + "] -> [" + this.protected_ + ", " + this.throws_ + ", " + this.case_ + "]";
   }

   @Override
   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.class_);
      int var3 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.break_);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.byte_);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.protected_);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.throws_);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.case_);
      return 31 * var3 + (int)(var1 ^ var1 >>> 32);
   }

   private static rpr_3 class_(
      double[] var0,
      rpr_3 var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      rpr_3 var18,
      double var19,
      double var21,
      double var23
   ) {
      double var25 = (var8 - var19) / var2;
      double var27 = var21 + var25 * var4;
      double var29 = var23 + var25 * var6;
      if (0.0 < var25 && var25 < var0[0] && var10 - 1.0E-7 < var27 && var27 < var12 + 1.0E-7 && var14 - 1.0E-7 < var29 && var29 < var16 + 1.0E-7) {
         var0[0] = var25;
         return var18;
      } else {
         return var1;
      }
   }

   public boolean class_(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.class_ < var7 && this.protected_ > var1 && this.break_ < var9 && this.throws_ > var3 && this.byte_ < var11 && this.case_ > var5;
   }

   public double class_(rfl_3 var1, double var2) {
      if (var1.throws_ > this.break_ && var1.break_ < this.throws_ && var1.case_ > this.byte_ && var1.byte_ < this.case_) {
         if (var2 > 0.0 && var1.protected_ <= this.class_) {
            double var6 = this.class_ - var1.protected_;
            if (var6 < var2) {
               var2 = var6;
            }
         } else if (var2 < 0.0 && var1.class_ >= this.protected_) {
            double var4 = this.protected_ - var1.class_;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public static rpr_3 class_(rfl_3 var0, rjU_2 var1, double[] var2, rpr_3 var3, double var4, double var6, double var8) {
      if (var4 > 1.0E-7) {
         var3 = class_(
            var2, var3, var4, var6, var8, var0.class_, var0.break_, var0.throws_, var0.byte_, var0.case_, rpr_3.WEST, var1.break_, var1.byte_, var1.protected_
         );
      } else if (var4 < -1.0E-7) {
         var3 = class_(
            var2,
            var3,
            var4,
            var6,
            var8,
            var0.protected_,
            var0.break_,
            var0.throws_,
            var0.byte_,
            var0.case_,
            rpr_3.EAST,
            var1.break_,
            var1.byte_,
            var1.protected_
         );
      }

      if (var6 > 1.0E-7) {
         var3 = class_(
            var2,
            var3,
            var6,
            var8,
            var4,
            var0.break_,
            var0.byte_,
            var0.case_,
            var0.class_,
            var0.protected_,
            rpr_3.DOWN,
            var1.byte_,
            var1.protected_,
            var1.break_
         );
      } else if (var6 < -1.0E-7) {
         var3 = class_(
            var2,
            var3,
            var6,
            var8,
            var4,
            var0.throws_,
            var0.byte_,
            var0.case_,
            var0.class_,
            var0.protected_,
            rpr_3.UP,
            var1.byte_,
            var1.protected_,
            var1.break_
         );
      }

      if (var8 > 1.0E-7) {
         var3 = class_(
            var2,
            var3,
            var8,
            var4,
            var6,
            var0.byte_,
            var0.class_,
            var0.protected_,
            var0.break_,
            var0.throws_,
            rpr_3.NORTH,
            var1.protected_,
            var1.break_,
            var1.byte_
         );
      } else if (var8 < -1.0E-7) {
         var3 = class_(
            var2,
            var3,
            var8,
            var4,
            var6,
            var0.case_,
            var0.class_,
            var0.protected_,
            var0.break_,
            var0.throws_,
            rpr_3.SOUTH,
            var1.protected_,
            var1.break_,
            var1.byte_
         );
      }

      return var3;
   }

   public double class_() {
      double var1 = this.break_();
      double var3 = this.byte_();
      double var5 = this.protected_();
      return (var1 + var3 + var5) / 3.0;
   }

   public boolean class_(rjU_2 var1, rjU_2 var2) {
      return this.class_(
         Math.min(var1.break_, var2.break_),
         Math.min(var1.byte_, var2.byte_),
         Math.min(var1.protected_, var2.protected_),
         Math.max(var1.break_, var2.break_),
         Math.max(var1.byte_, var2.byte_),
         Math.max(var1.protected_, var2.protected_)
      );
   }

   public static rff_3 class_(Iterable<rfl_3> var0, rjU_2 var1, rjU_2 var2, rfH_2 var3) {
      double[] var4 = new double[]{1.0};
      rpr_3 var5 = null;
      double var6 = var2.break_ - var1.break_;
      double var8 = var2.byte_ - var1.byte_;
      double var10 = var2.protected_ - var1.protected_;

      for (rfl_3 var13 : var0) {
         var5 = class_(var13.class_(var3), var1, var4, var5, var6, var8, var10);
      }

      if (var5 == null) {
         return null;
      } else {
         double var14 = var4[0];
         return new rff_3(var1.break_(var14 * var6, var14 * var8, var14 * var10), var5, var3, false);
      }
   }

   public rfl_3 class_(double var1) {
      return this.byte_(var1, var1, var1);
   }

   public static rfl_3 class_(rfi_3 var0) {
      return new rfl_3(
         (double)var0.class_, (double)var0.break_, (double)var0.byte_, (double)(var0.protected_ + 1), (double)(var0.throws_ + 1), (double)(var0.case_ + 1)
      );
   }

   public rfl_3 class_(double var1, double var3, double var5) {
      double var7 = this.class_;
      double var9 = this.break_;
      double var11 = this.byte_;
      double var13 = this.protected_;
      double var15 = this.throws_;
      double var17 = this.case_;
      if (var1 < 0.0) {
         var7 -= var1;
      } else if (var1 > 0.0) {
         var13 -= var1;
      }

      if (var3 < 0.0) {
         var9 -= var3;
      } else if (var3 > 0.0) {
         var15 -= var3;
      }

      if (var5 < 0.0) {
         var11 -= var5;
      } else if (var5 > 0.0) {
         var17 -= var5;
      }

      return new rfl_3(var7, var9, var11, var13, var15, var17);
   }

   public double class_(rpB_2 var1) {
      return var1.class_(this.class_, this.break_, this.byte_);
   }

   public static rfl_3 class_(rjU_2 var0) {
      return new rfl_3(var0.break_, var0.byte_, var0.protected_, var0.break_ + 1.0, var0.byte_ + 1.0, var0.protected_ + 1.0);
   }

   public rfl_3 class_(rfH_2 var1) {
      return new rfl_3(
         this.class_ + (double)var1.b_(),
         this.break_ + (double)var1.c_(),
         this.byte_ + (double)var1.d_(),
         this.protected_ + (double)var1.b_(),
         this.throws_ + (double)var1.c_(),
         this.case_ + (double)var1.d_()
      );
   }

   public rfl_3 class_(rfl_3 var1) {
      double var2 = Math.max(this.class_, var1.class_);
      double var4 = Math.max(this.break_, var1.break_);
      double var6 = Math.max(this.byte_, var1.byte_);
      double var8 = Math.min(this.protected_, var1.protected_);
      double var10 = Math.min(this.throws_, var1.throws_);
      double var12 = Math.min(this.case_, var1.case_);
      return new rfl_3(var2, var4, var6, var8, var10, var12);
   }

   public double break_(rfl_3 var1, double var2) {
      if (var1.protected_ > this.class_ && var1.class_ < this.protected_ && var1.case_ > this.byte_ && var1.byte_ < this.case_) {
         if (var2 > 0.0 && var1.throws_ <= this.break_) {
            double var6 = this.break_ - var1.throws_;
            if (var6 < var2) {
               var2 = var6;
            }
         } else if (var2 < 0.0 && var1.break_ >= this.throws_) {
            double var4 = this.throws_ - var1.break_;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public rfl_3 break_(double var1) {
      return this.class_(-var1);
   }

   public double break_(rpB_2 var1) {
      return var1.class_(this.protected_, this.throws_, this.case_);
   }

   public Optional<rjU_2> break_(rjU_2 var1, rjU_2 var2) {
      double[] var3 = new double[]{1.0};
      double var4 = var2.break_ - var1.break_;
      double var6 = var2.byte_ - var1.byte_;
      double var8 = var2.protected_ - var1.protected_;
      rpr_3 var10 = class_(this, var1, var3, null, var4, var6, var8);
      if (var10 == null) {
         return Optional.empty();
      } else {
         double var11 = var3[0];
         return Optional.of(var1.break_(var11 * var4, var11 * var6, var11 * var8));
      }
   }

   public rfl_3 break_(rjU_2 var1) {
      return this.break_(var1.break_, var1.byte_, var1.protected_);
   }

   public boolean break_(rfH_2 var1) {
      return this.throws_((double)var1.b_(), (double)var1.c_(), (double)var1.d_());
   }

   public rfl_3 break_(rfl_3 var1) {
      double var2 = Math.min(this.class_, var1.class_);
      double var4 = Math.min(this.break_, var1.break_);
      double var6 = Math.min(this.byte_, var1.byte_);
      double var8 = Math.max(this.protected_, var1.protected_);
      double var10 = Math.max(this.throws_, var1.throws_);
      double var12 = Math.max(this.case_, var1.case_);
      return new rfl_3(var2, var4, var6, var8, var10, var12);
   }

   public double break_() {
      return this.protected_ - this.class_;
   }

   public rfl_3 break_(double var1, double var3, double var5) {
      double var7 = this.class_;
      double var9 = this.break_;
      double var11 = this.byte_;
      double var13 = this.protected_;
      double var15 = this.throws_;
      double var17 = this.case_;
      if (var1 < 0.0) {
         var7 += var1;
      } else if (var1 > 0.0) {
         var13 += var1;
      }

      if (var3 < 0.0) {
         var9 += var3;
      } else if (var3 > 0.0) {
         var15 += var3;
      }

      if (var5 < 0.0) {
         var11 += var5;
      } else if (var5 > 0.0) {
         var17 += var5;
      }

      return new rfl_3(var7, var9, var11, var13, var15, var17);
   }

   public boolean throws_() {
      return Double.isNaN(this.class_)
         || Double.isNaN(this.break_)
         || Double.isNaN(this.byte_)
         || Double.isNaN(this.protected_)
         || Double.isNaN(this.throws_)
         || Double.isNaN(this.case_);
   }

   public boolean throws_(double var1, double var3, double var5) {
      return var1 >= this.class_ && var1 < this.protected_ && var3 >= this.break_ && var3 < this.throws_ && var5 >= this.byte_ && var5 < this.case_;
   }

   public rfl_3 throws_(rjU_2 var1) {
      return this.protected_(-var1.break_, -var1.byte_, -var1.protected_);
   }

   public rfl_3 finally_(rjU_2 var1) {
      return this.private_(var1.break_, var1.byte_, var1.protected_);
   }

   public static rfl_3 catch_(double var0, double var2, double var4) {
      return new rfl_3(-var0 / 2.0, -var2 / 2.0, -var4 / 2.0, var0 / 2.0, var2 / 2.0, var4 / 2.0);
   }

   public rfl_3 catch_(rjU_2 var1) {
      return this.byte_(-var1.break_, -var1.byte_, -var1.protected_);
   }

   public rjU_2 case_() {
      return new rjU_2(
         rfU_2.protected_(0.5, this.class_, this.protected_), rfU_2.protected_(0.5, this.break_, this.throws_), rfU_2.protected_(0.5, this.byte_, this.case_)
      );
   }

   public boolean case_(rjU_2 var1) {
      return this.throws_(var1.break_, var1.byte_, var1.protected_);
   }

   public rfl_3 case_(double var1, double var3, double var5) {
      return this.byte_(-var1, -var3, -var5);
   }

   public rjU_2 implements_(rjU_2 var1) {
      float var2 = (float)rfU_2.class_(var1.break_, this.class_, this.protected_);
      float var3 = (float)rfU_2.class_(var1.byte_, this.break_, this.throws_);
      float var4 = (float)rfU_2.class_(var1.protected_, this.byte_, this.case_);
      return new rjU_2((double)var2, (double)var3, (double)var4);
   }

   public double protected_() {
      return this.case_ - this.byte_;
   }

   public rfl_3 protected_(rjU_2 var1) {
      return this.protected_(var1.break_, var1.byte_, var1.protected_);
   }

   public boolean protected_(rfl_3 var1) {
      return this.class_ < var1.protected_ && this.protected_ > var1.class_ && this.byte_ < var1.case_ && this.case_ > var1.byte_;
   }

   public rfl_3 protected_(double var1, double var3, double var5) {
      return new rfl_3(this.class_ + var1, this.break_ + var3, this.byte_ + var5, this.protected_ + var1, this.throws_ + var3, this.case_ + var5);
   }

   public rfl_3 private_(double var1, double var3, double var5) {
      return new rfl_3(var1, var3, var5, var1 + this.break_(), var3 + this.byte_(), var5 + this.protected_());
   }

   public rjU_2 private_(rjU_2 var1) {
      int var2 = (int)rfU_2.class_(var1.break_, this.class_, this.protected_);
      int var3 = (int)rfU_2.class_(var1.byte_, this.break_, this.throws_);
      int var4 = (int)rfU_2.class_(var1.protected_, this.byte_, this.case_);
      return new rjU_2((double)var2, (double)var3, (double)var4);
   }

   @Override
   public rjU_2 rr() {
      return this.case_();
   }
}
