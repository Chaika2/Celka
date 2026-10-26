package celestial;

import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class gP_2 extends IOException {
   private final List<gB_2> class_ = Lists.newArrayList();
   private final String break_;

   public gP_2(String var1) {
      this.class_.add(new gB_2());
      this.break_ = var1;
   }

   public gP_2(String var1, Throwable var2) {
      super(var2);
      this.class_.add(new gB_2());
      this.break_ = var1;
   }

   public static gP_2 class_(Exception var0) {
      if (var0 instanceof gP_2) {
         return (gP_2)var0;
      } else {
         String var1 = var0.getMessage();
         if (var0 instanceof FileNotFoundException) {
            var1 = "File not found";
         }

         return new gP_2(var1, var0);
      }
   }

   public void class_(String var1) {
      this.class_.get(0).class_(var1);
   }

   @Override
   public String getMessage() {
      return "Invalid " + this.class_.get(this.class_.size() - 1) + ": " + this.break_;
   }

   public void break_(String var1) {
      this.class_.get(0).class_ = var1;
      this.class_.add(0, new gB_2());
   }
}
