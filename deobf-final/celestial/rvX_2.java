package celestial;

import java.io.IOException;
import java.util.List;

public class rvX_2 implements ruS_2<At_1> {
   private int class_;
   private List<rmG_2<?>> break_;

   public int byte_() {
      return this.class_;
   }

   public rvX_2() {
   }

   public rvX_2(int var1, rmE_2 var2, boolean var3) {
      this.class_ = var1;
      if (var3) {
         this.break_ = var2.byte_();
         var2.throws_();
      } else {
         this.break_ = var2.break_();
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = rmE_2.class_(var1);
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      rmE_2.class_(this.break_, var1);
   }

   public List<rmG_2<?>> break_() {
      return this.break_;
   }
}
