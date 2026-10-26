package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class TargetHud extends rrvj_1 {
   private static byte[] native_;
   public Object[] byte_;
   private static short[] volatile_;
   private static float[] final_;
   private static boolean[] package_;
   private static String[] int_;
   public static Object[] protected_;

   public TargetHud() {
      super("Target HUD", () -> 100.0F, () -> 33.0F);
      this.s();
      rrFC var5 = new rrFC();
      this.byte_[0] = var5;
      rrFA var6 = new rrFA();
      this.byte_[1] = var6;
      AnimValue var7 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0], 0.4F, false);
      this.byte_[2] = var7;
      AnimValue var8 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0], 0.4F, false);
      this.byte_[3] = var8;
   }

   static {
      ntfClinit();
   }

   private static void B() {
      final_ = new float[]{
         0.4F,
         0.4F,
         10.0F,
         0.0F,
         8.0F,
         4.0F,
         255.0F,
         0.0F,
         255.0F,
         0.0F,
         90.0F,
         270.0F,
         180.0F,
         4.0F,
         5.0F,
         5.0F,
         9.0F,
         33.0F,
         2.0F,
         2.5F,
         2.5F,
         20.0F,
         5.0F,
         1.0F,
         5.0F,
         2.0F,
         2.0F,
         2.0F,
         2.0F,
         1.0F,
         2.0F,
         1.0F,
         10.0F,
         2.0F,
         4.0F,
         4.0F,
         2.0F,
         2.0F,
         0.0F,
         1.0F,
         5.0F,
         2.0F,
         2.0F,
         0.5F,
         2.0F,
         11.0F,
         0.0F,
         33.0F,
         100.0F,
         100.0F,
         33.0F,
         4.0F,
         2.5F
      };
   }

   private static void S() {
      package_ = new boolean[]{false, false, false, true, false, false, false, true, false, true, false, false, true};
   }

   private void s() {
      if (this.byte_ == null) {
         this.byte_ = new Object[5];
         Object[] var1 = this.byte_;
      }
   }

   private static void h() {
      int_ = new String[]{new String("Target HUD"), new String("HP: Неизвестно"), new String("HP: "), new String(" + "), new String(" AB")};
   }

   private void class_(Ml_1 var1, iB_2 var2, float var3, float var4, float var5, int var6) {
      boolean var7 = (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2] ? true : package_[4];
      StreamerMode var8 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().throws_();
      String var9 = var8.break_(var2.extends_());
      ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).case_().class_(var1, var9, var3, var4, var6, var5 * 0.5F + 2.0F);
      ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0])
         .native_()
         .break_(var1, this.class_(var2, var7), (double)var3, (double)(var4 + 11.0F), var6, false, false);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1676626282;
   }

   @Override
   public boolean class_() {
      return true;
   }

   private String class_(iB_2 var1, boolean var2) {
      this.s();
      if (var2 && var1 != (cb_3)import_.class_[57] && var1.Pp()) {
         return "HP: Неизвестно";
      } else {
         StringBuilder var3 = new StringBuilder("HP: ").append(rql_3.class_(((AnimValue)this.byte_[2]).byte_()));
         if (var1.Sd() > 0.0F && !var2) {
            var3.append(rgF_2.GRAY).append(" + ").append(rgF_2.YELLOW).append(rql_3.class_(((AnimValue)this.byte_[3]).byte_())).append(" AB");
         }

         return var3.toString();
      }
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.s();
      super.class_(var1, var2, var3, var4, var5);
      iB_2 var6 = this.while_();
      iB_2 var7 = var6 != null ? var6 : (iB_2)this.byte_[4];
      if (var7 != null) {
         ((rrFA)this.byte_[1]).class_(var7);
         ((AnimValue)this.byte_[2]).break_(var7.u_());
         ((AnimValue)this.byte_[3]).break_(var7.Sd());
         float var8 = this.long_();
         float var9 = this.default_() + this.implements_();
         float var10 = this.abstract_() - 8.0F - 4.0F;
         ((rrFA)this.byte_[1]).class_(var1, var9, var10, var8);
         this.class_(var1, var7);
      }
   }

   private void class_(Ml_1 var1, float var2, float var3, float var4, float var5, int var6, int var7, int var8, int var9, int var10) {
      rrfD_2.class_(var1, var2, var3, var4 - 1.0F, 5.0F, 2.0F, 2.0F, 2.0F, 2.0F, ColorHelper.class_(35, var10));
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().w().goto_()) {
         rrfD_2.class_(var1, var2 - 1.0F, var3 - 2.0F, var5 + 1.0F, 10.0F, 2.0F, 4.0F, var6, var7, var8, var9);
      }

      float var11 = !(var5 < 4.0F) && !(var5 > var4 - 2.0F) ? final_[38] : final_[37];
      rrfD_2.break_(var1, var2, var3, var5 - 1.0F, 5.0F, 2.0F, var11, var11, 2.0F, var6, var7, var8, var9);
   }

   private void class_(Ml_1 var1, iB_2 var2) {
      this.s();
      float var3 = this.default_();
      float var4 = this.abstract_();
      float var5 = this.implements_();
      float var6 = this.long_();
      int var7 = (int)rfU_2.class_(255.0F * var6, 0.0F, 255.0F);
      int var8 = Math.min(var7, 225);
      int var9 = ColorHelper.break_(rrZF.d_, var7);
      int var10 = ColorHelper.class_(0.0F, var8);
      int var11 = ColorHelper.class_(90.0F, var8);
      int var12 = ColorHelper.class_(270.0F, var8);
      int var13 = ColorHelper.class_(180.0F, var8);
      byte var14 = 28;
      float var15 = var3 + (float)var14 + 4.0F;
      float var16 = var4 + 5.0F;
      float var17 = var3 + (float)var14 + 5.0F;
      float var18 = var5 - (float)var14 - 9.0F;
      float var19 = var2.SK();
      float var20 = Math.min(((AnimValue)this.byte_[2]).byte_(), var19) / var19 * var18;
      rrfD_2.class_(var1, var3, var4, var5, 33.0F, var8, var10, var11, var12, var13, false);
      this.class_(var1, var2, var15, var16, var5, var9);
      ((rrFC)this.byte_[0])
         .class_(var1, var2, var3 + 2.0F, var4 + 2.5F, var14, var14, 2.5F, (float)((Integer)var2.private_[10]).intValue() / 20.0F, (float)var7);
      this.class_(var1, var17, var4 + (float)var14 - 5.0F, var18, var20, var10, var11, var12, var13, var7);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6168359818072550387L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{99, 59, -93, 1, -125, -128, 9, -126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void M() {
      volatile_ = new short[]{0, 1, 0, 2, 0, 3, 1, 4, 1, 2, 3, 1, 225, 2, 0, 10, 0, 1, 2, 0, 0, 0, 57, 2, 3, 73, 57, 4, 0, 4, 1};
   }

   private static void G() {
      native_ = new byte[]{28, 35, 5, 7, 2, 3, 5, 4, 2, 5, 6, 5};
   }

   @Override
   public boolean package_() {
      return this.while_() != null ? true : package_[8];
   }

   public iB_2 while_() {
      this.s();
      if ((vm_3)import_.class_[73] instanceof FP) {
         cb_3 var9;
         cb_3 var10000 = var9 = (cb_3)import_.class_[57];
         this.byte_[4] = var9;
         return var10000;
      } else {
         rrvT var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_();
         AttackAura var2 = var1.E();
         TriggerBot var3 = var1.long_();
         iB_2 var4 = var2.native_();
         if (var4 == null) {
            var4 = var3.native_();
         }

         if (var4 != null) {
            this.byte_[4] = var4;
         }

         return var4;
      }
   }

   @Override
   public boolean protected_() {
      return false;
   }

   private static void E() {
      Object[] var0 = new Object[]{0.0F, 0.0F, 0.0F, 5, 2, 0.0F, 5};
      protected_ = var0;
   }

   @Override
   public void ar_() {
      this.s();
      super.ar_();
      ((rrFA)this.byte_[1]).break_();
   }

   @Override
   public float au_() {
      this.s();
      return ((rrFA)this.byte_[1]).class_() ? 10.0F : final_[3];
   }
}
