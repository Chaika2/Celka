package celestial;

public enum rCY implements rpH_2 {
   UP("up"),
   SIDE("side"),
   NONE("none");

   private final String name;

   private rCY(String var3) {
      this.name = var3;
   }

   @Override
   public String toString() {
      return this.id_class();
   }

   @Override
   public String id_class() {
      return this.name;
   }

   public boolean id_break() {
      return this != NONE;
   }
}
