package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjB_2 implements Ok_1 {
   private static byte[] id_break;
   private static float[] id_byte;
   private static short[] id_protected;
   private static int[] id_throws;
   private static boolean[] id_private;
   public Object[] id_class;

   @Override
   public Ok_1 id_byte(int var1, int var2) {
      ((Ok_1)this.id_class[id_protected[10]]).id_byte(var1, var2);
      return this;
   }

   public rrjB_2() {
      this.id_case();
      Float var5 = id_byte[0];
      this.id_class[id_protected[0]] = var5;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{29, -59, 55, -47, -58, 118, -15, 48}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Ok_1 id_class(float var1, float var2) {
      ((Ok_1)this.id_class[id_protected[8]]).id_class(var1, var2);
      return this;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7877508388274684056L;
   }

   @Override
   public Ok_1 id_class(int var1) {
      int var2 = var1 >>> id_break[0] & id_protected[5];
      int var3 = var1 & id_throws[0];
      ((Ok_1)this.id_class[id_protected[6]]).id_class(var3 | this.id_throws(var2) << id_break[1]);
      return this;
   }

   @Override
   public Ok_1 id_class(int var1, int var2) {
      ((Ok_1)this.id_class[id_protected[7]]).id_class(var1, this.id_throws(var2));
      return this;
   }

   @Override
   public Ok_1 id_class(double var1, double var3, double var5) {
      ((Ok_1)this.id_class[id_protected[3]]).id_class(var1, var3, var5);
      return this;
   }

   @Override
   public void id_class() {
      ((Ok_1)this.id_class[id_protected[12]]).id_class();
   }

   public rrjB_2 id_class(Ok_1 var1, float var2) {
      this.id_class[id_protected[1]] = var1;
      Float var8 = var2;
      this.id_class[id_protected[2]] = var8;
      return this;
   }

   @Override
   public Ok_1 id_class(float var1, float var2, float var3) {
      ((Ok_1)this.id_class[id_protected[11]]).id_class(var1, var2, var3);
      return this;
   }

   @Override
   public Ok_1 id_break(int var1, int var2, int var3, int var4) {
      ((Ok_1)this.id_class[id_protected[4]]).id_break(var1, var2, var3, this.id_throws(var4));
      return this;
   }

   @Override
   public Ok_1 id_break(int var1, int var2) {
      ((Ok_1)this.id_class[id_protected[9]]).id_break(var1, var2);
      return this;
   }

   private int id_throws(int var1) {
      int var2 = (int)((float)var1 * (Float)this.id_class[id_protected[14]]);
      return var2 < 0 ? id_private[0] : Math.min(var2, id_protected[15]);
   }

   private static void id_finally() {
      id_private = new boolean[]{false, true};
   }

   private static void id_catch() {
      id_byte = new float[]{1.0F, 0.0F};
   }

   private static void id_extends() {
      id_throws = new int[]{16777215};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         this.id_class[1] = 0.0F;
      }
   }

   private static int id_case(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1035970034;
   }

   private static void id_implements() {
      id_protected = new short[]{1, 0, 1, 0, 0, 255, 0, 0, 0, 0, 0, 0, 0, 0, 1, 255};
   }

   @Override
   public Hd_1 id_protected() {
      return ((Ok_1)this.id_class[id_protected[13]]).id_protected();
   }

   private static void id_private() {
      id_break = new byte[]{24, 24, 2};
   }
}
