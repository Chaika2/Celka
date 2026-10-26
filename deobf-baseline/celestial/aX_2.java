package celestial;

public class aX_2 extends ev_3 {
   public aX_2(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.CROSSBOW, var2);
   }

   @Override
   public int id_class() {
      return 3;
   }

   @Override
   public int id_class(int var1) {
      return 12 + (var1 - 1) * 20;
   }

   @Override
   public int id_break(int var1) {
      return 50;
   }
}
