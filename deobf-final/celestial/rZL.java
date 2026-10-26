package celestial;

import java.io.IOException;

public class rZL implements ruS_2<rmH_2> {
   private int class_;
   private String break_;

   public String byte_() {
      return this.break_;
   }

   public rZL() {
   }

   public rZL(int var1, String var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.throws_(32500);
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.class_(this.break_, 32500);
   }

   public int break_() {
      return this.class_;
   }
}
