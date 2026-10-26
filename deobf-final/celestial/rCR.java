package celestial;

public enum rCR implements rpH_2 {
   NORTH_SOUTH("north_south"),
   EAST_WEST("east_west"),
   ASCENDING_EAST("ascending_east"),
   ASCENDING_WEST("ascending_west"),
   ASCENDING_NORTH("ascending_north"),
   ASCENDING_SOUTH("ascending_south"),
   SOUTH_EAST("south_east"),
   SOUTH_WEST("south_west"),
   NORTH_WEST("north_west"),
   NORTH_EAST("north_east");

   private final String name;

   private rCR(String var3) {
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

   public boolean break_() {
      return this == ASCENDING_NORTH || this == ASCENDING_EAST || this == ASCENDING_SOUTH || this == ASCENDING_WEST;
   }
}
