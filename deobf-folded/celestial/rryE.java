package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryE {
   private static boolean[] id_break;
   private static float[] id_byte;
   private static byte[] id_protected;
   private static short[] id_throws;
   public Object[] id_class;

   public float id_byte() {
      return (Float)this.id_class[2];
   }

   public rryE(float var1, float var2, float var3) {
      this.id_case();
      Float var8 = var1;
      this.id_class[id_throws[3]] = var8;
      Float var9 = var2;
      this.id_class[1] = var9;
      Float var10 = var3;
      this.id_class[2] = var10;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-111, 43, -83, -93, -58, -30, -85, -63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8317807258410505341L;
   }

   public float id_class() {
      return (Float)this.id_class[id_throws[0]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -329512251;
   }

   public float id_break() {
      return (Float)this.id_class[1];
   }

   private static void id_throws() {
      id_protected = new byte[]{3, 2};
   }

   private static void id_catch() {
      id_break = new boolean[]{false, true};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         this.id_class[0] = 0.0F;
         this.id_class[1] = 0.0F;
         this.id_class[2] = 0.0F;
      }
   }

   private static void id_protected() {
      id_throws = new short[]{0, 1, 2, 0, 1, 2};
   }

   private static void id_private() {
      id_byte = new float[3];
   }
}
