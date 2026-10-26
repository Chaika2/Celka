package celestial;

public enum rCp_1 implements rpH_2 {
   HEAD("head"),
   FOOT("foot");

   private final String name;

   private rCp_1(String var3) {
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
