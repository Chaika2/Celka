package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrty_3 extends rrtm_3 {
   private static String[] protected_;
   private static short[] throws_;
   private static float[] native_;
   private static byte[] volatile_;
   public Object[] byte_;
   private static boolean[] final_;

   private static void long_() {
      final_ = new boolean[]{true, false, false, false, false, false};
   }

   private static void float_() {
      native_ = new float[]{0.2F, 5.0F, 12.0F, 16.5F, 4.5F, 40.5F, 12.0F, 90.0F, 8.0F, 8.0F, 4.0F, 2.0F, 0.0F, 90.0F, 270.0F, 180.0F};
   }

   public rrty_3(rrtN_2 var1, ButtonSetting var2, float var3, float var4, float var5, float var6) {
      super(var3, var4, var5, var6);
      this.while_();
      rruL var12 = new rruL();
      this.byte_[2] = var12;
      this.byte_[0] = var1;
      this.byte_[1] = var2;
      Supplier var7 = () -> new rji_3(
            (float)ColorHelper.class_(0.0F), (float)ColorHelper.class_(90.0F), (float)ColorHelper.class_(270.0F), (float)ColorHelper.class_(180.0F)
         );
      ((rruL)this.byte_[2])
         .class_(
            new rruF(
                  var1,
                  new rruH(
                        () -> rrZL.extends_,
                        () -> new rjK_2(4.0F, 2.0F),
                        () -> new rjK_2(8.0F, 8.0F),
                        () -> rrZF.d_,
                        ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_(),
                        () -> "Load",
                        () -> {
                           rruv_1 var1x = this.volatile_();
                           return new rjK_2(var1x.break_() + 90.0F, var1x.protected_());
                        },
                        () -> new rjK_2(40.5F, 12.0F),
                        () -> new rjK_2(16.5F, 4.5F),
                        () -> rrZF.d_,
                        var7
                     )
                     .<rrup_1>break_(ClickGuiTheme::class_)
                     .class_(0.2F)
               )
               .class_(
                  () -> {
                     this.while_();
                     ((ButtonSetting)this.byte_[1]).break_().run();
                     ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
                        .class_(
                           new rrtQ_2(
                              ((ButtonSetting)this.byte_[1]).class_().final_(), "Конфиг '" + ((ButtonSetting)this.byte_[1]).throws_() + "' загружен", 1500
                           )
                        );
                  }
               )
         );
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.while_();
      return super.class_(var1, var2, var3, var4, var5) ? ((rruL)this.byte_[2]).class_(var1, var2, var3, var4, false) : final_[5];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4414909475423555842L;
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      super.class_(var1, var2, var3, var4);
      float var5 = this.package_();
      float var6 = this.final_();
      this.private_().interface_().class_(var1, () -> this.break_(var1, var2, var5, var6, var3, var4));
   }

   private void break_(Ml_1 var1, rrtu_3 var2, float var3, float var4, int var5, int var6) {
      this.while_();
      rrZO var7 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_();
      rrtF_2.protected_(var1, this, var7, ((ButtonSetting)this.byte_[1]).throws_(), var3, var4, rrZF.k_, 255);
      ((rruL)this.byte_[2]).class_(var1, var2, var5, var6, false, false);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 595751198;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{52, -51, -83, 109, 73, 115, -50, 113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Setting<Runnable> finally_() {
      this.while_();
      return (ButtonSetting)this.byte_[1];
   }

   private static void instanceof_() {
      throws_ = new short[]{2, 0, 1, 2, 0, 0, 1, 255, 2, 2, 0, 1, 0, 1, 0, 1, 1, 1500};
   }

   private static void throw_() {
      protected_ = new String[]{new String("Load")};
   }

   private void while_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[3];
         Object[] var1 = this.byte_;
      }
   }

   @Override
   public rrtN_2 private_() {
      this.while_();
      return (rrtN_2)this.byte_[0];
   }

   @Override
   public rruv_1 volatile_() {
      this.while_();
      return new rruv_1(this.package_(), this.final_() - 5.0F, ((rrtN_2)this.byte_[0]).implements_(), 12.0F);
   }

   private static void synchronized_() {
      volatile_ = new byte[]{3};
   }
}
