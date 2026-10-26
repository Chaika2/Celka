package celestial;

public class ea_3 extends ev_3 {
   public ea_3(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.TRIDENT, var2);
   }

   @Override
   public int id_class() {
      return 5;
   }

   @Override
   public float id_class(int var1, aL_2 var2) {
      return var2 == aL_2.id_throws ? (float)var1 * 2.5F : 0.0F;
   }

   @Override
   public int id_class(int var1) {
      return 1 + (var1 - 1) * 8;
   }

   @Override
   public int id_break(int var1) {
      return this.id_class(var1) + 20;
   }
}
