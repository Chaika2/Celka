package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PC {
   public Object[] id_class;
   private static byte[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;

   public String id_byte() {
      return (String)this.id_class[2];
   }

   public PC(rdn_3 var1, String var2, String var3, int var4) {
      this.id_private();
      this.id_class[0] = var1;
      this.id_class[1] = var2;
      this.id_class[2] = var3;
      Integer var12 = var4;
      this.id_class[3] = var12;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2787233841795599707L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -428615265;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-30, 75, -35, 93, 10, 125, 123, 29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_class() {
      return (String)this.id_class[1];
   }

   public rdn_3 id_break() {
      return (rdn_3)this.id_class[0];
   }

   private static void id_throws() {
      id_break = new byte[]{4, 3};
   }

   private static void id_catch() {
      id_byte = new boolean[1];
   }

   private static void id_case() {
      id_protected = new short[]{0, 1, 2, 3, 0, 1, 2, 3};
   }

   public int id_protected() {
      return (Integer)this.id_class[3];
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[3] = 0;
      }
   }
}
