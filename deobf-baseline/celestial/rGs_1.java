package celestial;

import java.util.Comparator;
import java.util.List;

class rGs_1 extends rBk_1 {
   private final ay_3 id_break;
   private int id_byte;

   rGs_1(rGB var1) {
      this.id_class = var1;
      this.id_break = new ay_3().id_class(64.0);
      this.id_byte = 20;
   }

   @Override
   public boolean id_class() {
      if (this.id_byte > 0) {
         this.id_byte--;
         return false;
      } else {
         this.id_byte = 60;
         List var1 = ((rYB)this.id_class.id_throws[7]).id_class(this.id_break, this.id_class, this.id_class.rN().id_byte(16.0, 64.0, 16.0));
         if (!var1.isEmpty()) {
            var1.sort(Comparator.comparing(an_3::re).reversed());

            for (rhd_3 var3 : var1) {
               if (this.id_class.id_class(var3, ay_3.id_class)) {
                  this.id_class.id_byte(var3);
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public boolean id_break() {
      iB_2 var1 = this.id_class.I_();
      return var1 != null ? this.id_class.id_class(var1, ay_3.id_class) : false;
   }
}
