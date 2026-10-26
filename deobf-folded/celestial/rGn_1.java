package celestial;

import java.util.EnumSet;

class rGn_1 extends rBk_1 {
   private final rGA id_class;
   private int id_break;

   @Override
   public void id_byte() {
      this.id_break = 300;
      super.id_byte();
   }

   public rGn_1(rGA var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      iB_2 var1 = this.id_class.I_();
      if (var1 == null) {
         return false;
      } else if (!var1.BM()) {
         return false;
      } else {
         return var1 instanceof rhd_3 && ((rhx_3)((rhd_3)var1).id_implements[18]).id_class ? false : this.id_class.id_super() instanceof rGy_1;
      }
   }

   @Override
   public boolean id_break() {
      iB_2 var1 = this.id_class.I_();
      if (var1 == null) {
         return false;
      } else if (!var1.BM()) {
         return false;
      } else {
         return var1 instanceof rhd_3 && ((rhx_3)((rhd_3)var1).id_implements[18]).id_class ? false : --this.id_break > 0;
      }
   }

   @Override
   public void id_throws() {
      this.id_class.id_class(this.id_class.I_(), 10.0F, 10.0F);
      ((rGy_1)this.id_class.id_super()).id_class((Float)this.id_class.id_throws[15], this.id_class.n());
   }
}
