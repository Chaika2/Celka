package celestial;

import java.io.IOException;

public class rFM implements ruS_2<At_1> {
   private int class_;
   private int break_;
   private rdn_3 byte_ = rdn_3.break_;

   public int byte_() {
      return this.break_;
   }

   public rFM() {
   }

   public rFM(int var1, int var2, rdn_3 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3.implements_();
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readByte();
      this.break_ = var1.readShort();
      this.byte_ = var1.extends_();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeByte(this.class_);
      var1.writeShort(this.break_);
      var1.class_(this.byte_);
   }

   public int break_() {
      return this.class_;
   }

   public rdn_3 protected_() {
      return this.byte_;
   }
}
