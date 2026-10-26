package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAo_1 extends Om_1 {
   private static byte[] byte_;
   private static boolean[] protected_;
   private static short[] throws_;
   private static double[] case_;
   private static float[] catch_;
   public static Object[] class_;
   public Object[] break_;

   public void byte_(boolean var1) {
      this.throw_();
      Boolean var6 = var1;
      this.break_[12] = var6;
   }

   public void byte_(double var1) {
      this.throw_();
      Double var7 = var1;
      this.break_[0] = var7;
   }

   public void byte_(float var1) {
      this.throw_();
      Float var6 = var1;
      this.break_[7] = var6;
   }

   public float int_() {
      this.throw_();
      return (Float)this.break_[9];
   }

   public rrAo_1() {
      this.throw_();
   }

   static {
      ntfClinit();
   }

   public float this_() {
      this.throw_();
      return Math.abs((Float)this.break_[6] - (Float)this.break_[8]);
   }

   public void class_(PX var1) {
      this.throw_();
      if (!(Boolean)class_[1]) {
         Float var6 = var1.throws_();
         this.break_[6] = var6;
         Float var7 = var1.protected_();
         this.break_[7] = var7;
         Boolean var8 = true;
         class_[0] = var8;
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-66, -5, -36, 10, -61, 31, -58, 8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public double class_() {
      this.throw_();
      return (Double)this.break_[3];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2780419608273777496L;
   }

   public static rrAo_1 class_(
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
      rrAo_1 var19 = break_(var0, var2, var4, var6, var8, var10, var12, var13, var14, var15, var16, var17, var18);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var19);
      return var19;
   }

   public void class_(float var1) {
      this.throw_();
      Float var6 = var1;
      this.break_[6] = var6;
   }

   public void class_(double var1) {
      this.throw_();
      Double var7 = var1;
      this.break_[5] = var7;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1736858363;
   }

   public void break_(boolean var1) {
      this.throw_();
      Boolean var6 = var1;
      this.break_[10] = var6;
   }

   public void break_(float var1) {
      this.throw_();
      Float var6 = var1;
      this.break_[8] = var6;
   }

   public double break_() {
      this.throw_();
      return (Double)this.break_[2];
   }

   public void break_(double var1) {
      this.throw_();
      Double var7 = var1;
      this.break_[2] = var7;
   }

   private static rrAo_1 break_(
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
      rrAo_1 var10000 = (rrAo_1)class_[2];
      Double var23 = var0;
      var10000.break_[0] = var23;
      var10000 = (rrAo_1)class_[2];
      Double var24 = var2;
      var10000.break_[1] = var24;
      var10000 = (rrAo_1)class_[2];
      Double var25 = var4;
      var10000.break_[2] = var25;
      var10000 = (rrAo_1)class_[2];
      Double var26 = var6;
      var10000.break_[3] = var26;
      var10000 = (rrAo_1)class_[2];
      Double var27 = var8;
      var10000.break_[4] = var27;
      var10000 = (rrAo_1)class_[2];
      Double var28 = var10;
      var10000.break_[5] = var28;
      var10000 = (rrAo_1)class_[2];
      Float var29 = var12;
      var10000.break_[6] = var29;
      var10000 = (rrAo_1)class_[2];
      Float var30 = var13;
      var10000.break_[7] = var30;
      var10000 = (rrAo_1)class_[2];
      Float var31 = var14;
      var10000.break_[8] = var31;
      var10000 = (rrAo_1)class_[2];
      Float var32 = var15;
      var10000.break_[9] = var32;
      var10000 = (rrAo_1)class_[2];
      Boolean var33 = var16;
      var10000.break_[10] = var33;
      var10000 = (rrAo_1)class_[2];
      Boolean var34 = var17;
      var10000.break_[11] = var34;
      var10000 = (rrAo_1)class_[2];
      Boolean var35 = var18;
      var10000.break_[12] = var35;
      ((rrAo_1)class_[2]).class_(false);
      Boolean var36 = false;
      class_[0] = var36;
      return (rrAo_1)class_[2];
   }

   public void throws_(double var1) {
      this.throw_();
      Double var7 = var1;
      this.break_[4] = var7;
   }

   public float throws_() {
      this.throw_();
      return Math.abs((Float)this.break_[7] - (Float)this.break_[9]);
   }

   public PX finally_() {
      this.throw_();
      return new PX((Float)this.break_[6], (Float)this.break_[7]);
   }

   public double catch_() {
      this.throw_();
      return (Double)this.break_[1];
   }

   public boolean extends_() {
      this.throw_();
      return (Boolean)this.break_[10];
   }

   private static void goto_() {
      case_ = new double[6];
   }

   public void case_(double var1) {
      this.throw_();
      Double var7 = var1;
      this.break_[3] = var7;
   }

   public double case_() {
      this.throw_();
      return Math.abs((Double)this.break_[2] - (Double)this.break_[5]);
   }

   public float continue_() {
      this.throw_();
      return (Float)this.break_[7];
   }

   public double else_() {
      this.throw_();
      return Math.abs((Double)this.break_[1] - (Double)this.break_[4]);
   }

   public boolean implements_() {
      this.throw_();
      return this.break_[6] == this.break_[8] && this.break_[7] == this.break_[9] ? protected_[4] : protected_[3];
   }

   private static void instanceof_() {
      protected_ = new boolean[]{false, false, true, true, false, false, true, false, false, false, false, false, true, false};
   }

   public double new_() {
      this.throw_();
      return Math.abs((Double)this.break_[0] - (Double)this.break_[3]);
   }

   public double package_() {
      this.throw_();
      return (Double)this.break_[0];
   }

   private static void return_() {
      throws_ = new short[]{
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

   public double super_() {
      this.throw_();
      return (Double)this.break_[5];
   }

   private void throw_() {
      if (this.break_ == null) {
         this.break_ = new Object[13];
         Object[] var1 = this.break_;
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

   private static void try_() {
      Object[] var0 = new Object[]{false, false, new rrAo_1()};
      class_ = var0;
   }

   private static void while_() {
      byte_ = new byte[]{2, 13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 3};
   }

   private static void public_() {
      catch_ = new float[]{-90.0F, 90.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public boolean protected_() {
      this.throw_();
      return (Boolean)this.break_[11];
   }

   public void protected_(double var1) {
      this.throw_();
      Double var7 = var1;
      this.break_[1] = var7;
   }

   public void protected_(boolean var1) {
      this.throw_();
      Boolean var6 = var1;
      this.break_[11] = var6;
   }

   public void protected_(float var1) {
      this.throw_();
      Float var6 = var1;
      this.break_[9] = var6;
   }

   public boolean private_() {
      this.throw_();
      return (Boolean)this.break_[12];
   }

   public double final_() {
      this.throw_();
      return (Double)this.break_[4];
   }

   public float volatile_() {
      this.throw_();
      return (Float)this.break_[8];
   }

   public float synchronized_() {
      this.throw_();
      return (Float)this.break_[6];
   }

   public void native_() {
      this.throw_();
      Float var5 = rrfN_2.class_((Float)this.break_[6]);
      this.break_[6] = var5;
      Float var6 = rrfN_2.class_((Float)this.break_[7]);
      this.break_[7] = var6;
      Float var7 = rfU_2.class_((Float)this.break_[7], -90.0F, 90.0F);
      this.break_[7] = var7;
   }
}
