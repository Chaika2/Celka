package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLl_1 {
   public static Object[] id_class;
   private static float[] id_byte;
   public Object[] id_break;
   private static boolean[] id_protected;
   private static short[] id_throws;

   private static void id_byte() {
      Object[] var0 = new Object[]{new rrLl_1()};
      id_class = var0;
   }

   public rrLl_1() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   public float id_class() {
      return (Float)this.id_break[id_throws[3]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, -17, -39, 53, 82, -21, -87, 64}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(float var1) {
      Float var6 = var1;
      this.id_break[id_throws[4]] = var6;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7826481549747456384L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -509214765;
   }

   public static rrLl_1 id_break(float var0) {
      rrLl_1 var10000 = (rrLl_1)id_class[id_throws[0]];
      Float var5 = var0;
      var10000.id_break[id_throws[1]] = var5;
      return (rrLl_1)id_class[id_throws[2]];
   }

   private static void id_break() {
      id_throws = new short[5];
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
         var1[id_protected[2]] = id_byte[0];
      }
   }

   private static void id_case() {
      id_protected = new boolean[]{false, true, false, true};
   }

   private static void id_protected() {
      id_byte = new float[1];
   }
}
