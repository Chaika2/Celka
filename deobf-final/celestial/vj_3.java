package celestial;

class vj_3 extends Lg_1<vj_3> {
   vj_3(vI_2 var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      rdb_3 var11 = this.class_.extends_.private_.catch_.get(var2);
      this.class_.extends_.class_(var1, var4 + 40, var3, var11);

      for (int var12 = 0; var12 < this.class_.extends_.private_.class_.size(); var12++) {
         rCi_1 var13;
         if (var11 instanceof rxJ_2) {
            var13 = this.class_.extends_.private_.class_.get(var12).break_(((rxJ_2)var11).catch_());
         } else {
            var13 = null;
         }

         this.class_(var1, var13, var4 + this.class_.extends_.break_(var12), var3, var2 % 2 == 0);
      }

      for (int var14 = 0; var14 < this.class_.extends_.private_.throws_.size(); var14++) {
         this.class_(
            var1,
            this.class_.extends_.private_.throws_.get(var14).break_(var11),
            var4 + this.class_.extends_.break_(var14 + this.class_.extends_.private_.class_.size()),
            var3,
            var2 % 2 == 0
         );
      }
   }

   protected void class_(Ml_1 var1, rCi_1<?> var2, int var3, int var4, boolean var5) {
      String var6 = var2 == null ? "-" : var2.class_(this.class_.extends_.finally_.class_(var2));
      ch_3.byte_(var1, this.class_.extends_.super_, var6, var3 - this.class_.extends_.super_.break_(var6), var4 + 5, var5 ? 16777215 : 9474192);
   }
}
