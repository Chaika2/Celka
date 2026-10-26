package celestial;

public enum rCf_1 implements rpH_2 {
   UPPER,
   LOWER;

   @Override
   public String toString() {
      return this.class_();
   }

   @Override
   public String class_() {
      return this == UPPER ? "upper" : "lower";
   }
}
