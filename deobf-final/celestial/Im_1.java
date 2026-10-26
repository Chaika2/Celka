package celestial;

enum Im_1 {
   UP(rpr_3.UP, 0, -1),
   DOWN(rpr_3.DOWN, 0, 1),
   LEFT(rpr_3.EAST, -1, 0),
   RIGHT(rpr_3.WEST, 1, 0);

   private final rpr_3 facing;
   private final int xOffset;
   private final int yOffset;

   public int byte_() {
      return this.yOffset;
   }

   private Im_1(rpr_3 var3, int var4, int var5) {
      this.facing = var3;
      this.xOffset = var4;
      this.yOffset = var5;
   }

   public rpr_3 class_() {
      return this.facing;
   }

   public int break_() {
      return this.xOffset;
   }

   boolean protected_() {
      return this == DOWN || this == UP;
   }
}
