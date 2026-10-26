package celestial;

public class aE_2 extends ev_3 {
   public aE_2(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.CROSSBOW, var2);
   }

   @Override
   public int id_class() {
      return 1;
   }

   @Override
   public boolean id_class(ev_3 var1) {
      return super.id_class(var1) && var1 != eY_2.id_static;
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
