package celestial;

public enum rCj_1 implements rpH_2 {
   TOP("top"),
   BOTTOM("bottom");

   private final String name;

   private rCj_1(String var3) {
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
