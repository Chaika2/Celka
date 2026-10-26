package celestial;

public class tG_2 extends TH<rSN, wj_3<rSN>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/wither/wither_armor.png");
   private final wj_3<rSN> break_ = new wj_3<>(0.5F);

   public tG_2(qE_2<rSN, wj_3<rSN>> var1) {
      super(var1);
   }

   @Override
   protected float class_(float var1) {
      return rfU_2.break_(var1 * 0.02F) * 3.0F;
   }

   @Override
   protected rqO_2 class_() {
      return class_;
   }

   @Override
   protected tp_3<rSN> break_() {
      return this.break_;
   }
}
