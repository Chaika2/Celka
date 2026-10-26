package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrtw_3 extends rrtt_3 implements rrtL_2 {
   private static byte[] throws_;
   private static short[] native_;
   private static boolean[] volatile_;
   private static float[] final_;
   public Object[] protected_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{37, 53, -116, 106, 32, -114, -12, -38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrtw_3(rrtN_2 var1, rrtf_3<?> var2, float var3, float var4, float var5, float var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.instanceof_();
      rrtv_3 var11 = new rrtv_3(0.5F, false);
      this.protected_[1] = var11;
      rrtI_2 var12 = new rrtI_2(this);
      this.protected_[0] = var12;
   }

   static {
      ntfClinit();
   }

   private static void interface_() {
      final_ = new float[]{0.5F, 2.5F, 0.0F, 0.0F, 90.0F, 270.0F, 180.0F, 2.0F, 2.0F, 4.0F, 4.0F, 2.0F, 1.0F, 1.0F, 10.0F};
   }

   @Override
   public boolean class_() {
      this.instanceof_();
      return (Boolean)this.protected_[3];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2743466766927169627L;
   }

   public static void class_(Ml_1 var0, rrtm_3 var1, float var2, float var3, float var4, float var5) {
      int var6 = var1.class_(255);
      int var7 = ColorHelper.class_(0.0F);
      int var8 = ColorHelper.class_(90.0F);
      int var9 = ColorHelper.class_(270.0F);
      int var10 = ColorHelper.class_(180.0F);
      if (ClickGuiTheme.class_()) {
         rrtF_2.class_(var0, var2 - 2.0F, var3 - 2.0F, var4 + 4.0F, var5 + 4.0F, 6, var8, Math.min(var6, 100));
      }

      rrtF_2.class_(var0, var2, var3, var4, var5, 2.0F, var7, var8, var9, var10, var6);
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      super.class_(var1, var2, var3, var4);
      this.return_().class_(this.class_());
      float var5 = this.package_();
      float var6 = this.final_();
      rruv_1 var7 = this.volatile_();
      this.class_(var7.break_(), var7.protected_(), var7.byte_(), var7.class_(), var3, var4);
      this.private_().interface_().class_(var1, () -> this.class_(var1, var5, var6, var3, var4));
   }

   public float class_(float var1, float var2) {
      AnimValue var3 = this.return_();
      int var4 = this.synchronized_().class_().size();
      float var5 = var3.case_() ? (float)var4 * var1 - var2 : final_[2];
      return var5 * var3.byte_();
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4) {
      this.instanceof_();
      super.class_(var1, var2, var3, var4);
      this.class_(false);
      return ((rrtI_2)this.protected_[0]).class_(var1, var2, var3, var4);
   }

   private void class_(Ml_1 var1, float var2, float var3, int var4, int var5) {
      this.instanceof_();
      rrtF_2.protected_(
         var1,
         this,
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_(),
         this.synchronized_().break_().throws_(),
         var2,
         var3 + 2.5F,
         rrZF.k_,
         255
      );
      ((rrtI_2)this.protected_[0]).class_(var1, var4, var5);
   }

   public abstract void class_(Ml_1 var1, rrtI_2 var2, int var3, int var4);

   public void class_(Ml_1 var1) {
      rrfi_3.class_();
      var1.break_();
   }

   @Override
   public void class_(boolean var1) {
      this.instanceof_();
      Boolean var6 = var1;
      this.protected_[3] = var6;
   }

   public boolean class_(float var1, float var2, float var3, float var4, int var5, int var6) {
      this.instanceof_();
      boolean var10001 = (float)var5 >= var1 && (float)var5 <= var1 + var3 && (float)var6 >= var2 && (float)var6 <= var2 + var4 ? true : volatile_[4];
      Boolean var11 = (float)var5 >= var1 && (float)var5 <= var1 + var3 && (float)var6 >= var2 && (float)var6 <= var2 + var4 ? true : volatile_[4];
      this.protected_[2] = var11;
      return var10001;
   }

   public void class_(Ml_1 var1, float var2, float var3, float var4, float var5) {
      MT.transient_();
      rrfi_3.break_();
      rrfD_2.protected_(var1, var2, var3, var4, var5, -1);
      rrfi_3.class_(1);
   }

   public abstract boolean class_(rrtu_3 var1, rrtI_2 var2, float var3, float var4, int var5, int var6, int var7);

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.instanceof_();
      if (!super.class_(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         rruv_1 var6 = this.volatile_();
         return ((rrtI_2)this.protected_[0]).class_(var1, var6.break_(), var6.protected_(), var2, var3, var4);
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1183800247;
   }

   public rrtI_2 goto_() {
      this.instanceof_();
      return (rrtI_2)this.protected_[0];
   }

   @Override
   public boolean implements_() {
      this.instanceof_();
      return (Boolean)this.protected_[2];
   }

   private void instanceof_() {
      if (this.protected_ == null) {
         this.protected_ = new Object[4];
         Object[] var1 = this.protected_;
         var1[2] = false;
         var1[3] = false;
      }
   }

   public AnimValue return_() {
      this.instanceof_();
      return ((rrtv_3)this.protected_[1]).class_();
   }

   @Override
   public float super_() {
      this.instanceof_();
      return ((rrtI_2)this.protected_[0]).class_() - 10.0F;
   }

   private static void throw_() {
      throws_ = new byte[]{6, 100, -1, 4, 2, 3};
   }

   private static void try_() {
      volatile_ = new boolean[]{false, false, false, true, false, true, false, false};
   }

   private static void while_() {
      native_ = new short[]{1, 0, 0, 0, 255, 0, 0, 2, 255, 0, 0, 0, 2, 0, 0, 1, 3, 3};
   }

   public abstract float public_();

   @Override
   public rruv_1 volatile_() {
      this.instanceof_();
      return new rruv_1(((rrtI_2)this.protected_[0]).break_(), this.final_(), ((rrtI_2)this.protected_[0]).throws_(), ((rrtI_2)this.protected_[0]).class_())
         .class_(1.0F, 1.0F);
   }
}
