package celestial;

public class ad_3 extends ev_3 {
   protected ad_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.DIGGER, var2);
   }

   @Override
   public int class_() {
      return 1;
   }

   @Override
   public boolean class_(ev_3 var1) {
      return super.class_(var1) && var1 != eY_2.return_;
   }

   @Override
   public int class_(int var1) {
      return 15;
   }

   @Override
   public int break_(int var1) {
      return super.class_(var1) + 50;
   }
}
