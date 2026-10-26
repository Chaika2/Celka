package celestial;

public class qr_3 extends qc_3<rEw_1, tW_2<rEw_1>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/zombie/zombie.png");
   private final float package_;

   public qr_3(pg_3 var1, float var2) {
      super(var1, new tI_2(), 0.5F * var2);
      this.package_ = var2;
      this.class_(new TT<>(this));
      this.class_(new Tc_1<>(this, new tI_2(0.5F, true), new tI_2(1.0F, true)));
   }

   protected void class_(rEw_1 var1, Ml_1 var2, float var3) {
      var2.class_(this.package_, this.package_, this.package_);
   }

   public rqO_2 class_(rEw_1 var1) {
      return class_;
   }
}
