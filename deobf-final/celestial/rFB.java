package celestial;

import java.io.IOException;

public class rFB implements ruS_2<At_1> {
   private String class_;
   private rgP_2 break_;
   private rnr_3 byte_;
   private int protected_;

   public rgP_2 byte_() {
      return this.break_;
   }

   public rFB() {
   }

   public rFB(rnP_2 var1, int var2) {
      this.class_ = var1.break_();
      this.break_ = var1.protected_();
      this.byte_ = var1.case_();
      this.protected_ = var2;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.throws_(16);
      this.protected_ = var1.readByte();
      if (this.protected_ == 0 || this.protected_ == 2) {
         this.break_ = var1.throws_();
         this.byte_ = var1.class_(rnr_3.class);
      }
   }

   public String break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.writeByte(this.protected_);
      if (this.protected_ == 0 || this.protected_ == 2) {
         var1.class_(this.break_);
         var1.class_(this.byte_);
      }
   }

   public rnr_3 throws_() {
      return this.byte_;
   }

   public int protected_() {
      return this.protected_;
   }
}
