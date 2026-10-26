package celestial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrkP extends rrkr_1 {
   private static final Pattern protected_ = Pattern.compile("^\\s*const\\s*bool\\s*([A-Za-z0-9_]+)\\s*=\\s*(true|false)\\s*;\\s*(//.*)?$");

   public rrkP(String var1, String var2, String var3, String var4) {
      super(var1, var2, var3, var4);
   }

   public static rrdD break_(String var0, String var1) {
      Matcher var2 = protected_.matcher(var0);
      if (!var2.matches()) {
         return null;
      } else {
         String var3 = var2.group(1);
         String var4 = var2.group(2);
         String var5 = var2.group(3);
         if (var3 != null && var3.length() > 0) {
            var1 = rrzX_2.protected_(var1, "/shaders/");
            rrkP var6 = new rrkP(var3, var5, var4, var1);
            var6.break_(false);
            return var6;
         } else {
            return null;
         }
      }
   }

   @Override
   public boolean case_(String var1) {
      Matcher var2 = protected_.matcher(var1);
      if (!var2.matches()) {
         return false;
      } else {
         String var3 = var2.group(1);
         return var3.matches(this.class_());
      }
   }

   @Override
   public String package_() {
      return "const bool " + this.class_() + " = " + this.protected_() + "; // Shader option " + this.protected_();
   }

   @Override
   public boolean final_() {
      return false;
   }
}
