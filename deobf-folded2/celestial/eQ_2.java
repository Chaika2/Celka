package celestial;

public class eQ_2 extends ev_3 {
   public eQ_2(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.ARMOR_HEAD, var2);
   }

   @Override
   public int id_class() {
      return 1;
   }

   @Override
   public int id_class(int var1) {
      return 1;
   }

   @Override
   public int id_break(int var1) {
      return this.id_class(var1) + 40;
   }
}
