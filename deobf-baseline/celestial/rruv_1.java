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
      return (Float)this.id_break[id_case[28]];
   }

   public rruv_1(float var1, float var2, float var3, float var4) {
      this.id_throws();
      Float var9 = var1;
      this.id_break[id_case[22]] = var9;
      Float var10 = var2;
      this.id_break[id_case[23]] = var10;
      Float var11 = var3;
      this.id_break[id_case[24]] = var11;
      Float var12 = var4;
      this.id_break[id_case[25]] = var12;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return id_throws[4];
      } else if (!(var1 instanceof rruv_1 var2)) {
         return id_throws[5];
      } else if (Float.compare(this.id_break(), var2.id_break()) != 0) {
         return id_throws[6];
      } else if (Float.compare(this.id_protected(), var2.id_protected()) != 0) {
         return id_throws[7];
      } else if (Float.compare(this.id_byte(), var2.id_byte()) != 0) {
         return id_throws[8];
      } else {
         return Float.compare(this.id_class(), var2.id_class()) != 0 ? id_throws[9] : id_throws[10];
      }
   }

   @Override
   public String toString() {
      return "Bound(x=" + this.id_break() + ", y=" + this.id_protected() + ", width=" + this.id_byte() + ", height=" + this.id_class() + ")";
   }

   @Override
   public int hashCode() {
      byte var1 = id_byte[0];
      int var2 = id_throws[11];
      var2 = var2 * id_byte[1] + Float.floatToIntBits(this.id_break());
      var2 = var2 * id_byte[2] + Float.floatToIntBits(this.id_protected());
      var2 = var2 * id_byte[3] + Float.floatToIntBits(this.id_byte());
      return var2 * id_byte[4] + Float.floatToIntBits(this.id_class());
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8397752255162701236L;
   }

   public rruv_1 id_class(float var1, float var2) {
      return new rruv_1(
         (Float)this.id_break[id_case[0]] - var1,
         (Float)this.id_break[id_case[1]] - var2,
         (Float)this.id_break[id_case[2]] + var1 * id_protected[0],
         (Float)this.id_break[id_case[3]] + var2 * id_protected[1]
      );
   }

   public boolean id_class(rruv_1 var1) {
      return this.id_break[id_case[4]] < var1.id_break[id_case[5]] + var1.id_break[id_case[6]]
            && this.id_break[id_case[7]] + this.id_break[id_case[8]] > var1.id_break[id_case[9]]
            && this.id_break[id_case[10]] < var1.id_break[id_case[11]] + var1.id_break[id_case[12]]
            && this.id_break[id_case[13]] + this.id_break[id_case[14]] > var1.id_break[id_case[15]]
         ? id_throws[0]
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
      return (Float)this.id_break[id_case[29]];
   }

   public float id_break() {
      return (Float)this.id_break[id_case[26]];
   }

   public boolean id_break(float var1, float var2) {
      return this.id_break[id_case[16]] < var1
            && this.id_break[id_case[17]] + this.id_break[id_case[18]] > var1
            && this.id_break[id_case[19]] < var2
            && this.id_break[id_case[20]] + this.id_break[id_case[21]] > var2
         ? id_throws[2]
         : id_throws[3];
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[id_byte[5]];
         Object[] var1 = this.id_break;
         var1[id_throws[13]] = id_protected[6];
         var1[id_throws[14]] = id_protected[7];
         var1[id_byte[6]] = id_protected[8];
         var1[id_byte[7]] = id_protected[9];
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
      return (Float)this.id_break[id_case[27]];
   }

   private static void id_private() {
      id_byte = new byte[]{59, 59, 59, 59, 59, 4, 2, 3};
   }
}
