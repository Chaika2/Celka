package celestial;

public enum rCH implements rpH_2 {
   FLOOR("floor"),
   WALL("wall"),
   CEILING("ceiling");

   private final String name;

   private rCH(String var3) {
      this.name = var3;
   }

   @Override
   public String class_() {
      return this.name;
   }
}
