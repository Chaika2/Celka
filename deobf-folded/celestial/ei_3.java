package celestial;

public class ei_3 extends ev_3 {
   public ei_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.BOW, var2);
   }

   @Override
   public int id_class() {
      return 1;
   }

   @Override
   public boolean id_class(ev_3 var1) {
      return var1 instanceof as_3 ? false : super.id_class(var1);
   }

   @Override
   public int id_class(int var1) {
      return 20;
   }

   @Override
   public int id_break(int var1) {
      return 50;
   }
}
