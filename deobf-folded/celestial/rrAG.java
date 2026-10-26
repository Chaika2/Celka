package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAG {
   public Object[] id_class;
   public static Object[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;

   private static void id_byte() {
      id_byte = new boolean[]{false, true, true};
   }

   public rrAG() {
      this.id_break();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, -19, -46, -36, 47, -113, 78, 117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 16421677;
   }

   public rjU_2 id_class() {
      return (rjU_2)this.id_class[id_protected[3]];
   }

   public static rrAG id_class(rjU_2 var0) {
      ((rrAG)id_break[id_protected[0]]).id_class[id_protected[1]] = var0;
      return (rrAG)id_break[id_protected[2]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8873870976576787414L;
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_throws() {
      id_protected = new short[4];
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrAG()};
      id_break = var0;
   }
}
