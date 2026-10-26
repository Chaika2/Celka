package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.util.UUIDTypeAdapter;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwa_3 extends rrwU_2 {
   private static String[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;

   private static void id_byte() {
      id_break = new String[]{
         new String("account"),
         new String("account"),
         new String("account"),
         new String("lastAccount"),
         new String("account"),
         new String("account"),
         new String("account"),
         new String("uuid"),
         new String("name"),
         new String("authType"),
         new String("lastAccount"),
         new String("lastAccount"),
         new String("uuid"),
         new String("name"),
         new String("authType"),
         new String("accessToken"),
         new String("password"),
         new String("uuid"),
         new String("name"),
         new String("authType"),
         new String("accessToken"),
         new String("password")
      };
   }

   public rrwa_3() {
      super(id_break[0]);
   }

   static {
      ntfClinit();
   }

   private static rrQx_1 id_class(rrQd_1 var0, JsonObject var1, String var2, UUID var3) {
      return (rrQx_1)(switch (((int[])rrwi_3.id_class[id_protected[4]])[var0.ordinal()]) {
         case 1, 2 -> new rrQQ(var2, var3, var0);
         case 3 -> new rrQW(var2, var1.get(id_break[15]).getAsString(), var3, var0);
         case 4 -> new rrQz_1(var2, var1.get(id_break[16]).getAsString(), var3, var0);
         default -> null;
      });
   }

   @Override
   public void id_class(JsonObject var1) {
      super.id_class(var1);
      if (var1.has(id_break[4])) {
         JsonObject var2 = var1.getAsJsonObject(id_break[5]);

         for (JsonElement var5 : var2.getAsJsonArray(id_break[6])) {
            JsonObject var6 = var5.getAsJsonObject();
            String var7 = var6.get(id_break[7]).getAsString();
            UUID var8 = UUIDTypeAdapter.fromString(var7);
            String var9 = var6.get(id_break[8]).getAsString();
            rrQd_1 var10 = rrQd_1.id_class(var6.get(id_break[9]).getAsString());
            if (var10 != null) {
               rrQx_1 var11 = id_class(var10, var6, var9, var8);
               if (var11 != null) {
                  ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_protected[2]]).id_class(var11, id_byte[0], id_byte[1]);
               }
            }
         }
      }

      if (var1.has(id_break[10])) {
         JsonObject var12 = var1.getAsJsonObject(id_break[11]);
         String var13 = var12.get(id_break[12]).getAsString();
         UUID var14 = UUIDTypeAdapter.fromString(var13);
         String var15 = var12.get(id_break[13]).getAsString();
         rrQd_1 var16 = rrQd_1.id_class(var12.get(id_break[14]).getAsString());
         if (var16 == null) {
            return;
         }

         rrQx_1 var17 = id_class(var16, var12, var15, var14);
         if (var17 != null) {
            ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_protected[3]]).id_class(var17);
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -881388147;
   }

   private static void id_class(rrQx_1 var0, JsonObject var1, rrQd_1 var2) {
      var1.addProperty(id_break[17], UUIDTypeAdapter.fromUUID(var0.id_protected()));
      var1.addProperty(id_break[18], var0.id_class());
      var1.addProperty(id_break[19], var2.id_class());
      if (var0 instanceof rrQW var3) {
         var1.addProperty(id_break[20], var3.id_case());
      } else if (var0 instanceof rrQz_1 var4) {
         var1.addProperty(id_break[21], var4.id_case());
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3369808987216521616L;
   }

   @Override
   public void id_break(JsonObject var1) {
      super.id_break(var1);
      JsonObject var2 = new JsonObject();
      JsonArray var3 = new JsonArray();

      for (rrQx_1 var5 : ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_protected[0]]).id_class()) {
         JsonObject var6 = new JsonObject();
         rrQd_1 var7 = var5.id_break();
         id_class(var5, var6, var7);
         var3.add(var6);
      }

      var2.add(id_break[1], var3);
      var1.add(id_break[2], var2);
      rrQx_1 var8 = ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_protected[1]]).id_protected();
      if (var8 != null) {
         JsonObject var9 = new JsonObject();
         rrQd_1 var10 = var8.id_break();
         id_class(var8, var9, var10);
         var1.add(id_break[3], var9);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{35, 22, 45, -86, -105, -5, -98, 77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      id_protected = new short[5];
   }

   private static void id_protected() {
      id_byte = new boolean[2];
   }
}
