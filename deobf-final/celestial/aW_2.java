package celestial;

public class aW_2 extends ev_3 {
   public aW_2(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.WEAPON, var2);
   }

   @Override
   public int class_(int var1) {
      return 5 + (var1 - 1) * 9;
   }

   @Override
   public int class_() {
      return 3;
   }

   @Override
   public int break_(int var1) {
      return this.class_(var1) + 15;
   }

   public static float throws_(int var0) {
      return 1.0F - 1.0F / (float)(var0 + 1);
   }
}
