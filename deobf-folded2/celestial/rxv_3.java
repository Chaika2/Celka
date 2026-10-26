package celestial;

public class rxv_3 extends rxx_3 {
   private final rpr_3 id_break;

   @Override
   public boolean id_byte() {
      return this.id_break();
   }

   public rxv_3(rYB var1, rfH_2 var2, rpr_3 var3, rdn_3 var4, rpr_3 var5) {
      super(var1, null, rpm_3.MAIN_HAND, var4, new rff_3(rjU_2.id_protected(var2), var5, var2, false));
      this.id_break = var3;
   }

   @Override
   public rfH_2 id_class() {
      return this.id_implements().id_class();
   }

   @Override
   public boolean id_break() {
      return this.id_int().id_byte(this.id_implements().id_class()).id_class(this);
   }

   @Override
   public rpr_3[] id_throws() {
      switch (this.id_break) {
         case DOWN:
         default:
            return new rpr_3[]{rpr_3.DOWN, rpr_3.NORTH, rpr_3.EAST, rpr_3.SOUTH, rpr_3.WEST, rpr_3.UP};
         case UP:
            return new rpr_3[]{rpr_3.DOWN, rpr_3.UP, rpr_3.NORTH, rpr_3.EAST, rpr_3.SOUTH, rpr_3.WEST};
         case NORTH:
            return new rpr_3[]{rpr_3.DOWN, rpr_3.NORTH, rpr_3.EAST, rpr_3.WEST, rpr_3.UP, rpr_3.SOUTH};
         case SOUTH:
            return new rpr_3[]{rpr_3.DOWN, rpr_3.SOUTH, rpr_3.EAST, rpr_3.WEST, rpr_3.UP, rpr_3.NORTH};
         case WEST:
            return new rpr_3[]{rpr_3.DOWN, rpr_3.WEST, rpr_3.SOUTH, rpr_3.UP, rpr_3.NORTH, rpr_3.EAST};
         case EAST:
            return new rpr_3[]{rpr_3.DOWN, rpr_3.EAST, rpr_3.SOUTH, rpr_3.UP, rpr_3.NORTH, rpr_3.WEST};
      }
   }

   @Override
   public boolean id_catch() {
      return false;
   }

   @Override
   public rpr_3 id_case() {
      return this.id_break.id_final() == rpB_2.Y ? rpr_3.NORTH : this.id_break;
   }

   @Override
   public rpr_3 id_protected() {
      return rpr_3.DOWN;
   }

   @Override
   public float id_private() {
      return (float)(this.id_break.id_protected() * 90);
   }
}
