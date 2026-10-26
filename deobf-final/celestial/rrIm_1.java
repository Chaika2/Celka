package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIm_1 extends Setting<Float> {
   private static byte[] byte_;
   public Object[] break_;
   private static short[] protected_;
   private static boolean[] throws_;
   private static float[] case_;

   public void byte_(BiFunction<rrIm_1, Float, String> var1) {
      this.this_();
      this.break_[5] = var1;
   }

   public boolean int_() {
      this.this_();
      return this.byte_() >= this.break_[1] ? true : throws_[1];
   }

   public rrIm_1(String var1, Float var2, Float var3, Float var4, Float var5) {
      super(var1, var2);
      this.this_();
      Float var10 = var2;
      this.break_[2] = var10;
      Float var11 = var5;
      this.break_[3] = var11;
      Float var12 = var3;
      this.break_[0] = var12;
      Float var13 = var4;
      this.break_[1] = var13;
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.break_ == null) {
         this.break_ = new Object[7];
         Object[] var1 = this.break_;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
         var1[4] = false;
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2082567561;
   }

   public void class_(Float var1, boolean var2, boolean var3) {
      this.this_();
      super.class_(rfU_2.class_(var1, (Float)this.break_[0], (Float)this.break_[1]), var2, var3);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2368810573262168265L;
   }

   public float class_() {
      this.this_();
      return (Float)this.break_[0];
   }

   public rrIm_1 class_(BiFunction<rrIm_1, Float, String> var1) {
      this.this_();
      this.break_[5] = var1;
      return this;
   }

   public rrIm_1 break_(BiFunction<rrIm_1, Float, String> var1) {
      this.this_();
      this.break_[6] = var1;
      return this;
   }

   public BiFunction<rrIm_1, Float, String> break_() {
      this.this_();
      return (BiFunction<rrIm_1, Float, String>)this.break_[6];
   }

   public rrIm_1 finally_() {
      this.this_();
      Boolean var5 = true;
      this.break_[4] = var5;
      return this;
   }

   public float extends_() {
      this.this_();
      return (Float)this.break_[2];
   }

   private static void continue_() {
      case_ = new float[4];
   }

   private static void else_() {
      protected_ = new short[]{2, 3, 0, 1, 0, 1, 1, 5, 6, 4, 0, 1, 2, 3, 4, 5, 6, 5, 6};
   }

   private static void new_() {
      throws_ = new boolean[]{true, false, true, false, true, false};
   }

   public BiFunction<rrIm_1, Float, String> package_() {
      this.this_();
      return (BiFunction<rrIm_1, Float, String>)this.break_[5];
   }

   private static void super_() {
      byte_ = new byte[]{7, 2, 3, 4};
   }

   public void protected_(BiFunction<rrIm_1, Float, String> var1) {
      this.this_();
      this.break_[6] = var1;
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, -10, 127, -38, 122, 48, 114, 43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean final_() {
      this.this_();
      return (Boolean)this.break_[4];
   }

   public float volatile_() {
      this.this_();
      return (Float)this.break_[3];
   }

   public float native_() {
      this.this_();
      return (Float)this.break_[1];
   }
}
