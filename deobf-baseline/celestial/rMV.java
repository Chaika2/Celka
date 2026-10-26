package celestial;

import java.util.EnumSet;
import java.util.List;

class rMV extends rBk_1 {
   private int id_break;

   @Override
   public void id_byte() {
      List var1 = ((rYB)this.id_class.id_throws[7]).id_class(rsE_2.class, this.id_class.rN().id_byte(8.0, 8.0, 8.0), rMl_1.id_import);
      if (!var1.isEmpty() && this.id_class.id_class(rXQ.MAINHAND).id_class()) {
         this.id_class.id_public().id_class((an_3)var1.get(0), 1.2F);
      } else if (!this.id_class.id_class(rXQ.MAINHAND).id_class()) {
         this.id_class.sg();
      }

      this.id_break = 0;
   }

   public rMV(rMl_1 var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      if (this.id_break <= (Integer)this.id_class.id_throws[41] && !this.id_class.n_() && !this.id_class.rT() && this.id_class.sy() && this.id_class.L() <= 0) {
         List var1 = ((rYB)this.id_class.id_throws[7]).id_class(rsE_2.class, this.id_class.rN().id_byte(6.0, 6.0, 6.0), rMl_1.id_import);
         return !var1.isEmpty() || !this.id_class.id_class(rXQ.MAINHAND).id_class();
      } else {
         return false;
      }
   }

   @Override
   public boolean id_break() {
      return !this.id_class.rT() && (this.id_class.sL() || rMl_1.id_implements(this.id_class).nextInt(600) != 1)
         ? rMl_1.id_finally(this.id_class).nextInt(2000) != 1
         : false;
   }

   @Override
   public void id_throws() {
      if (!this.id_class.sJ() && !this.id_class.id_class(rXQ.MAINHAND).id_class()) {
         this.id_class.sg();
      }
   }

   @Override
   public void id_protected() {
      rdn_3 var1 = this.id_class.id_class(rXQ.MAINHAND);
      if (!var1.id_class()) {
         this.id_class.a_(var1);
         this.id_class.id_class(rXQ.MAINHAND, rdn_3.id_break);
         int var2 = this.id_class.sL() ? rMl_1.id_extends(this.id_class).nextInt(50) + 10 : rMl_1.id_native(this.id_class).nextInt(150) + 10;
         this.id_break = (Integer)this.id_class.id_throws[41] + var2 * 20;
      }

      this.id_class.id_this(false);
   }
}
