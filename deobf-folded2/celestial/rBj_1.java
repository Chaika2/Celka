package celestial;

import java.util.EnumSet;

public class rBj_1 extends rBk_1 {
   private final rRq_1 id_class;
   private final is_3 id_break;
   private iB_2 id_byte;
   private int id_protected;

   public rBj_1(is_3 var1) {
      this.id_break = var1;
      this.id_class = (rYB)var1.id_throws[7];
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      iB_2 var1 = this.id_break.I_();
      if (var1 == null) {
         return false;
      } else {
         this.id_byte = var1;
         return true;
      }
   }

   @Override
   public boolean id_break() {
      if (!this.id_byte.BM()) {
         return false;
      } else {
         return this.id_break.id_int(this.id_byte) > 225.0 ? false : !this.id_break.id_public().id_native() || this.id_class();
      }
   }

   @Override
   public void id_throws() {
      this.id_break.id_continue().id_class(this.id_byte, 30.0F, 30.0F);
      double var1 = (double)(this.id_break.PN() * 2.0F * this.id_break.PN() * 2.0F);
      double var3 = this.id_break.id_class(this.id_byte.rx(), this.id_byte.re(), this.id_byte.BO());
      double var5 = 0.8;
      if (var3 > var1 && var3 < 16.0) {
         var5 = 1.33;
      } else if (var3 < 225.0) {
         var5 = 0.6;
      }

      this.id_break.id_public().id_class(this.id_byte, var5);
      this.id_protected = Math.max(this.id_protected - 1, 0);
      if (!(var3 > var1) && this.id_protected <= 0) {
         this.id_protected = 20;
         this.id_break.id_public(this.id_byte);
      }
   }

   @Override
   public void id_protected() {
      this.id_byte = null;
      this.id_break.id_public().id_final();
   }
}
