package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAJ {
   public Object[] id_class;
   private static boolean[] id_byte;
   public static Object[] id_break;
   private static short[] id_protected;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[1]];
         Object[] var1 = this.id_class;
      }
   }

   public rrAJ() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   public void id_class(iM_2 var1) {
      this.id_class[id_protected[4]] = var1;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, 124, -36, -120, -72, 57, 97, -52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public iM_2 id_class() {
      return (iM_2)this.id_class[id_protected[3]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 917425419;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5030345346690978495L;
   }

   public static rrAJ id_break(iM_2 var0) {
      ((rrAJ)id_break[id_protected[0]]).id_class[id_protected[1]] = var0;
      return (rrAJ)id_break[id_protected[2]];
   }

   private static void id_break() {
      id_protected = new short[5];
   }

   private static void id_throws() {
      id_byte = new boolean[]{false, true, true};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrAJ()};
      id_break = var0;
   }
}
