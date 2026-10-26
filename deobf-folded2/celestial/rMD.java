package celestial;

import java.util.function.Predicate;

class rMD extends rBI<rhd_3> {
   public rMD(rMK var1) {
      super(var1, rhd_3.class, 20, true, true, (Predicate<iB_2>)null);
      this.id_implements = var1;
   }

   @Override
   public boolean id_class() {
      if (this.id_implements.n_()) {
         return false;
      } else {
         if (super.id_class()) {
            for (rMK var2 : ((rYB)this.id_implements.id_throws[7]).id_class(rMK.class, this.id_implements.rN().id_byte(8.0, 4.0, 8.0))) {
               if (var2.n_()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected double id_extends() {
      return super.id_extends() * 0.5;
   }
}
