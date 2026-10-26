package celestial;

import java.io.IOException;

public class rFq_1 implements ruS_2<At_1> {
   private int class_;

   public rFq_1() {
   }

   public rFq_1(int var1) {
      this.class_ = var1;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
   }
}
