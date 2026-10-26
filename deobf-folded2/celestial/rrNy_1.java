package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNy_1 implements rrNC {
   private static boolean[] id_break;
   private static long[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;
   public Object[] id_class;

   public long id_byte() {
      return (Long)this.id_class[1];
   }

   public rrNy_1(rgP_2 var1, long var2, long var4) {
      this.id_protected();
      this.id_class[0] = var1;
      Long var11 = var2;
      this.id_class[1] = var11;
      Long var12 = var4;
      this.id_class[2] = var12;
   }

   static {
      ntfClinit();
   }

   @Override
   public rgP_2 id_class() {
      return (rgP_2)this.id_class[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6814158873953098067L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{42, 63, -34, -8, -30, -70, 43, 45}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -966055776;
   }

   public long id_break() {
      return (Long)this.id_class[2];
   }

   private static void id_throws() {
      id_byte = new long[2];
   }

   private static void id_catch() {
      id_throws = new byte[]{3, 2};
   }

   private static void id_case() {
      id_protected = new short[]{0, 1, 2, 0, 1, 2};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[1] = 0L;
         var1[2] = 0L;
      }
   }

   private static void id_private() {
      id_break = new boolean[]{true};
   }
}
