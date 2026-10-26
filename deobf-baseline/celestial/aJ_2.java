package celestial;

public class aJ_2 extends ev_3 {
   public aJ_2(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.ARMOR_HEAD, var2);
   }

   @Override
   public int id_class() {
      return 3;
   }

   @Override
   public int id_class(int var1) {
      return 10 * var1;
   }

   @Override
   public int id_break(int var1) {
      return this.id_class(var1) + 30;
   }
}
