package celestial;

public class ax_3 extends ev_3 {
   public ax_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.TRIDENT, var2);
   }

   @Override
   public int class_() {
      return 3;
   }

   @Override
   public boolean class_(ev_3 var1) {
      return super.class_(var1) && var1 != eY_2.interface_ && var1 != eY_2.long_;
   }

   @Override
   public int class_(int var1) {
      return 10 + var1 * 7;
   }

   @Override
   public int break_(int var1) {
      return 50;
   }
}
