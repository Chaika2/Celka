package celestial;

import java.util.Optional;
import org.apache.commons.lang3.tuple.Pair;

public class rfl_3 implements rrTR {
   public final double id_class;
   public final double id_break;
   public final double id_byte;
   public final double id_protected;
   public final double id_throws;
   public final double id_case;

   public double id_byte(rfl_3 var1, double var2) {
      if (var1.id_protected > this.id_class && var1.id_class < this.id_protected && var1.id_throws > this.id_break && var1.id_break < this.id_throws) {
         if (var2 > 0.0 && var1.id_case <= this.id_byte) {
            double var6 = this.id_byte - var1.id_case;
            if (var6 < var2) {
               var2 = var6;
            }
         } else if (var2 < 0.0 && var1.id_byte >= this.id_case) {
            double var4 = this.id_case - var1.id_byte;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public Optional<Pair<rpr_3, rjU_2>> id_byte(rjU_2 var1, rjU_2 var2) {
      double[] var3 = new double[]{1.0};
      double var4 = var2.id_break - var1.id_break;
      double var6 = var2.id_byte - var1.id_byte;
      double var8 = var2.id_protected - var1.id_protected;
      rpr_3 var10 = id_class(this, var1, var3, null, var4, var6, var8);
      if (var10 == null) {
         return Optional.empty();
      } else {
         double var11 = var3[0];
         return Optional.of(Pair.of(var10, var1.id_break(var11 * var4, var11 * var6, var11 * var8)));
      }
   }

   public rfl_3 id_byte(double var1, double var3, double var5) {
      double var7 = this.id_class - var1;
      double var9 = this.id_break - var3;
      double var11 = this.id_byte - var5;
      double var13 = this.id_protected + var1;
      double var15 = this.id_throws + var3;
      double var17 = this.id_case + var5;
      return new rfl_3(var7, var9, var11, var13, var15, var17);
   }

   public double id_byte() {
      return this.id_throws - this.id_break;
   }

   public boolean id_byte(rfl_3 var1) {
      return this.id_class(var1.id_class, var1.id_break, var1.id_byte, var1.id_protected, var1.id_throws, var1.id_case);
   }

   public rfl_3 id_byte(rjU_2 var1) {
      return this.id_byte(var1.id_break, var1.id_byte, var1.id_protected);
   }

   public rfl_3(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.id_class = Math.min(var1, var7);
      this.id_break = Math.min(var3, var9);
      this.id_byte = Math.min(var5, var11);
      this.id_protected = Math.max(var1, var7);
      this.id_throws = Math.max(var3, var9);
      this.id_case = Math.max(var5, var11);
   }

   public rfl_3(rfH_2 var1, rfH_2 var2) {
      this((double)var1.b_(), (double)var1.c_(), (double)var1.d_(), (double)var2.b_(), (double)var2.c_(), (double)var2.d_());
   }

   public rfl_3(rfH_2 var1) {
      this((double)var1.b_(), (double)var1.c_(), (double)var1.d_(), (double)(var1.b_() + 1), (double)(var1.c_() + 1), (double)(var1.d_() + 1));
   }

   public rfl_3(rjU_2 var1, rjU_2 var2) {
      this(var1.id_break, var1.id_byte, var1.id_protected, var2.id_break, var2.id_byte, var2.id_protected);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof rfl_3 var2) {
         if (Double.compare(var2.id_class, this.id_class) != 0) {
            return false;
         } else if (Double.compare(var2.id_break, this.id_break) != 0) {
            return false;
         } else if (Double.compare(var2.id_byte, this.id_byte) != 0) {
            return false;
         } else if (Double.compare(var2.id_protected, this.id_protected) != 0) {
            return false;
         } else {
            return Double.compare(var2.id_throws, this.id_throws) != 0 ? false : Double.compare(var2.id_case, this.id_case) == 0;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "AABB["
         + this.id_class
         + ", "
         + this.id_break
         + ", "
         + this.id_byte
         + "] -> ["
         + this.id_protected
         + ", "
         + this.id_throws
         + ", "
         + this.id_case
         + "]";
   }

   @Override
   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.id_class);
      int var3 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.id_break);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.id_byte);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.id_protected);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.id_throws);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.id_case);
      return 31 * var3 + (int)(var1 ^ var1 >>> 32);
   }

   private static rpr_3 id_class(
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

   public boolean id_class(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.id_class < var7 && this.id_protected > var1 && this.id_break < var9 && this.id_throws > var3 && this.id_byte < var11 && this.id_case > var5;
   }

   public double id_class(rfl_3 var1, double var2) {
      if (var1.id_throws > this.id_break && var1.id_break < this.id_throws && var1.id_case > this.id_byte && var1.id_byte < this.id_case) {
         if (var2 > 0.0 && var1.id_protected <= this.id_class) {
            double var6 = this.id_class - var1.id_protected;
            if (var6 < var2) {
               var2 = var6;
            }
         } else if (var2 < 0.0 && var1.id_class >= this.id_protected) {
            double var4 = this.id_protected - var1.id_class;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public static rpr_3 id_class(rfl_3 var0, rjU_2 var1, double[] var2, rpr_3 var3, double var4, double var6, double var8) {
      if (var4 > 1.0E-7) {
         var3 = id_class(
            var2,
            var3,
            var4,
            var6,
            var8,
            var0.id_class,
            var0.id_break,
            var0.id_throws,
            var0.id_byte,
            var0.id_case,
            rpr_3.WEST,
            var1.id_break,
            var1.id_byte,
            var1.id_protected
         );
      } else if (var4 < -1.0E-7) {
         var3 = id_class(
            var2,
            var3,
            var4,
            var6,
            var8,
            var0.id_protected,
            var0.id_break,
            var0.id_throws,
            var0.id_byte,
            var0.id_case,
            rpr_3.EAST,
            var1.id_break,
            var1.id_byte,
            var1.id_protected
         );
      }

      if (var6 > 1.0E-7) {
         var3 = id_class(
            var2,
            var3,
            var6,
            var8,
            var4,
            var0.id_break,
            var0.id_byte,
            var0.id_case,
            var0.id_class,
            var0.id_protected,
            rpr_3.DOWN,
            var1.id_byte,
            var1.id_protected,
            var1.id_break
         );
      } else if (var6 < -1.0E-7) {
         var3 = id_class(
            var2,
            var3,
            var6,
            var8,
            var4,
            var0.id_throws,
            var0.id_byte,
            var0.id_case,
            var0.id_class,
            var0.id_protected,
            rpr_3.UP,
            var1.id_byte,
            var1.id_protected,
            var1.id_break
         );
      }

      if (var8 > 1.0E-7) {
         var3 = id_class(
            var2,
            var3,
            var8,
            var4,
            var6,
            var0.id_byte,
            var0.id_class,
            var0.id_protected,
            var0.id_break,
            var0.id_throws,
            rpr_3.NORTH,
            var1.id_protected,
            var1.id_break,
            var1.id_byte
         );
      } else if (var8 < -1.0E-7) {
         var3 = id_class(
            var2,
            var3,
            var8,
            var4,
            var6,
            var0.id_case,
            var0.id_class,
            var0.id_protected,
            var0.id_break,
            var0.id_throws,
            rpr_3.SOUTH,
            var1.id_protected,
            var1.id_break,
            var1.id_byte
         );
      }

      return var3;
   }

   public double id_class() {
      double var1 = this.id_break();
      double var3 = this.id_byte();
      double var5 = this.id_protected();
      return (var1 + var3 + var5) / 3.0;
   }

   public boolean id_class(rjU_2 var1, rjU_2 var2) {
      return this.id_class(
         Math.min(var1.id_break, var2.id_break),
         Math.min(var1.id_byte, var2.id_byte),
         Math.min(var1.id_protected, var2.id_protected),
         Math.max(var1.id_break, var2.id_break),
         Math.max(var1.id_byte, var2.id_byte),
         Math.max(var1.id_protected, var2.id_protected)
      );
   }

   public static rff_3 id_class(Iterable<rfl_3> var0, rjU_2 var1, rjU_2 var2, rfH_2 var3) {
      double[] var4 = new double[]{1.0};
      rpr_3 var5 = null;
      double var6 = var2.id_break - var1.id_break;
      double var8 = var2.id_byte - var1.id_byte;
      double var10 = var2.id_protected - var1.id_protected;

      for (rfl_3 var13 : var0) {
         var5 = id_class(var13.id_class(var3), var1, var4, var5, var6, var8, var10);
      }

      if (var5 == null) {
         return null;
      } else {
         double var14 = var4[0];
         return new rff_3(var1.id_break(var14 * var6, var14 * var8, var14 * var10), var5, var3, false);
      }
   }

   public rfl_3 id_class(double var1) {
      return this.id_byte(var1, var1, var1);
   }

   public static rfl_3 id_class(rfi_3 var0) {
      return new rfl_3(
         (double)var0.id_class,
         (double)var0.id_break,
         (double)var0.id_byte,
         (double)(var0.id_protected + 1),
         (double)(var0.id_throws + 1),
         (double)(var0.id_case + 1)
      );
   }

   public rfl_3 id_class(double var1, double var3, double var5) {
      double var7 = this.id_class;
      double var9 = this.id_break;
      double var11 = this.id_byte;
      double var13 = this.id_protected;
      double var15 = this.id_throws;
      double var17 = this.id_case;
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

   public double id_class(rpB_2 var1) {
      return var1.id_class(this.id_class, this.id_break, this.id_byte);
   }

   public static rfl_3 id_class(rjU_2 var0) {
      return new rfl_3(var0.id_break, var0.id_byte, var0.id_protected, var0.id_break + 1.0, var0.id_byte + 1.0, var0.id_protected + 1.0);
   }

   public rfl_3 id_class(rfH_2 var1) {
      return new rfl_3(
         this.id_class + (double)var1.b_(),
         this.id_break + (double)var1.c_(),
         this.id_byte + (double)var1.d_(),
         this.id_protected + (double)var1.b_(),
         this.id_throws + (double)var1.c_(),
         this.id_case + (double)var1.d_()
      );
   }

   public rfl_3 id_class(rfl_3 var1) {
      double var2 = Math.max(this.id_class, var1.id_class);
      double var4 = Math.max(this.id_break, var1.id_break);
      double var6 = Math.max(this.id_byte, var1.id_byte);
      double var8 = Math.min(this.id_protected, var1.id_protected);
      double var10 = Math.min(this.id_throws, var1.id_throws);
      double var12 = Math.min(this.id_case, var1.id_case);
      return new rfl_3(var2, var4, var6, var8, var10, var12);
   }

   public double id_break(rfl_3 var1, double var2) {
      if (var1.id_protected > this.id_class && var1.id_class < this.id_protected && var1.id_case > this.id_byte && var1.id_byte < this.id_case) {
         if (var2 > 0.0 && var1.id_throws <= this.id_break) {
            double var6 = this.id_break - var1.id_throws;
            if (var6 < var2) {
               var2 = var6;
            }
         } else if (var2 < 0.0 && var1.id_break >= this.id_throws) {
            double var4 = this.id_throws - var1.id_break;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public rfl_3 id_break(double var1) {
      return this.id_class(-var1);
   }

   public double id_break(rpB_2 var1) {
      return var1.id_class(this.id_protected, this.id_throws, this.id_case);
   }

   public Optional<rjU_2> id_break(rjU_2 var1, rjU_2 var2) {
      double[] var3 = new double[]{1.0};
      double var4 = var2.id_break - var1.id_break;
      double var6 = var2.id_byte - var1.id_byte;
      double var8 = var2.id_protected - var1.id_protected;
      rpr_3 var10 = id_class(this, var1, var3, null, var4, var6, var8);
      if (var10 == null) {
         return Optional.empty();
      } else {
         double var11 = var3[0];
         return Optional.of(var1.id_break(var11 * var4, var11 * var6, var11 * var8));
      }
   }

   public rfl_3 id_break(rjU_2 var1) {
      return this.id_break(var1.id_break, var1.id_byte, var1.id_protected);
   }

   public boolean id_break(rfH_2 var1) {
      return this.id_throws((double)var1.b_(), (double)var1.c_(), (double)var1.d_());
   }

   public rfl_3 id_break(rfl_3 var1) {
      double var2 = Math.min(this.id_class, var1.id_class);
      double var4 = Math.min(this.id_break, var1.id_break);
      double var6 = Math.min(this.id_byte, var1.id_byte);
      double var8 = Math.max(this.id_protected, var1.id_protected);
      double var10 = Math.max(this.id_throws, var1.id_throws);
      double var12 = Math.max(this.id_case, var1.id_case);
      return new rfl_3(var2, var4, var6, var8, var10, var12);
   }

   public double id_break() {
      return this.id_protected - this.id_class;
   }

   public rfl_3 id_break(double var1, double var3, double var5) {
      double var7 = this.id_class;
      double var9 = this.id_break;
      double var11 = this.id_byte;
      double var13 = this.id_protected;
      double var15 = this.id_throws;
      double var17 = this.id_case;
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

   public boolean id_throws() {
      return Double.isNaN(this.id_class)
         || Double.isNaN(this.id_break)
         || Double.isNaN(this.id_byte)
         || Double.isNaN(this.id_protected)
         || Double.isNaN(this.id_throws)
         || Double.isNaN(this.id_case);
   }

   public boolean id_throws(double var1, double var3, double var5) {
      return var1 >= this.id_class && var1 < this.id_protected && var3 >= this.id_break && var3 < this.id_throws && var5 >= this.id_byte && var5 < this.id_case;
   }

   public rfl_3 id_throws(rjU_2 var1) {
      return this.id_protected(-var1.id_break, -var1.id_byte, -var1.id_protected);
   }

   public rfl_3 id_finally(rjU_2 var1) {
      return this.id_private(var1.id_break, var1.id_byte, var1.id_protected);
   }

   public static rfl_3 id_catch(double var0, double var2, double var4) {
      return new rfl_3(-var0 / 2.0, -var2 / 2.0, -var4 / 2.0, var0 / 2.0, var2 / 2.0, var4 / 2.0);
   }

   public rfl_3 id_catch(rjU_2 var1) {
      return this.id_byte(-var1.id_break, -var1.id_byte, -var1.id_protected);
   }

   public rjU_2 id_case() {
      return new rjU_2(
         rfU_2.id_protected(0.5, this.id_class, this.id_protected),
         rfU_2.id_protected(0.5, this.id_break, this.id_throws),
         rfU_2.id_protected(0.5, this.id_byte, this.id_case)
      );
   }

   public boolean id_case(rjU_2 var1) {
      return this.id_throws(var1.id_break, var1.id_byte, var1.id_protected);
   }

   public rfl_3 id_case(double var1, double var3, double var5) {
      return this.id_byte(-var1, -var3, -var5);
   }

   public rjU_2 id_implements(rjU_2 var1) {
      float var2 = (float)rfU_2.id_class(var1.id_break, this.id_class, this.id_protected);
      float var3 = (float)rfU_2.id_class(var1.id_byte, this.id_break, this.id_throws);
      float var4 = (float)rfU_2.id_class(var1.id_protected, this.id_byte, this.id_case);
      return new rjU_2((double)var2, (double)var3, (double)var4);
   }

   public double id_protected() {
      return this.id_case - this.id_byte;
   }

   public rfl_3 id_protected(rjU_2 var1) {
      return this.id_protected(var1.id_break, var1.id_byte, var1.id_protected);
   }

   public boolean id_protected(rfl_3 var1) {
      return this.id_class < var1.id_protected && this.id_protected > var1.id_class && this.id_byte < var1.id_case && this.id_case > var1.id_byte;
   }

   public rfl_3 id_protected(double var1, double var3, double var5) {
      return new rfl_3(this.id_class + var1, this.id_break + var3, this.id_byte + var5, this.id_protected + var1, this.id_throws + var3, this.id_case + var5);
   }

   public rfl_3 id_private(double var1, double var3, double var5) {
      return new rfl_3(var1, var3, var5, var1 + this.id_break(), var3 + this.id_byte(), var5 + this.id_protected());
   }

   public rjU_2 id_private(rjU_2 var1) {
      int var2 = (int)rfU_2.id_class(var1.id_break, this.id_class, this.id_protected);
      int var3 = (int)rfU_2.id_class(var1.id_byte, this.id_break, this.id_throws);
      int var4 = (int)rfU_2.id_class(var1.id_protected, this.id_byte, this.id_case);
      return new rjU_2((double)var2, (double)var3, (double)var4);
   }

   @Override
   public rjU_2 rr() {
      return this.id_case();
   }
}
