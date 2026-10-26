package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZi_1 extends GuiComponent {
   private static float[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;
   public Object[] class_;
   private static short[] throws_;

   private static void int_() {
      throws_ = new short[]{
         4,
         5,
         0,
         1,
         6,
         7,
         10,
         11,
         2,
         3,
         0,
         1,
         5,
         2,
         5,
         3,
         4,
         0,
         1,
         0,
         4,
         1,
         1,
         0,
         0,
         1,
         0,
         1,
         5,
         5,
         1,
         4,
         0,
         270,
         180,
         0,
         1,
         0,
         6,
         8,
         7,
         9,
         10,
         11,
         8,
         9,
         1,
         3,
         3,
         3,
         3,
         2,
         2,
         2,
         2
      };
   }

   public rrZi_1(rrZI var1, rrtu_3 var2, ClickGuiScreen var3, Module var4, Supplier<Float> var5, Supplier<Float> var6, int var7, int var8) {
      this.else_();
      AnimValue var17 = new AnimValue(0.3F, false);
      this.class_[4] = var17;
      rruL var18 = new rruL();
      this.class_[5] = var18;
      this.class_[0] = var1;
      this.class_[1] = var4;
      this.class_[6] = var5;
      this.class_[7] = var6;
      Integer var23 = var7;
      this.class_[10] = var23;
      Integer var24 = var8;
      this.class_[11] = var24;
      rrvh_1 var25 = new rrvh_1(this, this::extends_, this::case_);
      this.class_[2] = var25;
      rrvO var26 = new rrvO(this, this::extends_, this::case_);
      this.class_[3] = var26;
      float var9 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).catch_().break_(((Module)this.class_[1]).final_());
      Runnable var10 = () -> {
         this.else_();
         float var3x = rfU_2.class_((float)var3.abstract_() - ((rrvh_1)this.class_[2]).implements_() - 10.0F, 5.0F, const_.volatile_() - 5.0F);
         float var4x = rfU_2.class_((float)var3.finally_(), 5.0F, (float)const_.native_() - ((rrvh_1)this.class_[2]).double_() - 5.0F);
         var2.class_(((rrvh_1)this.class_[2]).class_(var3x, var4x), () -> {
            this.else_();
            ((rrvh_1)this.class_[2]).class_(var2);
         });
      };
      Runnable var11 = () -> {
         this.else_();
         float var3x = rfU_2.class_((float)var3.abstract_() - ((rrvO)this.class_[3]).implements_() - 10.0F, 5.0F, const_.volatile_() - 5.0F);
         float var4x = rfU_2.class_((float)var3.finally_(), 5.0F, (float)const_.native_() - ((rrvO)this.class_[3]).double_() - 5.0F);
         var2.class_(((rrvO)this.class_[3]).class_(var3x, var4x), () -> {
            this.else_();
            ((rrvO)this.class_[3]).class_(var2);
         });
      };
      Supplier var12 = () -> {
         this.else_();
         return ((Module)this.class_[1]).b().stream().anyMatch(Setting::private_);
      };
      ((rruL)this.class_[5])
         .class_(
            new rruF(
                  new rrun_1(() -> rrZL.int_, () -> new rjK_2(this.extends_() + var9 + 7.0F, this.case_() + 3.5F), () -> new rjK_2(8.0F, 8.0F), () -> rrZF.d_)
                     .<rrun_1>class_(this::continue_)
                     .class_(0.2F)
               )
               .break_(var12)
               .class_(((rrvh_1)this.class_[2])::static_)
               .class_(var10)
         );
      if (!(var4 instanceof rrnv_3)) {
         ((rruL)this.class_[5]).class_(new rruF(new rrun_1(() -> rrZL.protected_, () -> {
            byte var3x = var12.get() ? 17 : byte_[8];
            return new rjK_2(this.extends_() + var9 + (float)var3x, this.case_() + 3.5F);
         }, () -> new rjK_2(8.0F, 8.0F), () -> rrZF.d_).<rrun_1>class_(this::continue_).class_(0.2F)).class_(((rrvO)this.class_[3])::static_).class_(var11));
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
      this.else_();
      super.class_(var1, var2, var3, var4, var5, var6, var7);
      float var8 = this.extends_();
      float var9 = this.case_();
      int var10 = this.catch_();
      int var11 = this.break_();
      AnimValue var12 = (AnimValue)this.class_[4];
      if (!((rrZI)this.class_[0]).native_().volatile_().long_()) {
         var12.class_(((Module)this.class_[1]).aJ_());
      }

      float var13 = ((rrZI)this.class_[0]).implements_().class_().byte_();
      int var14 = (int)(255.0F * var13);
      int var15 = ColorHelper.break_((Integer)rrZI.break_[4], var14);
      if (!((Module)this.class_[1]).aJ_()) {
         rrfD_2.break_(var1, var8, var9, (float)var10, (float)var11, 4.0F, var15, var15, var15, var15);
      }

      if (var12.case_()) {
         this.class_(var1, var8, var9, var10, var11, var13);
      }

      if (!((Module)this.class_[1]).aJ_() || !((rrZI)this.class_[0]).native_().volatile_().long_()) {
         int var16 = ColorHelper.break_(rrZF.d_, var14);
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0])
            .catch_()
            .protected_(var1, ((Module)this.class_[1]).final_(), var8 + 5.0F, var9 + 5.0F, var16, false);
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0])
            .private_()
            .class_(var1, ((Module)this.class_[1]).ay_(), (double)(var8 + 5.0F), (double)(var9 + 16.0F), var16, false, false);
      }

      ((rruL)this.class_[5]).class_(var1, var2, var3, var4, var6, var7);
   }

   @Override
   public rrZN class_() {
      this.else_();
      return (rrZI)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-20, -93, -51, 17, 42, -7, 18, -12}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void class_(Ml_1 var1, float var2, float var3, int var4, int var5, float var6) {
      this.else_();
      int var7 = (int)(255.0F * ((AnimValue)this.class_[4]).byte_() * var6);
      int var8 = ((rrZI)this.class_[0]).finally_().indexOf(this) * 100;
      int var9 = ColorHelper.class_((float)var8, var7);
      int var10 = ColorHelper.class_((float)(90 + var8), var7);
      int var11 = ColorHelper.class_((float)(270 + var8), var7);
      int var12 = ColorHelper.class_((float)(180 + var8), var7);
      if (ClickGuiTheme.class_()) {
         rrfD_2.class_(var1, var2, var3 - 2.0F, (float)var4, (float)(var5 + 4), 0.5F, 4, 9, var9, var10, var11, var12, var7);
      }

      rrfD_2.break_(var1, var2 + 1.0F, var3 + 1.0F, (float)(var4 - 2), (float)(var5 - 2), 4.0F, 4.0F, 4.0F, 4.0F, var9, var10, var11, var12);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -967693744;
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.else_();
      if (var4 == 0 && super.class_(var1, var2, var3, var4, var5)) {
         if (((rruL)this.class_[5]).class_(var1, var2, var3, var4, var5)) {
            return true;
         } else {
            ((Module)this.class_[1]).aw_();
            return true;
         }
      } else {
         return protected_[10];
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7057526812046625856L;
   }

   public void class_(float var1, float var2) {
      this.else_();
      Float var7 = var1;
      this.class_[8] = var7;
      Float var8 = var2;
      this.class_[9] = var8;
   }

   public int break_() {
      this.else_();
      return (Integer)this.class_[11];
   }

   public int catch_() {
      this.else_();
      return (Integer)this.class_[10];
   }

   public float extends_() {
      this.else_();
      return (Float)((Supplier)this.class_[6]).get() + (Float)this.class_[8];
   }

   public float case_() {
      this.else_();
      return (Float)((Supplier)this.class_[7]).get() + (Float)this.class_[9];
   }

   private float continue_() {
      this.else_();
      return ((rrZI)this.class_[0]).implements_().class_().byte_();
   }

   private void else_() {
      if (this.class_ == null) {
         this.class_ = new Object[12];
         Object[] var1 = this.class_;
         var1[8] = 0.0F;
         var1[9] = 0.0F;
         var1[10] = 0;
         var1[11] = 0;
      }
   }

   private static void new_() {
      break_ = new float[]{
         0.3F,
         0.2F,
         0.2F,
         255.0F,
         4.0F,
         5.0F,
         5.0F,
         5.0F,
         16.0F,
         255.0F,
         2.0F,
         0.5F,
         1.0F,
         1.0F,
         4.0F,
         4.0F,
         4.0F,
         4.0F,
         8.0F,
         8.0F,
         3.5F,
         8.0F,
         8.0F,
         7.0F,
         3.5F,
         10.0F,
         5.0F,
         5.0F,
         5.0F,
         5.0F,
         10.0F,
         5.0F,
         5.0F,
         5.0F,
         5.0F,
         0.0F,
         0.0F
      };
   }

   private static void package_() {
      byte_ = new byte[]{100, 90, 4, 4, 9, 2, 2, 17, 7, 12, 8, 9, 10, 11};
   }

   private static void return_() {
      protected_ = new boolean[]{false, true, false, true, false, false, false, false, true, true, false, false, false};
   }

   @Override
   public rruv_1 protected_() {
      return new rruv_1(this.extends_(), this.case_(), (float)this.catch_(), (float)this.break_());
   }

   public Module private_() {
      this.else_();
      return (Module)this.class_[1];
   }
}
