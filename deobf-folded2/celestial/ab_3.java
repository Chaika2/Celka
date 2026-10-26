package celestial;

public class ab_3 extends ev_3 {
   public ab_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.BOW, var2);
   }

   @Override
   public int id_class() {
      return 5;
   }

   @Override
   public int id_class(int var1) {
      return 1 + (var1 - 1) * 10;
   }

   @Override
   public int id_break(int var1) {
      return this.id_class(var1) + 15;
   }
}
