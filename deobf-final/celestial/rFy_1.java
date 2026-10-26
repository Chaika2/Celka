package celestial;

import java.io.IOException;

public class rFy_1 implements ruS_2<At_1> {
   private rfH_2 class_;
   private int break_;
   private rcd_3 byte_;

   public int byte_() {
      return this.break_;
   }

   public rFy_1() {
   }

   public rFy_1(rfH_2 var1, int var2, rcd_3 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.byte_();
      this.break_ = var1.readUnsignedByte();
      this.byte_ = var1.implements_();
   }

   public rfH_2 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.writeByte((byte)this.break_);
      var1.class_(this.byte_);
   }

   public rcd_3 protected_() {
      return this.byte_;
   }
}
