package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class ch_3 {
   public static final rqO_2 id_break = new rqO_2("textures/gui/options_background.png");
   public static final rqO_2 id_byte = new rqO_2("textures/gui/container/stats_icons.png");
   public static final rqO_2 id_protected = new rqO_2("textures/gui/icons.png");
   private int id_class;
   private final cX_2 id_throws = new cX_2();

   public static void id_byte(Ml_1 var0, cm_3 var1, String var2, int var3, int var4, int var5) {
      var1.id_class(var0, var2, (float)var3, (float)var4, var5);
   }

   private static void id_class(
      Ml_1 var0, float var1, float var2, float var3, float var4, int var5, float var6, float var7, float var8, float var9, int var10, int var11
   ) {
      id_class(
         var0.id_byte().id_class(),
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

   private static void id_class(rjV_2 var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, float var9) {
      lD_2 var10 = yb_3.id_class().id_byte();
      var10.id_class(7, ju_3.id_synchronized);
      var10.id_class(var0, (float)var1, (float)var4, (float)var5).id_class(var6, var9).id_class();
      var10.id_class(var0, (float)var2, (float)var4, (float)var5).id_class(var7, var9).id_class();
      var10.id_class(var0, (float)var2, (float)var3, (float)var5).id_class(var7, var8).id_class();
      var10.id_class(var0, (float)var1, (float)var3, (float)var5).id_class(var6, var8).id_class();
      var10.id_finally();
      RenderSystem.enableAlphaTest();
      yk_3.id_class(var10);
   }

   private static void id_class(rjV_2 var0, float var1, float var2, float var3, float var4, int var5, float var6, float var7, float var8, float var9) {
      lD_2 var10 = yb_3.id_class().id_byte();
      var10.id_class(7, ju_3.id_synchronized);
      var10.id_class(var0, var1, var4, (float)var5).id_class(var6, var9).id_class();
      var10.id_class(var0, var2, var4, (float)var5).id_class(var7, var9).id_class();
      var10.id_class(var0, var2, var3, (float)var5).id_class(var7, var8).id_class();
      var10.id_class(var0, var1, var3, (float)var5).id_class(var6, var8).id_class();
      var10.id_finally();
      RenderSystem.enableAlphaTest();
      yk_3.id_class(var10);
   }

   public static void id_class(Ml_1 var0, int var1, int var2, int var3, int var4, int var5, fj_3 var6, int var7) {
      id_class(
         var0.id_byte().id_class(), var1, var1 + var4, var2, var2 + var5, var3, var6.id_case(), var6.id_catch(), var6.id_private(), var6.id_implements(), var7
      );
   }

   public void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      id_class(var1, var2, var3, this.id_class, (float)var4, (float)var5, var6, var7, 256, 256, var8);
   }

   protected void id_class(Ml_1 var1, int var2, int var3, int var4, int var5) {
      if (var3 < var2) {
         int var6 = var2;
         var2 = var3;
         var3 = var6;
      }

      id_class(var1, var2, var4, var3 + 1, var4 + 1, var5);
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      id_class(var0, var1, var1 + var3, var2, var2 + var4, 0, var7, var8, var5, var6, var9, var10);
   }

   public static void id_class(Ml_1 var0, int var1, int var2, float var3, float var4, int var5, int var6, int var7, int var8) {
      id_class(var0, var1, var2, var5, var6, var3, var4, var5, var6, var7, var8);
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8) {
      id_class(var0, var1, var2, var5, var6, var3, var4, var5, var6, var7, var8);
   }

   private static void id_class(Ml_1 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, int var10, int var11) {
      id_class(
         var0.id_byte().id_class(),
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

   private static void id_class(rjV_2 var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, float var9, int var10) {
      lD_2 var11 = yb_3.id_class().id_byte();
      var11.id_class(7, ju_3.id_public);
      var11.id_class(var0, (float)var1, (float)var4, (float)var5).id_class(var6, var9).id_class(var10).id_class();
      var11.id_class(var0, (float)var2, (float)var4, (float)var5).id_class(var7, var9).id_class(var10).id_class();
      var11.id_class(var0, (float)var2, (float)var3, (float)var5).id_class(var7, var8).id_class(var10).id_class();
      var11.id_class(var0, (float)var1, (float)var3, (float)var5).id_class(var6, var8).id_class(var10).id_class();
      var11.id_finally();
      RenderSystem.enableAlphaTest();
      yk_3.id_class(var11);
   }

   public void id_class(int var1, int var2, int var3, int var4) {
      this.id_class(this.id_throws.id_class(new uI_2(var1, var2, var3 - var1, var4 - var2)));
   }

   private void id_class(@Nullable uI_2 var1) {
      if (var1 != null) {
         Qg_1 var2 = QY.id_instanceof().id_else();
         int var3 = var2.id_continue();
         double var4 = var2.id_return();
         double var6 = (double)var1.id_protected() * var4;
         double var8 = (double)var3 - (double)var1.id_byte() * var4;
         double var10 = (double)var1.id_catch() * var4;
         double var12 = (double)var1.id_private() * var4;
         RenderSystem.enableScissor((int)var6, (int)var8, Math.max(0, (int)var10), Math.max(0, (int)var12));
      } else {
         RenderSystem.disableScissor();
      }
   }

   public void id_class(int var1) {
      this.id_class = var1;
   }

   public static void id_class(Ml_1 var0, int var1, int var2, int var3, int var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      id_class(var0, var1, var1 + var3, var2, var2 + var4, 0, var7, var8, var5, var6, var9, var10);
   }

   public static void id_class(Ml_1 var0, int var1, int var2, int var3, float var4, float var5, int var6, int var7, int var8, int var9, int var10) {
      id_class(var0, var1, var1 + var6, var2, var2 + var7, var3, var6, var7, var4, var5, var9, var8, var10);
   }

   public static void id_class(Ml_1 var0, int var1, int var2, int var3, int var4, float var5, float var6, int var7, int var8, int var9, int var10, int var11) {
      id_class(var0, var1, var1 + var3, var2, var2 + var4, 0, var7, var8, var5, var6, var9, var10, var11);
   }

   public static void id_class(Ml_1 var0, int var1, int var2, float var3, float var4, int var5, int var6, int var7, int var8, int var9) {
      id_class(var0, var1, var2, var5, var6, var3, var4, var5, var6, var7, var8, var9);
   }

   private static void id_class(
      Ml_1 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, int var10, int var11, int var12
   ) {
      id_class(
         var0.id_byte().id_class(),
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

   protected static void id_class(rjV_2 var0, lD_2 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      float var9 = (float)(var7 >> 24 & 0xFF) / 255.0F;
      float var10 = (float)(var7 >> 16 & 0xFF) / 255.0F;
      float var11 = (float)(var7 >> 8 & 0xFF) / 255.0F;
      float var12 = (float)(var7 & 0xFF) / 255.0F;
      float var13 = (float)(var8 >> 24 & 0xFF) / 255.0F;
      float var14 = (float)(var8 >> 16 & 0xFF) / 255.0F;
      float var15 = (float)(var8 >> 8 & 0xFF) / 255.0F;
      float var16 = (float)(var8 & 0xFF) / 255.0F;
      var1.id_class(var0, (float)var4, (float)var3, (float)var6).id_class(var10, var11, var12, var9).id_class();
      var1.id_class(var0, (float)var2, (float)var3, (float)var6).id_class(var10, var11, var12, var9).id_class();
      var1.id_class(var0, (float)var2, (float)var5, (float)var6).id_class(var14, var15, var16, var13).id_class();
      var1.id_class(var0, (float)var4, (float)var5, (float)var6).id_class(var14, var15, var16, var13).id_class();
   }

   public static void id_class(Ml_1 var0, cm_3 var1, String var2, int var3, int var4, int var5) {
      var1.id_class(var0, var2, (float)(var3 - var1.id_break(var2) / 2), (float)var4, var5);
   }

   public static void id_class(Ml_1 var0, int var1, int var2, int var3, int var4, int var5) {
      id_class(var0.id_byte().id_class(), var1, var2, var3, var4, var5);
   }

   public static void id_class(Ml_1 var0, cm_3 var1, rgP_2 var2, int var3, int var4, int var5) {
      rpl_3 var6 = var2.id_catch();
      var1.id_class(var0, var6, (float)(var3 - var1.id_class(var6) / 2), (float)var4, var5);
   }

   public static void id_class(Ml_1 var0, cm_3 var1, rgP_2 var2, int var3, float var4, int var5) {
      rpl_3 var6 = var2.id_catch();
      var1.id_class(var0, var6, (float)(var3 - var1.id_class(var6) / 2), var4, var5);
   }

   public static void id_class(Ml_1 var0, float var1, float var2, float var3, float var4, int var5) {
      id_class(var0.id_byte().id_class(), var1, var2, var3, var4, var5);
   }

   private static void id_class(rjV_2 var0, int var1, int var2, int var3, int var4, int var5) {
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
      lD_2 var10 = yb_3.id_class().id_byte();
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.defaultBlendFunc();
      var10.id_class(7, ju_3.id_this);
      var10.id_class(var0, (float)var1, (float)var4, 0.0F).id_class(var7, var8, var9, var12).id_class();
      var10.id_class(var0, (float)var3, (float)var4, 0.0F).id_class(var7, var8, var9, var12).id_class();
      var10.id_class(var0, (float)var3, (float)var2, 0.0F).id_class(var7, var8, var9, var12).id_class();
      var10.id_class(var0, (float)var1, (float)var2, 0.0F).id_class(var7, var8, var9, var12).id_class();
      var10.id_finally();
      yk_3.id_class(var10);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
   }

   private static void id_class(rjV_2 var0, float var1, float var2, float var3, float var4, int var5) {
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
      lD_2 var10 = yb_3.id_class().id_byte();
      RenderSystem.enableBlend();
      RenderSystem.disableTexture();
      RenderSystem.defaultBlendFunc();
      var10.id_class(7, ju_3.id_this);
      var10.id_class(var0, var1, var4, 0.0F).id_class(var7, var8, var9, var12).id_class();
      var10.id_class(var0, var3, var4, 0.0F).id_class(var7, var8, var9, var12).id_class();
      var10.id_class(var0, var3, var2, 0.0F).id_class(var7, var8, var9, var12).id_class();
      var10.id_class(var0, var1, var2, 0.0F).id_class(var7, var8, var9, var12).id_class();
      var10.id_finally();
      yk_3.id_class(var10);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
   }

   protected void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      RenderSystem.disableTexture();
      RenderSystem.enableBlend();
      RenderSystem.disableAlphaTest();
      RenderSystem.defaultBlendFunc();
      RenderSystem.shadeModel(7425);
      yb_3 var8 = yb_3.id_class();
      lD_2 var9 = var8.id_byte();
      var9.id_class(7, ju_3.id_this);
      id_class(var1.id_byte().id_class(), var9, var2, var3, var4, var5, this.id_class, var6, var7);
      var8.id_break();
      RenderSystem.shadeModel(7424);
      RenderSystem.disableBlend();
      RenderSystem.enableAlphaTest();
      RenderSystem.enableTexture();
   }

   public void id_class(int var1, int var2, BiConsumer<Integer, Integer> var3) {
      RenderSystem.blendFuncSeparate(OP.ZERO, MK.ONE_MINUS_SRC_ALPHA, OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
      var3.accept(var1 + 1, var2);
      var3.accept(var1 - 1, var2);
      var3.accept(var1, var2 + 1);
      var3.accept(var1, var2 - 1);
      RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
      var3.accept(var1, var2);
   }

   public static void id_class(Ml_1 var0, int var1, int var2, int var3, int var4, int var5, fj_3 var6) {
      id_class(var0.id_byte().id_class(), var1, var1 + var4, var2, var2 + var5, var3, var6.id_case(), var6.id_catch(), var6.id_private(), var6.id_implements());
   }

   public static void id_class(Ml_1 var0, float var1, float var2, int var3, int var4, int var5, fj_3 var6) {
      id_class(
         var0.id_byte().id_class(),
         var1,
         var1 + (float)var4,
         var2,
         var2 + (float)var5,
         var3,
         var6.id_case(),
         var6.id_catch(),
         var6.id_private(),
         var6.id_implements()
      );
   }

   public static void id_class(Ml_1 var0, int var1, int var2, int var3, float var4, float var5, int var6, int var7, int var8, int var9) {
      id_class(var0, var1, var1 + var6, var2, var2 + var7, var3, var6, var7, var4, var5, var9, var8);
   }

   public static void id_class(Ml_1 var0, cm_3 var1, rgP_2 var2, float var3, float var4, int var5) {
      rpl_3 var6 = var2.id_catch();
      var1.id_class(var0, var6, var3 - (float)(var1.id_class(var6) / 2), var4, var5);
   }

   public static void id_break(Ml_1 var0, cm_3 var1, String var2, int var3, int var4, int var5) {
      var1.id_class(var0, var2, (float)var3, (float)var4, var5);
   }

   public void id_break(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      id_class(var1, var2, var3, this.id_class, (float)var4, (float)var5, var6, var7, 256, 256);
   }

   public static void id_break(Ml_1 var0, cm_3 var1, rgP_2 var2, int var3, int var4, int var5) {
      var1.id_break(var0, var2, (float)var3, (float)var4, var5);
   }

   protected void id_break(Ml_1 var1, int var2, int var3, int var4, int var5) {
      if (var4 < var3) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      id_class(var1, var2, var3 + 1, var2 + 1, var4, var5);
   }

   public void y_() {
      this.id_class(this.id_throws.id_class());
   }

   public int h_() {
      return this.id_class;
   }
}
