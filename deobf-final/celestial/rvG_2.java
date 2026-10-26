package celestial;

import java.io.IOException;

public class rvG_2 implements ruS_2<At_1> {
   private int[] class_;

   public rvG_2() {
   }

   public rvG_2(int... var1) {
      this.class_ = var1;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = new int[var1.case_()];

      for (int var2 = 0; var2 < this.class_.length; var2++) {
         this.class_[var2] = var1.case_();
      }
   }

   public int[] break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_.length);

      for (int var5 : this.class_) {
         var1.protected_(var5);
      }
   }
}
