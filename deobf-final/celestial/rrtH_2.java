package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtH_2 extends rrtm_3 {
   private static byte[] protected_;
   private static float[] throws_;
   private static short[] native_;
   public Object[] byte_;
   private static boolean[] volatile_;

   public rrtH_2(rrtN_2 var1, rrIz_1 var2, float var3, float var4, float var5, float var6) {
      super(var3, var4, var5, var6);
      this.while_();
      this.byte_[0] = var1;
      this.byte_[1] = var2;
      rrvX var13 = new rrvX(this, () -> var3, () -> var4);
      this.byte_[2] = var13;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7842636540898921007L;
   }

   private void class_(Ml_1 var1, float var2, float var3, float var4, int var5) {
      this.while_();
      rruv_1 var6 = this.volatile_();
      rrtF_2.class_(
         var1,
         this,
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_(),
         ((rrIz_1)this.byte_[1]).throws_(),
         var2,
         var3 + 2.5F,
         rrZF.k_,
         255
      );
      RenderSystem.enableAlphaTest();
      if (ClickGuiTheme.class_()) {
         rrtF_2.class_(var1, var2 + var4 - 11.0F, var3 + 0.5F, 12.0F, 7.0F, 6, var5, this.class_((int)(((rrvX)this.byte_[2]).break_() * 150.0F)));
      }

      rrtF_2.class_(
         var1,
         var2 + var4 - 10.0F,
         var3 + 1.5F,
         10.0F,
         5.0F,
         1.0F,
         var5,
         var5,
         ColorHelper.class_(var5, 0.5F),
         ColorHelper.class_(var5, 0.5F),
         this.class_((int)(((rrvX)this.byte_[2]).break_() * 255.0F))
      );
      RenderSystem.disableAlphaTest();
      ((rrvX)this.byte_[2]).class_(var6.break_() + 5.0F);
      ((rrvX)this.byte_[2]).break_(var6.protected_() + 3.0F);
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.while_();
      if (var4 == 1 && super.class_(var1, var2, var3, var4, var5)) {
         if (!((rrvX)this.byte_[2]).interface_().byte_()) {
            float var6 = this.package_() + this.private_().implements_() + 5.0F;
            float var7 = this.final_();
            if (var6 > const_.volatile_() - ((rrvX)this.byte_[2]).implements_()) {
               var6 = this.package_();
            }

            if (var7 + ((rrvX)this.byte_[2]).double_() > const_.final_()) {
               var7 = this.final_() - ((rrvX)this.byte_[2]).double_();
            }

            var1.class_(((rrvX)this.byte_[2]).class_(var6, var7), () -> {
               this.while_();
               ((rrvX)this.byte_[2]).class_(var1);
            });
         }

         return volatile_[1];
      } else {
         return volatile_[2];
      }
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      this.while_();
      super.class_(var1, var2, var3, var4);
      float var5 = this.package_();
      float var6 = this.final_();
      float var7 = this.new_();
      int var8 = ((rrIz_1)this.byte_[1]).byte_();
      this.private_().interface_().class_(var1, () -> this.class_(var1, var5, var6, var7, var8));
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{44, -69, 46, -34, 125, -84, -11, 78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 197262072;
   }

   @Override
   public Setting<Integer> finally_() {
      this.while_();
      return (rrIz_1)this.byte_[1];
   }

   private static void goto_() {
      throws_ = new float[]{2.5F, 11.0F, 0.5F, 12.0F, 7.0F, 150.0F, 10.0F, 1.5F, 10.0F, 5.0F, 1.0F, 0.5F, 0.5F, 255.0F, 5.0F, 3.0F, 5.0F, 11.0F, 12.0F, 8.0F};
   }

   private static void return_() {
      volatile_ = new boolean[]{true, true, false};
   }

   private static void try_() {
      native_ = new short[]{0, 1, 2, 1, 0, 1, 255, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 1, 2};
   }

   private void while_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[3];
         Object[] var1 = this.byte_;
      }
   }

   private static void public_() {
      protected_ = new byte[]{6, 3};
   }

   @Override
   public rrtN_2 private_() {
      this.while_();
      return (rrtN_2)this.byte_[0];
   }

   @Override
   public rruv_1 volatile_() {
      return new rruv_1(this.package_() + this.new_() - 11.0F, this.final_(), 12.0F, 8.0F);
   }

   public rrIz_1 synchronized_() {
      this.while_();
      return (rrIz_1)this.byte_[1];
   }
}
