package celestial;

import it.unimi.dsi.fastutil.ints.IntComparator;

public enum uq_3 {
   UP,
   DOWN,
   LEFT,
   RIGHT;

   private final IntComparator coordinateValueComparator = (var1x, var2x) -> var1x == var2x ? 0 : (this.id_break(var1x, var2x) ? -1 : 1);

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean id_byte() {
      return switch (this) {
         case UP, LEFT -> false;
         case DOWN, RIGHT -> true;
      };
   }

   public boolean id_class(int var1, int var2) {
      return this.id_byte() ? var1 > var2 : var2 > var1;
   }

   public uy_3 id_class() {
      return switch (this) {
         case UP, DOWN -> uy_3.VERTICAL;
         case LEFT, RIGHT -> uy_3.HORIZONTAL;
      };
   }

   public uq_3 id_break() {
      return switch (this) {
         case UP -> DOWN;
         case DOWN -> UP;
         case LEFT -> RIGHT;
         case RIGHT -> LEFT;
      };
   }

   public boolean id_break(int var1, int var2) {
      return this.id_byte() ? var1 < var2 : var2 < var1;
   }

   public IntComparator id_protected() {
      return this.coordinateValueComparator;
   }
}
