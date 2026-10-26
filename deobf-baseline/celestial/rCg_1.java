package celestial;

public enum rCg_1 implements rpH_2 {
   DEFAULT("normal"),
   STICKY("sticky");

   private final String name;

   private rCg_1(String var3) {
      this.name = var3;
   }

   @Override
   public String toString() {
      return this.name;
   }

   @Override
   public String id_class() {
      return this.name;
   }
}
