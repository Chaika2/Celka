package celestial;

public enum rCw_1 implements rpH_2 {
   COMPARE("compare"),
   SUBTRACT("subtract");

   private final String name;

   private rCw_1(String var3) {
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
