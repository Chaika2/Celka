package celestial;

import java.io.IOException;

public class rZj_1 implements ruS_2<At_1> {
   private int class_;
   private int break_;

   public int byte_() {
      return this.break_;
   }

   public rZj_1() {
   }

   public rZj_1(an_3 var1, int var2) {
      this.class_ = var1.V();
      this.break_ = var2;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.readUnsignedByte();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.writeByte(this.break_);
   }

   public int break_() {
      return this.class_;
   }
}
