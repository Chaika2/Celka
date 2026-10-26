package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnJ_2 {
   public Object[] id_class;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   public static Object[] id_break;
   private static short[] id_throws;
   private static float[] id_case;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[1] = 0.0F;
      }
   }

   public rrnJ_2() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   public static rrnJ_2 id_class(an_3 var0, float var1) {
      ((rrnJ_2)id_break[0]).id_class[0] = var0;
      rrnJ_2 var10000 = (rrnJ_2)id_break[0];
      Float var7 = var1;
      var10000.id_class[1] = var7;
      return (rrnJ_2)id_break[0];
   }

   public an_3 id_class() {
      return (an_3)this.id_class[0];
   }

   public void id_class(float var1) {
      Float var6 = var1;
      this.id_class[1] = var6;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-119, -55, 79, 66, 46, -1, -44, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -116145993;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3903569247151121350L;
   }

   public float id_break() {
      return (Float)this.id_class[1];
   }

   private static void id_throws() {
      id_protected = new byte[]{2};
   }

   private static void id_catch() {
      id_byte = new boolean[]{false, true, true};
   }

   private static void id_case() {
      id_case = new float[1];
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrnJ_2()};
      id_break = var0;
   }

   private static void id_private() {
      id_throws = new short[]{0, 0, 0, 1, 0, 0, 1, 1};
   }
}
