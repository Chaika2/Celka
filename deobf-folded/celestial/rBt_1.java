package celestial;

import java.util.EnumSet;

public class rBt_1 extends rBk_1 {
   private final aA_2 id_class;
   private iB_2 id_break;
   private double id_byte;
   private double id_protected;
   private double id_throws;
   private final double id_case;
   private final float id_catch;

   @Override
   public void id_byte() {
      this.id_class.id_public().id_class(this.id_byte, this.id_protected, this.id_throws, this.id_case);
   }

   public rBt_1(aA_2 var1, double var2, float var4) {
      this.id_class = var1;
      this.id_case = var2;
      this.id_catch = var4;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      this.id_break = this.id_class.I_();
      if (this.id_break == null) {
         return false;
      } else if (this.id_break.id_int(this.id_class) > (double)(this.id_catch * this.id_catch)) {
         return false;
      } else {
         rjU_2 var1 = iX_2.id_break(this.id_class, 16, 7, this.id_break.Ps());
         if (var1 == null) {
            return false;
         } else {
            this.id_byte = var1.id_break;
            this.id_protected = var1.id_byte;
            this.id_throws = var1.id_protected;
            return true;
         }
      }
   }

   @Override
   public boolean id_break() {
      return !this.id_class.id_public().id_native() && this.id_break.BM() && this.id_break.id_int(this.id_class) < (double)(this.id_catch * this.id_catch);
   }

   @Override
   public void id_protected() {
      this.id_break = null;
   }
}
