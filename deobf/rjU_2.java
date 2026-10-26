package celestial;

import java.util.EnumSet;

public class rjU_2 implements eX_2, rrTR {
   public static final rjU_2 id_class = new rjU_2((double)0.0F, (double)0.0F, (double)0.0F);
   public double id_break;
   public double id_byte;
   public double id_protected;

   public rjU_2 id_byte(float var1) {
      float var2 = rfU_2.id_break(var1);
      float var3 = rfU_2.id_class(var1);
      double var4 = this.id_break * (double)var2 + this.id_byte * (double)var3;
      double var6 = this.id_byte * (double)var2 - this.id_break * (double)var3;
      double var8 = this.id_protected;
      return new rjU_2(var4, var6, var8);
   }

   public static rjU_2 id_byte(rja_3 var0) {
      return new rjU_2((double)var0.b_(), (double)var0.c_(), (double)var0.d_());
   }

   public double id_byte(double var1, double var3, double var5) {
      double var7 = var1 - this.id_break;
      double var9 = var3 - this.id_byte;
      double var11 = var5 - this.id_protected;
      return (double)rfU_2.id_class(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public rjU_2 id_byte(rjU_2 var1) {
      return new rjU_2(this.id_byte * var1.id_protected - this.id_protected * var1.id_byte, this.id_protected * var1.id_break - this.id_break * var1.id_protected, this.id_break * var1.id_byte - this.id_byte * var1.id_break);
   }

   public final double id_byte() {
      return this.id_protected;
   }

   public rjU_2(double var1, double var3, double var5) {
      this.id_break = var1;
      this.id_byte = var3;
      this.id_protected = var5;
   }

   public rjU_2(rfH_2 var1) {
      this((double)var1.b_(), (double)var1.c_(), (double)var1.d_());
   }

   public rjU_2(rfl_3 var1) {
      rjU_2 var2 = var1.id_case();
      this.id_break = var2.id_break;
      this.id_byte = var2.id_byte;
      this.id_protected = var2.id_protected;
   }

   public rjU_2(rja_3 var1) {
      this((double)var1.b_(), (double)var1.c_(), (double)var1.d_());
   }

   public rjU_2(rje_3 var1) {
      this((double)var1.id_class(), (double)var1.id_break(), (double)var1.id_byte());
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof rjU_2) {
         rjU_2 var2 = (rjU_2)var1;
         if (Double.compare(var2.id_break, this.id_break) != 0) {
            return false;
         } else if (Double.compare(var2.id_byte, this.id_byte) != 0) {
            return false;
         } else {
            return Double.compare(var2.id_protected, this.id_protected) == 0;
         }
      } else {
         return false;
      }
   }

   public String toString() {
      return "(" + this.id_break + ", " + this.id_byte + ", " + this.id_protected + ")";
   }

   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.id_break);
      int var3 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.id_byte);
      var3 = 31 * var3 + (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.id_protected);
      return 31 * var3 + (int)(var1 ^ var1 >>> 32);
   }

   public rjU_2 id_class(double var1) {
      return this.id_throws(var1, var1, var1);
   }

   public double id_class(rpB_2 var1) {
      return var1.id_class(this.id_break, this.id_byte, this.id_protected);
   }

   public rjU_2 id_class(float var1, float var2, float var3) {
      this.id_break = (double)var1;
      this.id_byte = (double)var2;
      this.id_protected = (double)var3;
      return this;
   }

   public double id_class(rfH_2 var1) {
      double var2 = (double)var1.b_() - this.id_break;
      double var4 = (double)var1.c_() - this.id_byte;
      double var6 = (double)var1.d_() - this.id_protected;
      return (double)rfU_2.id_class(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public double id_class(an_3 var1) {
      return this.id_private(var1.Ps());
   }

   public static rjU_2 id_class(rjK_2 var0) {
      return id_class(var0.id_byte, var0.id_protected);
   }

   public static rjU_2 id_class(rja_3 var0) {
      return new rjU_2((double)var0.b_() + (double)0.5F, (double)var0.c_() + (double)0.5F, (double)var0.d_() + (double)0.5F);
   }

   public rjU_2 id_class(float var1) {
      float var2 = rfU_2.id_break(var1);
      float var3 = rfU_2.id_class(var1);
      double var4 = this.id_break;
      double var6 = this.id_byte * (double)var2 + this.id_protected * (double)var3;
      double var8 = this.id_protected * (double)var2 - this.id_byte * (double)var3;
      return new rjU_2(var4, var6, var8);
   }

   public static rjU_2 id_class(float var0, float var1) {
      float var2 = rfU_2.id_break(-var1 * ((float)Math.PI / 180F) - (float)Math.PI);
      float var3 = rfU_2.id_class(-var1 * ((float)Math.PI / 180F) - (float)Math.PI);
      float var4 = -rfU_2.id_break(-var0 * ((float)Math.PI / 180F));
      float var5 = rfU_2.id_class(-var0 * ((float)Math.PI / 180F));
      return new rjU_2((double)(var3 * var4), (double)var5, (double)(var2 * var4));
   }

   public rjU_2 id_class(EnumSet<rpB_2> var1) {
      double var2 = var1.contains(rpB_2.X) ? (double)rfU_2.id_byte(this.id_break) : this.id_break;
      double var4 = var1.contains(rpB_2.Y) ? (double)rfU_2.id_byte(this.id_byte) : this.id_byte;
      double var6 = var1.contains(rpB_2.Z) ? (double)rfU_2.id_byte(this.id_protected) : this.id_protected;
      return new rjU_2(var2, var4, var6);
   }

   public boolean id_class(eX_2 var1, double var2) {
      return this.id_protected(var1.id_class(), var1.id_break(), var1.id_byte()) < var2 * var2;
   }

   public rjU_2 id_class(rjU_2 var1) {
      return new rjU_2(var1.id_break - this.id_break, var1.id_byte - this.id_byte, var1.id_protected - this.id_protected);
   }

   public rjU_2 id_class(double var1, double var3, double var5) {
      return this.id_break(-var1, -var3, -var5);
   }

   public rjU_2 id_class(rjU_2 var1, float var2) {
      return new rjU_2(rfU_2.id_protected((double)var2, this.id_break, var1.id_break), rfU_2.id_protected((double)var2, this.id_byte, var1.id_byte), rfU_2.id_protected((double)var2, this.id_protected, var1.id_protected));
   }

   public static rjU_2 id_class(rja_3 var0, double var1) {
      return new rjU_2((double)var0.b_() + (double)0.5F, (double)var0.c_() + var1, (double)var0.d_() + (double)0.5F);
   }

   public static rjU_2 id_class(int var0) {
      double var1 = (double)(var0 >> 16 & 255) / (double)255.0F;
      double var3 = (double)(var0 >> 8 & 255) / (double)255.0F;
      double var5 = (double)(var0 & 255) / (double)255.0F;
      return new rjU_2(var1, var3, var5);
   }

   public final double id_class() {
      return this.id_break;
   }

   public rjU_2 id_break(float var1) {
      float var2 = rfU_2.id_break(var1);
      float var3 = rfU_2.id_class(var1);
      double var4 = this.id_break * (double)var2 + this.id_protected * (double)var3;
      double var6 = this.id_byte;
      double var8 = this.id_protected * (double)var2 - this.id_break * (double)var3;
      return new rjU_2(var4, var6, var8);
   }

   public rjU_2 id_break(double var1, double var3, double var5) {
      return new rjU_2(this.id_break + var1, this.id_byte + var3, this.id_protected + var5);
   }

   public double id_break(rjU_2 var1) {
      return this.id_break * var1.id_break + this.id_byte * var1.id_byte + this.id_protected * var1.id_protected;
   }

   public final double id_break() {
      return this.id_byte;
   }

   public static rjU_2 id_break(rja_3 var0) {
      return new rjU_2((double)var0.b_(), (double)var0.c_(), (double)var0.d_());
   }

   public rjU_2 id_throws() {
      return this.id_class((double)-1.0F);
   }

   public rjU_2 id_throws(double var1, double var3, double var5) {
      return new rjU_2(this.id_break * var1, this.id_byte * var3, this.id_protected * var5);
   }

   public rjU_2 id_throws(rjU_2 var1) {
      return this.id_break(var1.id_break, var1.id_byte, var1.id_protected);
   }

   public rjU_2 id_finally(rjU_2 var1) {
      return this.id_throws(var1.id_break, var1.id_byte, var1.id_protected);
   }

   public rja_3 id_finally() {
      return new rja_3(this.id_break, this.id_byte, this.id_protected);
   }

   public double id_catch() {
      return this.id_break * this.id_break + this.id_byte * this.id_byte + this.id_protected * this.id_protected;
   }

   public double id_catch(rjU_2 var1) {
      double var2 = var1.id_break - this.id_break;
      double var4 = var1.id_protected - this.id_protected;
      return (double)rfU_2.id_class(var2 * var2 + var4 * var4);
   }

   public rjU_2 id_extends() {
      return new rjU_2(this.id_break, this.id_byte, this.id_protected);
   }

   public double id_case(rjU_2 var1) {
      double var2 = var1.id_break - this.id_break;
      double var4 = var1.id_byte - this.id_byte;
      double var6 = var1.id_protected - this.id_protected;
      return (double)rfU_2.id_class(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public double id_case() {
      return (double)rfU_2.id_class(this.id_break * this.id_break + this.id_byte * this.id_byte + this.id_protected * this.id_protected);
   }

   public rjU_2 id_implements() {
      return new rjU_2(Math.abs(this.id_break), Math.abs(this.id_byte), Math.abs(this.id_protected));
   }

   public double id_implements(rjU_2 var1) {
      double var2 = var1.id_break - this.id_break;
      double var4 = var1.id_byte - this.id_byte;
      double var6 = var1.id_protected - this.id_protected;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public rjU_2 id_protected() {
      double var1 = (double)rfU_2.id_class(this.id_break * this.id_break + this.id_byte * this.id_byte + this.id_protected * this.id_protected);
      return var1 < 1.0E-4 ? id_class : new rjU_2(this.id_break / var1, this.id_byte / var1, this.id_protected / var1);
   }

   public double id_protected(double var1, double var3, double var5) {
      double var7 = var1 - this.id_break;
      double var9 = var3 - this.id_byte;
      double var11 = var5 - this.id_protected;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public static rjU_2 id_protected(rja_3 var0) {
      return new rjU_2((double)var0.b_() + (double)0.5F, (double)var0.c_(), (double)var0.d_() + (double)0.5F);
   }

   public rjU_2 id_protected(rjU_2 var1) {
      return this.id_class(var1.id_break, var1.id_byte, var1.id_protected);
   }

   public double id_private(rjU_2 var1) {
      double var2 = var1.id_break - this.id_break;
      double var4 = var1.id_byte - this.id_byte;
      double var6 = var1.id_protected - this.id_protected;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public rjU_2 id_private() {
      return new rjU_2((double)rfU_2.id_byte(this.id_break) + (double)0.5F, (double)rfU_2.id_byte(this.id_byte) + (double)0.5F, (double)rfU_2.id_byte(this.id_protected) + (double)0.5F);
   }

   public rjU_2 rr() {
      return this;
   }
}
