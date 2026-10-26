package celestial;

import java.io.IOException;

public class rvh_3 implements ruS_2<At_1> {
   private int class_;
   private byte break_;

   public rvh_3() {
   }

   public rvh_3(an_3 var1, byte var2) {
      this.class_ = var1.V();
      this.break_ = var2;
   }

   public an_3 class_(rYB var1) {
      return var1.break_(this.class_);
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.readByte();
   }

   public byte break_() {
      return this.break_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.writeByte(this.break_);
   }
}
