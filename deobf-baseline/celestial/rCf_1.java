package celestial;

public enum rCf_1 implements rpH_2 {
   UPPER,
   LOWER;

   @Override
   public String toString() {
      return this.id_class();
   }

   @Override
   public String id_class() {
      return this == UPPER ? "upper" : "lower";
   }
}
