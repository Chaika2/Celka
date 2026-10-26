package celestial;

import java.util.EnumSet;
import java.util.List;

class rMS extends rBk_1 {
   @Override
   public void id_byte() {
      List var1 = ((rYB)this.id_class.id_throws[7]).id_class(rsE_2.class, this.id_class.rN().id_byte(8.0, 8.0, 8.0), rba_3.id_return);
      if (!var1.isEmpty()) {
         this.id_class.id_public().id_class((an_3)var1.get(0), 1.2F);
      }
   }

   public rMS(rba_3 var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      if (!this.id_class.id_class(rXQ.MAINHAND).id_class()) {
         return false;
      } else if (this.id_class.I_() != null || this.id_class.Sr() != null) {
         return false;
      } else if (!this.id_class.sA()) {
         return false;
      } else if (this.id_class.Sa().nextInt(10) != 0) {
         return false;
      } else {
         List var1 = ((rYB)this.id_class.id_throws[7]).id_class(rsE_2.class, this.id_class.rN().id_byte(8.0, 8.0, 8.0), rba_3.id_return);
         return !var1.isEmpty() && this.id_class.id_class(rXQ.MAINHAND).id_class();
      }
   }

   @Override
   public void id_throws() {
      List var1 = ((rYB)this.id_class.id_throws[7]).id_class(rsE_2.class, this.id_class.rN().id_byte(8.0, 8.0, 8.0), rba_3.id_return);
      rdn_3 var2 = this.id_class.id_class(rXQ.MAINHAND);
      if (var2.id_class() && !var1.isEmpty()) {
         this.id_class.id_public().id_class((an_3)var1.get(0), 1.2F);
      }
   }
}
