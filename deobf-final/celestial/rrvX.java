package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvX extends rrtN_2 {
   private static int[] byte_;
   private static byte[] protected_;
   private static String[] native_;
   private static short[] volatile_;
   public Object[] class_;
   public static Object[] break_;
   private static double[] final_;
   private static float[] package_;
   private static boolean[] int_;

   @Override
   public String byte_() {
      return "Цвет";
   }

   @Override
   public void int_() {
      super.int_();
      this.x();
   }

   public rrvX(rrtH_2 var1, Supplier<Float> var2, Supplier<Float> var3) {
      super(var2, var3, () -> 105.5F, () -> 0.0F);
      this.S();
      rruL var8 = new rruL();
      this.class_[1] = var8;
      Float var9 = (Float)var2.get();
      this.class_[2] = var9;
      Float var10 = (Float)var3.get();
      this.class_[3] = var10;
      this.class_[0] = var1;
      this.class_(() -> 60.0F + (this.d() ? 55.0F : package_[70]));
      this.break_(var1.synchronized_().byte_(), true, true, true);
      this.super_();
      ((rrtH_2)this.class_[0]).synchronized_().class_("setup_color", (var1x, var2x) -> {
         if ((Boolean)var2x.getRight()) {
            this.break_((Integer)var2x.getLeft(), true, true, true);
         }
      });
   }

   static {
      ntfClinit();
   }

   private static void F() {
      native_ = new String[]{
         new String("setup_color"),
         new String("Цвет"),
         new String("ColorPickerPopUp"),
         new String("#%08X"),
         new String("#%06X"),
         new String("Успешно!"),
         new String("Ошибка!"),
         new String("#"),
         new String("Успешно!"),
         new String("Ошибка!"),
         new String("Вставить"),
         new String("Копировать"),
         new String("celestial/images/huebar.png")
      };
   }

   private void S() {
      if (this.class_ == null) {
         this.class_ = new Object[13];
         Object[] var1 = this.class_;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
         var1[4] = 0.0F;
         var1[5] = 0.0F;
         var1[6] = 0.0F;
         var1[7] = 0.0F;
         var1[8] = false;
         var1[9] = false;
         var1[10] = false;
      }
   }

   private void this_() {
      this.S();

      try {
         String var1 = ((Qj_1)import_.class_[volatile_[59]]).class_().trim();
         if (var1.startsWith(native_[7])) {
            var1 = var1.substring(int_[44]);
         }

         int var2 = (int)Long.parseLong(var1, protected_[9]);
         if (!((rrtH_2)this.class_[volatile_[60]]).synchronized_().class_().get()) {
            var2 |= byte_[3];
         } else if ((var2 & byte_[4]) == 0) {
            var2 |= byte_[5];
         }

         this.class_(var2, int_[45], int_[46], int_[47]);
         ((rruu_1)this.class_[volatile_[61]]).class_(rrum_1.class_(native_[8], package_[54]));
      } catch (Exception var3) {
         ((rruu_1)this.class_[12]).class_(rrum_1.class_("Ошибка!", 1.0F));
      }
   }

   private void x() {
      this.S();
      Boolean var5 = false;
      this.class_[8] = var5;
      Boolean var6 = false;
      this.class_[9] = var6;
      Boolean var7 = false;
      this.class_[10] = var7;
   }

   private static void h() {
      Object[] var0 = new Object[]{new rqO_2("minecraft", "celestial/images/huebar.png"), 60};
      break_ = var0;
   }

   private boolean d() {
      this.S();
      return ((rrtH_2)this.class_[0]).synchronized_().class_().get();
   }

   public void class_(float var1) {
      this.S();
      Float var6 = var1;
      this.class_[2] = var6;
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      super.class_(var1, var2, var3, var4, var5);
      this.interface_().class_(var1, () -> this.class_(var1, var2, var3, var4, false, var5), var2, var3, var4, var5);
   }

   private static void class_(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      int var8 = ColorHelper.break_((Integer)rrZI.break_[4], var7);
      rrfD_2.class_(var0, var1 - var6, var2 - var6, var3 + var6 * 2.0F, var4 + var6 * 2.0F, var5, 1.0F, 1.0F, var8, var8, var8, var8);
   }

   private void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5, boolean var6) {
      this.S();
      RenderSystem.disableBlend();
      RenderSystem.disableAlphaTest();
      double var7 = (double)this.long_();
      int var9 = (int)(255.0 * var7);
      this.class_(var1, var9);
      this.class_(var1, var9, var6);
      if (!var6) {
         this.class_(var1, var3, var4, var9);
         this.break_(var1, var3, var9);
         if (this.d()) {
            this.class_(var1, var3, var9);
         }
      }

      RenderSystem.enableBlend();
      RenderSystem.enableAlphaTest();
      ((rruL)this.class_[1]).class_(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      this.S();
      super.class_(var1, var2, var3, var4, var5, var6);
      if (this.class_().break_((float)var2, (float)var3)) {
         if (var4 == 0) {
            Boolean var11 = true;
            this.class_[8] = var11;
            return false;
         }

         if (var4 == 2) {
            this.class_(((rrtH_2)this.class_[0]).synchronized_().finally_(), true, true, true);
            return false;
         }
      } else if (this.finally_().break_((float)var2, (float)var3)) {
         if (var4 == 0) {
            Boolean var12 = true;
            this.class_[9] = var12;
            return false;
         }
      } else if (this.d() && this.volatile_().break_((float)var2, (float)var3) && var4 == 0) {
         Boolean var13 = true;
         this.class_[10] = var13;
         return false;
      }

      return ((rruL)this.class_[1]).class_(var1, var2, var3, var4, var5);
   }

   @Override
   public void class_(int var1, int var2, int var3) {
      super.class_(var1, var2, var3);
      this.x();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1470347704;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4859996799465379669L;
   }

   public rruv_1 class_() {
      float var1 = this.default_();
      float var2 = this.abstract_();
      float var3 = this.implements_();
      return new rruv_1(var1 + 5.0F, var2 + 5.0F, var3 - 10.0F, 60.0F);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{31, -27, 117, -98, 77, -20, -12, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void class_(Ml_1 var1, int var2, int var3) {
      this.S();
      rruv_1 var4 = this.volatile_();
      float var5 = var4.break_();
      float var6 = var4.protected_();
      float var7 = var4.byte_();
      float var8 = var4.class_();
      int var9 = Color.HSBtoRGB((Float)this.class_[4], (Float)this.class_[5], (Float)this.class_[6]);
      if ((Boolean)this.class_[10]) {
         int var10 = rfU_2.class_(var2, (int)var5, (int)(var5 + var7));
         Float var15 = ((float)var10 - var5) / var7;
         this.class_[7] = var15;
         this.class_(var9, false, false, false);
      }

      float var16 = package_[14];
      rrfD_2.break_(
         var1,
         var5 + 1.0F,
         var6 + 1.0F,
         var7 - 2.0F,
         var8 - 2.0F,
         var16,
         var16,
         var16,
         var16,
         ColorHelper.break_(0, var3),
         ColorHelper.break_(-16777216, var3),
         ColorHelper.break_(-1, var3),
         ColorHelper.break_(-1, var3)
      );
      class_(var1, var5, var6, var7, var8, 2.0F, 0.5F, var3);
      rrfD_2.class_(
         var1,
         (double)rfU_2.class_(var5 + (Float)this.class_[7] * var7, var5 + 2.0F, var5 + var7 - 2.0F),
         (double)(var6 + var8 / 2.0F),
         8.0F,
         ColorHelper.break_(rrZF.d_, var3),
         this.long_()
      );
   }

   private void class_(int var1, boolean var2, boolean var3, boolean var4) {
      this.S();
      this.break_(var1, var2, var3, var4);
      int var5 = Math.max(1, var1 >> 16 & 0xFF);
      int var6 = Math.max(1, var1 >> 8 & 0xFF);
      int var7 = Math.max(1, var1 & 0xFF);
      ((rrtH_2)this.class_[0])
         .synchronized_()
         .class_(Integer.valueOf(ColorHelper.class_(var5, var6, var7, (int)((Float)this.class_[7] * 255.0F))), false, true);
   }

   private void class_(Ml_1 var1, int var2) {
      float var3 = this.default_();
      float var4 = this.abstract_();
      float var5 = this.implements_();
      float var6 = this.double_();
      rrfD_2.class_(var1, var3, var4, var5, var6, 8.0F, 8.0F, 8.0F, 8.0F, ColorHelper.break_(rrZF.n_, var2));
   }

   private void class_(Ml_1 var1, int var2, boolean var3) {
   }

   private void class_(Ml_1 var1, int var2, int var3, int var4) {
      this.S();
      rruv_1 var5 = this.class_();
      float var6 = var5.break_();
      float var7 = var5.protected_();
      float var8 = var5.byte_();
      float var9 = var5.class_();
      if ((Boolean)this.class_[8]) {
         int var10 = rfU_2.class_(var2, (int)var6, (int)(var6 + var8));
         int var11 = rfU_2.class_(var3, (int)var7 + 1, (int)(var7 + var9));
         Float var16 = ((float)var10 - var6) / var8;
         this.class_[5] = var16;
         Float var17 = 1.0F - ((float)var11 - var7) / var9;
         this.class_[6] = var17;
         this.class_(Color.HSBtoRGB((Float)this.class_[4], (Float)this.class_[5], (Float)this.class_[6]), false, false, false);
      }

      float var18 = package_[1];
      class_(var1, var6, var7, var8, var9, var18 + 1.0F, 2.0F, var4);
      rrfD_2.break_(
         var1,
         var6,
         var7,
         var8,
         var9,
         var18,
         var18,
         var18,
         var18,
         ColorHelper.break_(-1, var4),
         ColorHelper.break_(402653184, var4),
         ColorHelper.break_(Color.HSBtoRGB((Float)this.class_[4], 1.0F, 1.0F), var4),
         ColorHelper.break_(402653184, var4)
      );
      rrfD_2.class_(
         var1,
         (double)(var6 + (Float)this.class_[5] * var8),
         (double)(var7 + (1.0F - (Float)this.class_[6]) * var9),
         5.0F,
         ColorHelper.break_(rrZF.d_, var4),
         this.long_()
      );
   }

   @Override
   public void class_(Ml_1 var1, float var2) {
      this.S();
      float var3 = 1.0F - var2;
      var1.class_((double)(var3 * (Float)this.class_[2]), (double)(var3 * (Float)this.class_[3]), 0.0);
      var1.class_(var2, var2, var2);
   }

   private static void m() {
      byte_ = new int[]{402653184, 402653184, -16777216, -16777216, -16777216, -16777216};
   }

   private static void v() {
      final_ = new double[]{255.0, 0.0};
   }

   private static void u() {
      int_ = new boolean[]{
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         true
      };
   }

   @Override
   public void break_(rrtu_3 var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      super.break_(var1, var2, var3, var4, var5, var6);
      this.int_();
   }

   public void break_(float var1) {
      this.S();
      Float var6 = var1;
      this.class_[3] = var6;
   }

   private void break_(Ml_1 var1, int var2, int var3) {
      this.S();
      rruv_1 var4 = this.finally_();
      float var5 = var4.break_();
      float var6 = var4.protected_();
      float var7 = var4.byte_();
      float var8 = var4.class_();
      if ((Boolean)this.class_[9]) {
         int var9 = rfU_2.class_(var2, (int)var5, (int)(var5 + var7));
         Float var14 = ((float)var9 - var5) / var7;
         this.class_[4] = var14;
         this.class_(Color.HSBtoRGB((Float)this.class_[4], (Float)this.class_[5], (Float)this.class_[6]), false, false, false);
      }

      rrfD_2.class_(var1, (rqO_2)break_[0], var5, var6, var7, var8, ColorHelper.break_(-1, var3));
      class_(var1, var5, var6, var7, var8, 2.0F, 0.5F, var3);
      rrfD_2.class_(
         var1,
         (double)rfU_2.class_(var5 + (Float)this.class_[4] * var7, var5 + 2.0F, var5 + var7 - 2.0F),
         (double)(var6 + var8 / 2.0F),
         8.0F,
         ColorHelper.break_(rrZF.d_, var3),
         this.long_()
      );
   }

   private void break_(int var1, boolean var2, boolean var3, boolean var4) {
      this.S();
      if (var2) {
         Float var9 = ColorHelper.class_(var1)[0];
         this.class_[4] = var9;
      }

      if (var3) {
         Float var10 = ColorHelper.class_(var1)[1];
         this.class_[5] = var10;
         Float var11 = ColorHelper.class_(var1)[2];
         this.class_[6] = var11;
      }

      if (var4) {
         Float var12 = (float)ColorHelper.throws_(var1) / 255.0F;
         this.class_[7] = var12;
      }
   }

   public float break_() {
      this.S();
      return (Float)this.class_[7];
   }

   private void W() {
      this.S();

      try {
         int var2 = ((rrtH_2)this.class_[volatile_[54]]).synchronized_().byte_();
         String var1;
         if (this.d() && ColorHelper.throws_(var2) < volatile_[55]) {
            String var4 = native_[3];
            Object[] var5 = new Object[int_[40]];
            var5[int_[41]] = var2;
            var1 = String.format(var4, var5);
         } else {
            String var10000 = native_[4];
            Object[] var10001 = new Object[int_[42]];
            var10001[int_[43]] = var2;
            var1 = String.format(var10000, var10001);
         }

         ((Qj_1)import_.class_[volatile_[56]]).class_(var1);
         ((rruu_1)this.class_[volatile_[57]]).class_(rrum_1.class_(native_[5], package_[52]));
      } catch (Exception var3) {
         ((rruu_1)this.class_[11]).class_(rrum_1.class_("Ошибка!", 1.0F));
      }
   }

   public rruv_1 finally_() {
      float var1 = this.default_();
      float var2 = this.abstract_();
      float var3 = this.implements_();
      return new rruv_1(var1 + 5.0F, var2 + 5.0F + 60.0F + 8.0F, var3 - 10.0F, 5.0F);
   }

   @Override
   public String catch_() {
      return "ColorPickerPopUp";
   }

   private static void G() {
      package_ = new float[]{
         1.0F,
         4.0F,
         1.0F,
         2.0F,
         1.0F,
         1.0F,
         1.0F,
         5.0F,
         2.0F,
         0.5F,
         2.0F,
         2.0F,
         2.0F,
         8.0F,
         1.0F,
         1.0F,
         1.0F,
         2.0F,
         2.0F,
         2.0F,
         0.5F,
         2.0F,
         2.0F,
         2.0F,
         8.0F,
         8.0F,
         8.0F,
         8.0F,
         8.0F,
         2.0F,
         2.0F,
         1.0F,
         1.0F,
         5.0F,
         5.0F,
         10.0F,
         60.0F,
         5.0F,
         5.0F,
         60.0F,
         8.0F,
         10.0F,
         5.0F,
         5.0F,
         5.0F,
         60.0F,
         22.0F,
         10.0F,
         5.0F,
         1.0F,
         255.0F,
         255.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.0F,
         3.5F,
         40.0F,
         10.0F,
         60.5F,
         15.0F,
         0.0F,
         3.5F,
         50.5F,
         10.0F,
         5.0F,
         15.0F,
         60.0F,
         55.0F,
         41.0F,
         0.0F,
         105.5F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   @Override
   public boolean extends_() {
      return false;
   }

   private static void else_() {
      protected_ = new byte[]{2, -1, -1, -1, -1, 2, 2, 16, 8, 16, 13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 60};
   }

   @Override
   public boolean new_() {
      return false;
   }

   public float package_() {
      this.S();
      return (Float)this.class_[3];
   }

   private void super_() {
      this.S();
      rruL var10000 = (rruL)this.class_[1];
      rruF[] var10001 = new rruF[2];
      rruu_1 var5;
      rruu_1 var10006 = var5 = new rrup_1(
            ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_(),
            () -> "Копировать",
            () -> new rjK_2(this.default_() + 5.0F, this.abstract_() + this.double_() - 15.0F),
            () -> new rjK_2(50.5F, 10.0F),
            () -> new rjK_2(0.0F, 3.5F),
            () -> rrZF.k_,
            () -> new rji_3(
                  (float)((Integer)rrZI.break_[4]).intValue(),
                  (float)((Integer)rrZI.break_[4]).intValue(),
                  (float)((Integer)rrZI.break_[4]).intValue(),
                  (float)((Integer)rrZI.break_[4]).intValue()
               )
         )
         .<rrup_1>break_(() -> false)
         .<rrup_1>class_(this::long_)
         .super_();
      this.class_[11] = var5;
      var10001[0] = new rruF(var10006).class_(this::W);
      rruu_1 var6;
      var10006 = var6 = new rrup_1(
            ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_(),
            () -> "Вставить",
            () -> new rjK_2(this.default_() + 60.5F, this.abstract_() + this.double_() - 15.0F),
            () -> new rjK_2(40.0F, 10.0F),
            () -> new rjK_2(0.0F, 3.5F),
            () -> rrZF.k_,
            () -> new rji_3(
                  (float)((Integer)rrZI.break_[4]).intValue(),
                  (float)((Integer)rrZI.break_[4]).intValue(),
                  (float)((Integer)rrZI.break_[4]).intValue(),
                  (float)((Integer)rrZI.break_[4]).intValue()
               )
         )
         .<rrup_1>break_(() -> false)
         .<rrup_1>class_(this::long_)
         .super_();
      this.class_[12] = var6;
      var10001[1] = new rruF(var10006).class_(this::this_);
      var10000.class_(var10001);
   }

   @Override
   public boolean protected_() {
      return true;
   }

   @Override
   public void private_() {
      super.private_();
      this.int_();
   }

   @Override
   public boolean final_() {
      return false;
   }

   public rruv_1 volatile_() {
      float var1 = this.default_();
      float var2 = this.abstract_();
      float var3 = this.implements_();
      return new rruv_1(var1 + 5.0F, var2 + 5.0F + 60.0F + 22.0F, var3 - 10.0F, 5.0F);
   }

   public float native_() {
      this.S();
      return (Float)this.class_[2];
   }

   private static void X() {
      volatile_ = new short[]{
         1,
         2,
         3,
         0,
         0,
         1,
         0,
         11,
         0,
         12,
         1,
         8,
         5,
         6,
         4,
         5,
         6,
         4,
         5,
         6,
         9,
         4,
         4,
         5,
         6,
         0,
         4,
         4,
         5,
         6,
         10,
         7,
         7,
         4,
         8,
         0,
         9,
         10,
         1,
         2,
         3,
         0,
         8,
         9,
         10,
         4,
         5,
         6,
         7,
         255,
         255,
         255,
         0,
         7,
         0,
         255,
         23,
         11,
         11,
         23,
         0,
         12,
         12,
         7,
         2,
         3,
         2,
         3,
         4,
         4,
         4,
         4,
         4,
         4,
         4,
         4
      };
   }
}
