package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwM_2 {
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   private static float[] id_throws;
   public Object[] id_class;

   public float id_byte() {
      return (Float)this.id_class[2];
   }

   public rrwM_2(rrwE_2 var1, float var2, float var3) {
      this.id_case();
      this.id_class[0] = var1;
      Float var9 = var2;
      this.id_class[1] = var9;
      Float var10 = var3;
      this.id_class[2] = var10;
   }

   static {
      ntfClinit();
   }

   public float id_class() {
      return (Float)this.id_class[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7941298500987496453L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1009973538;
   }

   public void id_class(rrwE_2 var1) {
      this.id_class[0] = var1;
   }

   public void id_class(float var1) {
      Float var6 = var1;
      this.id_class[1] = var6;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, 85, -8, -108, -20, 85, -4, 83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public float id_class(float var1, float var2) {
      return ((rrwE_2)this.id_class[0]).id_class(var1, var2) + (Float)this.id_class[1];
   }

   public float id_break(float var1, float var2) {
      return ((rrwE_2)this.id_class[0]).id_break(var1, var2) + (Float)this.id_class[2];
   }

   public void id_break(float var1) {
      Float var6 = var1;
      this.id_class[2] = var6;
   }

   public rrwE_2 id_break() {
      return (rrwE_2)this.id_class[0];
   }

   private static void id_throws() {
      id_byte = new byte[]{3, 2};
   }

   private static void id_catch() {
      id_break = new boolean[]{true};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[1] = 0.0F;
         var1[2] = 0.0F;
      }
   }

   private static void id_protected() {
      id_throws = new float[2];
   }

   private static void id_private() {
      id_protected = new short[]{0, 1, 2, 0, 1, 0, 2, 0, 1, 2, 0, 1, 2};
   }
}
