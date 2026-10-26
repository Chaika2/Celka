package celestial;

import java.io.IOException;
import java.util.List;

public class rFb_1 implements ruS_2<At_1> {
   private int class_;
   private int[] break_;

   public int byte_() {
      return this.class_;
   }

   public rFb_1() {
   }

   public rFb_1(an_3 var1) {
      this.class_ = var1.V();
      List var2 = var1.Bh();
      this.break_ = new int[var2.size()];

      for (int var3 = 0; var3 < var2.size(); var3++) {
         this.break_[var3] = ((an_3)var2.get(var3)).V();
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.break_();
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.class_(this.break_);
   }

   public int[] break_() {
      return this.break_;
   }
}
