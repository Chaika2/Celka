package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLT {
   private static boolean[] id_byte;
   public Object[] id_class;
   private static float[] id_protected;
   public static Object[] id_break;
   private static short[] id_throws;

   private static void id_byte() {
      id_throws = new short[5];
   }

   public rrLT() {
      this.id_break();
   }

   static {
      ntfClinit();
   }

   public static rrLT id_class(float var0) {
      rrLT var10000 = (rrLT)id_break[0];
      Float var5 = var0;
      var10000.id_class[0] = var5;
      return (rrLT)id_break[0];
   }

   public float id_class() {
      return (Float)this.id_class[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -175328981;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{17, 111, -109, -14, -123, 43, 17, -26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3858324127826546662L;
   }

   public void id_break(float var1) {
      Float var6 = var1;
      this.id_class[0] = var6;
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
         var1[0] = 0.0F;
      }
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrLT()};
      id_break = var0;
   }

   private static void id_case() {
      id_byte = new boolean[]{false, true, false, true};
   }

   private static void id_protected() {
      id_protected = new float[1];
   }
}
