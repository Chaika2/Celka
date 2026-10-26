package celestial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrkS extends rrkB {
   private String id_protected = null;
   private static final Pattern id_throws = Pattern.compile("^\\s*const\\s*(float|int)\\s*([A-Za-z0-9_]+)\\s*=\\s*(-?[0-9\\.]+f?F?)\\s*;\\s*(//.*)?$");

   public static rrdD id_byte(String var0, String var1) {
      Matcher var2 = id_throws.matcher(var0);
      if (!var2.matches()) {
         return null;
      } else {
         String var3 = var2.group(1);
         String var4 = var2.group(2);
         String var5 = var2.group(3);
         String var6 = var2.group(4);
         String var7 = rrzX_2.id_protected(var6, "[", "]");
         if (var7 != null && var7.length() > 0) {
            var6 = var6.replace(var7, "").trim();
         }

         String[] var8 = id_break(var5, var7);
         if (var4 != null && var4.length() > 0) {
            var1 = rrzX_2.id_protected(var1, "/shaders/");
            return new rrkS(var4, var3, var6, var5, var8, var1);
         } else {
            return null;
         }
      }
   }

   public rrkS(String var1, String var2, String var3, String var4, String[] var5, String var6) {
      super(var1, var3, var4, var5, var6);
      this.id_protected = var2;
   }

   @Override
   public boolean id_case(String var1) {
      Matcher var2 = id_throws.matcher(var1);
      if (!var2.matches()) {
         return false;
      } else {
         String var3 = var2.group(2);
         return var3.matches(this.id_class());
      }
   }

   @Override
   public String id_package() {
      return "const " + this.id_protected + " " + this.id_class() + " = " + this.id_protected() + "; // Shader option " + this.id_protected();
   }
}
