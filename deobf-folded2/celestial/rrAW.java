package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAW extends Om_1 {
   private static boolean[] id_byte;
   private static short[] id_protected;
   public static Object[] id_class;
   public Object[] id_break;

   public rrAW() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 288363490;
   }

   public static rrAW id_class(rfo_3 var0) {
      ((rrAW)id_class[0]).id_break[0] = var0;
      ((rrAW)id_class[0]).id_class(false);
      return (rrAW)id_class[0];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{51, 43, -20, 64, 45, 92, 113, -121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rfo_3 id_class() {
      this.id_protected();
      return (rfo_3)this.id_break[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2694983753341653268L;
   }

   private static void id_break() {
      id_byte = new boolean[]{false, false, true, true};
   }

   private static void id_throws() {
      id_protected = new short[5];
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrAW()};
      id_class = var0;
   }

   private void id_protected() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }
}
