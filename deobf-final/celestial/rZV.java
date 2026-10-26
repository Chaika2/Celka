package celestial;

import java.io.IOException;

public class rZV implements ruS_2<At_1> {
   private rfH_2 class_;
   private int break_;
   private int byte_;
   private xd_3 protected_;

   public int byte_() {
      return this.break_;
   }

   public rZV() {
   }

   public rZV(rfH_2 var1, xd_3 var2, int var3, int var4) {
      this.class_ = var1;
      this.protected_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.byte_();
      this.break_ = var1.readUnsignedByte();
      this.byte_ = var1.readUnsignedByte();
      this.protected_ = rVL.strictfp_.class_(var1.case_());
   }

   public rfH_2 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.writeByte(this.break_);
      var1.writeByte(this.byte_);
      var1.protected_(rVL.strictfp_.class_(this.protected_));
   }

   public xd_3 throws_() {
      return this.protected_;
   }

   public int protected_() {
      return this.byte_;
   }
}
