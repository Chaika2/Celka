package celestial;

public class eZ_2 extends ev_3 {
   protected eZ_2(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.DIGGER, var2);
   }

   @Override
   public int id_class() {
      return 5;
   }

   @Override
   public boolean id_class(rdn_3 var1) {
      return var1.id_break() == rdy_3.JJ ? true : super.id_class(var1);
   }

   @Override
   public int id_class(int var1) {
      return 1 + 10 * (var1 - 1);
   }

   @Override
   public int id_break(int var1) {
      return super.id_class(var1) + 50;
   }
}
