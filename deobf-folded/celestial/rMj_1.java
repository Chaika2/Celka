package celestial;

import java.util.EnumSet;

class rMj_1 extends rBk_1 {
   private final rMl_1 id_class;

   @Override
   public void id_byte() {
      this.id_class.id_public(true);
   }

   public rMj_1(rMl_1 var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK, rBW.JUMP));
   }

   @Override
   public boolean id_class() {
      if ((this.id_class.n_() || this.id_class.sn()) && rMl_1.id_case(this.id_class)) {
         if (!this.id_class.sy()) {
            return false;
         } else {
            float var1 = (Float)this.id_class.id_throws[15] * (float) (Math.PI / 180.0);
            int var2 = 0;
            int var3 = 0;
            float var4 = -rfU_2.id_class(var1);
            float var5 = rfU_2.id_break(var1);
            if ((double)Math.abs(var4) > 0.5) {
               var2 = (int)((float)var2 + var4 / Math.abs(var4));
            }

            if ((double)Math.abs(var5) > 0.5) {
               var3 = (int)((float)var3 + var5 / Math.abs(var5));
            }

            if (((rYB)this.id_class.id_throws[7]).id_byte(this.id_class.Bs().id_break(var2, -1, var3)).id_catch()) {
               return true;
            } else {
               return this.id_class.sn() && rMl_1.id_catch(this.id_class).nextInt(60) == 1 ? true : rMl_1.id_private(this.id_class).nextInt(500) == 1;
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean id_break() {
      return false;
   }

   @Override
   public boolean J_() {
      return false;
   }
}
