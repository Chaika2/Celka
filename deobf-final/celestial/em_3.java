package celestial;

public class em_3 extends ev_3 {
   public em_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.ARMOR_FEET, var2);
   }

   @Override
   public int class_() {
      return 3;
   }

   @Override
   public boolean class_(ev_3 var1) {
      return super.class_(var1) && var1 != eY_2.finally_;
   }

   @Override
   public int class_(int var1) {
      return var1 * 10;
   }

   @Override
   public int break_(int var1) {
      return this.class_(var1) + 15;
   }
}
