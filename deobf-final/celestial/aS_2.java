package celestial;

public class aS_2 extends ev_3 {
   protected aS_2(eF_2 var1, eC_2 var2, rXQ... var3) {
      super(var1, var2, var3);
   }

   @Override
   public int class_() {
      return 3;
   }

   @Override
   public int class_(int var1) {
      return 15 + (var1 - 1) * 9;
   }

   @Override
   public int break_(int var1) {
      return super.class_(var1) + 50;
   }
}
