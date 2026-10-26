package celestial;

public enum lV_2 {
   DOWN(
      new rpr_3[]{rpr_3.WEST, rpr_3.EAST, rpr_3.NORTH, rpr_3.SOUTH},
      0.5F,
      true,
      new lg_3[]{lg_3.FLIP_WEST, lg_3.SOUTH, lg_3.FLIP_WEST, lg_3.FLIP_SOUTH, lg_3.WEST, lg_3.FLIP_SOUTH, lg_3.WEST, lg_3.SOUTH},
      new lg_3[]{lg_3.FLIP_WEST, lg_3.NORTH, lg_3.FLIP_WEST, lg_3.FLIP_NORTH, lg_3.WEST, lg_3.FLIP_NORTH, lg_3.WEST, lg_3.NORTH},
      new lg_3[]{lg_3.FLIP_EAST, lg_3.NORTH, lg_3.FLIP_EAST, lg_3.FLIP_NORTH, lg_3.EAST, lg_3.FLIP_NORTH, lg_3.EAST, lg_3.NORTH},
      new lg_3[]{lg_3.FLIP_EAST, lg_3.SOUTH, lg_3.FLIP_EAST, lg_3.FLIP_SOUTH, lg_3.EAST, lg_3.FLIP_SOUTH, lg_3.EAST, lg_3.SOUTH}
   ),
   UP(
      new rpr_3[]{rpr_3.EAST, rpr_3.WEST, rpr_3.NORTH, rpr_3.SOUTH},
      1.0F,
      true,
      new lg_3[]{lg_3.EAST, lg_3.SOUTH, lg_3.EAST, lg_3.FLIP_SOUTH, lg_3.FLIP_EAST, lg_3.FLIP_SOUTH, lg_3.FLIP_EAST, lg_3.SOUTH},
      new lg_3[]{lg_3.EAST, lg_3.NORTH, lg_3.EAST, lg_3.FLIP_NORTH, lg_3.FLIP_EAST, lg_3.FLIP_NORTH, lg_3.FLIP_EAST, lg_3.NORTH},
      new lg_3[]{lg_3.WEST, lg_3.NORTH, lg_3.WEST, lg_3.FLIP_NORTH, lg_3.FLIP_WEST, lg_3.FLIP_NORTH, lg_3.FLIP_WEST, lg_3.NORTH},
      new lg_3[]{lg_3.WEST, lg_3.SOUTH, lg_3.WEST, lg_3.FLIP_SOUTH, lg_3.FLIP_WEST, lg_3.FLIP_SOUTH, lg_3.FLIP_WEST, lg_3.SOUTH}
   ),
   NORTH(
      new rpr_3[]{rpr_3.UP, rpr_3.DOWN, rpr_3.EAST, rpr_3.WEST},
      0.8F,
      true,
      new lg_3[]{lg_3.UP, lg_3.FLIP_WEST, lg_3.UP, lg_3.WEST, lg_3.FLIP_UP, lg_3.WEST, lg_3.FLIP_UP, lg_3.FLIP_WEST},
      new lg_3[]{lg_3.UP, lg_3.FLIP_EAST, lg_3.UP, lg_3.EAST, lg_3.FLIP_UP, lg_3.EAST, lg_3.FLIP_UP, lg_3.FLIP_EAST},
      new lg_3[]{lg_3.DOWN, lg_3.FLIP_EAST, lg_3.DOWN, lg_3.EAST, lg_3.FLIP_DOWN, lg_3.EAST, lg_3.FLIP_DOWN, lg_3.FLIP_EAST},
      new lg_3[]{lg_3.DOWN, lg_3.FLIP_WEST, lg_3.DOWN, lg_3.WEST, lg_3.FLIP_DOWN, lg_3.WEST, lg_3.FLIP_DOWN, lg_3.FLIP_WEST}
   ),
   SOUTH(
      new rpr_3[]{rpr_3.WEST, rpr_3.EAST, rpr_3.DOWN, rpr_3.UP},
      0.8F,
      true,
      new lg_3[]{lg_3.UP, lg_3.FLIP_WEST, lg_3.FLIP_UP, lg_3.FLIP_WEST, lg_3.FLIP_UP, lg_3.WEST, lg_3.UP, lg_3.WEST},
      new lg_3[]{lg_3.DOWN, lg_3.FLIP_WEST, lg_3.FLIP_DOWN, lg_3.FLIP_WEST, lg_3.FLIP_DOWN, lg_3.WEST, lg_3.DOWN, lg_3.WEST},
      new lg_3[]{lg_3.DOWN, lg_3.FLIP_EAST, lg_3.FLIP_DOWN, lg_3.FLIP_EAST, lg_3.FLIP_DOWN, lg_3.EAST, lg_3.DOWN, lg_3.EAST},
      new lg_3[]{lg_3.UP, lg_3.FLIP_EAST, lg_3.FLIP_UP, lg_3.FLIP_EAST, lg_3.FLIP_UP, lg_3.EAST, lg_3.UP, lg_3.EAST}
   ),
   WEST(
      new rpr_3[]{rpr_3.UP, rpr_3.DOWN, rpr_3.NORTH, rpr_3.SOUTH},
      0.6F,
      true,
      new lg_3[]{lg_3.UP, lg_3.SOUTH, lg_3.UP, lg_3.FLIP_SOUTH, lg_3.FLIP_UP, lg_3.FLIP_SOUTH, lg_3.FLIP_UP, lg_3.SOUTH},
      new lg_3[]{lg_3.UP, lg_3.NORTH, lg_3.UP, lg_3.FLIP_NORTH, lg_3.FLIP_UP, lg_3.FLIP_NORTH, lg_3.FLIP_UP, lg_3.NORTH},
      new lg_3[]{lg_3.DOWN, lg_3.NORTH, lg_3.DOWN, lg_3.FLIP_NORTH, lg_3.FLIP_DOWN, lg_3.FLIP_NORTH, lg_3.FLIP_DOWN, lg_3.NORTH},
      new lg_3[]{lg_3.DOWN, lg_3.SOUTH, lg_3.DOWN, lg_3.FLIP_SOUTH, lg_3.FLIP_DOWN, lg_3.FLIP_SOUTH, lg_3.FLIP_DOWN, lg_3.SOUTH}
   ),
   EAST(
      new rpr_3[]{rpr_3.DOWN, rpr_3.UP, rpr_3.NORTH, rpr_3.SOUTH},
      0.6F,
      true,
      new lg_3[]{lg_3.FLIP_DOWN, lg_3.SOUTH, lg_3.FLIP_DOWN, lg_3.FLIP_SOUTH, lg_3.DOWN, lg_3.FLIP_SOUTH, lg_3.DOWN, lg_3.SOUTH},
      new lg_3[]{lg_3.FLIP_DOWN, lg_3.NORTH, lg_3.FLIP_DOWN, lg_3.FLIP_NORTH, lg_3.DOWN, lg_3.FLIP_NORTH, lg_3.DOWN, lg_3.NORTH},
      new lg_3[]{lg_3.FLIP_UP, lg_3.NORTH, lg_3.FLIP_UP, lg_3.FLIP_NORTH, lg_3.UP, lg_3.FLIP_NORTH, lg_3.UP, lg_3.NORTH},
      new lg_3[]{lg_3.FLIP_UP, lg_3.SOUTH, lg_3.FLIP_UP, lg_3.FLIP_SOUTH, lg_3.UP, lg_3.FLIP_SOUTH, lg_3.UP, lg_3.SOUTH}
   );

   final rpr_3[] corners;
   final boolean doNonCubicWeight;
   final lg_3[] vert0Weights;
   final lg_3[] vert1Weights;
   final lg_3[] vert2Weights;
   final lg_3[] vert3Weights;
   private static final lV_2[] VALUES = rqR_2.class_(new lV_2[6], var0 -> {
      var0[rpr_3.DOWN.byte_()] = DOWN;
      var0[rpr_3.UP.byte_()] = UP;
      var0[rpr_3.NORTH.byte_()] = NORTH;
      var0[rpr_3.SOUTH.byte_()] = SOUTH;
      var0[rpr_3.WEST.byte_()] = WEST;
      var0[rpr_3.EAST.byte_()] = EAST;
   });

   private lV_2(rpr_3[] var3, float var4, boolean var5, lg_3[] var6, lg_3[] var7, lg_3[] var8, lg_3[] var9) {
      this.corners = var3;
      this.doNonCubicWeight = var5;
      this.vert0Weights = var6;
      this.vert1Weights = var7;
      this.vert2Weights = var8;
      this.vert3Weights = var9;
   }

   public static lV_2 class_(rpr_3 var0) {
      return VALUES[var0.byte_()];
   }
}
