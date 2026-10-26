package celestial;

public enum rCI implements rpH_2 {
   LEFT,
   RIGHT;

   @Override
   public String toString() {
      return this.id_class();
   }

   @Override
   public String id_class() {
      return this == LEFT ? "left" : "right";
   }
}
