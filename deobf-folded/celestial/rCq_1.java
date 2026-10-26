package celestial;

public enum rCq_1 implements rpH_2 {
   FLOOR("floor"),
   CEILING("ceiling"),
   SINGLE_WALL("single_wall"),
   DOUBLE_WALL("double_wall");

   private final String name;

   private rCq_1(String var3) {
      this.name = var3;
   }

   @Override
   public String id_class() {
      return this.name;
   }
}
