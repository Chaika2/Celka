package celestial;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;

public class ca_3 extends vm_3 implements AM {
   private static final rqO_2 class_ = new rqO_2("textures/gui/advancements/window.png");
   private static final rqO_2 throws_ = new rqO_2("textures/gui/advancements/tabs.png");
   private static final rgP_2 case_ = new rgn_3("advancements.sad_label");
   private static final rgP_2 catch_ = new rgn_3("advancements.empty");
   private static final rgP_2 private_ = new rgn_3("gui.advancements");
   private final Ab_1 implements_;
   private final Map<OT, cD_2> finally_ = Maps.newLinkedHashMap();
   private cD_2 else_;
   private boolean synchronized_;

   private void byte_(Ml_1 var1, int var2, int var3, int var4, int var5) {
      cD_2 var6 = this.else_;
      if (var6 == null) {
         class_(var1, var4 + 9, var5 + 18, var4 + 9 + 234, var5 + 18 + 113, -16777216);
         int var7 = var4 + 9 + 117;
         class_(var1, this.super_, catch_, var7, var5 + 18 + 56 - 4, -1);
         class_(var1, this.super_, case_, var7, var5 + 18 + 113 - 9, -1);
      } else {
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)(var4 + 9), (float)(var5 + 18), 0.0F);
         var6.class_(var1);
         RenderSystem.popMatrix();
         RenderSystem.depthFunc(515);
         RenderSystem.disableDepthTest();
      }
   }

   @Override
   public void byte_(OT var1) {
      cD_2 var2 = this.catch_(var1);
      if (var2 != null) {
         var2.class_(var1);
      }
   }

   public ca_3(Ab_1 var1) {
      super(rgN_2.byte_);
      this.implements_ = var1;
   }

   public void class_(Ml_1 var1, int var2, int var3) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.enableBlend();
      this.volatile_.A().class_(class_);
      this.break_(var1, var2, var3, 0, 0, 252, 140);
      if (this.finally_.size() > 1) {
         this.volatile_.A().class_(throws_);

         for (cD_2 var5 : this.finally_.values()) {
            var5.class_(var1, var2, var3, var5 == this.else_);
         }

         RenderSystem.enableRescaleNormal();
         RenderSystem.defaultBlendFunc();

         for (cD_2 var7 : this.finally_.values()) {
            var7.class_(var2, var3, this.final_);
         }

         RenderSystem.disableBlend();
      }

      this.super_.byte_(var1, private_, (float)(var2 + 8), (float)(var3 + 6), 4210752);
   }

   @Override
   public void class_(OT var1) {
      cD_2 var2 = cD_2.class_(this.volatile_, this, this.finally_.size(), var1);
      if (var2 != null) {
         this.finally_.put(var1, var2);
      }
   }

   @Override
   public void class_(OT var1, Oj_1 var2) {
      co_3 var3 = this.case_(var1);
      if (var3 != null) {
         var3.class_(var2);
      }
   }

   @Override
   public void class_() {
      this.finally_.clear();
      this.else_ = null;
   }

   @Override
   public boolean class_(double var1, double var3, int var5, double var6, double var8) {
      if (var5 != 0) {
         this.synchronized_ = false;
         return false;
      } else {
         if (!this.synchronized_) {
            this.synchronized_ = true;
         } else if (this.else_ != null) {
            this.else_.class_(var6, var8);
         }

         return true;
      }
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (((Qw_1)this.volatile_.class_[20]).q.class_(var1, var2)) {
         this.volatile_.break_((vm_3)null);
         ((Qi_1)this.volatile_.class_[22]).catch_();
         return true;
      } else {
         return super.class_(var1, var2, var3);
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      int var5 = (this.package_ - 252) / 2;
      int var6 = (this.int_ - 140) / 2;
      this.class_(var1);
      this.byte_(var1, var2, var3, var5, var6);
      this.class_(var1, var5, var6);
      this.protected_(var1, var2, var3, var5, var6);
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (var5 == 0) {
         int var6 = (this.package_ - 252) / 2;
         int var7 = (this.int_ - 140) / 2;

         for (cD_2 var9 : this.finally_.values()) {
            if (var9.class_(var6, var7, var1, var3)) {
               this.implements_.class_(var9.class_(), true);
               break;
            }
         }
      }

      return super.break_(var1, var3, var5);
   }

   @Override
   public void break_(OT var1) {
   }

   @Override
   public void throws_(OT var1) {
      this.else_ = this.finally_.get(var1);
   }

   private cD_2 catch_(OT var1) {
      while (var1.break_() != null) {
         var1 = var1.break_();
      }

      return this.finally_.get(var1);
   }

   public co_3 case_(OT var1) {
      cD_2 var2 = this.catch_(var1);
      return var2 == null ? null : var2.break_(var1);
   }

   private void protected_(Ml_1 var1, int var2, int var3, int var4, int var5) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      if (this.else_ != null) {
         RenderSystem.pushMatrix();
         RenderSystem.enableDepthTest();
         RenderSystem.translatef((float)(var4 + 9), (float)(var5 + 18), 400.0F);
         this.else_.byte_(var1, var2 - var4 - 9, var3 - var5 - 18, var4, var5);
         RenderSystem.disableDepthTest();
         RenderSystem.popMatrix();
      }

      if (this.finally_.size() > 1) {
         for (cD_2 var7 : this.finally_.values()) {
            if (var7.class_(var4, var5, (double)var2, (double)var3)) {
               this.class_(var1, var7.protected_(), var2, var3);
            }
         }
      }
   }

   @Override
   public void protected_(OT var1) {
   }

   @Override
   protected void v_() {
      this.finally_.clear();
      this.else_ = null;
      this.implements_.class_(this);
      if (this.else_ == null && !this.finally_.isEmpty()) {
         this.implements_.class_(this.finally_.values().iterator().next().class_(), true);
      } else {
         this.implements_.class_(this.else_ == null ? null : this.else_.class_(), true);
      }
   }

   @Override
   public void w_() {
      super.w_();
      this.implements_.class_((AM)null);
      Aq_1 var1 = this.volatile_.void_();
      if (var1 != null) {
         var1.class_(rZc_1.break_());
      }
   }
}
