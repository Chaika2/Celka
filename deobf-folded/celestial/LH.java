package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class LH extends LF {
   private boolean id_class;

   public void id_byte(boolean var1) {
      this.id_class = var1;
   }

   public LH(int var1, int var2, LL var3) {
      super(var1, var2, 20, 20, new rgn_3("narrator.button.difficulty_lock"), var3);
   }

   @Override
   public void id_break(Ml_1 var1, int var2, int var3, float var4) {
      QY.id_instanceof().A().id_class(LF.id_finally);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      Ly_1 var5;
      if (!this.id_int) {
         var5 = this.id_class ? Ly_1.LOCKED_DISABLED : Ly_1.UNLOCKED_DISABLED;
      } else if (this.B_()) {
         var5 = this.id_class ? Ly_1.LOCKED_HOVER : Ly_1.UNLOCKED_HOVER;
      } else {
         var5 = this.id_class ? Ly_1.LOCKED : Ly_1.UNLOCKED;
      }

      this.id_break(var1, this.id_volatile, this.id_final, var5.id_class(), var5.id_break(), this.id_extends, this.id_native);
   }

   public boolean id_private() {
      return this.id_class;
   }

   @Override
   protected rVi_1 A_() {
      return super.A_()
         .id_break(". ")
         .id_class(this.id_private() ? new rgn_3("narrator.button.difficulty_lock.locked") : new rgn_3("narrator.button.difficulty_lock.unlocked"));
   }
}
