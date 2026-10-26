package celestial;

public class as_3 extends ev_3 {
   public as_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.BREAKABLE, var2);
   }

   @Override
   public int id_class() {
      return 1;
   }

   @Override
   public int id_class(int var1) {
      return var1 * 25;
   }

   @Override
   public boolean id_break() {
      return true;
   }

   @Override
   public int id_break(int var1) {
      return this.id_class(var1) + 50;
   }
}
