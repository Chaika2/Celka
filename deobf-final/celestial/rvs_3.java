package celestial;

import java.io.IOException;

public class rvs_3 implements ruS_2<At_1> {
   private rdb_3 class_;
   private int break_;

   public int byte_() {
      return this.break_;
   }

   public rvs_3() {
   }

   public rvs_3(rdb_3 var1, int var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(int var1) {
      this.break_ = var1;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = rdb_3.break_(var1.case_());
      this.break_ = var1.case_();
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   public rdb_3 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(rdb_3.class_(this.class_));
      var1.protected_(this.break_);
   }
}
