package celestial;

import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import java.util.stream.IntStream;

public class rja_3 implements Comparable<rja_3> {
   public static final Codec<rja_3> throws_ = Codec.INT_STREAM
      .comapFlatMap(var0 -> rqR_2.class_(var0, 3).map(var0x -> new rja_3(var0x[0], var0x[1], var0x[2])), var0 -> IntStream.of(var0.b_(), var0.c_(), var0.d_()));
   public static final rja_3 case_ = new rja_3(0, 0, 0);
   private int class_;
   private int break_;
   private int byte_;

   public rja_3(int var1, int var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public rja_3(double var1, double var3, double var5) {
      this(rfU_2.byte_(var1), rfU_2.byte_(var3), rfU_2.byte_(var5));
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof rja_3 var2) {
         if (this.b_() != var2.b_()) {
            return false;
         } else {
            return this.c_() != var2.c_() ? false : this.d_() == var2.d_();
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("x", this.b_()).add("y", this.c_()).add("z", this.d_()).toString();
   }

   @Override
   public int hashCode() {
      return (this.c_() + this.d_() * 31) * 31 + this.b_();
   }

   public String this_() {
      return this.b_() + ", " + this.c_() + ", " + this.d_();
   }

   public double class_(double var1, double var3, double var5, boolean var7) {
      double var8 = var7 ? 0.5 : 0.0;
      double var10 = (double)this.b_() + var8 - var1;
      double var12 = (double)this.c_() + var8 - var3;
      double var14 = (double)this.d_() + var8 - var5;
      return var10 * var10 + var12 * var12 + var14 * var14;
   }

   public double class_(eX_2 var1, boolean var2) {
      return this.class_(var1.class_(), var1.break_(), var1.byte_(), var2);
   }

   public boolean class_(eX_2 var1, double var2) {
      return this.class_(var1.class_(), var1.break_(), var1.byte_(), true) < var2 * var2;
   }

   public boolean class_(rja_3 var1, double var2) {
      return this.class_((double)var1.b_(), (double)var1.c_(), (double)var1.d_(), false) < var2 * var2;
   }

   public int class_(rpB_2 var1) {
      return var1.class_(this.class_, this.break_, this.byte_);
   }

   public double break_(rfl_3 var1) {
      return this.class_(var1.class_, var1.break_, var1.byte_, false);
   }

   public rja_3 break_(rpr_3 var1, int var2) {
      return var2 == 0 ? this : new rja_3(this.b_() + var1.implements_() * var2, this.c_() + var1.finally_() * var2, this.d_() + var1.extends_() * var2);
   }

   public rja_3 throws_(rja_3 var1) {
      return new rja_3(
         this.c_() * var1.d_() - this.d_() * var1.c_(), this.d_() * var1.b_() - this.b_() * var1.d_(), this.b_() * var1.c_() - this.c_() * var1.b_()
      );
   }

   public rja_3 catch_() {
      return this.implements_(1);
   }

   public int catch_(rja_3 var1) {
      if (this.c_() == var1.c_()) {
         return this.d_() == var1.d_() ? this.b_() - var1.b_() : this.d_() - var1.d_();
      } else {
         return this.c_() - var1.c_();
      }
   }

   public rja_3 case_(int var1) {
      return this.break_(rpr_3.UP, var1);
   }

   public eX_2 else_() {
      return new rjU_2((double)this.b_(), (double)this.c_(), (double)this.d_());
   }

   public int implements_(rja_3 var1) {
      float var2 = (float)Math.abs(var1.b_() - this.b_());
      float var3 = (float)Math.abs(var1.c_() - this.c_());
      float var4 = (float)Math.abs(var1.d_() - this.d_());
      return (int)(var2 + var3 + var4);
   }

   public rja_3 implements_(int var1) {
      return this.break_(rpr_3.DOWN, var1);
   }

   public rja_3 implements_() {
      return this.case_(1);
   }

   public double protected_(double var1, double var3, double var5) {
      return this.class_(var1, var3, var5, true);
   }

   public double private_(rja_3 var1) {
      return this.class_((double)var1.b_(), (double)var1.c_(), (double)var1.d_(), true);
   }

   protected void a_(int var1) {
      this.class_ = var1;
   }

   public int c_() {
      return this.break_;
   }

   protected void c_(int var1) {
      this.byte_ = var1;
   }

   public int b_() {
      return this.class_;
   }

   protected void b_(int var1) {
      this.break_ = var1;
   }

   public int d_() {
      return this.byte_;
   }
}
