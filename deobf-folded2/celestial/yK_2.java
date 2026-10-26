package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Optional;
import java.util.function.Predicate;

public class yK_2 {
   public final ps_3 id_class = new ps_3();
   public final yD_2 id_break;
   public final yD_2 id_byte;
   public final yD_2 id_protected;
   public final yD_2 id_throws;
   public final yD_2 id_case;
   public final yV_2 id_catch;
   public final ph_3 id_private;
   public final yD_2 id_implements;
   public final yD_2 id_finally;
   public final yD_2 id_extends;
   public final yD_2 id_native;
   public final pE_2 id_volatile;
   public final pX_2 id_final;
   public final yI_2 id_package;
   public final pM_2 id_int;
   public final yU_2 id_new;
   public final ya_3 id_continue;
   private boolean id_super;

   public yK_2(QY var1) {
      this.id_break = new pJ_2(var1);
      this.id_byte = new yg_3(var1);
      this.id_protected = new pr_3(var1);
      this.id_throws = new yo_3(var1);
      this.id_case = new pS_2(var1);
      this.id_catch = new yV_2();
      this.id_private = new ph_3(var1);
      this.id_implements = new pB_2(var1);
      this.id_finally = new px_3();
      this.id_extends = new pO_2(var1);
      this.id_native = new yR_2(var1);
      this.id_volatile = new pE_2(var1);
      this.id_final = new pX_2();
      this.id_package = new yI_2(var1);
      this.id_int = new pM_2(var1);
      this.id_new = new yU_2(var1);
      this.id_continue = new ya_3();
   }

   public static void id_class(String var0, double var1, double var3, double var5, int var7) {
      id_class(var0, var1, var3, var5, var7, 0.02F);
   }

   public static void id_class(String var0, int var1, int var2, int var3, int var4) {
      id_class(var0, (double)var1 + 0.5, (double)var2 + 0.5, (double)var3 + 0.5, var4);
   }

   public static void id_class(
      double var0, double var2, double var4, double var6, double var8, double var10, float var12, float var13, float var14, float var15
   ) {
      yb_3 var16 = yb_3.id_class();
      lD_2 var17 = var16.id_byte();
      var17.id_class(5, ju_3.id_this);
      yX_2.id_class(var17, var0, var2, var4, var6, var8, var10, var12, var13, var14, var15);
      var16.id_break();
   }

   public static void id_class(rfl_3 var0, float var1, float var2, float var3, float var4) {
      id_class(var0.id_class, var0.id_break, var0.id_byte, var0.id_protected, var0.id_throws, var0.id_case, var1, var2, var3, var4);
   }

   public static void id_class(String var0, double var1, double var3, double var5, int var7, float var8) {
      id_class(var0, var1, var3, var5, var7, var8, true, 0.0F, false);
   }

   public static void id_class(String var0, double var1, double var3, double var5, int var7, float var8, boolean var9, float var10, boolean var11) {
      QY var12 = QY.id_instanceof();
      ly_3 var13 = ((Hh_1)var12.id_class[16]).id_finally();
      if (var13.id_private() && var12.id_case().id_protected != null) {
         cm_3 var14 = (cm_3)var12.id_class[15];
         double var15 = var13.id_break().id_break;
         double var17 = var13.id_break().id_byte;
         double var19 = var13.id_break().id_protected;
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)(var1 - var15), (float)(var3 - var17) + 0.07F, (float)(var5 - var19));
         RenderSystem.normal3f(0.0F, 1.0F, 0.0F);
         RenderSystem.multMatrix(new rjV_2(var13.id_case()));
         RenderSystem.scalef(var8, -var8, var8);
         RenderSystem.enableTexture();
         if (var11) {
            RenderSystem.disableDepthTest();
         } else {
            RenderSystem.enableDepthTest();
         }

         RenderSystem.depthMask(true);
         RenderSystem.scalef(-1.0F, 1.0F, 1.0F);
         float var21 = var9 ? (float)(-var14.id_break(var0)) / 2.0F : 0.0F;
         var21 -= var10 / var8;
         RenderSystem.enableAlphaTest();
         Hd_1 var22 = Hx_1.id_class(yb_3.id_class().id_byte());
         var14.id_class(var0, var21, 0.0F, var7, false, rjo_3.id_class().id_byte(), var22, var11, 0, 15728880);
         var22.id_break();
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.enableDepthTest();
         RenderSystem.popMatrix();
      }
   }

   public void id_class() {
      this.id_class.id_class();
      this.id_break.id_class();
      this.id_byte.id_class();
      this.id_protected.id_class();
      this.id_throws.id_class();
      this.id_case.id_class();
      this.id_catch.id_class();
      this.id_private.id_class();
      this.id_implements.id_class();
      this.id_finally.id_class();
      this.id_extends.id_class();
      this.id_native.id_class();
      this.id_volatile.id_class();
      this.id_final.id_class();
      this.id_package.id_class();
      this.id_int.id_class();
      this.id_new.id_class();
      this.id_continue.id_class();
   }

   public void id_class(Ml_1 var1, Hd_1 var2, double var3, double var5, double var7) {
      if (this.id_super && !QY.id_instanceof().E()) {
         this.id_byte.id_class(var1, var2, var3, var5, var7);
      }
   }

   public static Optional<an_3> id_class(an_3 var0, int var1) {
      if (var0 == null) {
         return Optional.empty();
      } else {
         rjU_2 var2 = var0.id_new(1.0F);
         rjU_2 var3 = var0.id_break(1.0F).id_class((double)var1);
         rjU_2 var4 = var2.id_throws(var3);
         rfl_3 var5 = var0.rN().id_break(var3).id_class(1.0);
         int var6 = var1 * var1;
         Predicate var7 = var0x -> !var0x.id_native() && var0x.rY();
         rfo_3 var8 = rhj_3.id_class(var0, var2, var4, var5, var7, (double)var6);
         if (var8 == null) {
            return Optional.empty();
         } else {
            return var2.id_implements(var8.id_case()) > (double)var6 ? Optional.empty() : Optional.of(var8.id_class());
         }
      }
   }

   public static void id_class(rfH_2 var0, rfH_2 var1, float var2, float var3, float var4, float var5) {
      ly_3 var6 = ((Hh_1)QY.id_instanceof().id_class[16]).id_finally();
      if (var6.id_private()) {
         rjU_2 var7 = var6.id_break().id_throws();
         rfl_3 var8 = new rfl_3(var0, var1).id_protected(var7);
         id_class(var8, var2, var3, var4, var5);
      }
   }

   public static void id_class(rfH_2 var0, float var1, float var2, float var3, float var4, float var5) {
      ly_3 var6 = ((Hh_1)QY.id_instanceof().id_class[16]).id_finally();
      if (var6.id_private()) {
         rjU_2 var7 = var6.id_break().id_throws();
         rfl_3 var8 = new rfl_3(var0).id_protected(var7).id_class((double)var1);
         id_class(var8, var2, var3, var4, var5);
      }
   }

   public boolean id_break() {
      this.id_super = !this.id_super;
      return this.id_super;
   }
}
