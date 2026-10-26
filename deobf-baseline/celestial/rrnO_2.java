package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnO_2 {
   private static short[] id_byte;
   public static Object[] id_class;
   private static byte[] id_protected;
   private static boolean[] id_throws;
   public Object[] id_break;

   private static void id_byte() {
      id_protected = new byte[]{2};
   }

   public rrnO_2() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1915576359;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, -116, -62, 31, -14, -84, 6, -127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2232792347216104352L;
   }

   public ryO_2 id_class() {
      return (ryO_2)this.id_break[id_byte[5]];
   }

   public static rrnO_2 id_class(ryO_2 var0, rfH_2 var1) {
      ((rrnO_2)id_class[id_byte[0]]).id_break[id_byte[1]] = var0;
      ((rrnO_2)id_class[id_byte[2]]).id_break[id_byte[3]] = var1;
      return (rrnO_2)id_class[id_byte[4]];
   }

   public rfH_2 id_break() {
      return (rfH_2)this.id_break[id_byte[6]];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrnO_2()};
      id_class = var0;
   }

   private static void id_catch() {
      id_byte = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   private static void id_case() {
      id_throws = new boolean[]{false, true};
   }

   private void id_protected() {
      if (this.id_break == null) {
         this.id_break = new Object[id_protected[0]];
         Object[] var1 = this.id_break;
      }
   }
}
