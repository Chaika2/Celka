package celestial;

public class aG_2 extends ev_3 {
   public aG_2(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.CROSSBOW, var2);
   }

   @Override
   public int id_class() {
      return 4;
   }

   @Override
   public boolean id_class(ev_3 var1) {
      return super.id_class(var1) && var1 != eY_2.id_float;
   }

   @Override
   public int id_class(int var1) {
      return 1 + (var1 - 1) * 10;
   }

   @Override
   public int id_break(int var1) {
      return 50;
   }
}
