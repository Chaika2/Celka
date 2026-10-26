package celestial;

import java.util.Random;

class rsI_2 implements rsR_2 {
   private final rdb_3 id_class;
   private final int id_break;
   private final int id_byte;
   private final int id_protected;
   private final float id_throws;

   public rsI_2(rpL_2 var1, int var2, int var3, int var4) {
      this.id_class = var1.id_case();
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = 0.05F;
   }

   @Override
   public rdI_2 id_class(an_3 var1, Random var2) {
      rdn_3 var3 = new rdn_3(this.id_class, this.id_break);
      return new rdI_2(var3, new rdn_3(rdy_3.dP), this.id_byte, this.id_protected, this.id_throws);
   }
}
