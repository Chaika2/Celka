package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlU_2 {
   private static float[] id_byte;
   public Object[] id_class;
   public static Object[] id_break;
   private static boolean[] id_protected;
   private static double[] id_throws;
   private static byte[] id_case;
   private static short[] id_catch;

   public double id_byte() {
      return (Double)this.id_class[1];
   }

   public rrlU_2(double var1, double var3, double var5, float var7, float var8, boolean var9) {
      this.id_finally();
      Double var14 = var1;
      this.id_class[id_catch[0]] = var14;
      Double var15 = var3;
      this.id_class[1] = var15;
      Double var16 = var5;
      this.id_class[2] = var16;
      Float var17 = var7;
      this.id_class[3] = var17;
      Float var18 = var8;
      this.id_class[4] = var18;
      Boolean var19 = var9;
      this.id_class[5] = var19;
   }

   public rrlU_2() {
      this.id_finally();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8937454708955066051L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{117, 71, -17, 46, 125, -28, 118, 117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -189996017;
   }

   public double id_class() {
      return (Double)this.id_class[2];
   }

   public double id_break() {
      return (Double)this.id_class[id_catch[6]];
   }

   public float id_throws() {
      return (Float)this.id_class[3];
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         this.id_class[0] = 0.0;
         this.id_class[1] = 0.0;
         this.id_class[2] = 0.0;
         this.id_class[3] = 0.0F;
         this.id_class[4] = 0.0F;
         this.id_class[5] = false;
      }
   }

   private static void id_catch() {
      id_protected = new boolean[]{false, false, true, false, true};
   }

   private static void id_extends() {
      id_throws = new double[3];
   }

   public float id_case() {
      return (Float)this.id_class[4];
   }

   private static void id_implements() {
      id_catch = new short[]{0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5};
   }

   public boolean id_protected() {
      return (Boolean)this.id_class[5];
   }

   private static void id_private() {
      id_case = new byte[]{6, 2, 3, 4, 5};
   }

   private static void id_volatile() {
      Object[] var0 = new Object[]{new rrlU_2()};
      id_break = var0;
   }

   private static void id_native() {
      id_byte = new float[2];
   }
}
