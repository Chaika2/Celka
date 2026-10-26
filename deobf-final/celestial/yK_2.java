package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Optional;
import java.util.function.Predicate;

public class yK_2 {
   public final ps_3 class_ = new ps_3();
   public final yD_2 break_;
   public final yD_2 byte_;
   public final yD_2 protected_;
   public final yD_2 throws_;
   public final yD_2 case_;
   public final yV_2 catch_;
   public final ph_3 private_;
   public final yD_2 implements_;
   public final yD_2 finally_;
   public final yD_2 extends_;
   public final yD_2 native_;
   public final pE_2 volatile_;
   public final pX_2 final_;
   public final yI_2 package_;
   public final pM_2 int_;
   public final yU_2 new_;
   public final ya_3 continue_;
   private boolean super_;

   public yK_2(QY var1) {
      this.break_ = new pJ_2(var1);
      this.byte_ = new yg_3(var1);
      this.protected_ = new pr_3(var1);
      this.throws_ = new yo_3(var1);
      this.case_ = new pS_2(var1);
      this.catch_ = new yV_2();
      this.private_ = new ph_3(var1);
      this.implements_ = new pB_2(var1);
      this.finally_ = new px_3();
      this.extends_ = new pO_2(var1);
      this.native_ = new yR_2(var1);
      this.volatile_ = new pE_2(var1);
      this.final_ = new pX_2();
      this.package_ = new yI_2(var1);
      this.int_ = new pM_2(var1);
      this.new_ = new yU_2(var1);
      this.continue_ = new ya_3();
   }

   public static void class_(String var0, double var1, double var3, double var5, int var7) {
      class_(var0, var1, var3, var5, var7, 0.02F);
   }

   public static void class_(String var0, int var1, int var2, int var3, int var4) {
      class_(var0, (double)var1 + 0.5, (double)var2 + 0.5, (double)var3 + 0.5, var4);
   }

   public static void class_(double var0, double var2, double var4, double var6, double var8, double var10, float var12, float var13, float var14, float var15) {
      yb_3 var16 = yb_3.class_();
      lD_2 var17 = var16.byte_();
      var17.class_(5, ju_3.this_);
      yX_2.class_(var17, var0, var2, var4, var6, var8, var10, var12, var13, var14, var15);
      var16.break_();
   }

   public static void class_(rfl_3 var0, float var1, float var2, float var3, float var4) {
      class_(var0.class_, var0.break_, var0.byte_, var0.protected_, var0.throws_, var0.case_, var1, var2, var3, var4);
   }

   public static void class_(String var0, double var1, double var3, double var5, int var7, float var8) {
      class_(var0, var1, var3, var5, var7, var8, true, 0.0F, false);
   }

   public static void class_(String var0, double var1, double var3, double var5, int var7, float var8, boolean var9, float var10, boolean var11) {
      QY var12 = QY.instanceof_();
      ly_3 var13 = ((Hh_1)var12.class_[16]).finally_();
      if (var13.private_() && var12.case_().protected_ != null) {
         cm_3 var14 = (cm_3)var12.class_[15];
         double var15 = var13.break_().break_;
         double var17 = var13.break_().byte_;
         double var19 = var13.break_().protected_;
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)(var1 - var15), (float)(var3 - var17) + 0.07F, (float)(var5 - var19));
         RenderSystem.normal3f(0.0F, 1.0F, 0.0F);
         RenderSystem.multMatrix(new rjV_2(var13.case_()));
         RenderSystem.scalef(var8, -var8, var8);
         RenderSystem.enableTexture();
         if (var11) {
            RenderSystem.disableDepthTest();
         } else {
            RenderSystem.enableDepthTest();
         }

         RenderSystem.depthMask(true);
         RenderSystem.scalef(-1.0F, 1.0F, 1.0F);
         float var21 = var9 ? (float)(-var14.break_(var0)) / 2.0F : 0.0F;
         var21 -= var10 / var8;
         RenderSystem.enableAlphaTest();
         Hd_1 var22 = Hx_1.class_(yb_3.class_().byte_());
         var14.class_(var0, var21, 0.0F, var7, false, rjo_3.class_().byte_(), var22, var11, 0, 15728880);
         var22.break_();
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.enableDepthTest();
         RenderSystem.popMatrix();
      }
   }

   public void class_() {
      this.class_.class_();
      this.break_.class_();
      this.byte_.class_();
      this.protected_.class_();
      this.throws_.class_();
      this.case_.class_();
      this.catch_.class_();
      this.private_.class_();
      this.implements_.class_();
      this.finally_.class_();
      this.extends_.class_();
      this.native_.class_();
      this.volatile_.class_();
      this.final_.class_();
      this.package_.class_();
      this.int_.class_();
      this.new_.class_();
      this.continue_.class_();
   }

   public void class_(Ml_1 var1, Hd_1 var2, double var3, double var5, double var7) {
      if (this.super_ && !QY.instanceof_().E()) {
         this.byte_.class_(var1, var2, var3, var5, var7);
      }
   }

   public static Optional<an_3> class_(an_3 var0, int var1) {
      if (var0 == null) {
         return Optional.empty();
      } else {
         rjU_2 var2 = var0.new_(1.0F);
         rjU_2 var3 = var0.break_(1.0F).class_((double)var1);
         rjU_2 var4 = var2.throws_(var3);
         rfl_3 var5 = var0.rN().break_(var3).class_(1.0);
         int var6 = var1 * var1;
         Predicate var7 = var0x -> !var0x.native_() && var0x.rY();
         rfo_3 var8 = rhj_3.class_(var0, var2, var4, var5, var7, (double)var6);
         if (var8 == null) {
            return Optional.empty();
         } else {
            return var2.implements_(var8.case_()) > (double)var6 ? Optional.empty() : Optional.of(var8.class_());
         }
      }
   }

   public static void class_(rfH_2 var0, rfH_2 var1, float var2, float var3, float var4, float var5) {
      ly_3 var6 = ((Hh_1)QY.instanceof_().class_[16]).finally_();
      if (var6.private_()) {
         rjU_2 var7 = var6.break_().throws_();
         rfl_3 var8 = new rfl_3(var0, var1).protected_(var7);
         class_(var8, var2, var3, var4, var5);
      }
   }

   public static void class_(rfH_2 var0, float var1, float var2, float var3, float var4, float var5) {
      ly_3 var6 = ((Hh_1)QY.instanceof_().class_[16]).finally_();
      if (var6.private_()) {
         rjU_2 var7 = var6.break_().throws_();
         rfl_3 var8 = new rfl_3(var0).protected_(var7).class_((double)var1);
         class_(var8, var2, var3, var4, var5);
      }
   }

   public boolean break_() {
      this.super_ = !this.super_;
      return this.super_;
   }
}
