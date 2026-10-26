package celestial;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class rfj_3 {
   public static final long class_ = class_(1875016, 1875016);
   public final int break_;
   public final int byte_;
   private int protected_ = 0;

   public int byte_() {
      return this.byte_ << 4;
   }

   public rfj_3(int var1, int var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public rfj_3(long var1) {
      this.break_ = (int)var1;
      this.byte_ = (int)(var1 >> 32);
   }

   public rfj_3(rfH_2 var1) {
      this.break_ = var1.b_() >> 4;
      this.byte_ = var1.d_() >> 4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rfj_3 var2) ? false : this.break_ == var2.break_ && this.byte_ == var2.byte_;
      }
   }

   @Override
   public String toString() {
      return "[" + this.break_ + ", " + this.byte_ + "]";
   }

   @Override
   public int hashCode() {
      if (this.protected_ != 0) {
         return this.protected_;
      } else {
         int var1 = 1664525 * this.break_ + 1013904223;
         int var2 = 1664525 * (this.byte_ ^ -559038737) + 1013904223;
         this.protected_ = var1 ^ var2;
         return this.protected_;
      }
   }

   public static Stream<rfj_3> class_(rfj_3 var0, rfj_3 var1) {
      int var2 = Math.abs(var0.break_ - var1.break_) + 1;
      int var3 = Math.abs(var0.byte_ - var1.byte_) + 1;
      int var4 = var0.break_ < var1.break_ ? 1 : -1;
      int var5 = var0.byte_ < var1.byte_ ? 1 : -1;
      return StreamSupport.stream(new rfV_2((long)(var2 * var3), 64, var0, var1, var5, var4), false);
   }

   public static Stream<rfj_3> class_(rfj_3 var0, int var1) {
      return class_(new rfj_3(var0.break_ - var1, var0.byte_ - var1), new rfj_3(var0.break_ + var1, var0.byte_ + var1));
   }

   public int class_(rfj_3 var1) {
      return Math.max(Math.abs(this.break_ - var1.break_), Math.abs(this.byte_ - var1.byte_));
   }

   public static int class_(long var0) {
      return (int)(var0 & 4294967295L);
   }

   public long class_() {
      return class_(this.break_, this.byte_);
   }

   public static long class_(int var0, int var1) {
      return (long)var0 & 4294967295L | ((long)var1 & 4294967295L) << 32;
   }

   public static int break_(long var0) {
      return (int)(var0 >>> 32 & 4294967295L);
   }

   public int break_() {
      return this.break_ << 4;
   }

   public int throws_() {
      return (this.byte_ << 4) + 15;
   }

   public rfH_2 finally_() {
      return new rfH_2(this.break_(), 0, this.byte_());
   }

   public int catch_() {
      return this.byte_ >> 5;
   }

   public int case_() {
      return this.break_ >> 5;
   }

   public int implements_() {
      return this.byte_ & 31;
   }

   public int protected_() {
      return (this.break_ << 4) + 15;
   }

   public int private_() {
      return this.break_ & 31;
   }
}
