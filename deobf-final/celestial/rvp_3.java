package celestial;

import java.io.IOException;

public class rvp_3 implements ruS_2<At_1> {
   private int class_;
   private int break_;
   private rgP_2 byte_;

   public rJP<?> byte_() {
      return rVL.G.class_(this.break_);
   }

   public rvp_3() {
   }

   public rvp_3(int var1, rJP<?> var2, rgP_2 var3) {
      this.class_ = var1;
      this.break_ = rVL.G.class_(var2);
      this.byte_ = var3;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.case_();
      this.byte_ = var1.throws_();
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.protected_(this.break_);
      var1.class_(this.byte_);
   }

   public rgP_2 protected_() {
      return this.byte_;
   }
}
