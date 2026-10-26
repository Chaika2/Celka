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
      return this.class_();
   }

   @Override
   public String class_() {
      return this.name;
   }

   public boolean break_() {
      return this != NONE;
   }
}
