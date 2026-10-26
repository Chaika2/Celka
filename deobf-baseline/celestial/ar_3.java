package celestial;

public class ar_3 extends ev_3 {
   protected ar_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.WEAPON, var2);
   }

   @Override
   public int id_class() {
      return 2;
   }

   @Override
   public int id_class(int var1) {
      return 5 + 20 * (var1 - 1);
   }

   @Override
   public int id_break(int var1) {
      return super.id_class(var1) + 50;
   }
}
