package celestial;

import java.util.Random;

class rsK_2 implements rsR_2 {
   private final rdn_3 id_class;
   private final int id_break;
   private final int id_byte;
   private final int id_protected;
   private final int id_throws;
   private final float id_case;

   public rsK_2(rdn_3 var1, int var2, int var3, int var4, int var5, float var6) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
   }

   public rsK_2(rdn_3 var1, int var2, int var3, int var4, int var5) {
      this(var1, var2, var3, var4, var5, 0.05F);
   }

   public rsK_2(rdb_3 var1, int var2, int var3, int var4, int var5) {
      this(new rdn_3(var1), var2, var3, var4, var5);
   }

   public rsK_2(rdb_3 var1, int var2, int var3, int var4) {
      this(new rdn_3(var1), var2, var3, 12, var4);
   }

   public rsK_2(xd_3 var1, int var2, int var3, int var4, int var5) {
      this(new rdn_3(var1), var2, var3, var4, var5);
   }

   @Override
   public rdI_2 id_class(an_3 var1, Random var2) {
      return new rdI_2(new rdn_3(rdy_3.dP, this.id_break), new rdn_3(this.id_class.id_break(), this.id_byte), this.id_protected, this.id_throws, this.id_case);
   }
}
