package celestial;

class vj_3 extends Lg_1<vj_3> {
   vj_3(vI_2 var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      rdb_3 var11 = this.id_class.id_extends.id_private.id_catch.get(var2);
      this.id_class.id_extends.id_class(var1, var4 + 40, var3, var11);

      for (int var12 = 0; var12 < this.id_class.id_extends.id_private.id_class.size(); var12++) {
         rCi_1 var13;
         if (var11 instanceof rxJ_2) {
            var13 = this.id_class.id_extends.id_private.id_class.get(var12).id_break(((rxJ_2)var11).id_catch());
         } else {
            var13 = null;
         }

         this.id_class(var1, var13, var4 + this.id_class.id_extends.id_break(var12), var3, var2 % 2 == 0);
      }

      for (int var14 = 0; var14 < this.id_class.id_extends.id_private.id_throws.size(); var14++) {
         this.id_class(
            var1,
            this.id_class.id_extends.id_private.id_throws.get(var14).id_break(var11),
            var4 + this.id_class.id_extends.id_break(var14 + this.id_class.id_extends.id_private.id_class.size()),
            var3,
            var2 % 2 == 0
         );
      }
   }

   protected void id_class(Ml_1 var1, rCi_1<?> var2, int var3, int var4, boolean var5) {
      String var6 = var2 == null ? "-" : var2.id_class(this.id_class.id_extends.id_finally.id_class(var2));
      ch_3.id_byte(var1, this.id_class.id_extends.id_super, var6, var3 - this.id_class.id_extends.id_super.id_break(var6), var4 + 5, var5 ? 16777215 : 9474192);
   }
}
