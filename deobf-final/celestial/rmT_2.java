package celestial;

import java.io.IOException;

public class rmT_2 implements ruS_2<rmH_2> {
   private String class_;

   public rmT_2() {
   }

   public rmT_2(String var1) {
      if (var1.length() > 256) {
         var1 = var1.substring(0, 256);
      }

      this.class_ = var1;
   }

   public void class_(String var1) {
      this.class_ = var1;
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.throws_(256);
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
   }

   public String break_() {
      return this.class_;
   }
}
