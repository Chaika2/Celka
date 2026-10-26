package celestial;

public class Tv_1 extends TH<rEJ, tA_2<rEJ>> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/creeper/creeper_armor.png");
   private final tA_2<rEJ> id_break = new tA_2<>(2.0F);

   public Tv_1(qE_2<rEJ, tA_2<rEJ>> var1) {
      super(var1);
   }

   @Override
   protected float id_class(float var1) {
      return var1 * 0.01F;
   }

   @Override
   protected rqO_2 id_class() {
      return id_class;
   }

   @Override
   protected tp_3<rEJ> id_break() {
      return this.id_break;
   }
}
