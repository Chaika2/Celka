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
   final int id_class;
   final int id_break;
   final rqs_3<rkg_3> id_byte;
   final rdn_3 id_protected;
   private final rqO_2 id_throws;
   final String id_case;

   @Override
   public rdn_3 id_byte() {
      return this.id_protected;
   }

   public rWb_1(rqO_2 var1, String var2, int var3, int var4, rqs_3<rkg_3> var5, rdn_3 var6) {
      this.id_throws = var1;
      this.id_case = var2;
      this.id_class = var3;
      this.id_break = var4;
      this.id_byte = var5;
      this.id_protected = var6;
   }

   public rdn_3 id_class(rXk_1 var1) {
      return this.id_byte().id_implements();
   }

   static String[] id_class(JsonArray var0) {
      String[] var1 = new String[var0.size()];
      if (var1.length > 3) {
         throw new JsonSyntaxException("Invalid pattern: too many rows, 3 is maximum");
      } else if (var1.length == 0) {
         throw new JsonSyntaxException("Invalid pattern: empty pattern not allowed");
      } else {
         for (int var2 = 0; var2 < var1.length; var2++) {
            String var3 = rpY_2.id_class(var0.get(var2), "pattern[" + var2 + "]");
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

   public static rdn_3 id_class(JsonObject var0) {
      String var1 = rpY_2.id_case(var0, "item");
      rdb_3 var2 = rVL.id_for.id_break(new rqO_2(var1)).orElseThrow(() -> new JsonSyntaxException("Unknown item '" + var1 + "'"));
      if (var0.has("data")) {
         throw new JsonParseException("Disallowed data tag found");
      } else {
         int var3 = rpY_2.id_class(var0, "count", 1);
         return new rdn_3(var2, var3);
      }
   }

   static String[] id_class(String... var0) {
      int var1 = Integer.MAX_VALUE;
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;

      for (int var5 = 0; var5 < var0.length; var5++) {
         String var6 = var0[var5];
         var1 = Math.min(var1, id_class(var6));
         int var7 = id_break(var6);
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

   private static int id_class(String var0) {
      int var1 = 0;

      while (var1 < var0.length() && var0.charAt(var1) == ' ') {
         var1++;
      }

      return var1;
   }

   static rqs_3<rkg_3> id_class(String[] var0, Map<String, rkg_3> var1, int var2, int var3) {
      rqs_3 var4 = rqs_3.id_class(var2 * var3, rkg_3.id_class);
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
   public rqs_3<rkg_3> id_class() {
      return this.id_byte;
   }

   private boolean id_class(rXk_1 var1, int var2, int var3, boolean var4) {
      for (int var5 = 0; var5 < var1.id_protected(); var5++) {
         for (int var6 = 0; var6 < var1.id_byte(); var6++) {
            int var7 = var5 - var2;
            int var8 = var6 - var3;
            rkg_3 var9 = rkg_3.id_class;
            if (var7 >= 0 && var8 >= 0 && var7 < this.id_class && var8 < this.id_break) {
               if (var4) {
                  var9 = this.id_byte.get(this.id_class - var7 - 1 + var8 * this.id_class);
               } else {
                  var9 = this.id_byte.get(var7 + var8 * this.id_class);
               }
            }

            if (!var9.id_class(var1.id_extends(var5 + var6 * var1.id_protected()))) {
               return false;
            }
         }
      }

      return true;
   }

   public boolean id_class(rXk_1 var1, rYB var2) {
      for (int var3 = 0; var3 <= var1.id_protected() - this.id_class; var3++) {
         for (int var4 = 0; var4 <= var1.id_byte() - this.id_break; var4++) {
            if (this.id_class(var1, var3, var4, true)) {
               return true;
            }

            if (this.id_class(var1, var3, var4, false)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return var1 >= this.id_class && var2 >= this.id_break;
   }

   private static int id_break(String var0) {
      int var1 = var0.length() - 1;

      while (var1 >= 0 && var0.charAt(var1) == ' ') {
         var1--;
      }

      return var1;
   }

   static Map<String, rkg_3> id_break(JsonObject var0) {
      HashMap var1 = Maps.newHashMap();

      for (Entry var3 : var0.entrySet()) {
         if (((String)var3.getKey()).length() != 1) {
            throw new JsonSyntaxException("Invalid key entry: '" + (String)var3.getKey() + "' is an invalid symbol (must be 1 character only).");
         }

         if (" ".equals(var3.getKey())) {
            throw new JsonSyntaxException("Invalid key entry: ' ' is a reserved symbol.");
         }

         var1.put((String)var3.getKey(), rkg_3.id_class((JsonElement)var3.getValue()));
      }

      var1.put(" ", rkg_3.id_class);
      return var1;
   }

   public int id_throws() {
      return this.id_class;
   }

   public int id_finally() {
      return this.id_break;
   }

   @Override
   public rqO_2 id_case() {
      return this.id_throws;
   }

   @Override
   public String id_protected() {
      return this.id_case;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.id_class;
   }
}
