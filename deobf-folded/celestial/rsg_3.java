package celestial;

import java.util.Random;

class rsg_3 implements rsR_2 {
   private final rdn_3 id_class;
   private final int id_break;
   private final int id_byte;
   private final int id_protected;
   private final float id_throws;

   public rsg_3(rdb_3 var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, 0.05F);
   }

   public rsg_3(rdb_3 var1, int var2, int var3, int var4, float var5) {
      this.id_class = new rdn_3(var1);
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
   }

   @Override
   public rdI_2 id_class(an_3 var1, Random var2) {
      int var3 = 5 + var2.nextInt(15);
      rdn_3 var4 = eA_2.id_class(var2, new rdn_3(this.id_class.id_break()), var3, false);
      int var5 = Math.min(this.id_break + var3, 64);
      rdn_3 var6 = new rdn_3(rdy_3.dP, var5);
      return new rdI_2(var6, var4, this.id_byte, this.id_protected, this.id_throws);
   }
}
