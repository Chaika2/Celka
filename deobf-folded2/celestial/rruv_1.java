package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruv_1 {
   public static Object[] id_class;
   private static byte[] id_byte;
   public Object[] id_break;
   private static float[] id_protected;
   private static boolean[] id_throws;
   private static short[] id_case;

   public float id_byte() {
      return (Float)this.id_break[2];
   }

   public rruv_1(float var1, float var2, float var3, float var4) {
      this.id_throws();
      Float var9 = var1;
      this.id_break[0] = var9;
      Float var10 = var2;
      this.id_break[1] = var10;
      Float var11 = var3;
      this.id_break[2] = var11;
      Float var12 = var4;
      this.id_break[3] = var12;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof rruv_1 var2)) {
         return false;
      } else if (Float.compare(this.id_break(), var2.id_break()) != 0) {
         return false;
      } else if (Float.compare(this.id_protected(), var2.id_protected()) != 0) {
         return false;
      } else if (Float.compare(this.id_byte(), var2.id_byte()) != 0) {
         return false;
      } else {
         return Float.compare(this.id_class(), var2.id_class()) != 0 ? false : id_throws[10];
      }
   }

   @Override
   public String toString() {
      return "Bound(x=" + this.id_break() + ", y=" + this.id_protected() + ", width=" + this.id_byte() + ", height=" + this.id_class() + ")";
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + Float.floatToIntBits(this.id_break());
      var2 = var2 * 59 + Float.floatToIntBits(this.id_protected());
      var2 = var2 * 59 + Float.floatToIntBits(this.id_byte());
      return var2 * 59 + Float.floatToIntBits(this.id_class());
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8397752255162701236L;
   }

   public rruv_1 id_class(float var1, float var2) {
      return new rruv_1(
         (Float)this.id_break[0] - var1, (Float)this.id_break[1] - var2, (Float)this.id_break[2] + var1 * 2.0F, (Float)this.id_break[3] + var2 * 2.0F
      );
   }

   public boolean id_class(rruv_1 var1) {
      return this.id_break[0] < var1.id_break[0] + var1.id_break[2]
            && this.id_break[0] + this.id_break[2] > var1.id_break[0]
            && this.id_break[1] < var1.id_break[1] + var1.id_break[3]
            && this.id_break[1] + this.id_break[3] > var1.id_break[1]
         ? true
         : id_throws[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{53, 7, -66, 13, -46, 60, -24, 95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1353702271;
   }

   public float id_class() {
      return (Float)this.id_break[3];
   }

   public float id_break() {
      return (Float)this.id_break[0];
   }

   public boolean id_break(float var1, float var2) {
      return this.id_break[0] < var1 && this.id_break[0] + this.id_break[2] > var1 && this.id_break[1] < var2 && this.id_break[1] + this.id_break[3] > var2
         ? true
         : id_throws[3];
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
         Object[] var1 = this.id_break;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
      }
   }

   private static void id_finally() {
      id_protected = new float[]{2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void id_catch() {
      id_throws = new boolean[]{true, false, true, false, true, false, false, false, false, false, true, true, false, false, true, true};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rruv_1(0.0F, 0.0F, 0.0F, 0.0F)};
      id_class = var0;
   }

   private static void id_implements() {
      id_case = new short[]{0, 1, 2, 3, 0, 0, 2, 0, 2, 0, 1, 1, 3, 1, 3, 1, 0, 0, 2, 1, 1, 3, 0, 1, 2, 3, 0, 1, 2, 3};
   }

   public float id_protected() {
      return (Float)this.id_break[1];
   }

   private static void id_private() {
      id_byte = new byte[]{59, 59, 59, 59, 59, 4, 2, 3};
   }
}
