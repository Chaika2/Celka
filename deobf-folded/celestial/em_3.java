package celestial;

public class em_3 extends ev_3 {
   public em_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.ARMOR_FEET, var2);
   }

   @Override
   public int id_class() {
      return 3;
   }

   @Override
   public boolean id_class(ev_3 var1) {
      return super.id_class(var1) && var1 != eY_2.id_finally;
   }

   @Override
   public int id_class(int var1) {
      return var1 * 10;
   }

   @Override
   public int id_break(int var1) {
      return this.id_class(var1) + 15;
   }
}
