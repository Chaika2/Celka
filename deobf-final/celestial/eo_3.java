package celestial;

public class eo_3 extends ev_3 {
   protected eo_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.WEAPON, var2);
   }

   @Override
   public int class_() {
      return 2;
   }

   @Override
   public int class_(int var1) {
      return 10 + 20 * (var1 - 1);
   }

   @Override
   public int break_(int var1) {
      return super.class_(var1) + 50;
   }
}
