package celestial;

import java.io.IOException;

public class rZR implements ruS_2<At_1> {
   private rfH_2 class_;
   private xc_3 break_;

   public rfH_2 byte_() {
      return this.class_;
   }

   public rZR(rRq_1 var1, rfH_2 var2) {
      this(var2, var1.byte_(var2));
   }

   public rZR(rfH_2 var1, xc_3 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public rZR() {
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.byte_();
      this.break_ = xd_3.char_.class_(var1.case_());
   }

   public xc_3 break_() {
      return this.break_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.protected_(xd_3.finally_(this.break_));
   }
}
