package celestial;

public enum eF_2 {
   COMMON(10),
   UNCOMMON(5),
   RARE(2),
   VERY_RARE(1);

   private final int weight;

   private eF_2(int var3) {
      this.weight = var3;
   }

   public int id_class() {
      return this.weight;
   }
}
