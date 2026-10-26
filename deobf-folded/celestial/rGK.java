package celestial;

import java.util.EnumSet;

class rGK extends rBk_1 {
   public rGK(rGg_1 var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      return !this.id_class.id_super().id_break() && rGg_1.id_protected(this.id_class).nextInt(7) == 0;
   }

   @Override
   public boolean id_break() {
      return false;
   }

   @Override
   public void id_throws() {
      rfH_2 var1 = this.id_class.sJ();
      if (var1 == null) {
         var1 = this.id_class.Bs();
      }

      for (int var2 = 0; var2 < 3; var2++) {
         rfH_2 var3 = var1.id_break(
            rGg_1.id_throws(this.id_class).nextInt(15) - 7, rGg_1.id_case(this.id_class).nextInt(11) - 5, rGg_1.id_catch(this.id_class).nextInt(15) - 7
         );
         if (((rYB)this.id_class.id_throws[7]).id_finally(var3)) {
            rGg_1.id_private(this.id_class).id_class((double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, 0.25);
            if (this.id_class.I_() == null) {
               this.id_class.id_continue().id_class((double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, 180.0F, 20.0F);
            }
            break;
         }
      }
   }
}
