package celestial;

public enum rCo_1 implements rpH_2 {
   TOP("top"),
   BOTTOM("bottom"),
   DOUBLE("double");

   private final String name;

   private rCo_1(String var3) {
      this.name = var3;
   }

   @Override
   public String toString() {
      return this.name;
   }

   @Override
   public String class_() {
      return this.name;
   }
}
