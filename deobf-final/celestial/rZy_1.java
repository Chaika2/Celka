package celestial;

import java.io.IOException;

public class rZy_1 implements ruS_2<rmH_2> {
   private rfH_2 class_;
   private String[] break_;

   public String[] byte_() {
      return this.break_;
   }

   public rZy_1() {
   }

   public rZy_1(rfH_2 var1, String var2, String var3, String var4, String var5) {
      this.class_ = var1;
      this.break_ = new String[]{var2, var3, var4, var5};
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.byte_();
      this.break_ = new String[4];

      for (int var2 = 0; var2 < 4; var2++) {
         this.break_[var2] = var1.throws_(384);
      }
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);

      for (int var2 = 0; var2 < 4; var2++) {
         var1.class_(this.break_[var2]);
      }
   }

   public rfH_2 break_() {
      return this.class_;
   }
}
