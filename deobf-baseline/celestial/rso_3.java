package celestial;

import java.util.Random;

class rso_3 implements rsR_2 {
   private final rdn_3 id_class;
   private final int id_break;
   private final int id_byte;
   private final rdn_3 id_protected;
   private final int id_throws;
   private final int id_case;
   private final int id_catch;
   private final float id_private;

   public rso_3(rpL_2 var1, int var2, rdb_3 var3, int var4, int var5, int var6) {
      this(var1, var2, 1, var3, var4, var5, var6);
   }

   public rso_3(rpL_2 var1, int var2, int var3, rdb_3 var4, int var5, int var6, int var7) {
      this.id_class = new rdn_3(var1);
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = new rdn_3(var4);
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_private = 0.05F;
   }

   @Override
   public rdI_2 id_class(an_3 var1, Random var2) {
      return new rdI_2(
         new rdn_3(rdy_3.dP, this.id_byte),
         new rdn_3(this.id_class.id_break(), this.id_break),
         new rdn_3(this.id_protected.id_break(), this.id_throws),
         this.id_case,
         this.id_catch,
         this.id_private
      );
   }
}
