package celestial;

public abstract class pW_2<T extends rbB_2, M extends wg_3<T>> extends pm_3<T, M> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/zombie/zombie.png");

   protected pW_2(pg_3 var1, M var2, M var3, M var4) {
      super(var1, (M)var2, 0.5F);
      this.class_(new Tc_1<>(this, var3, var4));
   }

   public rqO_2 class_(rbB_2 var1) {
      return class_;
   }

   protected boolean break_(T var1) {
      return var1.sQ();
   }
}
