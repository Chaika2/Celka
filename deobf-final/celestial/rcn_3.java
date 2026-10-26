package celestial;

import java.io.DataOutput;
import java.io.IOException;

public class rcn_3 extends rcK_2 {
   public static final rcv_3<rcn_3> class_ = new rcC_2();
   private final int break_;

   rcn_3(int var1) {
      this.break_ = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcn_3 && this.break_ == ((rcn_3)var1).break_;
   }

   @Override
   public String toString() {
      return String.valueOf(this.break_);
   }

   @Override
   public int hashCode() {
      return this.break_;
   }

   public static rcn_3 class_(int var0) {
      return var0 >= -128 && var0 <= 1024 ? rcl_3.class_[var0 + 128] : new rcn_3(var0);
   }

   @Override
   public void class_(DataOutput var1) throws IOException {
      var1.writeInt(this.break_);
   }

   @Override
   public rgP_2 class_(String var1, int var2) {
      return new rgN_2(String.valueOf(this.break_)).class_(case_);
   }

   @Override
   public byte class_() {
      return 3;
   }

   @Override
   public rcv_3<rcn_3> break_() {
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
      return (short)(this.break_ & 65535);
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

   public rcn_3 protected_() {
      return this;
   }

   @Override
   public byte private_() {
      return (byte)(this.break_ & 0xFF);
   }
}
