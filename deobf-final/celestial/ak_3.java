package celestial;

public class ak_3 extends ev_3 {
   public ak_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.ARMOR_FEET, var2);
   }

   @Override
   public int class_() {
      return 3;
   }

   @Override
   public int class_(int var1) {
      return var1 * 10;
   }

   @Override
   public boolean break_() {
      return true;
   }

   @Override
   public int break_(int var1) {
      return this.class_(var1) + 15;
   }

   @Override
   public boolean implements_() {
      return false;
   }

   @Override
   public boolean private_() {
      return false;
   }
}
