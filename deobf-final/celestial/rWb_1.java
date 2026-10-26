package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class rWb_1 implements rkt_3 {
   final int class_;
   final int break_;
   final rqs_3<rkg_3> byte_;
   final rdn_3 protected_;
   private final rqO_2 throws_;
   final String case_;

   @Override
   public rdn_3 byte_() {
      return this.protected_;
   }

   public rWb_1(rqO_2 var1, String var2, int var3, int var4, rqs_3<rkg_3> var5, rdn_3 var6) {
      this.throws_ = var1;
      this.case_ = var2;
      this.class_ = var3;
      this.break_ = var4;
      this.byte_ = var5;
      this.protected_ = var6;
   }

   public rdn_3 class_(rXk_1 var1) {
      return this.byte_().implements_();
   }

   static String[] class_(JsonArray var0) {
      String[] var1 = new String[var0.size()];
      if (var1.length > 3) {
         throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum");
      } else if (var1.length == 0) {
         throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
      } else {
         for (int var2 = 0; var2 < var1.length; var2++) {
            String var3 = rpY_2.class_(var0.get(var2), "pattern[" + var2 + "]");
            if (var3.length() > 3) {
               throw new JsonSyntaxException("Invalid pattern: too many columns, 3 is maximum");
            }

            if (var2 > 0 && var1[0].length() != var3.length()) {
               throw new JsonSyntaxException("Invalid pattern: each row must be the same width");
            }

            var1[var2] = var3;
         }

         return var1;
      }
   }

   public static rdn_3 class_(JsonObject var0) {
      String var1 = rpY_2.case_(var0, "item");
      rdb_3 var2 = rVL.for_.break_(new rqO_2(var1)).orElseThrow(() -> new JsonSyntaxException("Unknown item '" + var1 + "'"));
      if (var0.has("data")) {
         throw new JsonParseException("Disallowed data tag found");
      } else {
         int var3 = rpY_2.class_(var0, "count", 1);
         return new rdn_3(var2, var3);
      }
   }

   static String[] class_(String... var0) {
      int var1 = Integer.MAX_VALUE;
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;

      for (int var5 = 0; var5 < var0.length; var5++) {
         String var6 = var0[var5];
         var1 = Math.min(var1, class_(var6));
         int var7 = break_(var6);
         var2 = Math.max(var2, var7);
         if (var7 < 0) {
            if (var3 == var5) {
               var3++;
            }

            var4++;
         } else {
            var4 = 0;
         }
      }

      if (var0.length == var4) {
         return new String[0];
      } else {
         String[] var8 = new String[var0.length - var4 - var3];

         for (int var9 = 0; var9 < var8.length; var9++) {
            var8[var9] = var0[var9 + var3].substring(var1, var2 + 1);
         }

         return var8;
      }
   }

   private static int class_(String var0) {
      int var1 = 0;

      while (var1 < var0.length() && var0.charAt(var1) == ' ') {
         var1++;
      }

      return var1;
   }

   static rqs_3<rkg_3> class_(String[] var0, Map<String, rkg_3> var1, int var2, int var3) {
      rqs_3 var4 = rqs_3.class_(var2 * var3, rkg_3.class_);
      HashSet var5 = Sets.newHashSet(var1.keySet());
      var5.remove(" ");

      for (int var6 = 0; var6 < var0.length; var6++) {
         for (int var7 = 0; var7 < var0[var6].length(); var7++) {
            String var8 = var0[var6].substring(var7, var7 + 1);
            rkg_3 var9 = (rkg_3)var1.get(var8);
            if (var9 == null) {
               throw new JsonSyntaxException("Pattern references symbol '" + var8 + "' but it's not defined in the key");
            }

            var5.remove(var8);
            var4.set(var7 + var2 * var6, var9);
         }
      }

      if (!var5.isEmpty()) {
         throw new JsonSyntaxException("Key defines symbols that aren't used in pattern: " + var5);
      } else {
         return var4;
      }
   }

   @Override
   public rqs_3<rkg_3> class_() {
      return this.byte_;
   }

   private boolean class_(rXk_1 var1, int var2, int var3, boolean var4) {
      for (int var5 = 0; var5 < var1.protected_(); var5++) {
         for (int var6 = 0; var6 < var1.byte_(); var6++) {
            int var7 = var5 - var2;
            int var8 = var6 - var3;
            rkg_3 var9 = rkg_3.class_;
            if (var7 >= 0 && var8 >= 0 && var7 < this.class_ && var8 < this.break_) {
               if (var4) {
                  var9 = this.byte_.get(this.class_ - var7 - 1 + var8 * this.class_);
               } else {
                  var9 = this.byte_.get(var7 + var8 * this.class_);
               }
            }

            if (!var9.class_(var1.extends_(var5 + var6 * var1.protected_()))) {
               return false;
            }
         }
      }

      return true;
   }

   public boolean class_(rXk_1 var1, rYB var2) {
      for (int var3 = 0; var3 <= var1.protected_() - this.class_; var3++) {
         for (int var4 = 0; var4 <= var1.byte_() - this.break_; var4++) {
            if (this.class_(var1, var3, var4, true)) {
               return true;
            }

            if (this.class_(var1, var3, var4, false)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean class_(int var1, int var2) {
      return var1 >= this.class_ && var2 >= this.break_;
   }

   private static int break_(String var0) {
      int var1 = var0.length() - 1;

      while (var1 >= 0 && var0.charAt(var1) == ' ') {
         var1--;
      }

      return var1;
   }

   static Map<String, rkg_3> break_(JsonObject var0) {
      HashMap var1 = Maps.newHashMap();

      for (Entry var3 : var0.entrySet()) {
         if (((String)var3.getKey()).length() != 1) {
            throw new JsonSyntaxException("Invalid key entry: '" + (String)var3.getKey() + "' is an invalid symbol (must be 1 character only).");
         }

         if (" ".equals(var3.getKey())) {
            throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
         }

         var1.put((String)var3.getKey(), rkg_3.class_((JsonElement)var3.getValue()));
      }

      var1.put(" ", rkg_3.class_);
      return var1;
   }

   public int throws_() {
      return this.class_;
   }

   public int finally_() {
      return this.break_;
   }

   @Override
   public rqO_2 case_() {
      return this.throws_;
   }

   @Override
   public String protected_() {
      return this.case_;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.class_;
   }
}
