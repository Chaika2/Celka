package celestial;

import java.io.DataOutput;
import java.io.IOException;

public class rcz_3 extends rcK_2 {
   public static final rcz_3 class_ = new rcz_3(0.0);
   public static final rcv_3<rcz_3> break_ = new rcQ_2();
   private final double byte_;

   private rcz_3(double var1) {
      this.byte_ = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcz_3 && this.byte_ == ((rcz_3)var1).byte_;
   }

   @Override
   public String toString() {
      return this.byte_ + "d";
   }

   @Override
   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.byte_);
      return (int)(var1 ^ var1 >>> 32);
   }

   public static rcz_3 class_(double var0) {
      return var0 == 0.0 ? class_ : new rcz_3(var0);
   }

   @Override
   public void class_(DataOutput var1) throws IOException {
      var1.writeDouble(this.byte_);
   }

   @Override
   public rgP_2 class_(String var1, int var2) {
      rVi_1 var3 = new rgN_2("d").class_(catch_);
      return new rgN_2(String.valueOf(this.byte_)).class_(var3).class_(case_);
   }

   @Override
   public byte class_() {
      return 6;
   }

   @Override
   public rcv_3<rcz_3> break_() {
      return break_;
   }

   @Override
   public long throws_() {
      return (long)Math.floor(this.byte_);
   }

   @Override
   public float finally_() {
      return (float)this.byte_;
   }

   @Override
   public short catch_() {
      return (short)(rfU_2.byte_(this.byte_) & 65535);
   }

   @Override
   public Number extends_() {
      return this.byte_;
   }

   @Override
   public int case_() {
      return rfU_2.byte_(this.byte_);
   }

   @Override
   public double implements_() {
      return this.byte_;
   }

   public rcz_3 protected_() {
      return this;
   }

   @Override
   public byte private_() {
      return (byte)(rfU_2.byte_(this.byte_) & 0xFF);
   }
}
