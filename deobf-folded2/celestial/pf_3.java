package celestial;

import java.util.Random;

public class pf_3 extends qc_3<rEu_1, tH_2<rEu_1>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/enderman/enderman.png");
   private final Random id_package = new Random();

   public pf_3(pg_3 var1) {
      super(var1, new tH_2<>(0.0F), 0.5F);
      this.id_class(new Tl_1<>(this));
      this.id_class(new Tq_1(this));
   }

   public rjU_2 id_class(rEu_1 var1, float var2) {
      if (var1.sk()) {
         double var3 = 0.02;
         return new rjU_2(this.id_package.nextGaussian() * 0.02, 0.0, this.id_package.nextGaussian() * 0.02);
      } else {
         return super.id_class(var1, var2);
      }
   }

   public rqO_2 id_class(rEu_1 var1) {
      return id_class;
   }

   public void id_class(rEu_1 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      xc_3 var7 = var1.sd();
      tH_2 var8 = this.id_class();
      var8.id_native = var7 != null;
      var8.id_volatile = var1.sk();
      super.id_class((rEu_1)var1, var2, var3, var4, var5, var6);
   }
}
