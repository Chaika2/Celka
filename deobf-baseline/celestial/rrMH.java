package celestial;

import java.util.Arrays;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringEscapeUtils;

public class rrMH {
   private String[] id_class = null;
   private String id_break = null;
   private boolean id_byte = false;
   private int id_protected = 0;
   private String id_throws = null;
   private int id_case = 0;
   private static final int id_catch = 0;
   private static final int id_private = 1;
   private static final int id_implements = 2;
   private static final int id_finally = 3;
   private static final int id_extends = 4;
   private static final String id_native = "pattern:";
   private static final String id_volatile = "ipattern:";
   private static final String id_final = "regex:";
   private static final String id_package = "iregex:";
   private static final int id_int = 0;
   private static final int id_new = 1;
   private static final String id_continue = "#";
   private static final Pattern id_super = Pattern.compile("^#[0-9a-f]{6}+$");

   public rrMH(String var1, String var2) {
      String[] var3 = rrbb_3.id_class(var1, ".");
      this.id_class = Arrays.copyOfRange(var3, 0, var3.length - 1);
      this.id_break = var3[var3.length - 1];
      if (var2.startsWith("!")) {
         this.id_byte = true;
         var2 = var2.substring(1);
      }

      if (var2.startsWith("pattern:")) {
         this.id_protected = 1;
         var2 = var2.substring("pattern:".length());
      } else if (var2.startsWith("ipattern:")) {
         this.id_protected = 2;
         var2 = var2.substring("ipattern:".length()).toLowerCase();
      } else if (var2.startsWith("regex:")) {
         this.id_protected = 3;
         var2 = var2.substring("regex:".length());
      } else if (var2.startsWith("iregex:")) {
         this.id_protected = 4;
         var2 = var2.substring("iregex:".length()).toLowerCase();
      } else {
         this.id_protected = 0;
      }

      var2 = StringEscapeUtils.unescapeJava(var2);
      if (this.id_protected == 0 && id_super.matcher(var2).matches()) {
         this.id_case = 1;
      }

      this.id_throws = var2;
   }

   @Override
   public String toString() {
      StringBuffer var1 = new StringBuffer();

      for (int var2 = 0; var2 < this.id_class.length; var2++) {
         String var3 = this.id_class[var2];
         if (var2 > 0) {
            var1.append(".");
         }

         var1.append(var3);
      }

      if (var1.length() > 0) {
         var1.append(".");
      }

      var1.append(this.id_break);
      var1.append(" = ");
      var1.append(this.id_throws);
      return var1.toString();
   }

   public boolean id_class(String var1) {
      if (var1 == null) {
         return false;
      } else {
         switch (this.id_protected) {
            case 0:
               return var1.equals(this.id_throws);
            case 1:
               return this.id_class(var1, this.id_throws);
            case 2:
               return this.id_class(var1.toLowerCase(), this.id_throws);
            case 3:
               return this.id_break(var1, this.id_throws);
            case 4:
               return this.id_break(var1.toLowerCase(), this.id_throws);
            default:
               throw new IllegalArgumentException("Unknown NbtTagValue type: " + this.id_protected);
         }
      }
   }

   public boolean id_class(rcd_3 var1) {
      return this.id_byte ? !this.id_break(var1) : this.id_break(var1);
   }

   private static String id_class(String var0, int var1) {
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

   private static String id_class(rcZ_2 var0, int var1) {
      if (var0 == null) {
         return null;
      } else if (!(var0 instanceof rca_3 var2)) {
         if (var0 instanceof rcn_3 var9) {
            return var1 == 1 ? "#" + rrzX_2.id_class(Integer.toHexString(var9.id_case()), 6, '0') : Integer.toString(var9.id_case());
         } else if (var0 instanceof rch_3 var8) {
            return Byte.toString(var8.id_private());
         } else if (var0 instanceof rcD_2 var7) {
            return Short.toString(var7.id_catch());
         } else if (var0 instanceof rct_3 var6) {
            return Long.toString(var6.id_throws());
         } else if (var0 instanceof rcu_3 var5) {
            return Float.toString(var5.id_finally());
         } else {
            return var0 instanceof rcz_3 var4 ? Double.toString(var4.id_implements()) : var0.toString();
         }
      } else {
         String var3 = var2.id_native();
         if (var3.startsWith("{") && var3.endsWith("}")) {
            var3 = id_break(var3);
         } else if (var3.startsWith("[{") && var3.endsWith("}]")) {
            var3 = id_break(var3);
         }

         return var3;
      }
   }

   private boolean id_class(String var1, String var2) {
      return rrzX_2.id_class(var1, var2, '*', '?');
   }

   private static rcZ_2 id_class(rcZ_2 var0, String var1) {
      if (var0 instanceof rcd_3 var4) {
         return var4.id_byte(var1);
      } else if (var0 instanceof rcy_3 var2) {
         if (var1.equals("count")) {
            return rcn_3.id_class(var2.size());
         } else {
            int var3 = rrbb_3.id_class(var1, -1);
            return var3 >= 0 && var3 < var2.size() ? var2.id_finally(var3) : null;
         }
      } else {
         return null;
      }
   }

   public boolean id_class(rcZ_2 var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = id_class(var1, this.id_case);
         return this.id_class(var2);
      }
   }

   public boolean id_break(rcd_3 var1) {
      if (var1 == null) {
         return false;
      } else {
         Object var2 = var1;

         for (int var3 = 0; var3 < this.id_class.length; var3++) {
            String var4 = this.id_class[var3];
            var2 = id_class((rcZ_2)var2, var4);
            if (var2 == null) {
               return false;
            }
         }

         if (this.id_break.equals("*")) {
            return this.id_break((rcZ_2)var2);
         } else {
            rcZ_2 var5 = id_class((rcZ_2)var2, this.id_break);
            return var5 == null ? false : this.id_class(var5);
         }
      }
   }

   private static String id_break(String var0) {
      StringBuilder var1 = new StringBuilder();
      String var2 = "\"text\":\"";
      int var3 = -1;

      while (true) {
         var3 = var0.indexOf(var2, var3 + 1);
         if (var3 < 0) {
            return var1.toString();
         }

         String var4 = id_class(var0, var3 + var2.length());
         if (var4 != null) {
            var1.append(var4);
         }
      }
   }

   private boolean id_break(String var1, String var2) {
      return var1.matches(var2);
   }

   private boolean id_break(rcZ_2 var1) {
      if (var1 instanceof rcd_3 var2) {
         for (String var4 : var2.id_protected()) {
            rcZ_2 var5 = var2.id_byte(var4);
            if (this.id_class(var5)) {
               return true;
            }
         }
      }

      if (var1 instanceof rcy_3 var6) {
         int var7 = var6.size();

         for (int var8 = 0; var8 < var7; var8++) {
            rcZ_2 var9 = var6.id_finally(var8);
            if (this.id_class(var9)) {
               return true;
            }
         }
      }

      return false;
   }
}
