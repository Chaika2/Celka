package celestial;

import java.util.Random;

public class pf_3 extends qc_3<rEu_1, tH_2<rEu_1>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/enderman/enderman.png");
   private final Random package_ = new Random();

   public pf_3(pg_3 var1) {
      super(var1, new tH_2<>(0.0F), 0.5F);
      this.class_(new Tl_1<>(this));
      this.class_(new Tq_1(this));
   }

   public rjU_2 class_(rEu_1 var1, float var2) {
      if (var1.sk()) {
         double var3 = 0.02;
         return new rjU_2(this.package_.nextGaussian() * 0.02, 0.0, this.package_.nextGaussian() * 0.02);
      } else {
         return super.class_(var1, var2);
      }
   }

   public rqO_2 class_(rEu_1 var1) {
      return class_;
   }

   public void class_(rEu_1 var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      xc_3 var7 = var1.sd();
      tH_2 var8 = this.class_();
      var8.native_ = var7 != null;
      var8.volatile_ = var1.sk();
      super.class_((rEu_1)var1, var2, var3, var4, var5, var6);
   }
}
