package celestial;

import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import java.util.stream.IntStream;

public class rja_3 implements Comparable<rja_3> {
   public static final Codec<rja_3> id_throws = Codec.INT_STREAM
      .comapFlatMap(
         var0 -> rqR_2.id_class(var0, 3).map(var0x -> new rja_3(var0x[0], var0x[1], var0x[2])), var0 -> IntStream.of(var0.b_(), var0.c_(), var0.d_())
      );
   public static final rja_3 id_case = new rja_3(0, 0, 0);
   private int id_class;
   private int id_break;
   private int id_byte;

   public rja_3(int var1, int var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public rja_3(double var1, double var3, double var5) {
      this(rfU_2.id_byte(var1), rfU_2.id_byte(var3), rfU_2.id_byte(var5));
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

   public String id_this() {
      return this.b_() + ", " + this.c_() + ", " + this.d_();
   }

   public double id_class(double var1, double var3, double var5, boolean var7) {
      double var8 = var7 ? 0.5 : 0.0;
      double var10 = (double)this.b_() + var8 - var1;
      double var12 = (double)this.c_() + var8 - var3;
      double var14 = (double)this.d_() + var8 - var5;
      return var10 * var10 + var12 * var12 + var14 * var14;
   }

   public double id_class(eX_2 var1, boolean var2) {
      return this.id_class(var1.id_class(), var1.id_break(), var1.id_byte(), var2);
   }

   public boolean id_class(eX_2 var1, double var2) {
      return this.id_class(var1.id_class(), var1.id_break(), var1.id_byte(), true) < var2 * var2;
   }

   public boolean id_class(rja_3 var1, double var2) {
      return this.id_class((double)var1.b_(), (double)var1.c_(), (double)var1.d_(), false) < var2 * var2;
   }

   public int id_class(rpB_2 var1) {
      return var1.id_class(this.id_class, this.id_break, this.id_byte);
   }

   public double id_break(rfl_3 var1) {
      return this.id_class(var1.id_class, var1.id_break, var1.id_byte, false);
   }

   public rja_3 id_break(rpr_3 var1, int var2) {
      return var2 == 0 ? this : new rja_3(this.b_() + var1.id_implements() * var2, this.c_() + var1.id_finally() * var2, this.d_() + var1.id_extends() * var2);
   }

   public rja_3 id_throws(rja_3 var1) {
      return new rja_3(
         this.c_() * var1.d_() - this.d_() * var1.c_(), this.d_() * var1.b_() - this.b_() * var1.d_(), this.b_() * var1.c_() - this.c_() * var1.b_()
      );
   }

   public rja_3 id_catch() {
      return this.id_implements(1);
   }

   public int id_catch(rja_3 var1) {
      if (this.c_() == var1.c_()) {
         return this.d_() == var1.d_() ? this.b_() - var1.b_() : this.d_() - var1.d_();
      } else {
         return this.c_() - var1.c_();
      }
   }

   public rja_3 id_case(int var1) {
      return this.id_break(rpr_3.UP, var1);
   }

   public eX_2 id_else() {
      return new rjU_2((double)this.b_(), (double)this.c_(), (double)this.d_());
   }

   public int id_implements(rja_3 var1) {
      float var2 = (float)Math.abs(var1.b_() - this.b_());
      float var3 = (float)Math.abs(var1.c_() - this.c_());
      float var4 = (float)Math.abs(var1.d_() - this.d_());
      return (int)(var2 + var3 + var4);
   }

   public rja_3 id_implements(int var1) {
      return this.id_break(rpr_3.DOWN, var1);
   }

   public rja_3 id_implements() {
      return this.id_case(1);
   }

   public double id_protected(double var1, double var3, double var5) {
      return this.id_class(var1, var3, var5, true);
   }

   public double id_private(rja_3 var1) {
      return this.id_class((double)var1.b_(), (double)var1.c_(), (double)var1.d_(), true);
   }

   protected void a_(int var1) {
      this.id_class = var1;
   }

   public int c_() {
      return this.id_break;
   }

   protected void c_(int var1) {
      this.id_byte = var1;
   }

   public int b_() {
      return this.id_class;
   }

   protected void b_(int var1) {
      this.id_break = var1;
   }

   public int d_() {
      return this.id_byte;
   }
}
