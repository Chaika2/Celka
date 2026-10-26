package celestial;

import java.io.DataOutput;
import java.io.IOException;

public class rct_3 extends rcK_2 {
   public static final rcv_3<rct_3> class_ = new rcw_3();
   private final long break_;

   rct_3(long var1) {
      this.break_ = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof rct_3 && this.break_ == ((rct_3)var1).break_;
   }

   @Override
   public String toString() {
      return this.break_ + "L";
   }

   @Override
   public int hashCode() {
      return (int)(this.break_ ^ this.break_ >>> 32);
   }

   public static rct_3 class_(long var0) {
      return var0 >= -128L && var0 <= 1024L ? rcI_2.class_[(int)var0 + 128] : new rct_3(var0);
   }

   @Override
   public void class_(DataOutput var1) throws IOException {
      var1.writeLong(this.break_);
   }

   @Override
   public rgP_2 class_(String var1, int var2) {
      rVi_1 var3 = new rgN_2("L").class_(catch_);
      return new rgN_2(String.valueOf(this.break_)).class_(var3).class_(case_);
   }

   @Override
   public byte class_() {
      return 4;
   }

   @Override
   public rcv_3<rct_3> break_() {
      return class_;
   }

   @Override
   public long throws_() {
      return this.break_;
   }

   @Override
   public float finally_() {
      return (float)this.break_;
   }

   @Override
   public short catch_() {
      return (short)((int)(this.break_ & 65535L));
   }

   @Override
   public Number extends_() {
      return this.break_;
   }

   @Override
   public int case_() {
      return (int)(this.break_ & -1L);
   }

   @Override
   public double implements_() {
      return (double)this.break_;
   }

   public rct_3 protected_() {
      return this;
   }

   @Override
   public byte private_() {
      return (byte)((int)(this.break_ & 255L));
   }
}
