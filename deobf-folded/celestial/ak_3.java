package celestial;

public class ak_3 extends ev_3 {
   public ak_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.ARMOR_FEET, var2);
   }

   @Override
   public int id_class() {
      return 3;
   }

   @Override
   public int id_class(int var1) {
      return var1 * 10;
   }

   @Override
   public boolean id_break() {
      return true;
   }

   @Override
   public int id_break(int var1) {
      return this.id_class(var1) + 15;
   }

   @Override
   public boolean id_implements() {
      return false;
   }

   @Override
   public boolean id_private() {
      return false;
   }
}
