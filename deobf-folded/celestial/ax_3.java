package celestial;

public class ax_3 extends ev_3 {
   public ax_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.TRIDENT, var2);
   }

   @Override
   public int id_class() {
      return 3;
   }

   @Override
   public boolean id_class(ev_3 var1) {
      return super.id_class(var1) && var1 != eY_2.id_interface && var1 != eY_2.id_long;
   }

   @Override
   public int id_class(int var1) {
      return 10 + var1 * 7;
   }

   @Override
   public int id_break(int var1) {
      return 50;
   }
}
