package celestial;

public enum rrGa_1 {
   DOWN(rpr_3.DOWN),
   UP(rpr_3.UP),
   NORTH(rpr_3.NORTH),
   SOUTH(rpr_3.SOUTH),
   WEST(rpr_3.WEST),
   EAST(rpr_3.EAST),
   NORTH_WEST(rpr_3.NORTH, rpr_3.WEST),
   NORTH_EAST(rpr_3.NORTH, rpr_3.EAST),
   SOUTH_WEST(rpr_3.SOUTH, rpr_3.WEST),
   SOUTH_EAST(rpr_3.SOUTH, rpr_3.EAST),
   DOWN_NORTH(rpr_3.DOWN, rpr_3.NORTH),
   DOWN_SOUTH(rpr_3.DOWN, rpr_3.SOUTH),
   UP_NORTH(rpr_3.UP, rpr_3.NORTH),
   UP_SOUTH(rpr_3.UP, rpr_3.SOUTH),
   DOWN_WEST(rpr_3.DOWN, rpr_3.WEST),
   DOWN_EAST(rpr_3.DOWN, rpr_3.EAST),
   UP_WEST(rpr_3.UP, rpr_3.WEST),
   UP_EAST(rpr_3.UP, rpr_3.EAST);

   private rpr_3 facing1;
   private rpr_3 facing2;

   public int byte_() {
      int var1 = this.facing1.implements_();
      if (this.facing2 != null) {
         var1 += this.facing2.implements_();
      }

      return var1;
   }

   private rrGa_1(rpr_3 var3) {
      this.facing1 = var3;
   }

   private rrGa_1(rpr_3 var3, rpr_3 var4) {
      this.facing1 = var3;
      this.facing2 = var4;
   }

   rfH_2 class_(rfH_2 var1) {
      var1 = var1.class_(this.facing1, 1);
      if (this.facing2 != null) {
         var1 = var1.class_(this.facing2, 1);
      }

      return var1;
   }

   public rpr_3 class_() {
      return this.facing1;
   }

   public rpr_3 break_() {
      return this.facing2;
   }

   public int throws_() {
      int var1 = this.facing1.extends_();
      if (this.facing2 != null) {
         var1 += this.facing2.extends_();
      }

      return var1;
   }

   public boolean case_() {
      return this.facing2 != null;
   }

   public int protected_() {
      int var1 = this.facing1.finally_();
      if (this.facing2 != null) {
         var1 += this.facing2.finally_();
      }

      return var1;
   }
}
