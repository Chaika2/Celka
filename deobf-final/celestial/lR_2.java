package celestial;

enum lR_2 {
   DOWN(0, 1, 2, 3),
   UP(2, 3, 0, 1),
   NORTH(3, 0, 1, 2),
   SOUTH(0, 1, 2, 3),
   WEST(3, 0, 1, 2),
   EAST(1, 2, 3, 0);

   final int vert0;
   final int vert1;
   final int vert2;
   final int vert3;
   private static final lR_2[] VALUES = rqR_2.class_(new lR_2[6], var0 -> {
      var0[rpr_3.DOWN.byte_()] = DOWN;
      var0[rpr_3.UP.byte_()] = UP;
      var0[rpr_3.NORTH.byte_()] = NORTH;
      var0[rpr_3.SOUTH.byte_()] = SOUTH;
      var0[rpr_3.WEST.byte_()] = WEST;
      var0[rpr_3.EAST.byte_()] = EAST;
   });

   private lR_2(int var3, int var4, int var5, int var6) {
      this.vert0 = var3;
      this.vert1 = var4;
      this.vert2 = var5;
      this.vert3 = var6;
   }

   public static lR_2 class_(rpr_3 var0) {
      return VALUES[var0.byte_()];
   }
}
