package celestial;

public class ad_3 extends ev_3 {
   protected ad_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.DIGGER, var2);
   }

   @Override
   public int id_class() {
      return 1;
   }

   @Override
   public boolean id_class(ev_3 var1) {
      return super.id_class(var1) && var1 != eY_2.id_return;
   }

   @Override
   public int id_class(int var1) {
      return 15;
   }

   @Override
   public int id_break(int var1) {
      return super.id_class(var1) + 50;
   }
}
