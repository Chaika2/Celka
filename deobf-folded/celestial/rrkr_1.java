package celestial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrkr_1 extends rrdD {
   private static final Pattern id_protected = Pattern.compile("^\\s*(//)?\\s*#define\\s+([A-Za-z0-9_]+)\\s*(//.*)?$");
   private static final Pattern id_throws = Pattern.compile("^\\s*#if(n)?def\\s+([A-Za-z0-9_]+)(\\s*)?$");

   public rrkr_1(String var1, String var2, String var3, String var4) {
      super(var1, var2, var3, new String[]{"false", "true"}, var3, var4);
   }

   public static rrdD id_class(String var0, String var1) {
      Matcher var2 = id_protected.matcher(var0);
      if (!var2.matches()) {
         return null;
      } else {
         String var3 = var2.group(1);
         String var4 = var2.group(2);
         String var5 = var2.group(3);
         if (var4 != null && var4.length() > 0) {
            boolean var6 = rrbb_3.id_class((Object)var3, (Object)"//");
            boolean var7 = !var6;
            var1 = rrzX_2.id_protected(var1, "/shaders/");
            return new rrkr_1(var4, var5, String.valueOf(var7), var1);
         } else {
            return null;
         }
      }
   }

   @Override
   public String id_throws(String var1) {
      return id_private(var1) ? "§a" : "§c";
   }

   @Override
   public boolean id_catch(String var1) {
      Matcher var2 = id_throws.matcher(var1);
      if (var2.matches()) {
         String var3 = var2.group(2);
         if (var3.equals(this.id_class())) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean id_case(String var1) {
      Matcher var2 = id_protected.matcher(var1);
      if (!var2.matches()) {
         return false;
      } else {
         String var3 = var2.group(2);
         return var3.matches(this.id_class());
      }
   }

   @Override
   public String id_package() {
      return id_private(this.id_protected()) ? "#define " + this.id_class() + " // Shader option ON" : "//#define " + this.id_class() + " // Shader option OFF";
   }

   @Override
   public String id_protected(String var1) {
      String var2 = super.id_protected(var1);
      if (var2 != var1) {
         return var2;
      } else {
         return id_private(var1) ? rrba_3.id_break() : rrba_3.id_byte();
      }
   }

   public static boolean id_private(String var0) {
      return Boolean.valueOf(var0);
   }

   @Override
   public boolean id_final() {
      return true;
   }
}
