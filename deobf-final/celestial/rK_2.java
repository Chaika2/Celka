package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rK_2 implements C_int {
   private static boolean[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static double[] protected_;
   private static float[] throws_;
   private static short[] case_;

   public abstract PX byte_();

   rK_2(rK_2 var1) {
      this.implements_();
      Ps_1 var6 = (Ps_1)var1.class_[0];
      this.class_[0] = var6;
      Pr_1 var7 = ((Pr_1)var1.class_[1]).class_();
      this.class_[1] = var7;
      Double var8 = (Double)var1.class_[2];
      this.class_[2] = var8;
      Double var9 = (Double)var1.class_[3];
      this.class_[3] = var9;
   }

   public rK_2(Ps_1 var1) {
      this.implements_();
      this.class_[0] = var1;
      Pr_1 var7 = new Pr_1();
      this.class_[1] = var7;
   }

   static {
      ntfClinit();
   }

   private float class_(float var1, float var2) {
      float var3 = var2 - var1;
      double var4 = this.break_(var3);
      return var1 + this.class_(var4);
   }

   @Override
   public void class_(int var1) {
      for (int var2 = 0; var2 < var1; var2++) {
         this.break_();
      }
   }

   @Override
   public C_int class_() {
      return new rD_2(this, this);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3234824775722761568L;
   }

   private float class_(float var1) {
      if (var1 < -20.0F) {
         return var1 + 1.0F;
      } else {
         return var1 > 10.0F ? var1 - 1.0F : var1;
      }
   }

   @Override
   public PX class_(PX var1) {
      PX var2 = this.byte_();
      float var3 = var1.throws_();
      float var4 = var1.protected_();
      if (var4 == var2.protected_()) {
         var4 = this.class_(var4);
      }

      var3 += (float)((Double)this.class_[2]).doubleValue();
      var4 += (float)((Double)this.class_[3]).doubleValue();
      return new PX(this.class_(var2.throws_(), var3), this.class_(var2.protected_(), var4)).class_();
   }

   private float class_(double var1) {
      double var3 = ((Qw_1)((Ps_1)this.class_[0]).throws_().class_[20]).class_ * 0.6F + 0.2F;
      return (float)(var1 * var3 * var3 * var3 * 8.0) * 0.15F;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-38, -61, -55, 51, -14, -24, 102, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 805709315;
   }

   @Override
   public PX break_(PX var1) {
      PX var2 = this.class_(var1);
      this.break_();
      return var2;
   }

   @Override
   public void break_() {
      double var1 = (Double)C_class.instanceof_().t.class_[0];
      Double var7 = (((Pr_1)this.class_[1]).byte_() - 0.5) * var1;
      this.class_[2] = var7;
      Double var8 = (((Pr_1)this.class_[1]).byte_() - 0.5) * var1;
      this.class_[3] = var8;
   }

   private double break_(float var1) {
      float var2 = this.class_(1.0);
      return (double)Math.round(var1 / var2);
   }

   private static void throws_() {
      protected_ = new double[]{0.5, 0.5, 1.0, 0.6F, 0.2F, 8.0, 0.0, 0.0};
   }

   private static void catch_() {
      break_ = new boolean[1];
   }

   private static void case_() {
      case_ = new short[]{0, 1, 0, 0, 1, 1, 2, 2, 3, 3, 2, 3, 0, 1, 2, 1, 3, 0, 20};
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[2] = 0.0;
         var1[3] = 0.0;
      }
   }

   private static void protected_() {
      throws_ = new float[]{-20.0F, 1.0F, 10.0F, 1.0F, 0.15F};
   }

   private static void private_() {
      byte_ = new byte[]{4, 2, 3};
   }
}
