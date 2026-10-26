package celestial;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;

public class cD_2 extends ch_3 {
   private final QY class_;
   private final ca_3 throws_;
   private final cU_2 case_;
   private final int catch_;
   private final OT private_;
   private final OU implements_;
   private final rdn_3 finally_;
   private final rgP_2 extends_;
   private final co_3 native_;
   private final Map<OT, co_3> volatile_ = Maps.newLinkedHashMap();
   private double final_;
   private double package_;
   private int int_ = Integer.MAX_VALUE;
   private int new_ = Integer.MAX_VALUE;
   private int continue_ = Integer.MIN_VALUE;
   private int super_ = Integer.MIN_VALUE;
   private float this_;
   private boolean else_;

   public void byte_(Ml_1 var1, int var2, int var3, int var4, int var5) {
      RenderSystem.pushMatrix();
      RenderSystem.translatef(0.0F, 0.0F, 200.0F);
      class_(var1, 0, 0, 234, 113, rfU_2.protected_(this.this_ * 255.0F) << 24);
      boolean var6 = false;
      int var7 = rfU_2.byte_(this.final_);
      int var8 = rfU_2.byte_(this.package_);
      if (var2 > 0 && var2 < 234 && var3 > 0 && var3 < 113) {
         for (co_3 var10 : this.volatile_.values()) {
            if (var10.break_(var7, var8, var2, var3)) {
               var6 = true;
               var10.class_(var1, var7, var8, this.this_, var4, var5);
               break;
            }
         }
      }

      RenderSystem.popMatrix();
      if (var6) {
         this.this_ = rfU_2.class_(this.this_ + 0.02F, 0.0F, 0.3F);
      } else {
         this.this_ = rfU_2.class_(this.this_ - 0.04F, 0.0F, 1.0F);
      }
   }

   public cD_2(QY var1, ca_3 var2, cU_2 var3, int var4, OT var5, OU var6) {
      this.class_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
      this.catch_ = var4;
      this.private_ = var5;
      this.implements_ = var6;
      this.finally_ = var6.byte_();
      this.extends_ = var6.class_();
      this.native_ = new co_3(this, var1, var5, var6);
      this.class_(this.native_, var5);
   }

   public void class_(double var1, double var3) {
      if (this.continue_ - this.int_ > 234) {
         this.final_ = rfU_2.class_(this.final_ + var1, (double)(-(this.continue_ - 234)), 0.0);
      }

      if (this.super_ - this.new_ > 113) {
         this.package_ = rfU_2.class_(this.package_ + var3, (double)(-(this.super_ - 113)), 0.0);
      }
   }

   public boolean class_(int var1, int var2, double var3, double var5) {
      return this.case_.class_(var1, var2, this.catch_, var3, var5);
   }

   public static cD_2 class_(QY var0, ca_3 var1, int var2, OT var3) {
      if (var3.byte_() == null) {
         return null;
      } else {
         for (cU_2 var7 : cU_2.values()) {
            if (var2 < var7.class_()) {
               return new cD_2(var0, var1, var7, var2, var3, var3.byte_());
            }

            var2 -= var7.class_();
         }

         return null;
      }
   }

   private void class_(co_3 var1, OT var2) {
      this.volatile_.put(var2, var1);
      int var3 = var1.throws_();
      int var4 = var3 + 28;
      int var5 = var1.protected_();
      int var6 = var5 + 27;
      this.int_ = Math.min(this.int_, var3);
      this.continue_ = Math.max(this.continue_, var4);
      this.new_ = Math.min(this.new_, var5);
      this.super_ = Math.max(this.super_, var6);

      for (co_3 var8 : this.volatile_.values()) {
         var8.class_();
      }
   }

   public void class_(OT var1) {
      if (var1.byte_() != null) {
         co_3 var2 = new co_3(this, this.class_, var1, var1.byte_());
         this.class_(var2, var1);
      }
   }

   public OT class_() {
      return this.private_;
   }

   public void class_(Ml_1 var1, int var2, int var3, boolean var4) {
      this.case_.class_(var1, this, var2, var3, var4, this.catch_);
   }

   public void class_(int var1, int var2, Hz_1 var3) {
      this.case_.class_(var1, var2, this.catch_, var3, this.finally_);
   }

   public void class_(Ml_1 var1) {
      if (!this.else_) {
         this.final_ = (double)(117 - (this.continue_ + this.int_) / 2);
         this.package_ = (double)(56 - (this.super_ + this.new_) / 2);
         this.else_ = true;
      }

      RenderSystem.pushMatrix();
      RenderSystem.enableDepthTest();
      RenderSystem.translatef(0.0F, 0.0F, 950.0F);
      RenderSystem.colorMask(false, false, false, false);
      class_(var1, 4680, 2260, -4680, -2260, -16777216);
      RenderSystem.colorMask(true, true, true, true);
      RenderSystem.translatef(0.0F, 0.0F, -950.0F);
      RenderSystem.depthFunc(518);
      class_(var1, 234, 113, 0, 0, -16777216);
      RenderSystem.depthFunc(515);
      rqO_2 var2 = this.implements_.protected_();
      if (var2 != null) {
         this.class_.A().class_(var2);
      } else {
         this.class_.A().class_(fY_2.class_);
      }

      int var3 = rfU_2.byte_(this.final_);
      int var4 = rfU_2.byte_(this.package_);
      int var5 = var3 % 16;
      int var6 = var4 % 16;

      for (int var7 = -1; var7 <= 15; var7++) {
         for (int var8 = -1; var8 <= 8; var8++) {
            class_(var1, var5 + 16 * var7, var6 + 16 * var8, 0.0F, 0.0F, 16, 16, 16, 16);
         }
      }

      this.native_.class_(var1, var3, var4, true);
      this.native_.class_(var1, var3, var4, false);
      this.native_.class_(var1, var3, var4);
      RenderSystem.depthFunc(518);
      RenderSystem.translatef(0.0F, 0.0F, -950.0F);
      RenderSystem.colorMask(false, false, false, false);
      class_(var1, 4680, 2260, -4680, -2260, -16777216);
      RenderSystem.colorMask(true, true, true, true);
      RenderSystem.translatef(0.0F, 0.0F, 950.0F);
      RenderSystem.depthFunc(515);
      RenderSystem.popMatrix();
   }

   public co_3 break_(OT var1) {
      return this.volatile_.get(var1);
   }

   public ca_3 throws_() {
      return this.throws_;
   }

   public rgP_2 protected_() {
      return this.extends_;
   }
}
