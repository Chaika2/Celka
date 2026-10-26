package celestial;

import java.io.DataOutput;
import java.io.IOException;

public class rch_3 extends rcK_2 {
   public static final rcv_3<rch_3> class_ = new rcX_2();
   public static final rch_3 break_ = class_((byte)0);
   public static final rch_3 byte_ = class_((byte)1);
   private final byte private_;

   rch_3(byte var1) {
      this.private_ = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rch_3 && this.private_ == ((rch_3)var1).private_;
   }

   @Override
   public String toString() {
      return this.private_ + "b";
   }

   @Override
   public int hashCode() {
      return this.private_;
   }

   public static rch_3 class_(byte var0) {
      return rcJ_2.class_[128 + var0];
   }

   public static rch_3 class_(boolean var0) {
      return var0 ? byte_ : break_;
   }

   @Override
   public rgP_2 class_(String var1, int var2) {
      rVi_1 var3 = new rgN_2("b").class_(catch_);
      return new rgN_2(String.valueOf(this.private_)).class_(var3).class_(case_);
   }

   @Override
   public void class_(DataOutput var1) throws IOException {
      var1.writeByte(this.private_);
   }

   @Override
   public byte class_() {
      return 1;
   }

   @Override
   public rcv_3<rch_3> break_() {
      return class_;
   }

   @Override
   public long throws_() {
      return (long)this.private_;
   }

   @Override
   public float finally_() {
      return (float)this.private_;
   }

   @Override
   public short catch_() {
      return (short)this.private_;
   }

   @Override
   public Number extends_() {
      return this.private_;
   }

   @Override
   public int case_() {
      return this.private_;
   }

   @Override
   public double implements_() {
      return (double)this.private_;
   }

   public rch_3 protected_() {
      return this;
   }

   @Override
   public byte private_() {
      return this.private_;
   }
}
