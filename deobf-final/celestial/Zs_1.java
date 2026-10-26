package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Zs_1 extends vm_3 {
   private static final rqO_2 class_ = new rqO_2("textures/gui/demo_background.png");
   private cv_3 throws_ = cv_3.class_;
   private cv_3 case_ = cv_3.class_;

   public Zs_1() {
      super(new rgn_3("demo.help.title"));
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      int var5 = (this.package_ - 248) / 2 + 10;
      int var6 = (this.int_ - 166) / 2 + 8;
      this.super_.byte_(var1, this.extends_, (float)var5, (float)var6, 2039583);
      var6 = this.throws_.byte_(var1, var5, var6 + 12, 12, 5197647);
      this.case_.byte_(var1, var5, var6 + 20, 9, 2039583);
      super.class_(var1, var2, var3, var4);
   }

   @Override
   public void class_(Ml_1 var1) {
      super.class_(var1);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(class_);
      int var2 = (this.package_ - 248) / 2;
      int var3 = (this.int_ - 166) / 2;
      this.break_(var1, var2, var3, 0, 0, 248, 166);
   }

   @Override
   protected void v_() {
      byte var1 = -16;
      this.class_((LF)(new LF(this.package_ / 2 - 116, this.int_ / 2 + 62 + -16, 114, 20, new rgn_3("demo.help.buy"), var0 -> {
         var0.int_ = false;
         rqR_2.implements_().class_("http://www.minecraft.net/store?source=demo");
      })));
      this.class_((LF)(new LF(this.package_ / 2 + 2, this.int_ / 2 + 62 + -16, 114, 20, new rgn_3("demo.help.later"), var1x -> {
         this.volatile_.break_((vm_3)null);
         ((Qi_1)this.volatile_.class_[22]).catch_();
      })));
      Qw_1 var2 = (Qw_1)this.volatile_.class_[20];
      this.throws_ = cv_3.class_(
         this.super_,
         new rgn_3("demo.help.movementShort", var2.h.native_(), var2.X.native_(), var2.J.native_(), var2.x.native_()),
         new rgn_3("demo.help.movementMouse"),
         new rgn_3("demo.help.jump", var2.d.native_()),
         new rgn_3("demo.help.inventory", var2.z.native_())
      );
      this.case_ = cv_3.class_(this.super_, new rgn_3("demo.help.fullWrapped"), 218);
   }
}
