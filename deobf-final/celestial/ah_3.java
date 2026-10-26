package celestial;

public class ah_3 extends ev_3 {
   public ah_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.BOW, var2);
   }

   @Override
   public int class_() {
      return 2;
   }

   @Override
   public int class_(int var1) {
      return 12 + (var1 - 1) * 20;
   }

   @Override
   public int break_(int var1) {
      return this.class_(var1) + 25;
   }
}
