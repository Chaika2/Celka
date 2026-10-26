package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class ch_3 {
   public static final rqO_2 break_ = new rqO_2("textures/gui/options_background.png");
   public static final rqO_2 byte_ = new rqO_2("textures/gui/container/stats_icons.png");
   public static final rqO_2 protected_ = new rqO_2("textures/gui/icons.png");
   private int class_;
   private final cX_2 throws_ = new cX_2();

   public static void byte_(Ml_1 var0, cm_3 var1, String var2, int var3, int var4, int var5) {
      var1.class_(var0, var2, (float)var3, (float)var4, var5);
   }

   private static void class_(
      Ml_1 var0, float var1, float var2, float var3, float var4, int var5, float var6, float var7, float var8, float var9, int var10, int var11
   ) {
      class_(
         var0.byte_().class_(),
         var1,
         var2,
         var3,
         var4,
         var5,
         (var8 + 0.0F) / (float)var10,
         (var8 + var6) / (float)var10,
         (var9 + 0.0F) / (float)var11,
         (var9 + var7) / (float)var11
      );
   }

   private static void class_(rjV_2 var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, float var9) {
      lD_2 var10 = yb_3.class_().byte_();
      var10.class_(7, ju_3.synchronized_);
      var10.class_(var0, (float)var1, (float)var4, (float)var5).class_(var6, var9).class_();
      var10.class_(var0, (float)var2, (float)var4, (float)var5).class_(var7, var9).class_();
      var10.class_(var0, (float)var2, (float)var3, (float)var5).class_(var7, var8).class_();
      var10.class_(var0, (float)var1, (float)var3, (float)var5).class_(var6, var8).class_();
      var10.finally_();
      RenderSystem.enableAlphaTest();
      yk_3.class_(var10);
   }

   private static void class_(rjV_2 var0, float var1, float var2, float var3, float var4, int var5, float var6, float var7, float var8, float var9) {
      lD_2 var10 = yb_3.class_().byte_();
      var10.class_(7, ju_3.synchronized_);
      var10.class_(var0, var1, var4, (float)var5).class_(var6, var9).class_();
      var10.class_(var0, var2, var4, (float)var5).class_(var7, var9).class_();
      var10.class_(var0, var2, var3, (float)var5).class_(var7, var8).class_();
      var10.class_(var0, var1, var3, (float)var5).class_(var6, var8).class_();
      var10.finally_();
      RenderSystem.enableAlphaTest();
      yk_3.class_(var10);
   }

   public static void class_(Ml_1 var0, int var1, int var2, int var3, int var4, int var5, fj_3 var6, int var7) {
      class_(var0.byte_().class_(), var1, var1 + var4, var2, var2 + var5, var3, var6.case_(), var6.catch_(), var6.private_(), var6.implements_(), var7);
   }

   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class_(var1, var2, var3, this.class_, (float)var4, (float)var5, var6, var7, 256, 256, var8);
   }

   protected void class_(Ml_1 var1, int var2, int var3, int var4, int var5) {
      if (var3 < var2) {
         int var6 = var2;
         var2 = var3;
         var3 = var6;
      }

      class_(var1, var2, var4, var3 + 1, var4 + 1, var5);
   }

   public static void class_(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      class_(var0, var1, var1 + var3, var2, var2 + var4, 0, var7, var8, var5, var6, var9, var10);
   }

   public static void class_(Ml_1 var0, int var1, int var2, float var3, float var4, int var5, int var6, int var7, int var8) {
      class_(var0, var1, var2, var5, var6, var3, var4, var5, var6, var7, var8);
   }

   public static void class_(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8) {
      class_(var0, var1, var2, var5, var6, var3, var4, var5, var6, var7, var8);
   }

   private static void class_(Ml_1 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, int var10, int var11) {
      class_(
         var0.byte_().class_(),
         var1,
         var2,
         var3,
         var4,
         var5,
         (var8 + 0.0F) / (float)var10,
         (var8 + (float)var6) / (float)var10,
         (var9 + 0.0F) / (float)var11,
         (var9 + (float)var7) / (float)var11
      );
   }

   private static void class_(rjV_2 var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, float var9, int var10) {
      lD_2 var11 = yb_3.class_().byte_();
      var11.class_(7, ju_3.public_);
      var11.class_(var0, (float)var1, (float)var4, (float)var5).class_(var6, var9).class_(var10).class_();
      var11.class_(var0, (float)var2, (float)var4, (float)var5).class_(var7, var9).class_(var10).class_();
      var11.class_(var0, (float)var2, (float)var3, (float)var5).class_(var7, var8).class_(var10).class_();
      var11.class_(var0, (float)var1, (float)var3, (float)var5).class_(var6, var8).class_(var10).class_();
      var11.finally_();
      RenderSystem.enableAlphaTest();
      yk_3.class_(var11);
   }

   public void class_(int var1, int var2, int var3, int var4) {
      this.class_(this.throws_.class_(new uI_2(var1, var2, var3 - var1, var4 - var2)));
   }

   private void class_(@Nullable uI_2 var1) {
      if (var1 != null) {
         Qg_1 var2 = QY.instanceof_().else_();
         int var3 = var2.continue_();
         double var4 = var2.return_();
         double var6 = (double)var1.protected_() * var4;
         double var8 = (double)var3 - (double)var1.byte_() * var4;
         double var10 = (double)var1.catch_() * var4;
         double var12 = (double)var1.private_() * var4;
         RenderSystem.enableScissor((int)var6, (int)var8, Math.max(0, (int)var10), Math.max(0, (int)var12));
      } else {
         RenderSystem.disableScissor();
      }
   }

   public void class_(int var1) {
      this.class_ = var1;
   }

   public static void class_(Ml_1 var0, int var1, int var2, int var3, int var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      class_(var0, var1, var1 + var3, var2, var2 + var4, 0, var7, var8, var5, var6, var9, var10);
   }

   public static void class_(Ml_1 var0, int var1, int var2, int var3, float var4, float var5, int var6, int var7, int var8, int var9, int var10) {
      class_(var0, var1, var1 + var6, var2, var2 + var7, var3, var6, var7, var4, var5, var9, var8, var10);
   }

   public static void class_(Ml_1 var0, int var1, int var2, int var3, int var4, float var5, float var6, int var7, int var8, int var9, int var10, int var11) {
      class_(var0, var1, var1 + var3, var2, var2 + var4, 0, var7, var8, var5, var6, var9, var10, var11);
   }

   public static void class_(Ml_1 var0, int var1, int var2, float var3, float var4, int var5, int var6, int var7, int var8, int var9) {
      class_(var0, var1, var2, var5, var6, var3, var4, var5, var6, var7, var8, var9);
   }

   private static void class_(
      Ml_1 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, int var10, int var11, int var12
   ) {
      class_(
         var0.byte_().class_(),
         var1,
         var2,
         var3,
         var4,
         var5,
         (var8 + 0.0F) / (float)var10,
         (var8 + (float)var6) / (float)var10,
         (var9 + 0.0F) / (float)var11,
         (var9 + (float)var7) / (float)var11,
         var12
      );
   }

   protected static void class_(rjV_2 var0, lD_2 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      float var9 = (float)(var7 >> 24 & 0xFF) / 255.0F;
      float var10 = (float)(var7 >> 16 & 0xFF) / 255.0F;
      float var11 = (float)(var7 >> 8 & 0xFF) / 255.0F;
      float var12 = (float)(var7 & 0xFF) / 255.0F;
      float var13 = (float)(var8 >> 24 & 0xFF) / 255.0F;
      float var14 = (float)(var8 >> 16 & 0xFF) / 255.0F;
      float var15 = (float)(var8 >> 8 & 0xFF) / 255.0F;
      float var16 = (float)(var8 & 0xFF) / 255.0F;
      var1.class_(var0, (float)var4, (float)var3, (float)var6).class_(var10, var11, var12, var9).class_();
      var1.class_(var0, (float)var2, (float)var3, (float)var6).class_(var10, var11, var12, var9).class_();
      var1.class_(var0, (float)var2, (float)var5, (float)var6).class_(var14, var15, var16, var13).class_();
      var1.class_(var0, (float)var4, (float)var5, (float)var6).class_(var14, var15, var16, var13).class_();
   }

   public static void class_(Ml_1 var0, cm_3 var1, String var2, int var3, int var4, int var5) {
      var1.class_(var0, var2, (float)(var3 - var1.break_(var2) / 2), (float)var4, var5);
   }

   public static void class_(Ml_1 var0, int var1, int var2, int var3, int var4, int var5) {
      class_(var0.byte_().class_(), var1, var2, var3, var4, var5);
   }

   public static void class_(Ml_1 var0, cm_3 var1, rgP_2 var2, int var3, int var4, int var5) {
      rpl_3 var6 = var2.catch_();
      var1.class_(var0, var6, (float)(var3 - var1.class_(var6) / 2), (float)var4, var5);
   }

   public static void class_(Ml_1 var0, cm_3 var1, rgP_2 var2, int var3, float var4, int var5) {
      rpl_3 var6 = var2.catch_();
      var1.class_(var0, var6, (float)(var3 - var1.class_(var6) / 2), var4, var5);
   }

   public static void class_(Ml_1 var0, float var1, float var2, float var3, float var4, int var5) {
      class_(var0.byte_().class_(), var1, var2, var3, var4, var5);
   }

   private static void class_(rjV_2 var0, int var1, int var2, int var3, int var4, int var5) {
      if (var1 < var3) {
         int var6 = var1;
         var1 = var3;
         var3 = var6;
      }

      if (var2 < var4) {
         int var11 = var2;
         var2 = var4;
         var4 = var11;
      }

      float var12 = (float)(var5 >> 24 & 0xFF) / 255.0F;
      float var7 = (float)(var5 >> 16 & 0xFF) / 255.0F;
      float var8 = (float)(var5 >> 8 & 0xFF) / 255.0F;
      float var9 = (float)(var5 & 0xFF) / 255.0F;
      lD_2 var10 = yb_3.class_().byte_();
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.defaultBlendFunc();
      var10.class_(7, ju_3.this_);
      var10.class_(var0, (float)var1, (float)var4, 0.0F).class_(var7, var8, var9, var12).class_();
      var10.class_(var0, (float)var3, (float)var4, 0.0F).class_(var7, var8, var9, var12).class_();
      var10.class_(var0, (float)var3, (float)var2, 0.0F).class_(var7, var8, var9, var12).class_();
      var10.class_(var0, (float)var1, (float)var2, 0.0F).class_(var7, var8, var9, var12).class_();
      var10.finally_();
      yk_3.class_(var10);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
   }

   private static void class_(rjV_2 var0, float var1, float var2, float var3, float var4, int var5) {
      if (var1 < var3) {
         float var6 = var1;
         var1 = var3;
         var3 = var6;
      }

      if (var2 < var4) {
         float var11 = var2;
         var2 = var4;
         var4 = var11;
      }

      float var12 = (float)(var5 >> 24 & 0xFF) / 255.0F;
      float var7 = (float)(var5 >> 16 & 0xFF) / 255.0F;
      float var8 = (float)(var5 >> 8 & 0xFF) / 255.0F;
      float var9 = (float)(var5 & 0xFF) / 255.0F;
      lD_2 var10 = yb_3.class_().byte_();
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.defaultBlendFunc();
      var10.class_(7, ju_3.this_);
      var10.class_(var0, var1, var4, 0.0F).class_(var7, var8, var9, var12).class_();
      var10.class_(var0, var3, var4, 0.0F).class_(var7, var8, var9, var12).class_();
      var10.class_(var0, var3, var2, 0.0F).class_(var7, var8, var9, var12).class_();
      var10.class_(var0, var1, var2, 0.0F).class_(var7, var8, var9, var12).class_();
      var10.finally_();
      yk_3.class_(var10);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
   }

   protected void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      RenderSystem.disableTexture();
      RenderSystem.enableBlend();
      RenderSystem.disableAlphaTest();
      RenderSystem.defaultBlendFunc();
      RenderSystem.shadeModel(7425);
      yb_3 var8 = yb_3.class_();
      lD_2 var9 = var8.byte_();
      var9.class_(7, ju_3.this_);
      class_(var1.byte_().class_(), var9, var2, var3, var4, var5, this.class_, var6, var7);
      var8.break_();
      RenderSystem.shadeModel(7424);
      RenderSystem.disableBlend();
      RenderSystem.enableAlphaTest();
      RenderSystem.enableTexture();
   }

   public void class_(int var1, int var2, BiConsumer<Integer, Integer> var3) {
      RenderSystem.blendFuncSeparate(OP.ZERO, MK.ONE_MINUS_SRC_ALPHA, OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
      var3.accept(var1 + 1, var2);
      var3.accept(var1 - 1, var2);
      var3.accept(var1, var2 + 1);
      var3.accept(var1, var2 - 1);
      RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
      var3.accept(var1, var2);
   }

   public static void class_(Ml_1 var0, int var1, int var2, int var3, int var4, int var5, fj_3 var6) {
      class_(var0.byte_().class_(), var1, var1 + var4, var2, var2 + var5, var3, var6.case_(), var6.catch_(), var6.private_(), var6.implements_());
   }

   public static void class_(Ml_1 var0, float var1, float var2, int var3, int var4, int var5, fj_3 var6) {
      class_(var0.byte_().class_(), var1, var1 + (float)var4, var2, var2 + (float)var5, var3, var6.case_(), var6.catch_(), var6.private_(), var6.implements_());
   }

   public static void class_(Ml_1 var0, int var1, int var2, int var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      class_(var0, var1, var1 + var6, var2, var2 + var7, var3, var6, var7, var4, var5, var9, var8);
   }

   public static void class_(Ml_1 var0, cm_3 var1, rgP_2 var2, float var3, float var4, int var5) {
      rpl_3 var6 = var2.catch_();
      var1.class_(var0, var6, var3 - (float)(var1.class_(var6) / 2), var4, var5);
   }

   public static void break_(Ml_1 var0, cm_3 var1, String var2, int var3, int var4, int var5) {
      var1.class_(var0, var2, (float)var3, (float)var4, var5);
   }

   public void break_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class_(var1, var2, var3, this.class_, (float)var4, (float)var5, var6, var7, 256, 256);
   }

   public static void break_(Ml_1 var0, cm_3 var1, rgP_2 var2, int var3, int var4, int var5) {
      var1.break_(var0, var2, (float)var3, (float)var4, var5);
   }

   protected void break_(Ml_1 var1, int var2, int var3, int var4, int var5) {
      if (var4 < var3) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      class_(var1, var2, var3 + 1, var2 + 1, var4, var5);
   }

   public void y_() {
      this.class_(this.throws_.class_());
   }

   public int h_() {
      return this.class_;
   }
}
