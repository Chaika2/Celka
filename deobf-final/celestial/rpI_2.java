package celestial;

public class rpI_2 implements rpF_2 {
   private final int[] class_;

   public rpI_2(int var1) {
      this.class_ = new int[var1];
   }

   @Override
   public int class_() {
      return this.class_.length;
   }

   @Override
   public void class_(int var1, int var2) {
      this.class_[var1] = var2;
   }

   @Override
   public int class_(int var1) {
      return this.class_[var1];
   }
}
