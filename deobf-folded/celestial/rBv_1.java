package celestial;

import java.util.EnumSet;

public class rBv_1 extends rBk_1 {
   private final is_3 id_class;
   private iB_2 id_break;
   private final float id_byte;

   @Override
   public void id_byte() {
      rjU_2 var1 = this.id_class.rv();
      rjU_2 var2 = new rjU_2(this.id_break.rx() - this.id_class.rx(), 0.0, this.id_break.BO() - this.id_class.BO());
      if (var2.id_catch() > 1.0E-7) {
         var2 = var2.id_protected().id_class(0.4).id_throws(var1.id_class(0.2));
      }

      this.id_class.id_catch(var2.id_break, (double)this.id_byte, var2.id_protected);
   }

   public rBv_1(is_3 var1, float var2) {
      this.id_class = var1;
      this.id_byte = var2;
      this.id_class(EnumSet.of(rBW.JUMP, rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      if (this.id_class.BP()) {
         return false;
      } else {
         this.id_break = this.id_class.I_();
         if (this.id_break == null) {
            return false;
         } else {
            double var1 = this.id_class.id_int(this.id_break);
            if (var1 < 4.0 || var1 > 16.0) {
               return false;
            } else {
               return !this.id_class.BL() ? false : this.id_class.Sa().nextInt(5) == 0;
            }
         }
      }
   }

   @Override
   public boolean id_break() {
      return !this.id_class.BL();
   }
}
