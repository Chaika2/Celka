package celestial;

public class as_3 extends ev_3 {
   public as_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.BREAKABLE, var2);
   }

   @Override
   public int class_() {
      return 1;
   }

   @Override
   public int class_(int var1) {
      return var1 * 25;
   }

   @Override
   public boolean break_() {
      return true;
   }

   @Override
   public int break_(int var1) {
      return this.class_(var1) + 50;
   }
}
