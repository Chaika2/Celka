package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruZ implements rrum_1 {
   private static boolean[] id_break;
   private static short[] id_byte;
   public Object[] id_class;
   private static float[] id_protected;
   private static byte[] id_throws;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[1] = id_protected[1];
      }
   }

   public rruZ(String var1, float var2) {
      this.id_byte();
      this.id_class[id_byte[0]] = var1;
      Float var8 = var2;
      this.id_class[1] = var8;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1288107831;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{67, 2, 24, 55, -15, -1, -30, -93}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public float id_class() {
      return (Float)this.id_class[1] * 1000.0F;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4487449110266991177L;
   }

   @Override
   public String id_break() {
      return (String)this.id_class[id_byte[2]];
   }

   private static void id_throws() {
      id_protected = new float[]{1000.0F, 0.0F};
   }

   private static void id_catch() {
      id_byte = new short[]{0, 1, 0, 1};
   }

   private static void id_case() {
      id_throws = new byte[]{2};
   }

   private static void id_protected() {
      id_break = new boolean[]{true};
   }
}
