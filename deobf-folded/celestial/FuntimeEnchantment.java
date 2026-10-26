package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FuntimeEnchantment {
   public Object[] id_class;
   private static byte[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_protected = new boolean[]{true, true, false};
   }

   public FuntimeEnchantment(String var1, int var2) {
      this.id_throws();
      this.id_class[id_byte[0]] = var1;
      Integer var8 = var2;
      this.id_class[1] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return "FuntimeCustomEnchantmentWrapper{enchantment='" + (String)this.id_class[id_byte[2]] + "', level=" + (Integer)this.id_class[1] + "}";
   }

   public static FuntimeEnchantment id_class(String var0) {
      return id_class(var0, 1);
   }

   public String id_class() {
      return (String)this.id_class[id_byte[4]];
   }

   public static FuntimeEnchantment id_class(String var0, int var1) {
      return new FuntimeEnchantment(var0, var1);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -447814090;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8520792010658519645L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{76, 57, -78, -126, 89, 32, 70, -34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int id_break() {
      return (Integer)this.id_class[1];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         this.id_class[1] = 0;
      }
   }

   private static void id_case() {
      id_break = new byte[]{2};
   }

   private static void id_protected() {
      id_byte = new short[]{0, 1, 0, 1, 0, 1};
   }
}
