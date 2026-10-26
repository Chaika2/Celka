package celestial;

public class ah_3 extends ev_3 {
   public ah_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.BOW, var2);
   }

   @Override
   public int id_class() {
      return 2;
   }

   @Override
   public int id_class(int var1) {
      return 12 + (var1 - 1) * 20;
   }

   @Override
   public int id_break(int var1) {
      return this.id_class(var1) + 25;
   }
}
