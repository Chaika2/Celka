package celestial;

import java.util.Arrays;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringEscapeUtils;

public class rrMH {
   private String[] class_ = null;
   private String break_ = null;
   private boolean byte_ = false;
   private int protected_ = 0;
   private String throws_ = null;
   private int case_ = 0;
   private static final int catch_ = 0;
   private static final int private_ = 1;
   private static final int implements_ = 2;
   private static final int finally_ = 3;
   private static final int extends_ = 4;
   private static final String native_ = "pattern:";
   private static final String volatile_ = "ipattern:";
   private static final String final_ = "regex:";
   private static final String package_ = "iregex:";
   private static final int int_ = 0;
   private static final int new_ = 1;
   private static final String continue_ = "#";
   private static final Pattern super_ = Pattern.compile("^#[0-9a-f]{6}+$");

   public rrMH(String var1, String var2) {
      String[] var3 = rrbb_3.class_(var1, ".");
      this.class_ = Arrays.copyOfRange(var3, 0, var3.length - 1);
      this.break_ = var3[var3.length - 1];
      if (var2.startsWith("!")) {
         this.byte_ = true;
         var2 = var2.substring(1);
      }

      if (var2.startsWith("pattern:")) {
         this.protected_ = 1;
         var2 = var2.substring("pattern:".length());
      } else if (var2.startsWith("ipattern:")) {
         this.protected_ = 2;
         var2 = var2.substring("ipattern:".length()).toLowerCase();
      } else if (var2.startsWith("regex:")) {
         this.protected_ = 3;
         var2 = var2.substring("regex:".length());
      } else if (var2.startsWith("iregex:")) {
         this.protected_ = 4;
         var2 = var2.substring("iregex:".length()).toLowerCase();
      } else {
         this.protected_ = 0;
      }

      var2 = StringEscapeUtils.unescapeJava(var2);
      if (this.protected_ == 0 && super_.matcher(var2).matches()) {
         this.case_ = 1;
      }

      this.throws_ = var2;
   }

   @Override
   public String toString() {
      StringBuffer var1 = new StringBuffer();

      for (int var2 = 0; var2 < this.class_.length; var2++) {
         String var3 = this.class_[var2];
         if (var2 > 0) {
            var1.append(".");
         }

         var1.append(var3);
      }

      if (var1.length() > 0) {
         var1.append(".");
      }

      var1.append(this.break_);
      var1.append(" = ");
      var1.append(this.throws_);
      return var1.toString();
   }

   public boolean class_(String var1) {
      if (var1 == null) {
         return false;
      } else {
         switch (this.protected_) {
            case 0:
               return var1.equals(this.throws_);
            case 1:
               return this.class_(var1, this.throws_);
            case 2:
               return this.class_(var1.toLowerCase(), this.throws_);
            case 3:
               return this.break_(var1, this.throws_);
            case 4:
               return this.break_(var1.toLowerCase(), this.throws_);
            default:
               throw new IllegalArgumentException("Unknown NbtTagValue type: " + this.protected_);
         }
      }
   }

   public boolean class_(rcd_3 var1) {
      return this.byte_ ? !this.break_(var1) : this.break_(var1);
   }

   private static String class_(String var0, int var1) {
      StringBuilder var2 = new StringBuilder();
      boolean var3 = false;

      for (int var4 = var1; var4 < var0.length(); var4++) {
         char var5 = var0.charAt(var4);
         if (var3) {
            if (var5 == 'b') {
               var2.append('\b');
            } else if (var5 == 'f') {
               var2.append('\f');
            } else if (var5 == 'n') {
               var2.append('\n');
            } else if (var5 == 'r') {
               var2.append('\r');
            } else if (var5 == 't') {
               var2.append('\t');
            } else {
               var2.append(var5);
            }

            var3 = false;
         } else if (var5 == '\\') {
            var3 = true;
         } else {
            if (var5 == '"') {
               break;
            }

            var2.append(var5);
         }
      }

      return var2.toString();
   }

   private static String class_(rcZ_2 var0, int var1) {
      if (var0 == null) {
         return null;
      } else if (!(var0 instanceof rca_3 var2)) {
         if (var0 instanceof rcn_3 var9) {
            return var1 == 1 ? "#" + rrzX_2.class_(Integer.toHexString(var9.case_()), 6, '0') : Integer.toString(var9.case_());
         } else if (var0 instanceof rch_3 var8) {
            return Byte.toString(var8.private_());
         } else if (var0 instanceof rcD_2 var7) {
            return Short.toString(var7.catch_());
         } else if (var0 instanceof rct_3 var6) {
            return Long.toString(var6.throws_());
         } else if (var0 instanceof rcu_3 var5) {
            return Float.toString(var5.finally_());
         } else {
            return var0 instanceof rcz_3 var4 ? Double.toString(var4.implements_()) : var0.toString();
         }
      } else {
         String var3 = var2.native_();
         if (var3.startsWith("{") && var3.endsWith("}")) {
            var3 = break_(var3);
         } else if (var3.startsWith("[{") && var3.endsWith("}]")) {
            var3 = break_(var3);
         }

         return var3;
      }
   }

   private boolean class_(String var1, String var2) {
      return rrzX_2.class_(var1, var2, '*', '?');
   }

   private static rcZ_2 class_(rcZ_2 var0, String var1) {
      if (var0 instanceof rcd_3 var4) {
         return var4.byte_(var1);
      } else if (var0 instanceof rcy_3 var2) {
         if (var1.equals("count")) {
            return rcn_3.class_(var2.size());
         } else {
            int var3 = rrbb_3.class_(var1, -1);
            return var3 >= 0 && var3 < var2.size() ? var2.finally_(var3) : null;
         }
      } else {
         return null;
      }
   }

   public boolean class_(rcZ_2 var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = class_(var1, this.case_);
         return this.class_(var2);
      }
   }

   public boolean break_(rcd_3 var1) {
      if (var1 == null) {
         return false;
      } else {
         Object var2 = var1;

         for (int var3 = 0; var3 < this.class_.length; var3++) {
            String var4 = this.class_[var3];
            var2 = class_((rcZ_2)var2, var4);
            if (var2 == null) {
               return false;
            }
         }

         if (this.break_.equals("*")) {
            return this.break_((rcZ_2)var2);
         } else {
            rcZ_2 var5 = class_((rcZ_2)var2, this.break_);
            return var5 == null ? false : this.class_(var5);
         }
      }
   }

   private static String break_(String var0) {
      StringBuilder var1 = new StringBuilder();
      String var2 = "\"text\":\"";
      int var3 = -1;

      while (true) {
         var3 = var0.indexOf(var2, var3 + 1);
         if (var3 < 0) {
            return var1.toString();
         }

         String var4 = class_(var0, var3 + var2.length());
         if (var4 != null) {
            var1.append(var4);
         }
      }
   }

   private boolean break_(String var1, String var2) {
      return var1.matches(var2);
   }

   private boolean break_(rcZ_2 var1) {
      if (var1 instanceof rcd_3 var2) {
         for (String var4 : var2.protected_()) {
            rcZ_2 var5 = var2.byte_(var4);
            if (this.class_(var5)) {
               return true;
            }
         }
      }

      if (var1 instanceof rcy_3 var6) {
         int var7 = var6.size();

         for (int var8 = 0; var8 < var7; var8++) {
            rcZ_2 var9 = var6.finally_(var8);
            if (this.class_(var9)) {
               return true;
            }
         }
      }

      return false;
   }
}
