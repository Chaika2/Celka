package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjk_3 implements MinecraftAccessor {
   private static boolean[] id_class;
   private static String[] id_break;

   public static boolean id_byte(rdn_3 var0) {
      return var0.id_break() == rdy_3.kh && var0.id_final()
         ? var0.id_package().id_int("pyrotechnic-item").id_native("name").equals("ALTERNATIVE_TRAP")
         : id_class[4];
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-91, -12, 19, -89, -52, -61, -124, -87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -191553648;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5233350799532614894L;
   }

   private static void id_class() {
      id_break = new String[]{
         new String("kringeItems"),
         new String("type"),
         new String("SnowBall"),
         new String("kringeItems"),
         new String("type"),
         new String("ExplosiveStuff"),
         new String("pyrotechnic-item"),
         new String("name"),
         new String("STUN_STAR"),
         new String("pyrotechnic-item"),
         new String("name"),
         new String("EXPLOSIVE_TRAP"),
         new String("pyrotechnic-item"),
         new String("name"),
         new String("ALTERNATIVE_TRAP"),
         new String("backpack-inventory")
      };
   }

   public static boolean id_class(rdn_3 var0) {
      return var0.id_break() == rdy_3.dA && var0.id_final()
         ? var0.id_package().id_int("pyrotechnic-item").id_native("name").equals("EXPLOSIVE_TRAP")
         : id_class[3];
   }

   public static boolean id_break(rdn_3 var0) {
      return var0.id_break() == rdy_3.xa && var0.id_final() ? var0.id_package().id_int("kringeItems").id_native("type").equals("ExplosiveStuff") : id_class[1];
   }

   private static void id_break() {
      id_class = new boolean[6];
   }

   public static boolean id_throws(rdn_3 var0) {
      if (var0.id_break() instanceof rxJ_2 var1 && var1.id_catch() instanceof Wp_1) {
         return var0.id_protected("backpack-inventory");
      }

      return id_class[5];
   }

   public static boolean id_case(rdn_3 var0) {
      return var0.id_break() == rdy_3.hU && var0.id_final() ? var0.id_package().id_int("kringeItems").id_native("type").equals("SnowBall") : id_class[0];
   }

   public static boolean id_protected(rdn_3 var0) {
      return var0.id_break() == rdy_3.dQ && var0.id_final() ? var0.id_package().id_int("pyrotechnic-item").id_native("name").equals("STUN_STAR") : id_class[2];
   }
}
