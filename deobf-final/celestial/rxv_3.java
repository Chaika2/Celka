package celestial;

public class rxv_3 extends rxx_3 {
   private final rpr_3 break_;

   @Override
   public boolean byte_() {
      return this.break_();
   }

   public rxv_3(rYB var1, rfH_2 var2, rpr_3 var3, rdn_3 var4, rpr_3 var5) {
      super(var1, null, rpm_3.MAIN_HAND, var4, new rff_3(rjU_2.protected_(var2), var5, var2, false));
      this.break_ = var3;
   }

   @Override
   public rfH_2 class_() {
      return this.implements_().class_();
   }

   @Override
   public boolean break_() {
      return this.int_().byte_(this.implements_().class_()).class_(this);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public rpr_3[] throws_() {
      switch (this.break_) {
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
   public boolean catch_() {
      return false;
   }

   @Override
   public rpr_3 case_() {
      return this.break_.final_() == rpB_2.Y ? rpr_3.NORTH : this.break_;
   }

   @Override
   public rpr_3 protected_() {
      return rpr_3.DOWN;
   }

   @Override
   public float private_() {
      return (float)(this.break_.protected_() * 90);
   }
}
