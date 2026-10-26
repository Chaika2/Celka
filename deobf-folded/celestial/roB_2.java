package celestial;

public enum roB_2 {
   GROWING(4259712),
   SHRINKING(16724016),
   STATIONARY(2138367);

   private final int color;

   private roB_2(int var3) {
      this.color = var3;
   }

   public int id_class() {
      return this.color;
   }
}
