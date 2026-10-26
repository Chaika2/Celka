package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFp_1 {
   public Object[] id_class;
   public static Object[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_protected = new boolean[]{false, true, true};
   }

   public rrFp_1() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   public static rrFp_1 id_class(Aw_1 var0) {
      ((rrFp_1)id_break[id_byte[0]]).id_class[id_byte[1]] = var0;
      return (rrFp_1)id_break[id_byte[2]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -964417762;
   }

   public Aw_1 id_class() {
      return (Aw_1)this.id_class[id_byte[3]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3497160486310001092L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-108, 66, 127, -75, -86, 109, 9, -5}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_byte = new short[4];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrFp_1()};
      id_break = var0;
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
