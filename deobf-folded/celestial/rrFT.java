package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFT {
   private static short[] id_byte;
   public Object[] id_class;
   private static byte[] id_protected;
   public static Object[] id_break;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_byte = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   public rrFT() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1509921273;
   }

   public static rrFT id_class(Aw_1 var0, String var1) {
      ((rrFT)id_break[id_byte[0]]).id_class[id_byte[1]] = var0;
      ((rrFT)id_break[id_byte[2]]).id_class[1] = var1;
      return (rrFT)id_break[id_byte[4]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8197411513702392399L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-51, 100, -4, 6, -49, -123, -18, 30}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public Aw_1 id_class() {
      return (Aw_1)this.id_class[id_byte[5]];
   }

   public String id_break() {
      return (String)this.id_class[1];
   }

   private static void id_throws() {
      id_throws = new boolean[]{false, true};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrFT()};
      id_break = var0;
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_protected = new byte[]{2};
   }
}
