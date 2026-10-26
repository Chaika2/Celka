package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;
import java.util.function.Consumer;

public class cj_3 extends cT_2 {
   static final rqO_2 class_ = new rqO_2("textures/gui/title/mojangstudios.png");
   private static final int throws_ = ryj_3.class_(255, 239, 50, 61);
   private static final int case_ = throws_ & 16777215;
   private final QY catch_;
   private final rAN private_;
   private final Consumer<Optional<Throwable>> implements_;
   private final boolean finally_;
   private float extends_;
   private long native_ = -1L;
   private long volatile_ = -1L;
   private int final_ = case_;
   private int package_ = case_;
   private int int_ = 16777215;
   private int new_ = 16777215;
   private rrxz_3 continue_ = null;
   private boolean super_ = false;

   public cj_3(QY var1, rAN var2, Consumer<Optional<Throwable>> var3, boolean var4) {
      this.catch_ = var1;
      this.private_ = var2;
      this.implements_ = var3;
      this.finally_ = false;
   }

   private static int class_(String var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         var0 = var0.trim();

         try {
            return Integer.parseInt(var0, 16) & 16777215;
         } catch (NumberFormatException var3) {
            return var1;
         }
      }
   }

   private static int class_(Properties var0, String var1, int var2) {
      String var3 = var0.getProperty(var1);
      if (var3 == null) {
         return var2;
      } else {
         var3 = var3.trim();
         int var4 = class_(var3, var2);
         if (var4 < 0) {
            rrbb_3.protected_("Invalid color: " + var1 + " = " + var3);
            return var4;
         } else {
            rrbb_3.byte_(var1 + " = " + var3);
            return var4;
         }
      }
   }

   public static void class_(QY var0) {
      var0.A().class_(class_, new cV_2());
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      int var5 = this.catch_.else_().super_();
      int var6 = this.catch_.else_().this_();
      long var7 = rqR_2.break_();
      if (this.finally_ && (this.private_.byte_() || (vm_3)this.catch_.class_[73] != null) && this.volatile_ == -1L) {
         this.volatile_ = var7;
      }

      float var9 = this.native_ > -1L ? (float)(var7 - this.native_) / 1000.0F : -1.0F;
      float var10 = this.volatile_ > -1L ? (float)(var7 - this.volatile_) / 500.0F : -1.0F;
      float var11;
      if (var9 >= 1.0F) {
         this.super_ = true;
         if ((vm_3)this.catch_.class_[73] != null) {
            ((vm_3)this.catch_.class_[73]).class_(var1, 0, 0, var4);
         }

         int var12 = rfU_2.case_((1.0F - rfU_2.class_(var9 - 1.0F, 0.0F, 1.0F)) * 255.0F);
         class_(var1, 0, 0, var5, var6, this.final_ | var12 << 24);
         var11 = 1.0F - rfU_2.class_(var9 - 1.0F, 0.0F, 1.0F);
      } else if (this.finally_) {
         if ((vm_3)this.catch_.class_[73] != null && var10 < 1.0F) {
            ((vm_3)this.catch_.class_[73]).class_(var1, var2, var3, var4);
         }

         int var25 = rfU_2.throws_(rfU_2.class_((double)var10, 0.15, 1.0) * 255.0);
         class_(var1, 0, 0, var5, var6, this.final_ | var25 << 24);
         var11 = rfU_2.class_(var10, 0.0F, 1.0F);
      } else {
         class_(var1, 0, 0, var5, var6, this.final_ | 0xFF000000);
         var11 = 1.0F;
      }

      int var26 = (int)((double)this.catch_.else_().super_() * 0.5);
      int var13 = (int)((double)this.catch_.else_().this_() * 0.5);
      double var14 = Math.min((double)this.catch_.else_().super_() * 0.75, (double)this.catch_.else_().this_()) * 0.25;
      int var16 = (int)(var14 * 0.5);
      double var17 = var14 * 4.0;
      int var19 = (int)(var17 * 0.5);
      this.catch_.A().class_(class_);
      RenderSystem.enableBlend();
      RenderSystem.blendEquation(32774);
      RenderSystem.blendFunc(770, 1);
      RenderSystem.alphaFunc(516, 0.0F);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, var11);
      boolean var20 = true;
      if (this.continue_ != null) {
         this.continue_.implements_();
         if (!this.continue_.byte_() && this.super_) {
            var20 = false;
         }
      }

      if (var20) {
         class_(var1, var26 - var19, var13 - var16, var19, (int)var14, -0.0625F, 0.0F, 120, 60, 120, 120);
         class_(var1, var26, var13 - var16, var19, (int)var14, 0.0625F, 60.0F, 120, 60, 120, 120);
      }

      RenderSystem.defaultBlendFunc();
      RenderSystem.defaultAlphaFunc();
      RenderSystem.disableBlend();
      int var21 = (int)((double)this.catch_.else_().this_() * 0.8325);
      float var22 = this.private_.break_();
      this.extends_ = rfU_2.class_(this.extends_ * 0.95F + var22 * 0.050000012F, 0.0F, 1.0F);
      rrxr_3.extends_.class_();
      if (var9 < 1.0F) {
         this.class_(var1, var5 / 2 - var19, var21 - 5, var5 / 2 + var19, var21 + 5, 1.0F - rfU_2.class_(var9, 0.0F, 1.0F));
      }

      if (var9 >= 2.0F) {
         this.catch_.class_(null);
      }

      if (this.native_ == -1L && this.private_.protected_() && (!this.finally_ || var10 >= 2.0F)) {
         this.native_ = rqR_2.break_();

         try {
            this.private_.throws_();
            this.implements_.accept(Optional.empty());
         } catch (Throwable var24) {
            this.implements_.accept(Optional.of(var24));
         }

         if ((vm_3)this.catch_.class_[73] != null) {
            ((vm_3)this.catch_.class_[73]).break_(this.catch_, this.catch_.else_().super_(), this.catch_.else_().this_());
         }
      }
   }

   private void class_(Ml_1 var1, int var2, int var3, int var4, int var5, float var6) {
      int var7 = rfU_2.case_((float)(var4 - var2 - 2) * this.extends_);
      int var8 = Math.round(var6 * 255.0F);
      if (this.package_ != this.final_) {
         int var9 = this.package_ >> 16 & 0xFF;
         int var10 = this.package_ >> 8 & 0xFF;
         int var11 = this.package_ & 0xFF;
         int var12 = ryj_3.class_(var8, var9, var10, var11);
         class_(var1, var2, var3, var4, var5, var12);
      }

      int var16 = this.int_ >> 16 & 0xFF;
      int var17 = this.int_ >> 8 & 0xFF;
      int var18 = this.int_ & 0xFF;
      int var19 = ryj_3.class_(var8, var16, var17, var18);
      class_(var1, var2 + 1, var3, var4 - 1, var3 + 1, var19);
      class_(var1, var2 + 1, var5, var4 - 1, var5 - 1, var19);
      class_(var1, var2, var3, var2 + 1, var5, var19);
      class_(var1, var4, var3, var4 - 1, var5, var19);
      int var13 = this.new_ >> 16 & 0xFF;
      int var14 = this.new_ >> 8 & 0xFF;
      int var15 = this.new_ & 0xFF;
      var19 = ryj_3.class_(var8, var13, var14, var15);
      class_(var1, var2 + 2, var3 + 2, var2 + var7, var5 - 2, var19);
   }

   @Override
   public boolean class_() {
      return true;
   }

   public boolean throws_() {
      return this.super_;
   }

   public void protected_() {
      this.final_ = case_;
      this.package_ = case_;
      this.int_ = 16777215;
      this.new_ = 16777215;
      if (rrbb_3.K()) {
         try {
            String var1 = "optifine/color.properties";
            rqO_2 var2 = new rqO_2(var1);
            if (!rrbb_3.byte_(var2)) {
               return;
            }

            InputStream var3 = rrbb_3.class_(var2);
            rrbb_3.byte_("Loading " + var1);
            rrzE_2 var4 = new rrzE_2();
            var4.load(var3);
            var3.close();
            this.final_ = class_(var4, "screen.loading", this.final_);
            this.int_ = class_(var4, "screen.loading.outline", this.int_);
            this.package_ = class_(var4, "screen.loading.bar", this.package_);
            this.new_ = class_(var4, "screen.loading.progress", this.new_);
            this.continue_ = rrks_1.break_(var4.getProperty("screen.loading.blend"));
         } catch (Exception var5) {
            rrbb_3.protected_(var5.getClass().getName() + ": " + var5.getMessage());
         }
      }
   }
}
