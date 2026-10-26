package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnz_3 {
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;
   public static Object[] id_break;

   private static void id_byte() {
      id_byte = new boolean[]{false, true, true};
   }

   public rrnz_3() {
      this.id_break();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6894233272564675L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -744412586;
   }

   public static rrnz_3 id_class(rhd_3 var0) {
      ((rrnz_3)id_break[id_protected[0]]).id_class[id_protected[1]] = var0;
      return (rrnz_3)id_break[id_protected[2]];
   }

   public rhd_3 id_class() {
      return (rhd_3)this.id_class[id_protected[3]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{84, -92, -128, -37, -1, -115, -42, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[1]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_throws() {
      id_protected = new short[4];
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrnz_3()};
      id_break = var0;
   }
}
