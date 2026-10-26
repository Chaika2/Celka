package celestial;

import java.io.DataOutput;
import java.io.IOException;

public class rcD_2 extends rcK_2 {
   public static final rcv_3<rcD_2> class_ = new rcU_2();
   private final short break_;

   rcD_2(short var1) {
      this.break_ = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcD_2 && this.break_ == ((rcD_2)var1).break_;
   }

   @Override
   public String toString() {
      return this.break_ + "s";
   }

   @Override
   public int hashCode() {
      return this.break_;
   }

   public static rcD_2 class_(short var0) {
      return var0 >= -128 && var0 <= 1024 ? rce_3.class_[var0 + 128] : new rcD_2(var0);
   }

   @Override
   public void class_(DataOutput var1) throws IOException {
      var1.writeShort(this.break_);
   }

   @Override
   public rgP_2 class_(String var1, int var2) {
      rVi_1 var3 = new rgN_2("s").class_(catch_);
      return new rgN_2(String.valueOf(this.break_)).class_(var3).class_(case_);
   }

   @Override
   public byte class_() {
      return 2;
   }

   @Override
   public rcv_3<rcD_2> break_() {
      return class_;
   }

   @Override
   public long throws_() {
      return (long)this.break_;
   }

   @Override
   public float finally_() {
      return (float)this.break_;
   }

   @Override
   public short catch_() {
      return this.break_;
   }

   @Override
   public Number extends_() {
      return this.break_;
   }

   @Override
   public int case_() {
      return this.break_;
   }

   @Override
   public double implements_() {
      return (double)this.break_;
   }

   public rcD_2 protected_() {
      return this;
   }

   @Override
   public byte private_() {
      return (byte)(this.break_ & 255);
   }
}
