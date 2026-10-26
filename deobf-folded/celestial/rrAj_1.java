package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAj_1 {
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static short[] id_throws;
   private static double[] id_case;
   public static Object[] id_class;
   public Object[] id_break;
   private static float[] id_catch;

   public double id_byte() {
      return (Double)this.id_break[id_throws[27]];
   }

   private void id_int() {
      if (this.id_break == null) {
         this.id_break = new Object[13];
         Object[] var1 = this.id_break;
         var1[id_byte[1]] = id_case[0];
         var1[1] = id_case[1];
         var1[2] = id_case[2];
         var1[3] = id_case[3];
         var1[4] = id_case[4];
         var1[5] = id_case[5];
         var1[6] = id_catch[0];
         var1[7] = id_catch[1];
         var1[8] = id_catch[2];
         var1[9] = id_catch[3];
         var1[10] = id_byte[3];
         var1[11] = id_byte[4];
         var1[12] = id_byte[5];
      }
   }

   public rrAj_1() {
      this.id_int();
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new short[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0, 9, 0, 10, 0, 11, 0, 12, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{78, -107, -127, -83, -94, -93, -113, 76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1521031948608246867L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1650171379;
   }

   public static rrAj_1 id_class(
      double var0,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      float var12,
      float var13,
      float var14,
      float var15,
      boolean var16,
      boolean var17,
      boolean var18
   ) {
      rrAj_1 var10000 = (rrAj_1)id_class[id_throws[0]];
      Double var23 = var0;
      var10000.id_break[id_throws[1]] = var23;
      var10000 = (rrAj_1)id_class[id_throws[2]];
      Double var24 = var2;
      var10000.id_break[1] = var24;
      var10000 = (rrAj_1)id_class[id_throws[4]];
      Double var25 = var4;
      var10000.id_break[2] = var25;
      var10000 = (rrAj_1)id_class[id_throws[6]];
      Double var26 = var6;
      var10000.id_break[3] = var26;
      var10000 = (rrAj_1)id_class[id_throws[8]];
      Double var27 = var8;
      var10000.id_break[4] = var27;
      var10000 = (rrAj_1)id_class[id_throws[10]];
      Double var28 = var10;
      var10000.id_break[5] = var28;
      var10000 = (rrAj_1)id_class[id_throws[12]];
      Float var29 = var12;
      var10000.id_break[6] = var29;
      var10000 = (rrAj_1)id_class[id_throws[14]];
      Float var30 = var13;
      var10000.id_break[7] = var30;
      var10000 = (rrAj_1)id_class[id_throws[16]];
      Float var31 = var14;
      var10000.id_break[8] = var31;
      var10000 = (rrAj_1)id_class[id_throws[18]];
      Float var32 = var15;
      var10000.id_break[9] = var32;
      var10000 = (rrAj_1)id_class[id_throws[20]];
      Boolean var33 = var16;
      var10000.id_break[10] = var33;
      var10000 = (rrAj_1)id_class[id_throws[22]];
      Boolean var34 = var17;
      var10000.id_break[11] = var34;
      var10000 = (rrAj_1)id_class[id_throws[24]];
      Boolean var35 = var18;
      var10000.id_break[12] = var35;
      return (rrAj_1)id_class[id_throws[26]];
   }

   public double id_class() {
      return (Double)this.id_break[4];
   }

   public double id_break() {
      return (Double)this.id_break[1];
   }

   public boolean id_throws() {
      return (Boolean)this.id_break[12];
   }

   public double id_finally() {
      return (Double)this.id_break[3];
   }

   public double id_catch() {
      return (Double)this.id_break[5];
   }

   public float id_extends() {
      return (Float)this.id_break[9];
   }

   public float id_case() {
      return (Float)this.id_break[6];
   }

   private static void id_continue() {
      id_protected = new byte[]{13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
   }

   public double id_implements() {
      return (Double)this.id_break[2];
   }

   private static void id_new() {
      id_case = new double[6];
   }

   private static void id_package() {
      Object[] var0 = new Object[]{new rrAj_1()};
      id_class = var0;
   }

   private static void id_super() {
      id_catch = new float[4];
   }

   public float id_protected() {
      return (Float)this.id_break[8];
   }

   public float id_private() {
      return (Float)this.id_break[7];
   }

   private static void id_final() {
      id_byte = new boolean[]{false, false, true, false, false, false, true};
   }

   public boolean id_volatile() {
      return (Boolean)this.id_break[11];
   }

   public boolean id_native() {
      return (Boolean)this.id_break[10];
   }
}
