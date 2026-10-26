package celestial;

import java.io.IOException;

public class rZe_1 implements ruS_2<At_1> {
   private int class_;
   private int break_;
   private int byte_;

   public int byte_() {
      return this.break_;
   }

   public rZe_1() {
   }

   public rZe_1(int var1, int var2, int var3) {
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
      this.break_ = var1.case_();
      this.byte_ = var1.case_();
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.protected_(this.break_);
      var1.protected_(this.byte_);
   }

   public int protected_() {
      return this.byte_;
   }
}
