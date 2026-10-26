package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtC_2 extends rrtm_3 {
   private static boolean[] protected_;
   private static byte[] throws_;
   private static short[] native_;
   public Object[] byte_;
   private static float[] volatile_;

   public rrtC_2(rrtN_2 var1, GroupSetting var2, float var3, float var4, float var5, float var6) {
      super(var3, var4, var5, var6);
      this.return_();
      this.byte_[0] = var1;
      this.byte_[1] = var2;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3813375382009093668L;
   }

   private void class_(Ml_1 var1, rrZO var2, String var3, float var4, float var5, float var6, float var7, int var8) {
      float var9 = var2.break_(var3);
      float var10 = var9 / 2.0F;
      rrtF_2.class_(var1, var4, var5 + 1.5F, var6, 0.5F, ColorHelper.break_((Integer)rrZI.break_[4], 0.7F), var8);
      rrtF_2.class_(var1, var4 + var6 / 2.0F - var10 - 5.0F, var5 - 0.5F, var9 + 10.0F, (float)var2.class_(), rrZF.n_, var8);
      rrtF_2.class_(var1, this, var2, var3, var4 + var6 / 2.0F - var10, var5, 15, var8, false);
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      this.return_();
      super.class_(var1, var2, var3, var4);
      rrZO var5 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).throws_();
      String var6 = ((GroupSetting)this.byte_[1]).throws_();
      float var7 = this.package_();
      float var8 = this.final_();
      float var9 = this.new_();
      float var10 = this.continue_();
      int var11 = this.class_(255);
      this.private_().interface_().class_(var1, () -> this.class_(var1, var5, var6, var7, var8, var9, var10, var11));
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{36, -57, -9, -122, 103, -128, -113, 52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 160416314;
   }

   @Override
   public Setting<?> finally_() {
      this.return_();
      return (GroupSetting)this.byte_[1];
   }

   private static void goto_() {
      native_ = new short[]{0, 1, 0, 1, 255, 4, 0, 1};
   }

   private void return_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[2];
         Object[] var1 = this.byte_;
      }
   }

   private static void while_() {
      volatile_ = new float[]{2.0F, 1.5F, 0.5F, 0.7F, 2.0F, 5.0F, 0.5F, 10.0F, 2.0F, 5.0F, 5.0F};
   }

   private static void public_() {
      throws_ = new byte[]{15, 2};
   }

   @Override
   public rrtN_2 private_() {
      this.return_();
      return (rrtN_2)this.byte_[0];
   }

   @Override
   public rruv_1 volatile_() {
      return new rruv_1(this.package_(), this.final_() - 5.0F, this.new_(), this.continue_() - 5.0F);
   }

   private static void synchronized_() {
      protected_ = new boolean[1];
   }
}
