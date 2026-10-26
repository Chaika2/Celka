package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bB_2 {
   private static byte[] id_break;
   private static boolean[] id_byte;
   private static float[] id_protected;
   private static short[] id_throws;
   public Object[] id_class;

   public void id_byte() {
      Object var5 = null;
      this.id_class[id_throws[6]] = var5;
      Float var6 = id_protected[0];
      this.id_class[1] = var6;
   }

   public bB_2() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-38, -13, -126, -58, -81, 120, -10, -19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rjU_2 var1) {
      if ((rjU_2)this.id_class[id_throws[0]] == null) {
         this.id_class[id_throws[1]] = var1;
      }

      Float var7 = (Float)this.id_class[1] + (float)((rjU_2)this.id_class[id_throws[3]]).id_case(var1);
      this.id_class[1] = var7;
      this.id_class[id_throws[5]] = var1;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1669401699;
   }

   public float id_class() {
      return (Float)this.id_class[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3642944291624709720L;
   }

   public rjU_2 id_break() {
      return (rjU_2)this.id_class[id_throws[8]];
   }

   private static void id_throws() {
      id_protected = new float[2];
   }

   private static void id_catch() {
      id_throws = new short[]{0, 0, 1, 0, 1, 0, 0, 1, 0, 1};
   }

   private static void id_case() {
      id_break = new byte[]{2};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[1] = id_protected[1];
      }
   }

   private static void id_private() {
      id_byte = new boolean[]{true};
   }
}
