package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rX_2 implements rP_2 {
   private static boolean[] id_byte;
   private static short[] id_protected;
   public static Object[] id_class;
   private static byte[] id_throws;
   private static int[] id_case;
   private static double[] id_catch;
   public Object[] id_break;
   private static String[] id_private;

   public int id_byte() {
      return (Integer)this.id_break[id_protected[20]];
   }

   public rX_2(rU_2 var1) {
      this.id_case();
      Integer var6 = (Integer)var1.id_break[id_protected[2]];
      this.id_break[id_protected[3]] = var6;
      Integer var7 = (Integer)var1.id_break[2];
      this.id_break[1] = var7;
   }

   public rX_2(int var1, int var2) {
      this.id_case();
      Integer var7 = var1;
      this.id_break[id_protected[0]] = var7;
      Integer var8 = var2;
      this.id_break[1] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rX_2 var2 = (rX_2)var1;
         return this.id_break[id_protected[10]] == var2.id_break[id_protected[11]] && this.id_break[1] == var2.id_break[1] ? true : id_byte[5];
      } else {
         return id_byte[3];
      }
   }

   @Override
   public String toString() {
      String var10000 = id_private[0];
      Object[] var10001 = new Object[2];
      var10001[id_byte[6]] = Pd_1.id_class((Integer)this.id_break[id_protected[16]]);
      var10001[1] = Pd_1.id_class((Integer)this.id_break[1]);
      return String.format(var10000, var10001);
   }

   @Override
   public int hashCode() {
      int var1 = 1791873246;
      var1 = var1 * 222601791 + (Integer)this.id_break[id_protected[14]];
      return var1 * -1331679453 + (Integer)this.id_break[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{54, -123, -48, -20, 32, -27, -7, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static double id_class(double var0, double var2) {
      double var4 = Math.abs(var0);
      double var6 = Math.abs(var2);
      double var8;
      double var10;
      if (var4 < var6) {
         var8 = var6 - var4;
         var10 = var4;
      } else {
         var8 = var4 - var6;
         var10 = var6;
      }

      var10 *= id_class[id_protected[18]];
      return (var10 + var8) * (Double)C_throws.id_break().PS.id_class[id_protected[19]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -884276889;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2307622736696774989L;
   }

   public static rX_2 id_class(rjU_2 var0, float var1, double var2) {
      float var4 = (float)Math.toRadians((double)var1);
      double var5 = var0.id_break - (double)rfU_2.id_class(var4) * var2;
      double var7 = var0.id_protected + (double)rfU_2.id_break(var4) * var2;
      return new rX_2(rfU_2.id_byte(var5), rfU_2.id_byte(var7));
   }

   @Override
   public double id_class(int var1, int var2, int var3) {
      int var4 = var1 - (Integer)this.id_break[id_protected[8]];
      int var5 = var3 - (Integer)this.id_break[1];
      return id_class((double)var4, (double)var5);
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return var1 == this.id_break[id_protected[6]] && var3 == this.id_break[1] ? true : id_byte[1];
   }

   public int id_break() {
      return (Integer)this.id_break[1];
   }

   private static void id_throws() {
      id_catch = new double[]{2.0, 0.0};
   }

   private static void id_finally() {
      id_case = new int[]{1791873246, 222601791, -1331679453};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{1.4142135623730951};
      id_class = var0;
   }

   private static void id_extends() {
      id_protected = new short[]{0, 1, 0, 0, 2, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1};
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
         var1[id_byte[9]] = Integer.valueOf(id_byte[10]);
         var1[1] = Integer.valueOf(id_byte[12]);
      }
   }

   private static void id_implements() {
      id_throws = new byte[]{2, 2};
   }

   private static void id_protected() {
      id_byte = new boolean[]{true, false, true, false, true, false, false, true, false, false, false, true, false, true, false};
   }

   private static void id_private() {
      id_private = new String[]{new String("GoalXZ{x=%s,z=%s}")};
   }
}
