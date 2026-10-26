package celestial;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rrdt_1 {
   private boolean id_class = true;
   private Deque<Boolean> id_break = new ArrayDeque<>();
   private Deque<Boolean> id_byte = new ArrayDeque<>();
   private Map<String, String> id_protected = new HashMap<>();
   private static final Pattern id_throws = Pattern.compile("\\s*#\\s*(\\w+)\\s*(.*)");
   private static final Pattern id_case = Pattern.compile("defined\\s+(\\w+)");
   private static final Pattern id_catch = Pattern.compile("defined\\s*\\(\\s*(\\w+)\\s*\\)");
   private static final Pattern id_private = Pattern.compile("(\\w+)");
   private static final String id_implements = "define";
   private static final String id_finally = "undef";
   private static final String id_extends = "ifdef";
   private static final String id_native = "ifndef";
   private static final String id_volatile = "if";
   private static final String id_final = "else";
   private static final String id_package = "elif";
   private static final String id_int = "endif";
   private static final List<String> id_new = Arrays.asList("define", "undef", "ifdef", "ifndef", "if", "else", "elif", "endif");

   private boolean id_byte(String var1) {
      Matcher var2 = id_case.matcher(var1);
      var1 = var2.replaceAll("defined_$1");
      Matcher var3 = id_catch.matcher(var1);
      var1 = var3.replaceAll("defined_$1");
      boolean var4 = false;
      int var5 = 0;

      do {
         var4 = false;
         Matcher var6 = id_private.matcher(var1);

         while (var6.find()) {
            String var7 = var6.group();
            if (var7.length() > 0) {
               char var8 = var7.charAt(0);
               if ((Character.isLetter(var8) || var8 == '_') && this.id_protected.containsKey(var7)) {
                  String var9 = this.id_protected.get(var7);
                  if (var9 == null) {
                     var9 = "1";
                  }

                  int var10 = var6.start();
                  int var11 = var6.end();
                  var1 = var1.substring(0, var10) + " " + var9 + " " + var1.substring(var11);
                  var4 = true;
                  var5++;
                  break;
               }
            }
         }
      } while (var4 && var5 < 100);

      if (var5 >= 100) {
         rrbb_3.id_protected("Too many iterations: " + var5 + ", when resolving: " + var1);
         return true;
      } else {
         try {
            rrdq_1 var16 = new rrdq_1(this.id_protected);
            rrXA var17 = new rrXA(var16);
            rrXt_1 var18 = var17.id_byte(var1);
            if (var18.id_byte() == rrXC.BOOL) {
               rrXw_1 var20 = (rrXw_1)var18;
               return var20.id_break();
            } else if (var18.id_byte() == rrXC.FLOAT) {
               rrXf_1 var19 = (rrXf_1)var18;
               float var21 = var19.id_class();
               return var21 != 0.0F;
            } else {
               throw new rrXo_1("Not a boolean or float expression: " + var18.id_byte());
            }
         } catch (rrXo_1 var12) {
            rrbb_3.id_protected("Invalid macro expression: " + var1);
            rrbb_3.id_protected("Error: " + var12.getMessage());
            return false;
         }
      }
   }

   public boolean id_class(String var1) {
      Matcher var2 = id_throws.matcher(var1);
      if (!var2.matches()) {
         return this.id_class;
      } else {
         String var3 = var2.group(1);
         String var4 = var2.group(2);
         int var5 = var4.indexOf("//");
         if (var5 >= 0) {
            var4 = var4.substring(0, var5);
         }

         boolean var6 = this.id_class;
         this.id_class(var3, var4);
         this.id_class = !this.id_break.contains(Boolean.FALSE);
         return this.id_class || var6;
      }
   }

   private void id_class(String var1, String var2) {
      StringTokenizer var3 = new StringTokenizer(var2, " \t");
      String var4 = var3.hasMoreTokens() ? var3.nextToken() : "";
      String var5 = var3.hasMoreTokens() ? var3.nextToken("").trim() : "";
      if (var1.equals("define")) {
         this.id_protected.put(var4, var5);
      } else if (var1.equals("undef")) {
         this.id_protected.remove(var4);
      } else if (var1.equals("ifdef")) {
         boolean var6 = this.id_protected.containsKey(var4);
         this.id_break.add(var6);
         this.id_byte.add(var6);
      } else if (var1.equals("ifndef")) {
         boolean var9 = !this.id_protected.containsKey(var4);
         this.id_break.add(var9);
         this.id_byte.add(var9);
      } else if (var1.equals("if")) {
         boolean var10 = this.id_byte(var2);
         this.id_break.add(var10);
         this.id_byte.add(var10);
      } else if (!this.id_break.isEmpty()) {
         if (var1.equals("elif")) {
            boolean var11 = this.id_break.removeLast();
            boolean var7 = this.id_byte.removeLast();
            if (var7) {
               this.id_break.add(false);
               this.id_byte.add(var7);
            } else {
               boolean var8 = this.id_byte(var2);
               this.id_break.add(var8);
               this.id_byte.add(var8);
            }
         } else if (var1.equals("else")) {
            boolean var12 = this.id_break.removeLast();
            boolean var13 = this.id_byte.removeLast();
            boolean var14 = !var13;
            this.id_break.add(var14);
            this.id_byte.add(true);
         } else if (var1.equals("endif")) {
            this.id_break.removeLast();
            this.id_byte.removeLast();
         }
      }
   }

   public static boolean id_break(String var0) {
      Matcher var1 = id_throws.matcher(var0);
      if (!var1.matches()) {
         return false;
      } else {
         String var2 = var1.group(1);
         return id_new.contains(var2);
      }
   }
}
