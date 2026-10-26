package celestial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrkr_1 extends rrdD {
   private static final Pattern protected_ = Pattern.compile("^\\s*(//)?\\s*#define\\s+([A-Za-z0-9_]+)\\s*(//.*)?$");
   private static final Pattern throws_ = Pattern.compile("^\\s*#if(n)?def\\s+([A-Za-z0-9_]+)(\\s*)?$");

   public rrkr_1(String var1, String var2, String var3, String var4) {
      super(var1, var2, var3, new String[]{"false", "true"}, var3, var4);
   }

   public static rrdD class_(String var0, String var1) {
      Matcher var2 = protected_.matcher(var0);
      if (!var2.matches()) {
         return null;
      } else {
         String var3 = var2.group(1);
         String var4 = var2.group(2);
         String var5 = var2.group(3);
         if (var4 != null && var4.length() > 0) {
            boolean var6 = rrbb_3.class_((Object)var3, (Object)"//");
            boolean var7 = !var6;
            var1 = rrzX_2.protected_(var1, "/shaders/");
            return new rrkr_1(var4, var5, String.valueOf(var7), var1);
         } else {
            return null;
         }
      }
   }

   @Override
   public String throws_(String var1) {
      return private_(var1) ? "§a" : "§c";
   }

   @Override
   public boolean catch_(String var1) {
      Matcher var2 = throws_.matcher(var1);
      if (var2.matches()) {
         String var3 = var2.group(2);
         if (var3.equals(this.class_())) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean case_(String var1) {
      Matcher var2 = protected_.matcher(var1);
      if (!var2.matches()) {
         return false;
      } else {
         String var3 = var2.group(2);
         return var3.matches(this.class_());
      }
   }

   @Override
   public String package_() {
      return private_(this.protected_()) ? "#define " + this.class_() + " // Shader option ON" : "//#define " + this.class_() + " // Shader option OFF";
   }

   @Override
   public String protected_(String var1) {
      String var2 = super.protected_(var1);
      if (var2 != var1) {
         return var2;
      } else {
         return private_(var1) ? rrba_3.break_() : rrba_3.byte_();
      }
   }

   public static boolean private_(String var0) {
      return Boolean.valueOf(var0);
   }

   @Override
   public boolean final_() {
      return true;
   }
}
