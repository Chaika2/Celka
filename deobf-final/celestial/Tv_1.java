package celestial;

public class Tv_1 extends TH<rEJ, tA_2<rEJ>> {
   private static final rqO_2 class_ = new rqO_2("textures/entity/creeper/creeper_armor.png");
   private final tA_2<rEJ> break_ = new tA_2<>(2.0F);

   public Tv_1(qE_2<rEJ, tA_2<rEJ>> var1) {
      super(var1);
   }

   @Override
   protected float class_(float var1) {
      return var1 * 0.01F;
   }

   @Override
   protected rqO_2 class_() {
      return class_;
   }

   @Override
   protected tp_3<rEJ> break_() {
      return this.break_;
   }
}
