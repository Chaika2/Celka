package celestial;

public enum rtx_3 {
   POSITIVE(1),
   NEGATIVE(-1);

   private final int step;

   private rtx_3(int var3) {
      this.step = var3;
   }

   public int id_class() {
      return this.step;
   }
}
