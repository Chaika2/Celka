package celestial;

public class eZ_2 extends ev_3 {
   protected eZ_2(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.DIGGER, var2);
   }

   @Override
   public int class_() {
      return 5;
   }

   @Override
   public boolean class_(rdn_3 var1) {
      return var1.break_() == rdy_3.JJ ? true : super.class_(var1);
   }

   @Override
   public int class_(int var1) {
      return 1 + 10 * (var1 - 1);
   }

   @Override
   public int break_(int var1) {
      return super.class_(var1) + 50;
   }
}
