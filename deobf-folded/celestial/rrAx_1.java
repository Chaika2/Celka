package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAx_1 extends Om_1 {
   public Object[] id_class;
   private static short[] id_byte;
   public static Object[] id_break;
   private static boolean[] id_protected;

   public rrAx_1() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   public rrAd_1 id_class() {
      this.id_throws();
      return (rrAd_1)this.id_class[id_byte[4]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-121, 20, -2, 43, 39, -73, 99, -76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAx_1 id_class(rrAd_1 var0) {
      ((rrAx_1)id_break[id_byte[0]]).id_class[id_byte[1]] = var0;
      ((rrAx_1)id_break[id_byte[2]]).id_class(id_protected[0]);
      return (rrAx_1)id_break[id_byte[3]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 99570339125897169L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 957099941;
   }

   private static void id_break() {
      id_protected = new boolean[]{false, false, true, true};
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_case() {
      id_byte = new short[5];
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrAx_1()};
      id_break = var0;
   }
}
