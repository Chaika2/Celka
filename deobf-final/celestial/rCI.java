package celestial;

public enum rCI implements rpH_2 {
   LEFT,
   RIGHT;

   @Override
   public String toString() {
      return this.class_();
   }

   @Override
   public String class_() {
      return this == LEFT ? "left" : "right";
   }
}
