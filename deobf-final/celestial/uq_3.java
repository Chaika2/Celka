package celestial;

import it.unimi.dsi.fastutil.ints.IntComparator;

public enum uq_3 {
   UP,
   DOWN,
   LEFT,
   RIGHT;

   private final IntComparator coordinateValueComparator = (var1x, var2x) -> var1x == var2x ? 0 : (this.break_(var1x, var2x) ? -1 : 1);

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean byte_() {
      return switch (this) {
         case UP, LEFT -> false;
         case DOWN, RIGHT -> true;
      };
   }

   public boolean class_(int var1, int var2) {
      return this.byte_() ? var1 > var2 : var2 > var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public uy_3 class_() {
      return switch (this) {
         case UP, DOWN -> uy_3.VERTICAL;
         case LEFT, RIGHT -> uy_3.HORIZONTAL;
      };
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public uq_3 break_() {
      return switch (this) {
         case UP -> DOWN;
         case DOWN -> UP;
         case LEFT -> RIGHT;
         case RIGHT -> LEFT;
      };
   }

   public boolean break_(int var1, int var2) {
      return this.byte_() ? var1 < var2 : var2 < var1;
   }

   public IntComparator protected_() {
      return this.coordinateValueComparator;
   }
}
