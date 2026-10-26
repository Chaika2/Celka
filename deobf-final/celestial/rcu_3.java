package celestial;

import java.io.DataOutput;
import java.io.IOException;

public class rcu_3 extends rcK_2 {
   public static final rcu_3 class_ = new rcu_3(0.0F);
   public static final rcv_3<rcu_3> break_ = new rcm_3();
   private final float byte_;

   private rcu_3(float var1) {
      this.byte_ = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rcu_3 && this.byte_ == ((rcu_3)var1).byte_;
   }

   @Override
   public String toString() {
      return this.byte_ + "f";
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.byte_);
   }

   public static rcu_3 class_(float var0) {
      return var0 == 0.0F ? class_ : new rcu_3(var0);
   }

   @Override
   public void class_(DataOutput var1) throws IOException {
      var1.writeFloat(this.byte_);
   }

   @Override
   public rgP_2 class_(String var1, int var2) {
      rVi_1 var3 = new rgN_2("f").class_(catch_);
      return new rgN_2(String.valueOf(this.byte_)).class_(var3).class_(case_);
   }

   @Override
   public byte class_() {
      return 5;
   }

   @Override
   public rcv_3<rcu_3> break_() {
      return break_;
   }

   @Override
   public long throws_() {
      return (long)this.byte_;
   }

   @Override
   public float finally_() {
      return this.byte_;
   }

   @Override
   public short catch_() {
      return (short)(rfU_2.protected_(this.byte_) & 65535);
   }

   @Override
   public Number extends_() {
      return this.byte_;
   }

   @Override
   public int case_() {
      return rfU_2.protected_(this.byte_);
   }

   @Override
   public double implements_() {
      return (double)this.byte_;
   }

   public rcu_3 protected_() {
      return this;
   }

   @Override
   public byte private_() {
      return (byte)(rfU_2.protected_(this.byte_) & 0xFF);
   }
}
