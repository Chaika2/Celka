package celestial;

public class aG_2 extends ev_3 {
   public aG_2(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.CROSSBOW, var2);
   }

   @Override
   public int class_() {
      return 4;
   }

   @Override
   public boolean class_(ev_3 var1) {
      return super.class_(var1) && var1 != eY_2.float_;
   }

   @Override
   public int class_(int var1) {
      return 1 + (var1 - 1) * 10;
   }

   @Override
   public int break_(int var1) {
      return 50;
   }
}
