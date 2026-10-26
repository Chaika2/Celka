package celestial;

public class rpI_2 implements rpF_2 {
   private final int[] id_class;

   public rpI_2(int var1) {
      this.id_class = new int[var1];
   }

   @Override
   public int id_class() {
      return this.id_class.length;
   }

   @Override
   public void id_class(int var1, int var2) {
      this.id_class[var1] = var2;
   }

   @Override
   public int id_class(int var1) {
      return this.id_class[var1];
   }
}
