package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtl_3 extends rrtm_3 {
   private static float[] protected_;
   private static boolean[] throws_;
   private static short[] native_;
   private static int[] volatile_;
   public Object[] byte_;
   private static byte[] final_;

   public rrtl_3(rrtN_2 var1, rrIk_1 var2, float var3, float var4, float var5, float var6) {
      super(var3, var4, var5, var6);
      this.goto_();
      rrtv_3 var11 = new rrtv_3(0.6F, false);
      this.byte_[2] = var11;
      this.byte_[0] = var1;
      this.byte_[1] = var2;
   }

   static {
      ntfClinit();
   }

   public static void class_(Ml_1 var0, rrtm_3 var1, rrtv_3 var2, Setting<?> var3, rrZO var4, float var5, float var6, float var7, boolean var8) {
      int var9 = var8 ? ColorHelper.class_(0.0F) : volatile_[0];
      int var10 = var8 ? ColorHelper.class_(90.0F) : volatile_[1];
      int var11 = var8 ? ColorHelper.class_(270.0F) : volatile_[2];
      int var12 = var8 ? ColorHelper.class_(180.0F) : volatile_[3];
      byte var13 = var8 ? -1 : final_[1];
      var2.class_().break_((float)var13);
      float var14 = var2.class_().byte_();
      rrtF_2.class_(var0, var1, var4, var3.throws_(), var5, var6 + 2.5F, rrZF.k_, 255);
      if (ClickGuiTheme.class_()) {
         rrtF_2.class_(var0, var5 + var7 - 17.0F, var6, 17.0F, 8.0F, 6, var9, var1.class_(255));
      }

      rrtF_2.class_(var0, var5 + var7 - 17.0F, var6, 17.0F, 8.0F, 3.5F, var9, var10, var11, var12, var1.class_(255));
      rrtF_2.class_(var0, var1, var5 - 3.0F + var7 - var14 - 2.0F, var6 + 4.0F, 7.5F, rrZF.d_, 255, var1.private_().long_() * rrvk_1.class_());
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.goto_();
      if (var4 == 0 && super.class_(var1, var2, var3, var4, var5)) {
         ((rrIk_1)this.byte_[1]).class_(Boolean.valueOf(!((rrIk_1)this.byte_[1]).class_() ? true : throws_[2]), false, true);
         return true;
      } else {
         return throws_[6];
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2208922259631976299L;
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      this.goto_();
      super.class_(var1, var2, var3, var4);
      float var5 = this.package_();
      float var6 = this.final_();
      float var7 = this.new_();
      boolean var8 = ((rrIk_1)this.byte_[1]).class_();
      this.private_().interface_().class_(var1, () -> this.break_(var1, var5, var6, var7, var8));
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, 96, 50, -44, 22, -47, 75, -72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 992720293;
   }

   private void break_(Ml_1 var1, float var2, float var3, float var4, boolean var5) {
      this.goto_();
      rrZO var6 = ((rrIk_1)this.byte_[1]).break_() == null
         ? ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_()
         : ((rrIk_1)this.byte_[1]).break_();
      class_(var1, this, (rrtv_3)this.byte_[2], (rrIk_1)this.byte_[1], var6, var2, var3, var4, var5);
   }

   @Override
   public Setting<Boolean> finally_() {
      this.goto_();
      return (rrIk_1)this.byte_[1];
   }

   private void goto_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[3];
         Object[] var1 = this.byte_;
      }
   }

   private static void return_() {
      final_ = new byte[]{-1, 8, 6, 3};
   }

   private static void try_() {
      volatile_ = new int[]{6781311, 6781311, 6781311, 6781311};
   }

   private static void while_() {
      native_ = new short[]{2, 0, 1, 1, 1, 0, 1, 2, 1, 255, 255, 255, 255, 1, 1, 0, 1};
   }

   private static void public_() {
      throws_ = new boolean[]{false, true, false, false, true, true, false};
   }

   @Override
   public rrtN_2 private_() {
      this.goto_();
      return (rrtN_2)this.byte_[0];
   }

   @Override
   public rruv_1 volatile_() {
      return new rruv_1(this.package_() + this.new_() - 18.0F, this.final_() - 4.0F, 19.0F, 12.0F);
   }

   private static void synchronized_() {
      protected_ = new float[]{
         0.6F, 0.0F, 90.0F, 270.0F, 180.0F, 2.5F, 17.0F, 17.0F, 8.0F, 17.0F, 17.0F, 8.0F, 3.5F, 3.0F, 2.0F, 4.0F, 7.5F, 18.0F, 4.0F, 19.0F, 12.0F
      };
   }
}
