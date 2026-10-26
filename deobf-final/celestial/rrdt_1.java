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
   private boolean class_ = true;
   private Deque<Boolean> break_ = new ArrayDeque<>();
   private Deque<Boolean> byte_ = new ArrayDeque<>();
   private Map<String, String> protected_ = new HashMap<>();
   private static final Pattern throws_ = Pattern.compile("\\s*#\\s*(\\w+)\\s*(.*)");
   private static final Pattern case_ = Pattern.compile("defined\\s+(\\w+)");
   private static final Pattern catch_ = Pattern.compile("defined\\s*\\(\\s*(\\w+)\\s*\\)");
   private static final Pattern private_ = Pattern.compile("(\\w+)");
   private static final String implements_ = "define";
   private static final String finally_ = "undef";
   private static final String extends_ = "ifdef";
   private static final String native_ = "ifndef";
   private static final String volatile_ = "if";
   private static final String final_ = "else";
   private static final String package_ = "elif";
   private static final String int_ = "endif";
   private static final List<String> new_ = Arrays.asList("define", "undef", "ifdef", "ifndef", "if", "else", "elif", "endif");

   private boolean byte_(String var1) {
      Matcher var2 = case_.matcher(var1);
      var1 = var2.replaceAll("defined_$1");
      Matcher var3 = catch_.matcher(var1);
      var1 = var3.replaceAll("defined_$1");
      boolean var4 = false;
      int var5 = 0;

      do {
         var4 = false;
         Matcher var6 = private_.matcher(var1);

         while (var6.find()) {
            String var7 = var6.group();
            if (var7.length() > 0) {
               char var8 = var7.charAt(0);
               if ((Character.isLetter(var8) || var8 == '_') && this.protected_.containsKey(var7)) {
                  String var9 = this.protected_.get(var7);
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
         rrbb_3.protected_("Too many iterations: " + var5 + ", when resolving: " + var1);
         return true;
      } else {
         try {
            rrdq_1 var16 = new rrdq_1(this.protected_);
            rrXA var17 = new rrXA(var16);
            rrXt_1 var18 = var17.byte_(var1);
            if (var18.byte_() == rrXC.BOOL) {
               rrXw_1 var20 = (rrXw_1)var18;
               return var20.break_();
            } else if (var18.byte_() == rrXC.FLOAT) {
               rrXf_1 var19 = (rrXf_1)var18;
               float var21 = var19.class_();
               return var21 != 0.0F;
            } else {
               throw new rrXo_1("Not a boolean or float expression: " + var18.byte_());
            }
         } catch (rrXo_1 var12) {
            rrbb_3.protected_("Invalid macro expression: " + var1);
            rrbb_3.protected_("Error: " + var12.getMessage());
            return false;
         }
      }
   }

   public boolean class_(String var1) {
      Matcher var2 = throws_.matcher(var1);
      if (!var2.matches()) {
         return this.class_;
      } else {
         String var3 = var2.group(1);
         String var4 = var2.group(2);
         int var5 = var4.indexOf("//");
         if (var5 >= 0) {
            var4 = var4.substring(0, var5);
         }

         boolean var6 = this.class_;
         this.class_(var3, var4);
         this.class_ = !this.break_.contains(Boolean.FALSE);
         return this.class_ || var6;
      }
   }

   private void class_(String var1, String var2) {
      StringTokenizer var3 = new StringTokenizer(var2, " \t");
      String var4 = var3.hasMoreTokens() ? var3.nextToken() : "";
      String var5 = var3.hasMoreTokens() ? var3.nextToken("").trim() : "";
      if (var1.equals("define")) {
         this.protected_.put(var4, var5);
      } else if (var1.equals("undef")) {
         this.protected_.remove(var4);
      } else if (var1.equals("ifdef")) {
         boolean var6 = this.protected_.containsKey(var4);
         this.break_.add(var6);
         this.byte_.add(var6);
      } else if (var1.equals("ifndef")) {
         boolean var9 = !this.protected_.containsKey(var4);
         this.break_.add(var9);
         this.byte_.add(var9);
      } else if (var1.equals("if")) {
         boolean var10 = this.byte_(var2);
         this.break_.add(var10);
         this.byte_.add(var10);
      } else if (!this.break_.isEmpty()) {
         if (var1.equals("elif")) {
            boolean var11 = this.break_.removeLast();
            boolean var7 = this.byte_.removeLast();
            if (var7) {
               this.break_.add(false);
               this.byte_.add(var7);
            } else {
               boolean var8 = this.byte_(var2);
               this.break_.add(var8);
               this.byte_.add(var8);
            }
         } else if (var1.equals("else")) {
            boolean var12 = this.break_.removeLast();
            boolean var13 = this.byte_.removeLast();
            boolean var14 = !var13;
            this.break_.add(var14);
            this.byte_.add(true);
         } else if (var1.equals("endif")) {
            this.break_.removeLast();
            this.byte_.removeLast();
         }
      }
   }

   public static boolean break_(String var0) {
      Matcher var1 = throws_.matcher(var0);
      if (!var1.matches()) {
         return false;
      } else {
         String var2 = var1.group(1);
         return new_.contains(var2);
      }
   }
}
