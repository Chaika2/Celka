package celestial;

public enum lg_3 {
   DOWN(rpr_3.DOWN, false),
   UP(rpr_3.UP, false),
   NORTH(rpr_3.NORTH, false),
   SOUTH(rpr_3.SOUTH, false),
   WEST(rpr_3.WEST, false),
   EAST(rpr_3.EAST, false),
   FLIP_DOWN(rpr_3.DOWN, true),
   FLIP_UP(rpr_3.UP, true),
   FLIP_NORTH(rpr_3.NORTH, true),
   FLIP_SOUTH(rpr_3.SOUTH, true),
   FLIP_WEST(rpr_3.WEST, true),
   FLIP_EAST(rpr_3.EAST, true);

   final int shape;

   private lg_3(rpr_3 var3, boolean var4) {
      this.shape = var3.byte_() + (var4 ? rpr_3.values().length : 0);
   }
}
