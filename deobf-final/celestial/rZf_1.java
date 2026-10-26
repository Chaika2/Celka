package celestial;

import java.io.IOException;

public class rZf_1 implements ruS_2<At_1> {
   private int class_;
   private rfH_2 break_;
   private int byte_;

   public rfH_2 byte_() {
      return this.break_;
   }

   public rZf_1() {
   }

   public rZf_1(int var1, rfH_2 var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.byte_();
      this.byte_ = var1.readUnsignedByte();
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.class_(this.break_);
      var1.writeByte(this.byte_);
   }

   public int protected_() {
      return this.byte_;
   }
}
