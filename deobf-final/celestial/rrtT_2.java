package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtT_2 extends rrtm_3 implements rrvs_1 {
   private static float[] throws_;
   public static Object[] byte_;
   private static byte[] native_;
   private static String[] volatile_;
   public Object[] protected_;
   private static boolean[] final_;
   private static short[] package_;

   @Override
   public void byte_(int var1, int var2, int var3) {
      this.return_();
      super.byte_(var1, var2, var3);
      if (((rrIF)this.protected_[1]).volatile_() || var1 != 261 && var1 != 256) {
         Boolean var8 = false;
         this.protected_[2] = var8;
      }
   }

   public rrtT_2(rrtN_2 var1, rrIF var2, float var3, float var4, float var5, float var6) {
      super(var3, var4, var5, var6);
      this.return_();
      AnimValue var11 = new AnimValue(0.5F, true);
      this.protected_[4] = var11;
      AnimValue var12 = new AnimValue(0.5F, true);
      this.protected_[5] = var12;
      this.protected_[0] = var1;
      this.protected_[1] = var2;
      ((AnimValue)this.protected_[4]).class_(this.class_(this.instanceof_(), this.class_(((rrIF)this.protected_[1]).finally_())));
      ((AnimValue)this.protected_[5]).class_();
      ((rrvd_1)rrvd_1.staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7[0]).break_(this);
   }

   static {
      ntfClinit();
   }

   private static void interface_() {
      volatile_ = new String[]{new String("?")};
   }

   @Override
   public void class_(int var1, int var2, int var3) {
      this.return_();
      super.class_(var1, var2, var3);
      if ((Boolean)this.protected_[2]) {
         switch (var1) {
            case 256:
            case 261:
               ((rrIF)this.protected_[1]).class_((KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0], false, true);
               break;
            default:
               ((rrIF)this.protected_[1]).class_(rrfC_2.class_(var1), false, true);
         }
      }
   }

   public float class_(rrZO var1, String var2) {
      return var1.break_(var2) + 4.0F;
   }

   private void class_(Ml_1 var1, rrZO var2, rrZO var3, float var4, float var5, float var6, String var7) {
      this.return_();
      rrtF_2.class_(var1, this, var2, ((rrIF)this.protected_[1]).throws_(), var4, var5 + 3.0F, rrZF.k_, 255);
      ((AnimValue)this.protected_[4]).break_(this.class_(var3, var7));
      Float var13 = ((AnimValue)this.protected_[4]).byte_();
      this.protected_[3] = var13;
      boolean var8 = ((AnimValue)this.protected_[4]).protected_();
      ((AnimValue)this.protected_[5]).class_(var8);
      rrtw_3.class_(var1, this, var4 + var6 - (Float)this.protected_[3], var5, (Float)this.protected_[3], 10.0F);
      if (var8) {
         rrtF_2.protected_(
            var1,
            this,
            this.instanceof_(),
            var7,
            var4 + var6 - (Float)this.protected_[3] + 2.0F,
            var5 + 3.0F,
            rrZF.d_,
            (int)(((AnimValue)this.protected_[5]).byte_() * 255.0F)
         );
      }
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      this.return_();
      super.class_(var1, var2, var3, var4);
      rrZO var5 = this.throw_();
      rrZO var6 = this.instanceof_();
      float var7 = this.package_();
      float var8 = this.final_();
      float var9 = this.new_();
      KeyBind var10 = ((rrIF)this.protected_[1]).finally_();
      this.private_().interface_().class_(var1, () -> this.class_(var1, var5, var6, var7, var8, var9, this.class_(var10)));
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4) {
      this.return_();
      super.class_(var1, var2, var3, var4);
      if ((Boolean)this.protected_[2]) {
         ((rrIF)this.protected_[1]).class_(rrfC_2.class_(var4), false, true);
         Boolean var9 = false;
         this.protected_[2] = var9;
      }

      return final_[13];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3218405159159548219L;
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.return_();
      if (var4 == 0 && super.class_(var1, var2, var3, var4, var5)) {
         Boolean var10 = true;
         this.protected_[2] = var10;
         return true;
      } else {
         return final_[9];
      }
   }

   private String class_(KeyBind var1) {
      this.return_();
      return this.protected_[2] ? "?" : var1.break_();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{40, -27, -67, 16, -71, 108, -21, 70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1997779396;
   }

   @Override
   public Setting<?> finally_() {
      this.return_();
      return (rrIF)this.protected_[1];
   }

   private static void goto_() {
      package_ = new short[]{
         4, 5, 0, 1, 4, 1, 5, 0, 1, 1, 255, 4, 4, 3, 4, 5, 3, 3, 3, 5, 2, 1, 0, 1, 1, 261, 256, 2, 2, 2, 1, 2, 2, 2, 0, 3, 3, 1, 2, 1, 1, 2
      };
   }

   @Override
   public void case_() {
      this.return_();
      super.case_();
      Boolean var5 = false;
      this.protected_[2] = var5;
   }

   private rrZO instanceof_() {
      this.return_();
      return ((rrIF)this.protected_[1]).native_();
   }

   private void return_() {
      if (this.protected_ == null) {
         this.protected_ = new Object[6];
         Object[] var1 = this.protected_;
         var1[2] = false;
         var1[3] = 0.0F;
      }
   }

   private rrZO throw_() {
      this.return_();
      return ((rrIF)this.protected_[1]).extends_();
   }

   private static void try_() {
      throws_ = new float[]{0.5F, 0.5F, 3.0F, 10.0F, 2.0F, 3.0F, 255.0F, 10.0F, 4.0F, 0.0F};
   }

   private static void while_() {
      native_ = new byte[]{6, 2, 3, 10};
   }

   private static void public_() {
      Object[] var0 = new Object[]{10};
      byte_ = var0;
   }

   @Override
   public rrtN_2 private_() {
      this.return_();
      return (rrtN_2)this.protected_[0];
   }

   @Override
   public rruv_1 volatile_() {
      this.return_();
      return new rruv_1(this.package_() + this.new_() - (Float)this.protected_[3], this.final_(), (Float)this.protected_[3], 10.0F);
   }

   private static void synchronized_() {
      final_ = new boolean[]{true, true, false, true, false, true, false, true, true, false, false, true, false, false, false, false, false, true, false};
   }

   @Override
   public boolean aO_() {
      this.return_();
      return (Boolean)this.protected_[2];
   }

   @Override
   public void aP_() {
      this.return_();
      super.aP_();
      Boolean var5 = false;
      this.protected_[2] = var5;
   }
}
