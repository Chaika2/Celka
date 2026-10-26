package celestial;

import java.io.IOException;

public class rFr_1 implements ruS_2<At_1> {
   private int class_;
   private rLR break_;

   public rFr_1() {
   }

   public rFr_1(int var1, rLR var2) {
      this.class_ = var1;
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
      this.break_ = rLR.class_(var1.readUnsignedByte());
   }

   public rLR break_() {
      return this.break_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.writeByte(rLR.class_(this.break_));
   }
}
