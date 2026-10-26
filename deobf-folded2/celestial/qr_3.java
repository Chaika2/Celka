package celestial;

public class qr_3 extends qc_3<rEw_1, tW_2<rEw_1>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/zombie/zombie.png");
   private final float id_package;

   public qr_3(pg_3 var1, float var2) {
      super(var1, new tI_2(), 0.5F * var2);
      this.id_package = var2;
      this.id_class(new TT<>(this));
      this.id_class(new Tc_1<>(this, new tI_2(0.5F, true), new tI_2(1.0F, true)));
   }

   protected void id_class(rEw_1 var1, Ml_1 var2, float var3) {
      var2.id_class(this.id_package, this.id_package, this.id_package);
   }

   public rqO_2 id_class(rEw_1 var1) {
      return id_class;
   }
}
