package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rruu_1 {
   private static boolean[] break_;
   private static short[] byte_;
   private static float[] protected_;
   private static long[] throws_;
   private static byte[] case_;
   public Object[] class_;

   public rrum_1 byte_() {
      return (rrum_1)this.class_[4];
   }

   public void byte_(float var1) {
      Float var6 = var1;
      this.class_[2] = var6;
   }

   private static void int_() {
      byte_ = new short[]{5, 5, 6, 1, 2, 5, 5, 0, 1, 2, 3, 4, 5, 6, 0, 1, 2, 3, 4};
   }

   public rruu_1() {
      this.package_();
      Float var5 = 0.3F;
      this.class_[5] = var5;
      AnimValue var6 = new AnimValue((Float)this.class_[5], true);
      this.class_[6] = var6;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      protected_ = new float[]{0.3F, 1.0F, 0.2F, 0.0F, 0.0F, 0.0F};
   }

   public void class_(long var1) {
      Long var7 = var1;
      this.class_[3] = var7;
   }

   public <T extends rruu_1> T class_(float var1) {
      Float var6 = var1;
      this.class_[5] = var6;
      return (T)this;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1798350005;
   }

   public void class_(rrum_1 var1) {
      this.class_[4] = var1;
   }

   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
   }

   public abstract Supplier<rjK_2> class_();

   public String class_(String var1) {
      rrum_1 var2 = this.byte_();
      if (var2 != null && this.throws_() > 0L) {
         if ((float)(System.currentTimeMillis() - this.throws_()) > var2.class_()) {
            this.class_(0L);
         }

         return var2.break_();
      } else {
         return var1;
      }
   }

   public void class_(boolean var1) {
      AnimValue var2 = this.case_();
      var2.break_().break_((Float)this.class_[5]);
      var2.class_(var1);
   }

   private static long break_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1086682412161052963L;
   }

   public rruv_1 break_() {
      return this.catch_();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, 0, 52, -7, 25, -107, -41, -57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void break_(float var1) {
      Float var6 = var1;
      this.class_[1] = var6;
   }

   public void break_(boolean var1) {
      Boolean var6 = var1;
      this.class_[0] = var6;
   }

   public long throws_() {
      return (Long)this.class_[3];
   }

   public float finally_() {
      return 1.0F - 0.2F * this.protected_();
   }

   public rruv_1 catch_() {
      rjK_2 var1 = this.class_().get();
      rjK_2 var2 = this.extends_().get();
      return new rruv_1(var1.byte_ + (Float)this.class_[1], var1.protected_ + (Float)this.class_[2], var2.byte_, var2.protected_);
   }

   public abstract Supplier<rjK_2> extends_();

   public AnimValue case_() {
      return (AnimValue)this.class_[6];
   }

   private static void continue_() {
      case_ = new byte[]{7, 2, 3, 5};
   }

   public float implements_() {
      return (Float)this.class_[2];
   }

   private static void new_() {
      throws_ = new long[3];
   }

   private void package_() {
      if (this.class_ == null) {
         this.class_ = new Object[7];
         Object[] var1 = this.class_;
         var1[0] = false;
         var1[1] = 0.0F;
         var1[2] = 0.0F;
         var1[3] = 0L;
         var1[5] = 0.0F;
      }
   }

   private static void super_() {
      break_ = new boolean[]{true, false, false, true};
   }

   public float protected_() {
      return this.case_().byte_();
   }

   public float private_() {
      return (Float)this.class_[1];
   }

   public float final_() {
      return (Float)this.class_[5];
   }

   public boolean volatile_() {
      return this.case_().case_();
   }

   public boolean native_() {
      return (Boolean)this.class_[0];
   }
}
