package celestial;

public class ab_3 extends ev_3 {
   public ab_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.BOW, var2);
   }

   @Override
   public int class_() {
      return 5;
   }

   @Override
   public int class_(int var1) {
      return 1 + (var1 - 1) * 10;
   }

   @Override
   public int break_(int var1) {
      return this.class_(var1) + 15;
   }
}
