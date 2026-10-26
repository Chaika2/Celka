package celestial;

public class qO_2 extends qc_3<rMZ, tD_2<rMZ>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/iron_golem/iron_golem.png");

   public qO_2(pg_3 var1) {
      super(var1, new tD_2<>(), 0.7F);
      this.class_(new Tw_1(this));
      this.class_(new TI(this));
   }

   public rqO_2 class_(rMZ var1) {
      return class_;
   }

   protected void class_(rMZ var1, Ml_1 var2, float var3, float var4, float var5) {
      super.class_(var1, var2, var3, var4, var5);
      if (!((double)((Float)var1.private_[18]).floatValue() < 0.01)) {
         float var6 = 13.0F;
         float var7 = (Float)var1.private_[19] - (Float)var1.private_[18] * (1.0F - var5) + 6.0F;
         float var8 = (Math.abs(var7 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         var2.class_(rje_3.case_.byte_(6.5F * var8));
      }
   }
}
