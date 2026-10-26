package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvM extends rrtN_2 implements rrZA {
   private static short[] byte_;
   private static float[] protected_;
   private static double[] native_;
   public Object[] class_;
   public static Object[] break_;
   private static int[] volatile_;
   private static boolean[] final_;
   private static byte[] package_;
   private static String[] int_;

   @Override
   public String byte_() {
      this.throw_();
      return ((rrZY)this.class_[0]).break_().case_();
   }

   public rrvM(rrZY var1, Supplier<Float> var2, Supplier<Float> var3) {
      super(var2, var3, () -> 140.0F, () -> 14.0F);
      this.throw_();
      AnimValue var8 = new AnimValue(0.5F, true).throws_();
      this.class_[3] = var8;
      this.class_[0] = var1;
      rrZH var10 = new rrZH(0.5F);
      this.class_[1] = var10;
      rrZl_1 var11 = new rrZl_1(this, (rrZH)this.class_[1]);
      this.class_[2] = var11;
      this.else_();
      this.switch_();
   }

   static {
      ntfClinit();
   }

   private static void B() {
      package_ = new byte[]{5, -1, -1, 4};
   }

   private static void this_() {
      protected_ = new float[]{
         0.5F,
         0.5F,
         14.0F,
         28.0F,
         192.0F,
         192.0F,
         10.0F,
         0.0F,
         192.0F,
         0.0F,
         0.0F,
         2.0F,
         192.0F,
         10.0F,
         14.0F,
         21.0F,
         25.0F,
         9.0F,
         20.0F,
         5.0F,
         10.0F,
         14.0F,
         9.0F,
         255.0F,
         2.0F,
         10.0F,
         10.0F,
         10.0F,
         10.0F,
         15.0F,
         13.0F,
         10.0F,
         10.0F,
         10.0F,
         10.0F,
         1.5F,
         1.5F,
         10.5F,
         10.0F,
         14.0F,
         140.0F
      };
   }

   private static void s() {
      final_ = new boolean[]{
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false
      };
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{1, 51, -100, 79, -102, -108, 30, -34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      this.throw_();
      ((rrZl_1)this.class_[2]).class_(var1, var2, var3, var4, false);
      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   private float class_(float var1) {
      this.throw_();
      byte var2 = 5;
      return var1 + ((float)var2 - ((AnimValue)this.class_[3]).byte_() * (float)var2);
   }

   @Override
   public float class_() {
      return 192.0F;
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.throw_();
      super.class_(var1, var2, var3, var4, var5);
      float var6 = this.default_();
      float var7 = this.abstract_();
      if (!var5) {
         ((rrZH)this.class_[1]).class_(this.class_(true) - 14.0F, (float)((int)this.ao_()) - 28.0F);
      }

      this.interface_().class_(var1, () -> {
         if (!var5) {
            rrfD_2.class_(var1, rrZL.break_, var6 + 1.5F, var7 + 1.5F, 10.5F, 10.0F, -657931);
         }
      }, var2, var3, var4, true, var5);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7544597634608847112L;
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, double var4, boolean var6, boolean var7) {
      this.throw_();
      boolean var8 = ((rrZH)this.class_[1]).class_(this.break_(var1, var2, var3), var4, 25.0);
      return !super.class_(var1, var2, var3, var4, var6, var7) && !var8 ? final_[14] : final_[13];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1346067524;
   }

   @Override
   public void class_(int var1, int var2, int var3) {
      this.throw_();
      super.class_(var1, var2, var3);
      ((rrZl_1)this.class_[2]).break_(var1, var2, var3);
   }

   @Override
   public float class_(boolean var1) {
      float var2 = 0.0F;

      for (rrtm_3 var5 : this.strictfp_()) {
         var2 += var1 ? var5.class_(var5) : var5.continue_();
      }

      return var2;
   }

   @Override
   public void break_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.throw_();
      if (!var5) {
         float var6 = this.class_(true);
         ((AnimValue)this.class_[3]).class_(var6 > 192.0F ? true : final_[7]);
         float var7 = this.default_();
         float var8 = this.abstract_();
         float var9 = this.implements_();
         float var10 = this.ao_();
         if (this.ah_()) {
            this.interface_().class_(var1, () -> rrfD_2.class_(var1, var7, var8 + 15.0F, var9, var10 - 13.0F, 10.0F, 10.0F, 10.0F, 10.0F, -1), false, true);
         }

         for (int var11 = this.strictfp_().size() - 1; var11 >= 0; var11--) {
            rrtm_3 var12 = this.strictfp_().get(var11);
            if (var12.private_().ap_()) {
               var12.this_().class_().class_(var12.finally_().private_());
            }

            var12.class_(((rrZH)this.class_[1]).case_());
            if (!rrtm_3.class_(var12, this)) {
               var12.class_(var1, var2, var3, var4);
            }
         }

         if (this.ah_()) {
            this.interface_().class_(var1, rrfi_3::class_, true, false);
         }

         this.interface_()
            .class_(
               var1,
               () -> {
                  this.throw_();
                  this.interface_().class_(var1, () -> rrfD_2.class_(var1, var7, var8, var9, var10 + 2.0F, 10.0F, 10.0F, 10.0F, 10.0F, -1), false, false);
                  rrvJ.class_(var1, (rrZH)this.class_[1], var7, var8 + 14.0F, var8 + var10 - 21.0F, var9, 25.0F);
                  this.interface_().class_(var1, rrfi_3::class_, true, false);
                  if (((AnimValue)this.class_[3]).case_()) {
                     float var10x = this.class_(var9);
                     ((rrZl_1)this.class_[2])
                        .class_(
                           var1,
                           var2,
                           var7 + var10x - 9.0F,
                           var8 + 20.0F,
                           var3,
                           var4,
                           5.0F,
                           var6 - 10.0F,
                           var10 - 14.0F - 9.0F,
                           false,
                           255.0F * ((AnimValue)this.class_[3]).byte_()
                        );
                  }
               }
            );
      }
   }

   public float finally_() {
      float var1 = 0.0F;

      for (rrtm_3 var4 : this.strictfp_()) {
         var1 += var4.class_(var4);
      }

      return Math.min(var1 - 2.0F, 192.0F) + 10.0F;
   }

   @Override
   public String catch_() {
      return "AutoBuySettingPopUp";
   }

   private static void continue_() {
      int_ = new String[]{new String("AutoBuySettingPopUp")};
   }

   private void else_() {
      this.throw_();
      if ((rrZY)this.class_[0] != null) {
         rrNd_1 var1 = ((rrZY)this.class_[0]).break_();

         for (Setting var3 : var1.b()) {
            if (var3 != null) {
               this.class_(new Setting[]{var3});
            }
         }
      }
   }

   @Override
   public float implements_() {
      this.throw_();
      return super.implements_() + (rrZA.super.ah_() ? 10.0F * ((AnimValue)this.class_[3]).byte_() : protected_[7]);
   }

   private static void return_() {
      byte_ = new short[]{3, 0, 1, 1, 2, 0, 0, 1, 3, 1, 3, 1, 2, 2, 2, 0, 3, 3, 1, 3, 2, 3, 192};
   }

   private static void super_() {
      native_ = new double[]{25.0};
   }

   private void throw_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }

   private static void try_() {
      Object[] var0 = new Object[]{192};
      break_ = var0;
   }

   private static void while_() {
      volatile_ = new int[]{-657931};
   }

   @Override
   public boolean protected_() {
      return true;
   }

   @Override
   public void private_() {
      this.throw_();
      super.private_();
      ((rrZl_1)this.class_[2]).private_();
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public float ao_() {
      return this.class_(true) > 192.0F ? this.finally_() : super.ao_();
   }

   @Override
   public boolean ah_() {
      this.throw_();
      boolean var1 = ((AnimValue)this.class_[3]).case_() && this.interface_().class_().P() ? true : final_[20];
      return !rrZA.super.ah_() && !var1 ? final_[22] : final_[21];
   }
}
