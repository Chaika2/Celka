package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rl_3 implements rq_3 {
   public Object[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;

   @Override
   public int id_byte() {
      return (Integer)this.id_class[2];
   }

   public rl_3() {
      this(0, 0, 0);
   }

   public rl_3(int var1, int var2, int var3) {
      this.id_private();
      Integer var8 = var1;
      this.id_class[0] = var8;
      Integer var9 = var2;
      this.id_class[1] = var9;
      Integer var10 = var3;
      this.id_class[2] = var10;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7595321734947514677L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-113, 108, -86, -107, -4, -57, -11, -78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -178144244;
   }

   @Override
   public int id_class() {
      return (Integer)this.id_class[1];
   }

   @Override
   public int id_break() {
      return (Integer)this.id_class[0];
   }

   private static void id_throws() {
      id_byte = new byte[]{3, 2};
   }

   private static void id_catch() {
      id_break = new boolean[]{false, false, false, false, false, true, false, false};
   }

   private static void id_case() {
      id_protected = new short[]{0, 1, 2, 0, 1, 2};
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
      }
   }
}
