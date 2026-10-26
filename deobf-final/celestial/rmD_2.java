package celestial;

import java.io.IOException;

public class rmD_2 implements ruS_2<rmH_2> {
   private int protected_;
   private rmU_2 throws_;
   private int case_;
   public static rmU_2 class_;
   public static boolean break_;
   public static boolean byte_;

   public int byte_() {
      return this.case_;
   }

   public rmD_2(an_3 var1, rmU_2 var2, int var3) {
      this.protected_ = var1.V();
      this.throws_ = var2;
      this.case_ = var3;
      class_ = var2;
      if (var2 == rmU_2.START_SPRINTING) {
         break_ = true;
      } else if (var2 == rmU_2.STOP_SPRINTING) {
         break_ = false;
      }

      if (var2 == rmU_2.PRESS_SHIFT_KEY) {
         byte_ = true;
      } else if (var2 == rmU_2.RELEASE_SHIFT_KEY) {
         byte_ = false;
      }
   }

   public rmD_2(an_3 var1, rmU_2 var2) {
      this(var1, var2, 0);
   }

   public rmD_2() {
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.protected_ = var1.case_();
      this.throws_ = var1.class_(rmU_2.class);
      this.case_ = var1.case_();
   }

   public rmU_2 break_() {
      return this.throws_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.protected_);
      var1.class_(this.throws_);
      var1.protected_(this.case_);
   }
}
