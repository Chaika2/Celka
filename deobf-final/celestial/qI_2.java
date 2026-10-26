package celestial;

public class qI_2 extends qc_3<rGz_1, wv_3<rGz_1>> {
   public static final rqO_2 class_ = new rqO_2("textures/" + lp_3.catch_.break_().break_() + ".png");
   public static final rqO_2[] package_ = lp_3.private_.stream().map(var0 -> new rqO_2("textures/" + var0.break_().break_() + ".png")).toArray(rqO_2[]::new);

   public qI_2(pg_3 var1) {
      super(var1, new wv_3<>(), 0.0F);
      this.class_(new TU(this));
   }

   public boolean class_(rGz_1 var1, yt_3 var2, double var3, double var5, double var7) {
      if (super.class_((rGz_1)var1, var2, var3, var5, var7)) {
         return true;
      } else {
         if (var1.sd() > 0 && var1.sW()) {
            rjU_2 var9 = rjU_2.byte_(var1.sJ());
            rjU_2 var10 = rjU_2.byte_(var1.sk());
            if (var2.class_(new rfl_3(var10.break_, var10.byte_, var10.protected_, var9.break_, var9.byte_, var9.protected_))) {
               return true;
            }
         }

         return false;
      }
   }

   public rqO_2 class_(rGz_1 var1) {
      return var1.sz() == null ? class_ : package_[var1.sz().break_()];
   }

   protected void class_(rGz_1 var1, Ml_1 var2, float var3, float var4, float var5) {
      super.class_(var1, var2, var3, var4 + 180.0F, var5);
      var2.class_(0.0, 0.5, 0.0);
      var2.class_(var1.n().case_().break_());
      var2.class_(0.0, -0.5, 0.0);
   }

   public rjU_2 class_(rGz_1 var1, float var2) {
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
         return super.class_(var1, var2);
      }
   }
}
