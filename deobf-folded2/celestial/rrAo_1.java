package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAo_1 extends Om_1 {
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static short[] id_throws;
   private static double[] id_case;
   private static float[] id_catch;
   public static Object[] id_class;
   public Object[] id_break;

   public void id_byte(boolean var1) {
      this.id_throw();
      Boolean var6 = var1;
      this.id_break[12] = var6;
   }

   public void id_byte(double var1) {
      this.id_throw();
      Double var7 = var1;
      this.id_break[0] = var7;
   }

   public void id_byte(float var1) {
      this.id_throw();
      Float var6 = var1;
      this.id_break[7] = var6;
   }

   public float id_int() {
      this.id_throw();
      return (Float)this.id_break[9];
   }

   public rrAo_1() {
      this.id_throw();
   }

   static {
      ntfClinit();
   }

   public float id_this() {
      this.id_throw();
      return Math.abs((Float)this.id_break[6] - (Float)this.id_break[8]);
   }

   public void id_class(PX var1) {
      this.id_throw();
      if (!(Boolean)id_class[1]) {
         Float var6 = var1.id_throws();
         this.id_break[6] = var6;
         Float var7 = var1.id_protected();
         this.id_break[7] = var7;
         Boolean var8 = true;
         id_class[0] = var8;
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-66, -5, -36, 10, -61, 31, -58, 8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public double id_class() {
      this.id_throw();
      return (Double)this.id_break[3];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2780419608273777496L;
   }

   public static rrAo_1 id_class(
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
      rrAo_1 var19 = id_break(var0, var2, var4, var6, var8, var10, var12, var13, var14, var15, var16, var17, var18);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var19);
      return var19;
   }

   public void id_class(float var1) {
      this.id_throw();
      Float var6 = var1;
      this.id_break[6] = var6;
   }

   public void id_class(double var1) {
      this.id_throw();
      Double var7 = var1;
      this.id_break[5] = var7;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1736858363;
   }

   public void id_break(boolean var1) {
      this.id_throw();
      Boolean var6 = var1;
      this.id_break[10] = var6;
   }

   public void id_break(float var1) {
      this.id_throw();
      Float var6 = var1;
      this.id_break[8] = var6;
   }

   public double id_break() {
      this.id_throw();
      return (Double)this.id_break[2];
   }

   public void id_break(double var1) {
      this.id_throw();
      Double var7 = var1;
      this.id_break[2] = var7;
   }

   private static rrAo_1 id_break(
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
      rrAo_1 var10000 = (rrAo_1)id_class[2];
      Double var23 = var0;
      var10000.id_break[0] = var23;
      var10000 = (rrAo_1)id_class[2];
      Double var24 = var2;
      var10000.id_break[1] = var24;
      var10000 = (rrAo_1)id_class[2];
      Double var25 = var4;
      var10000.id_break[2] = var25;
      var10000 = (rrAo_1)id_class[2];
      Double var26 = var6;
      var10000.id_break[3] = var26;
      var10000 = (rrAo_1)id_class[2];
      Double var27 = var8;
      var10000.id_break[4] = var27;
      var10000 = (rrAo_1)id_class[2];
      Double var28 = var10;
      var10000.id_break[5] = var28;
      var10000 = (rrAo_1)id_class[2];
      Float var29 = var12;
      var10000.id_break[6] = var29;
      var10000 = (rrAo_1)id_class[2];
      Float var30 = var13;
      var10000.id_break[7] = var30;
      var10000 = (rrAo_1)id_class[2];
      Float var31 = var14;
      var10000.id_break[8] = var31;
      var10000 = (rrAo_1)id_class[2];
      Float var32 = var15;
      var10000.id_break[9] = var32;
      var10000 = (rrAo_1)id_class[2];
      Boolean var33 = var16;
      var10000.id_break[10] = var33;
      var10000 = (rrAo_1)id_class[2];
      Boolean var34 = var17;
      var10000.id_break[11] = var34;
      var10000 = (rrAo_1)id_class[2];
      Boolean var35 = var18;
      var10000.id_break[12] = var35;
      ((rrAo_1)id_class[2]).id_class(false);
      Boolean var36 = false;
      id_class[0] = var36;
      return (rrAo_1)id_class[2];
   }

   public void id_throws(double var1) {
      this.id_throw();
      Double var7 = var1;
      this.id_break[4] = var7;
   }

   public float id_throws() {
      this.id_throw();
      return Math.abs((Float)this.id_break[7] - (Float)this.id_break[9]);
   }

   public PX id_finally() {
      this.id_throw();
      return new PX((Float)this.id_break[6], (Float)this.id_break[7]);
   }

   public double id_catch() {
      this.id_throw();
      return (Double)this.id_break[1];
   }

   public boolean id_extends() {
      this.id_throw();
      return (Boolean)this.id_break[10];
   }

   private static void id_goto() {
      id_case = new double[6];
   }

   public void id_case(double var1) {
      this.id_throw();
      Double var7 = var1;
      this.id_break[3] = var7;
   }

   public double id_case() {
      this.id_throw();
      return Math.abs((Double)this.id_break[2] - (Double)this.id_break[5]);
   }

   public float id_continue() {
      this.id_throw();
      return (Float)this.id_break[7];
   }

   public double id_else() {
      this.id_throw();
      return Math.abs((Double)this.id_break[1] - (Double)this.id_break[4]);
   }

   public boolean id_implements() {
      this.id_throw();
      return this.id_break[6] == this.id_break[8] && this.id_break[7] == this.id_break[9] ? id_protected[4] : id_protected[3];
   }

   private static void id_instanceof() {
      id_protected = new boolean[]{false, false, true, true, false, false, true, false, false, false, false, false, true, false};
   }

   public double id_new() {
      this.id_throw();
      return Math.abs((Double)this.id_break[0] - (Double)this.id_break[3]);
   }

   public double id_package() {
      this.id_throw();
      return (Double)this.id_break[0];
   }

   private static void id_return() {
      id_throws = new short[]{
         2,
         0,
         2,
         1,
         2,
         2,
         2,
         3,
         2,
         4,
         2,
         5,
         2,
         6,
         2,
         7,
         2,
         8,
         2,
         9,
         2,
         10,
         2,
         11,
         2,
         12,
         2,
         0,
         2,
         0,
         1,
         6,
         7,
         0,
         6,
         6,
         7,
         7,
         7,
         7,
         6,
         7,
         6,
         8,
         7,
         9,
         0,
         3,
         1,
         4,
         2,
         5,
         6,
         8,
         7,
         9,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         9,
         10,
         11,
         12
      };
   }

   public double id_super() {
      this.id_throw();
      return (Double)this.id_break[5];
   }

   private void id_throw() {
      if (this.id_break == null) {
         this.id_break = new Object[13];
         Object[] var1 = this.id_break;
         var1[0] = 0.0;
         var1[1] = 0.0;
         var1[2] = 0.0;
         var1[3] = 0.0;
         var1[4] = 0.0;
         var1[5] = 0.0;
         var1[6] = 0.0F;
         var1[7] = 0.0F;
         var1[8] = 0.0F;
         var1[9] = 0.0F;
         var1[10] = false;
         var1[11] = false;
         var1[12] = false;
      }
   }

   private static void id_try() {
      Object[] var0 = new Object[]{false, false, new rrAo_1()};
      id_class = var0;
   }

   private static void id_while() {
      id_byte = new byte[]{2, 13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 3};
   }

   private static void id_public() {
      id_catch = new float[]{-90.0F, 90.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public boolean id_protected() {
      this.id_throw();
      return (Boolean)this.id_break[11];
   }

   public void id_protected(double var1) {
      this.id_throw();
      Double var7 = var1;
      this.id_break[1] = var7;
   }

   public void id_protected(boolean var1) {
      this.id_throw();
      Boolean var6 = var1;
      this.id_break[11] = var6;
   }

   public void id_protected(float var1) {
      this.id_throw();
      Float var6 = var1;
      this.id_break[9] = var6;
   }

   public boolean id_private() {
      this.id_throw();
      return (Boolean)this.id_break[12];
   }

   public double id_final() {
      this.id_throw();
      return (Double)this.id_break[4];
   }

   public float id_volatile() {
      this.id_throw();
      return (Float)this.id_break[8];
   }

   public float id_synchronized() {
      this.id_throw();
      return (Float)this.id_break[6];
   }

   public void id_native() {
      this.id_throw();
      Float var5 = rrfN_2.id_class((Float)this.id_break[6]);
      this.id_break[6] = var5;
      Float var6 = rrfN_2.id_class((Float)this.id_break[7]);
      this.id_break[7] = var6;
      Float var7 = rfU_2.id_class((Float)this.id_break[7], -90.0F, 90.0F);
      this.id_break[7] = var7;
   }
}
