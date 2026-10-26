package celestial;

import java.io.IOException;

public class rvm_3 implements ruS_2<At_1> {
   private int class_;

   public rvm_3() {
   }

   public rvm_3(int var1) {
      this.class_ = var1;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.readByte();
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeByte(this.class_);
   }
}
