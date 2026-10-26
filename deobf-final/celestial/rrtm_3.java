package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrtm_3 implements MinecraftAccessor, rrtc_3, rrwf_3 {
   private static int[] byte_;
   private static byte[] protected_;
   private static float[] throws_;
   public static Object[] class_;
   public Object[] break_;
   private static short[] native_;
   private static boolean[] volatile_;

   private void byte_(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
   }

   public float byte_() {
      return (Float)this.break_[4];
   }

   public void byte_(int var1, int var2, int var3) {
   }

   public float int_() {
      return ((rrtv_3)this.break_[5]).class_().byte_();
   }

   public rrtm_3(float var1, float var2, float var3, float var4) {
      this(var1, var2);
      Float var9 = var3;
      this.break_[2] = var9;
      Float var10 = var4;
      this.break_[3] = var10;
   }

   public rrtm_3(float var1, float var2) {
      this.return_();
      rrtv_3 var7 = new rrtv_3(0.5F, false);
      this.break_[5] = var7;
      rrtv_3 var8 = new rrtv_3(0.4F, false);
      this.break_[6] = var8;
      Float var9 = var1;
      this.break_[0] = var9;
      Float var10 = var2;
      this.break_[1] = var10;
   }

   static {
      ntfClinit();
   }

   public rrtv_3 this_() {
      return (rrtv_3)this.break_[5];
   }

   public int class_(int var1) {
      return (int)((float)var1 * this.int_());
   }

   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      if (!this.private_().P()) {
         return false;
      } else if ((float)var3 < this.private_().abstract_() + 5.0F && this.volatile_().break_((float)var2, (float)var3)) {
         this.class_(var1, var2, var3, var4);
         return false;
      } else {
         return volatile_[4];
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{90, 31, 95, -86, 34, 97, 103, 48}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3923469962346456546L;
   }

   public float class_(rrtm_3 var1) {
      rrtN_2 var2 = this.private_();
      float var3 = var2.interface_().byte_() && !var2.P() ? 1.0F : var1.int_();
      return (var1.continue_() + 0.0F) * var3;
   }

   public boolean class_(float var1, float var2, float var3) {
      return var1 >= this.package_() && var1 <= this.package_() + this.new_() && var2 >= this.final_() && var2 <= this.final_() + var3 ? true : volatile_[11];
   }

   public boolean class_(rrtu_3 var1, int var2, int var3, int var4) {
      return false;
   }

   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      if (!this.private_().ap_()) {
         ((rrtv_3)this.break_[5]).class_().class_(this.finally_().private_());
      }
   }

   public void class_(float var1) {
      Float var6 = var1;
      this.break_[4] = var6;
   }

   public static boolean class_(rrtm_3 var0, rrtN_2 var1) {
      float var2 = var0.final_();
      float var3 = var1.abstract_();
      float var4 = var1.ao_();
      float var5 = var0.class_(var0);
      float var6 = var0.super_();
      byte var7 = 20;
      return !(var2 + var5 + var6 < var3 + (float)var7) && !(var2 > var3 + var4 + (float)var7) ? volatile_[15] : volatile_[14];
   }

   public boolean class_(char var1, int var2) {
      return false;
   }

   public void class_(int var1, int var2, int var3) {
   }

   public int class_(int var1, AnimValue var2) {
      return (int)((float)var1 * var2.byte_());
   }

   public void break_() {
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1359720828;
   }

   public void break_(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      this.byte_(var1, var2, var3, var4);
   }

   public boolean break_(int var1, int var2, int var3) {
      return var3 == 0 ? true : volatile_[6];
   }

   public void break_(float var1) {
      Float var6 = var1;
      this.break_[1] = var6;
   }

   public boolean throws_() {
      return !this.finally_().private_() && !(this.int_() > 0.0F) ? volatile_[13] : volatile_[12];
   }

   public void catch_() {
   }

   public void extends_() {
   }

   private static void goto_() {
      protected_ = new byte[]{20, 7, 2, 3, 4};
   }

   public void case_() {
   }

   public float continue_() {
      return (Float)this.break_[3];
   }

   public void else_() {
   }

   public boolean implements_() {
      return false;
   }

   private static void instanceof_() {
      native_ = new short[]{5, 6, 0, 1, 2, 3, 5, 0, 1, 4, 1, 2, 3, 5, 5, 4, 4, 5};
   }

   public float new_() {
      return (Float)this.break_[2];
   }

   public float package_() {
      return this.private_().default_() + (Float)this.break_[0];
   }

   private void return_() {
      if (this.break_ == null) {
         this.break_ = new Object[7];
         Object[] var1 = this.break_;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
         var1[4] = 0.0F;
      }
   }

   public float super_() {
      return 0.0F;
   }

   private static void try_() {
      volatile_ = new boolean[]{
         false, false, false, false, true, true, false, false, false, false, true, false, true, false, true, false, false, true, true, false
      };
   }

   private static void while_() {
      throws_ = new float[]{0.5F, 0.4F, 5.0F, 22.0F, 0.0F, 0.6F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void public_() {
      byte_ = new int[]{6781311};
   }

   public List<? extends rrtn_3> protected_() {
      return Collections.emptyList();
   }

   public abstract rrtN_2 private_();

   public float final_() {
      rrtN_2 var1 = this.private_();
      float var2 = 22.0F;

      for (rrtm_3 var4 : this.private_().strictfp_()) {
         if (var4.throws_()) {
            var4.break_(var2);
            var2 += this.class_(var4);
         }
      }

      float var5 = !var1.P() && var1.interface_().byte_() ? 0.0F : this.continue_() * 0.6F * (1.0F - this.int_());
      return var1.abstract_() + ((Float)this.break_[1] - var5) + (Float)this.break_[4];
   }

   public abstract rruv_1 volatile_();

   private static void synchronized_() {
      Object[] var0 = new Object[]{6781311};
      class_ = var0;
   }

   public void native_() {
      ((rrtv_3)this.break_[5]).class_().extends_();
   }

   public void aP_() {
   }
}
