package celestial;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrkB extends rrdD {
   private static final Pattern id_protected = Pattern.compile("^\\s*#define\\s+(\\w+)\\s+(-?[0-9\\.Ff]+|\\w+)\\s*(//.*)?$");

   public rrkB(String var1, String var2, String var3, String[] var4, String var5) {
      super(var1, var2, var3, var4, var3, var5);
      this.id_break(this.id_int().length > 1);
   }

   public static rrdD id_class(String var0, String var1) {
      Matcher var2 = id_protected.matcher(var0);
      if (!var2.matches()) {
         return null;
      } else {
         String var3 = var2.group(1);
         String var4 = var2.group(2);
         String var5 = var2.group(3);
         String var6 = rrzX_2.id_protected(var5, "[", "]");
         if (var6 != null && var6.length() > 0) {
            var5 = var5.replace(var6, "").trim();
         }

         String[] var7 = id_break(var4, var6);
         if (var3 != null && var3.length() > 0) {
            var1 = rrzX_2.id_protected(var1, "/shaders/");
            return new rrkB(var3, var5, var4, var7, var1);
         } else {
            return null;
         }
      }
   }

   public static String[] id_break(String var0, String var1) {
      String[] var2 = new String[]{var0};
      if (var1 == null) {
         return var2;
      } else {
         var1 = var1.trim();
         var1 = rrzX_2.id_protected(var1, "[");
         var1 = rrzX_2.id_throws(var1, "]");
         var1 = var1.trim();
         if (var1.length() <= 0) {
            return var2;
         } else {
            String[] var3 = rrbb_3.id_class(var1, " ");
            if (var3.length <= 0) {
               return var2;
            } else {
               if (!Arrays.asList(var3).contains(var0)) {
                  var3 = (String[])rrbb_3.id_class(var3, var0, 0);
               }

               return var3;
            }
         }
      }
   }

   @Override
   public String id_throws(String var1) {
      String var2 = var1.toLowerCase();
      return !var2.equals("false") && !var2.equals("off") ? "§a" : "§c";
   }

   @Override
   public boolean id_case(String var1) {
      Matcher var2 = id_protected.matcher(var1);
      if (!var2.matches()) {
         return false;
      } else {
         String var3 = var2.group(1);
         return var3.matches(this.id_class());
      }
   }

   @Override
   public String id_package() {
      return "#define " + this.id_class() + " " + this.id_protected() + " // Shader option " + this.id_protected();
   }

   @Override
   public String id_protected(String var1) {
      String var2 = rrdZ.id_break("prefix." + this.id_class(), "");
      String var3 = super.id_protected(var1);
      String var4 = rrdZ.id_break("suffix." + this.id_class(), "");
      return var2 + var3 + var4;
   }
}
