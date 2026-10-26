package celestial;

public enum rCy_1 implements rpH_2 {
   NONE("none"),
   SMALL("small"),
   LARGE("large");

   private final String name;

   private rCy_1(String var3) {
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
