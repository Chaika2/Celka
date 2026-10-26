package celestial;

import java.util.EnumSet;

class rMj_1 extends rBk_1 {
   private final rMl_1 class_;

   @Override
   public void byte_() {
      this.class_.public_(true);
   }

   public rMj_1(rMl_1 var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.MOVE, rBW.LOOK, rBW.JUMP));
   }

   @Override
   public boolean class_() {
      if ((this.class_.n_() || this.class_.sn()) && rMl_1.case_(this.class_)) {
         if (!this.class_.sy()) {
            return false;
         } else {
            float var1 = (Float)this.class_.throws_[15] * (float) (Math.PI / 180.0);
            int var2 = 0;
            int var3 = 0;
            float var4 = -rfU_2.class_(var1);
            float var5 = rfU_2.break_(var1);
            if ((double)Math.abs(var4) > 0.5) {
               var2 = (int)((float)var2 + var4 / Math.abs(var4));
            }

            if ((double)Math.abs(var5) > 0.5) {
               var3 = (int)((float)var3 + var5 / Math.abs(var5));
            }

            if (((rYB)this.class_.throws_[7]).byte_(this.class_.Bs().break_(var2, -1, var3)).catch_()) {
               return true;
            } else {
               return this.class_.sn() && rMl_1.catch_(this.class_).nextInt(60) == 1 ? true : rMl_1.private_(this.class_).nextInt(500) == 1;
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean break_() {
      return false;
   }

   @Override
   public boolean J_() {
      return false;
   }
}
