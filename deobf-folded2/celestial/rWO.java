package celestial;

import it.unimi.dsi.fastutil.ints.IntList;

public class rWO implements rkt_3 {
   private final rqO_2 id_class;
   final String id_break;
   final rdn_3 id_byte;
   final rqs_3<rkg_3> id_protected;

   @Override
   public rdn_3 id_byte() {
      return this.id_byte;
   }

   public rWO(rqO_2 var1, String var2, rdn_3 var3, rqs_3<rkg_3> var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   public boolean id_class(rXk_1 var1, rYB var2) {
      rWr_1 var3 = new rWr_1();
      int var4 = 0;

      for (int var5 = 0; var5 < var1.id_else(); var5++) {
         rdn_3 var6 = var1.id_extends(var5);
         if (!var6.id_class()) {
            var4++;
            var3.id_class(var6, 1);
         }
      }

      return var4 == this.id_protected.size() && var3.id_class(this, (IntList)null);
   }

   public rdn_3 id_class(rXk_1 var1) {
      return this.id_byte.id_implements();
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return var1 * var2 >= this.id_protected.size();
   }

   @Override
   public rqs_3<rkg_3> id_class() {
      return this.id_protected;
   }

   @Override
   public rqO_2 id_case() {
      return this.id_class;
   }

   @Override
   public String id_protected() {
      return this.id_break;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.id_break;
   }
}
