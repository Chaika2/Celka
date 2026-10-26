package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrTC implements C_int, MinecraftAccessor {
   private static boolean[] byte_;
   public static Object[] class_;
   private static short[] protected_;
   public Object[] break_;
   private static byte[] throws_;
   private static double[] case_;
   private static float[] catch_;

   public double byte_() {
      return ((Qw_1)import_.class_[20]).class_;
   }

   public rrTC(rrnF_2 var1) {
      this.implements_();
      Pr_1 var6 = new Pr_1();
      this.break_[1] = var6;
      this.break_[0] = var1;
   }

   rrTC(rrTC var1) {
      this.implements_();
      Pr_1 var6 = ((Pr_1)var1.break_[1]).class_();
      this.break_[1] = var6;
      rrnF_2 var7 = (rrnF_2)var1.break_[0];
      this.break_[0] = var7;
   }

   static {
      ntfClinit();
   }

   private float class_(float var1, float var2) {
      float var3 = var2 - var1;
      double var4 = this.class_(var3);
      return var1 + this.class_(var4);
   }

   @Override
   public void class_(int var1) {
      for (int var2 = 0; var2 < var1; var2++) {
         this.break_();
      }
   }

   private float class_(double var1) {
      double var3 = this.byte_() * 0.6F + 0.2F;
      return (float)(var1 * var3 * var3 * var3 * 8.0) * 0.15F;
   }

   @Override
   public C_int class_() {
      return new rrTl_1(this, this);
   }

   @Override
   public PX class_(PX var1) {
      rrTf_1 var2 = ((rrnF_2)this.break_[0]).aL_();
      PX var3 = this.throws_();
      float var4 = var3.throws_();
      float var5 = var3.protected_();
      float var6 = var1.throws_();
      float var7 = var1.protected_();
      float var8 = ((rrnF_2)this.break_[0]).break_();
      float var9 = ((rrnF_2)this.break_[0]).private_();
      if (var8 != -1.0F) {
         var6 = ((rrnF_2)this.break_[0]).aA_().process(var4, var6, var8);
      }

      if (var9 != -1.0F) {
         var7 = ((rrnF_2)this.break_[0]).aE_().process(var5, var7, var9);
      }

      if (var2 != null) {
         PX var10 = var2.processRandom(var3, new PX(var6, var7));
         var6 = var10.throws_();
         var7 = var10.protected_();
      }

      var6 = (Float)((cb_3)import_.class_[57]).throws_[15] + rfU_2.catch_(var6 - (Float)((cb_3)import_.class_[57]).throws_[15]);
      float var13 = this.class_(var4, var4 + rfU_2.catch_(var6 - var4));
      float var11 = this.class_(var5, var7);
      return new PX(var13, var11).class_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1945552562075482507L;
   }

   private double class_(float var1) {
      float var2 = this.class_(1.0);
      return (double)Math.round(var1 / var2);
   }

   @Override
   public void break_() {
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1095389317;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-42, 94, 41, 9, -50, 23, -113, -90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public PX break_(PX var1) {
      PX var2 = this.class_(var1);
      this.break_();
      return var2;
   }

   public abstract PX throws_();

   private static void finally_() {
      Object[] var0 = new Object[]{0.0F};
      class_ = var0;
   }

   private static void catch_() {
      protected_ = new short[]{1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 57, 15, 57, 15, 20, 1};
   }

   private static void extends_() {
      case_ = new double[]{1.0, 0.6F, 0.2F, 8.0};
   }

   private static void case_() {
      throws_ = new byte[]{2};
   }

   private void implements_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   public Pr_1 protected_() {
      return (Pr_1)this.break_[1];
   }

   private static void private_() {
      byte_ = new boolean[]{false, true, false};
   }

   private static void native_() {
      catch_ = new float[]{-1.0F, -1.0F, 0.15F, -1.0F};
   }
}
