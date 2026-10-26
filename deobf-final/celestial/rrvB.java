package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvB extends GuiComponent {
   private static byte[] break_;
   private static float[] byte_;
   private static boolean[] protected_;
   private static short[] throws_;
   public Object[] class_;

   private static void int_() {
      byte_ = new float[]{
         0.3F,
         255.0F,
         5.0F,
         5.0F,
         2.5F,
         2.5F,
         8.0F,
         1.0F,
         1.0F,
         6.0F,
         6.0F,
         6.0F,
         6.0F,
         14.0F,
         13.0F,
         11.0F,
         10.0F,
         3.0F,
         3.0F,
         3.0F,
         3.0F,
         5.5F,
         9.0F,
         5.0F,
         18.0F,
         0.0F,
         0.0F
      };
   }

   public rrvB(rrZf_1 var1, rrvP var2, Supplier<Float> var3, Supplier<Float> var4, int var5, int var6) {
      this.volatile_();
      AnimValue var11 = new AnimValue(0.3F, false);
      this.class_[2] = var11;
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[3] = var3;
      this.class_[4] = var4;
      Integer var16 = var5;
      this.class_[7] = var16;
      Integer var17 = var6;
      this.class_[8] = var17;
   }

   static {
      ntfClinit();
   }

   private void class_(Ml_1 var1, float var2, float var3, int var4) {
      this.volatile_();
      String var5 = "#" + Integer.toHexString(((rrvP)this.class_[1]).class_());
      String var6 = "#" + Integer.toHexString(((rrvP)this.class_[1]).break_());
      ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0])
         .implements_()
         .class_(var1, var5 + "\n" + var6, (double)(var2 + 5.0F), (double)(var3 + 18.0F), ColorHelper.break_(rrZF.d_, var4), false, false);
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.volatile_();
      if (var4 == 0 && super.class_(var1, var2, var3, var4, var5)) {
         ((ThemeManager)ThemeManager.staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311[0]).class_((rrvP)this.class_[1]);
         return true;
      } else {
         return protected_[3];
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-55, 59, -22, -78, 39, 24, 108, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4054386035585881662L;
   }

   private void class_(Ml_1 var1, float var2, float var3, int var4, int var5, int var6) {
      this.volatile_();
      float var7 = var2 + (float)var4 - 14.0F;
      float var8 = var3 + (float)var5 - 13.0F;
      rrfD_2.class_(var1, var7, var8, 11.0F, 10.0F, 3.0F, 3.0F, 3.0F, 3.0F, ColorHelper.break_(rrZF.d_, var6));
      ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0])
         .native_()
         .byte_(var1, String.valueOf(((rrvP)this.class_[1]).ordinal() + 1), var7 + 5.5F, var3 + (float)var5 - 9.0F, ColorHelper.break_(rrZF.n_, var6), false);
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
      this.volatile_();
      super.class_(var1, var2, var3, var4, var5, var6, var7);
      float var8 = this.private_();
      float var9 = this.catch_();
      int var10 = this.case_();
      int var11 = this.extends_();
      if (!((rrZf_1)this.class_[0]).extends_().volatile_().long_()) {
         ((AnimValue)this.class_[2])
            .class_(((rrvP)this.class_[1]).equals(((ThemeManager)ThemeManager.staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311[0]).break_()));
      }

      int var12 = (int)(byte_[1] * ((rrZf_1)this.class_[0]).implements_().class_().byte_());
      this.break_(var1, var8, var9, var10, var11, var12);
      ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0])
         .native_()
         .protected_(var1, ((rrvP)this.class_[1]).byte_(), var8 + 5.0F, var9 + 5.0F, ColorHelper.break_(rrZF.d_, var12), false);
   }

   @Override
   public rrZN class_() {
      this.volatile_();
      return (rrZf_1)this.class_[0];
   }

   public void class_(float var1, float var2) {
      this.volatile_();
      Float var7 = var1;
      this.class_[5] = var7;
      Float var8 = var2;
      this.class_[6] = var8;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1686906395;
   }

   public rrvP break_() {
      this.volatile_();
      return (rrvP)this.class_[1];
   }

   private void break_(Ml_1 var1, float var2, float var3, int var4, int var5, int var6) {
      this.volatile_();
      MT.throws_();
      MT.package_();
      int var7 = ((rrvP)this.class_[1]).class_();
      int var8 = ((rrvP)this.class_[1]).class_();
      int var9 = ((rrvP)this.class_[1]).break_();
      int var10 = ((rrvP)this.class_[1]).break_();
      int var11 = (int)((float)var6 * ((AnimValue)this.class_[2]).byte_());
      if (var11 > 0) {
         int var12 = ColorHelper.break_(var7, var11);
         int var13 = ColorHelper.break_(var8, var11);
         int var14 = ColorHelper.break_(var9, var11);
         int var15 = ColorHelper.break_(var10, var11);
         rrfD_2.class_(var1, var2 - 2.5F, var3 - 2.5F, (float)(var4 + 5), (float)(var5 + 5), 8.0F, 1.0F, 1.0F, var12, var13, var14, var15);
      }

      rrfD_2.break_(
         var1,
         var2,
         var3,
         (float)var4,
         (float)var5,
         6.0F,
         6.0F,
         6.0F,
         6.0F,
         ColorHelper.break_(var7, var6),
         ColorHelper.break_(var9, var6),
         ColorHelper.break_(var8, var6),
         ColorHelper.break_(var10, var6)
      );
      this.class_(var1, var2, var3, var6);
      this.class_(var1, var2, var3, var4, var5, var6);
      MT.final_();
      MT.protected_();
   }

   public float catch_() {
      this.volatile_();
      return (Float)((Supplier)this.class_[4]).get() + (Float)this.class_[6];
   }

   public int extends_() {
      this.volatile_();
      return (Integer)this.class_[8];
   }

   public int case_() {
      this.volatile_();
      return (Integer)this.class_[7];
   }

   private static void new_() {
      throws_ = new short[]{2, 0, 1, 3, 4, 7, 8, 0, 2, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 2, 0, 1, 1, 1, 0, 0, 1, 3, 5, 4, 6, 7, 8, 5, 6};
   }

   private static void package_() {
      protected_ = new boolean[]{false, false, true, false, true, false, false, false, false, false};
   }

   @Override
   public rruv_1 protected_() {
      return new rruv_1(this.private_(), this.catch_(), (float)this.case_(), (float)this.extends_());
   }

   public float private_() {
      this.volatile_();
      return (Float)((Supplier)this.class_[3]).get() + (Float)this.class_[5];
   }

   private void volatile_() {
      if (this.class_ == null) {
         this.class_ = new Object[9];
         Object[] var1 = this.class_;
         var1[5] = 0.0F;
         var1[6] = 0.0F;
         var1[7] = 0;
         var1[8] = 0;
      }
   }

   private static void native_() {
      break_ = new byte[]{5, 5, 9, 5, 6, 7, 8};
   }
}
