package celestial;

import java.io.IOException;

public class rFA implements ruS_2<At_1> {
   private int class_;
   private int break_;

   public int byte_() {
      return this.break_;
   }

   public rFA() {
   }

   public rFA(int var1, int var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.case_();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.protected_(this.break_);
   }

   public int break_() {
      return this.class_;
   }
}
