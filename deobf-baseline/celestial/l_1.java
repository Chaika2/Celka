package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class l_1 {
   private static byte[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static short[] id_protected;

   public int id_byte() {
      return (Integer)this.id_class[id_protected[6]];
   }

   public l_1(Y var1, H var2, int var3, int var4) {
      this.id_private();
      this.id_class[id_protected[0]] = var1;
      this.id_class[id_protected[1]] = var2;
      Integer var11 = var3;
      this.id_class[id_protected[2]] = var11;
      Integer var12 = var4;
      this.id_class[id_protected[3]] = var12;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5626222361976864675L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-78, 118, -46, 107, 107, -101, 46, -24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public int id_class() {
      return (Integer)this.id_class[id_protected[7]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1389694509;
   }

   public H id_break() {
      return (H)this.id_class[id_protected[5]];
   }

   private static void id_throws() {
      id_break = new byte[]{4, 2, 3};
   }

   private static void id_catch() {
      id_protected = new short[]{0, 1, 2, 3, 0, 1, 2, 3};
   }

   private static void id_case() {
      id_byte = new boolean[2];
   }

   public Y id_protected() {
      return (Y)this.id_class[id_protected[4]];
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
         var1[id_break[1]] = Integer.valueOf(id_byte[0]);
         var1[id_break[2]] = Integer.valueOf(id_byte[1]);
      }
   }
}
