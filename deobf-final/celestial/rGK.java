package celestial;

import java.util.EnumSet;

class rGK extends rBk_1 {
   public rGK(rGg_1 var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      return !this.class_.super_().break_() && rGg_1.protected_(this.class_).nextInt(7) == 0;
   }

   @Override
   public boolean break_() {
      return false;
   }

   @Override
   public void throws_() {
      rfH_2 var1 = this.class_.sJ();
      if (var1 == null) {
         var1 = this.class_.Bs();
      }

      for (int var2 = 0; var2 < 3; var2++) {
         rfH_2 var3 = var1.break_(
            rGg_1.throws_(this.class_).nextInt(15) - 7, rGg_1.case_(this.class_).nextInt(11) - 5, rGg_1.catch_(this.class_).nextInt(15) - 7
         );
         if (((rYB)this.class_.throws_[7]).finally_(var3)) {
            rGg_1.private_(this.class_).class_((double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, 0.25);
            if (this.class_.I_() == null) {
               this.class_.continue_().class_((double)var3.b_() + 0.5, (double)var3.c_() + 0.5, (double)var3.d_() + 0.5, 180.0F, 20.0F);
            }
            break;
         }
      }
   }
}
