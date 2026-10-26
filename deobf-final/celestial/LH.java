package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class LH extends LF {
   private boolean class_;

   public void byte_(boolean var1) {
      this.class_ = var1;
   }

   public LH(int var1, int var2, LL var3) {
      super(var1, var2, 20, 20, new rgn_3("narrator.button.difficulty_lock"), var3);
   }

   @Override
   public void break_(Ml_1 var1, int var2, int var3, float var4) {
      QY.instanceof_().A().class_(LF.finally_);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      Ly_1 var5;
      if (!this.int_) {
         var5 = this.class_ ? Ly_1.LOCKED_DISABLED : Ly_1.UNLOCKED_DISABLED;
      } else if (this.B_()) {
         var5 = this.class_ ? Ly_1.LOCKED_HOVER : Ly_1.UNLOCKED_HOVER;
      } else {
         var5 = this.class_ ? Ly_1.LOCKED : Ly_1.UNLOCKED;
      }

      this.break_(var1, this.volatile_, this.final_, var5.class_(), var5.break_(), this.extends_, this.native_);
   }

   public boolean private_() {
      return this.class_;
   }

   @Override
   protected rVi_1 A_() {
      return super.A_()
         .break_(". ")
         .class_(this.private_() ? new rgn_3("narrator.button.difficulty_lock.locked") : new rgn_3("narrator.button.difficulty_lock.unlocked"));
   }
}
