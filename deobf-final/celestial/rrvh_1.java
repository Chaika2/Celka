package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvh_1 extends rrtN_2 implements rrZA {
   private static int[] byte_;
   private static byte[] protected_;
   private static boolean[] native_;
   public static Object[] class_;
   public Object[] break_;
   private static float[] volatile_;
   private static String[] final_;
   private static short[] package_;
   private static double[] int_;

   @Override
   public String byte_() {
      this.continue_();
      return ((rrZi_1)this.break_[0]).private_().final_();
   }

   public rrvh_1(rrZi_1 var1, Supplier<Float> var2, Supplier<Float> var3) {
      super(var2, var3, () -> 140.0F, () -> 14.0F);
      this.continue_();
      AnimValue var8 = new AnimValue(0.5F, true).throws_();
      this.break_[3] = var8;
      this.break_[0] = var1;
      rrZH var10 = new rrZH(0.5F);
      this.break_[1] = var10;
      rrZl_1 var11 = new rrZl_1(this, (rrZH)this.break_[1]);
      this.break_[2] = var11;
      this.else_();
      this.switch_();
   }

   static {
      ntfClinit();
   }

   private static void B() {
      final_ = new String[]{new String("ModuleSettingPopUp")};
   }

   private static void S() {
      protected_ = new byte[]{5, -1, -1, 4};
   }

   private static void this_() {
      native_ = new boolean[]{
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
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

   @Override
   public void class_(int var1, int var2, int var3) {
      this.continue_();
      super.class_(var1, var2, var3);
      ((rrZl_1)this.break_[2]).break_(var1, var2, var3);
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, double var4, boolean var6, boolean var7) {
      this.continue_();
      boolean var8 = ((rrZH)this.break_[1]).class_(this.break_(var1, var2, var3), var4, 25.0);
      return !super.class_(var1, var2, var3, var4, var6, var7) && !var8 ? native_[14] : native_[13];
   }

   @Override
   public float class_() {
      return 192.0F;
   }

   @Override
   public float class_(boolean var1) {
      float var2 = 0.0F;

      for (rrtm_3 var5 : this.strictfp_()) {
         var2 += var1 ? var5.class_(var5) : var5.continue_();
      }

      return var2;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-127, 46, -26, -32, -74, 33, -3, -20}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1474399309;
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      this.continue_();
      ((rrZl_1)this.break_[2]).class_(var1, var2, var3, var4, false);
      return super.class_(var1, var2, var3, var4, var5, var6);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5719284113162494025L;
   }

   private float class_(float var1) {
      this.continue_();
      byte var2 = 5;
      return var1 + ((float)var2 - ((AnimValue)this.break_[3]).byte_() * (float)var2);
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.continue_();
      super.class_(var1, var2, var3, var4, var5);
      float var6 = this.default_();
      float var7 = this.abstract_();
      if (!var5) {
         ((rrZH)this.break_[1]).class_(this.class_(true) - 14.0F, (float)((int)this.ao_()) - 28.0F);
      }

      this.interface_().class_(var1, () -> {
         if (!var5) {
            rrfD_2.class_(var1, rrZL.break_, var6 + 1.5F, var7 + 1.5F, 10.5F, 10.0F, -657931);
         }
      }, var2, var3, var4, false, var5);
   }

   @Override
   public void break_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.continue_();
      if (!var5) {
         float var6 = this.default_();
         float var7 = this.abstract_();
         float var8 = this.implements_();
         float var9 = this.ao_();
         if (this.ah_()) {
            this.interface_().class_(var1, () -> rrfD_2.class_(var1, var6, var7 + 15.0F, var8, var9 - 13.0F, 10.0F, 10.0F, 10.0F, 10.0F, -1), false, true);
         }

         for (int var10 = this.strictfp_().size() - 1; var10 >= 0; var10--) {
            rrtm_3 var11 = this.strictfp_().get(var10);
            if (var11.private_().ap_()) {
               var11.this_().class_().class_(var11.finally_().private_());
            }

            var11.class_(((rrZH)this.break_[1]).case_());
            if (!rrtm_3.class_(var11, this)) {
               var11.class_(var1, var2, var3, var4);
            }
         }

         if (this.ah_()) {
            this.interface_().class_(var1, rrfi_3::class_, true, false);
         }

         float var12 = this.class_(true);
         ((AnimValue)this.break_[3]).class_(var12 > 192.0F ? true : native_[12]);
         this.interface_()
            .class_(
               var1,
               () -> {
                  this.continue_();
                  this.interface_().class_(var1, () -> rrfD_2.class_(var1, var6, var7, var8, var9 + 2.0F, 10.0F, 10.0F, 10.0F, 10.0F, -1), false, false);
                  rrvJ.class_(var1, (rrZH)this.break_[1], var6, var7 + 14.0F, var7 + var9 - 21.0F, var8, 25.0F);
                  this.interface_().class_(var1, rrfi_3::class_, true, false);
                  if (((AnimValue)this.break_[3]).case_()) {
                     float var10x = this.class_(var8);
                     ((rrZl_1)this.break_[2])
                        .class_(
                           var1,
                           var2,
                           var6 + var10x - 9.0F,
                           var7 + 20.0F,
                           var3,
                           var4,
                           5.0F,
                           var12 - 10.0F,
                           var9 - 14.0F - 9.0F,
                           false,
                           255.0F * ((AnimValue)this.break_[3]).byte_()
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
      return "ModuleSettingPopUp";
   }

   private void continue_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         Object[] var1 = this.break_;
      }
   }

   private void else_() {
      this.continue_();
      if ((rrZi_1)this.break_[0] != null) {
         for (Setting var2 : ((rrZi_1)this.break_[0]).private_().b()) {
            if (var2 != null) {
               this.class_(new Setting[]{var2});
            }
         }
      }
   }

   @Override
   public float implements_() {
      this.continue_();
      return super.implements_() + (rrZA.super.ah_() ? 10.0F * ((AnimValue)this.break_[3]).byte_() : volatile_[7]);
   }

   private static void package_() {
      int_ = new double[]{25.0};
   }

   private static void super_() {
      volatile_ = new float[]{
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

   private static void throw_() {
      package_ = new short[]{3, 0, 1, 1, 2, 0, 0, 1, 1, 3, 3, 1, 2, 2, 2, 0, 3, 3, 1, 3, 2, 3, 192};
   }

   private static void try_() {
      Object[] var0 = new Object[]{192};
      class_ = var0;
   }

   private static void while_() {
      byte_ = new int[]{-657931};
   }

   @Override
   public boolean protected_() {
      return true;
   }

   @Override
   public void private_() {
      this.continue_();
      super.private_();
      ((rrZl_1)this.break_[2]).private_();
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
      this.continue_();
      boolean var1 = ((AnimValue)this.break_[3]).case_() && this.interface_().class_().P() ? true : native_[20];
      return !rrZA.super.ah_() && !var1 ? native_[22] : native_[21];
   }
}
