package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class mX_2 extends Lm_1 {
   private final gM_2 super_;
   private float this_;

   public mX_2(gM_2 var1) {
      super(0, 0, 35, 27, false);
      this.super_ = var1;
      this.class_(153, 2, 35, 0, ms_3.class_);
   }

   private void class_(Hz_1 var1) {
      List var2 = this.super_.class_();
      int var3 = this.throws_ ? -2 : 0;
      if (var2.size() == 1) {
         var1.break_((rdn_3)var2.get(0), this.volatile_ + 9 + var3, this.final_ + 5);
      } else if (var2.size() == 2) {
         var1.break_((rdn_3)var2.get(0), this.volatile_ + 3 + var3, this.final_ + 5);
         var1.break_((rdn_3)var2.get(1), this.volatile_ + 14 + var3, this.final_ + 5);
      }
   }

   public gM_2 class_() {
      return this.super_;
   }

   public boolean class_(VR var1) {
      List var2 = var1.class_(this.super_);
      this.new_ = false;
      if (var2 != null) {
         for (mG_2 var4 : var2) {
            if (var4.class_() && var4.byte_()) {
               this.new_ = true;
               break;
            }
         }
      }

      return this.new_;
   }

   public void class_(QY var1) {
      VR var2 = ((cb_3)var1.class_[57]).Z();
      List var3 = var2.class_(this.super_);
      if ((rJr_1)((cb_3)var1.class_[57]).implements_[4] instanceof rJI) {
         for (mG_2 var5 : var3) {
            for (rkw_3 var7 : var5.class_(var2.class_((rJI<?>)((rJr_1)((cb_3)var1.class_[57]).implements_[4])))) {
               if (var2.protected_(var7)) {
                  this.this_ = 15.0F;
                  return;
               }
            }
         }
      }
   }

   @Override
   public void break_(Ml_1 var1, int var2, int var3, float var4) {
      if (this.this_ > 0.0F) {
         float var5 = 1.0F + 0.1F * (float)Math.sin((double)(this.this_ / 15.0F * (float) Math.PI));
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)(this.volatile_ + 8), (float)(this.final_ + 12), 0.0F);
         RenderSystem.scalef(1.0F, var5, 1.0F);
         RenderSystem.translatef((float)(-(this.volatile_ + 8)), (float)(-(this.final_ + 12)), 0.0F);
      }

      QY var9 = QY.instanceof_();
      var9.A().class_(this.class_);
      RenderSystem.disableDepthTest();
      int var6 = this.case_;
      int var7 = this.catch_;
      if (this.throws_) {
         var6 += this.private_;
      }

      if (this.B_()) {
         var7 += this.implements_;
      }

      int var8 = this.volatile_;
      if (this.throws_) {
         var8 -= 2;
      }

      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.break_(var1, var8, this.final_, var6, var7, this.extends_, this.native_);
      RenderSystem.enableDepthTest();
      this.class_(var9.float_());
      if (this.this_ > 0.0F) {
         RenderSystem.popMatrix();
         this.this_ -= var4;
      }
   }
}
