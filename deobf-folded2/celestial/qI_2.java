package celestial;

public class qI_2 extends qc_3<rGz_1, wv_3<rGz_1>> {
   public static final rqO_2 id_class = new rqO_2("textures/" + lp_3.id_catch.id_break().id_break() + ".png");
   public static final rqO_2[] id_package = lp_3.id_private
      .stream()
      .map(var0 -> new rqO_2("textures/" + var0.id_break().id_break() + ".png"))
      .toArray(rqO_2[]::new);

   public qI_2(pg_3 var1) {
      super(var1, new wv_3<>(), 0.0F);
      this.id_class(new TU(this));
   }

   public boolean id_class(rGz_1 var1, yt_3 var2, double var3, double var5, double var7) {
      if (super.id_class((rGz_1)var1, var2, var3, var5, var7)) {
         return true;
      } else {
         if (var1.sd() > 0 && var1.sW()) {
            rjU_2 var9 = rjU_2.id_byte(var1.sJ());
            rjU_2 var10 = rjU_2.id_byte(var1.sk());
            if (var2.id_class(new rfl_3(var10.id_break, var10.id_byte, var10.id_protected, var9.id_break, var9.id_byte, var9.id_protected))) {
               return true;
            }
         }

         return false;
      }
   }

   public rqO_2 id_class(rGz_1 var1) {
      return var1.sz() == null ? id_class : id_package[var1.sz().id_break()];
   }

   protected void id_class(rGz_1 var1, Ml_1 var2, float var3, float var4, float var5) {
      super.id_class(var1, var2, var3, var4 + 180.0F, var5);
      var2.id_class(0.0, 0.5, 0.0);
      var2.id_class(var1.n().id_case().id_break());
      var2.id_class(0.0, -0.5, 0.0);
   }

   public rjU_2 id_class(rGz_1 var1, float var2) {
      int var3 = var1.sd();
      if (var3 > 0 && var1.sW()) {
         rfH_2 var4 = var1.sJ();
         rfH_2 var5 = var1.sk();
         double var6 = (double)((float)var3 - var2) / 6.0;
         var6 *= var6;
         double var8 = (double)(var4.b_() - var5.b_()) * var6;
         double var10 = (double)(var4.c_() - var5.c_()) * var6;
         double var12 = (double)(var4.d_() - var5.d_()) * var6;
         return new rjU_2(-var8, -var10, -var12);
      } else {
         return super.id_class(var1, var2);
      }
   }
}
