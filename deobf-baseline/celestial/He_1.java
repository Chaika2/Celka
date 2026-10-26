package celestial;

enum He_1 {
   NONE("none"),
   IS_OUTLINE("is_outline"),
   AFFECTS_OUTLINE("affects_outline");

   private final String name;

   private He_1(String var3) {
      this.name = var3;
   }

   @Override
   public String toString() {
      return this.name;
   }
}
