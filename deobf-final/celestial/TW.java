package celestial;

public class TW extends pm_3<rbE_2, wR_2<rbE_2>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/zombie_villager/zombie_villager.png");

   public TW(pg_3 var1, rAv_1 var2) {
      super(var1, new wR_2<>(0.0F, false), 0.5F);
      this.class_(new Tc_1<>(this, new wR_2(0.5F, true), new wR_2(1.0F, true)));
      this.class_(new ts_3<>(this, var2, "zombie_villager"));
   }

   public rqO_2 class_(rbE_2 var1) {
      return class_;
   }

   protected boolean break_(rbE_2 var1) {
      return var1.sZ();
   }
}
