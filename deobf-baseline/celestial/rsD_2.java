package celestial;

import java.util.Random;

class rsD_2 implements rsR_2 {
   final rLR id_class;
   final int id_break;
   final int id_byte;
   private final float id_protected;

   public rsD_2(rLR var1, int var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = 0.05F;
   }

   @Override
   public rdI_2 id_class(an_3 var1, Random var2) {
      rdn_3 var3 = new rdn_3(rdy_3.ke, 1);
      rkJ_2.id_class(var3, this.id_class, this.id_break);
      return new rdI_2(new rdn_3(rdy_3.dP, 1), var3, 12, this.id_byte, this.id_protected);
   }
}
