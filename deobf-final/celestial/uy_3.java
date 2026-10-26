package celestial;

public enum uy_3 {
   HORIZONTAL,
   VERTICAL;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public uq_3 byte_() {
      return switch (this) {
         case HORIZONTAL -> uq_3.LEFT;
         case VERTICAL -> uq_3.UP;
      };
   }

   public uq_3 class_(boolean var1) {
      return var1 ? this.break_() : this.byte_();
   }

   public uy_3 class_() {
      return switch (this) {
         case HORIZONTAL -> VERTICAL;
         case VERTICAL -> HORIZONTAL;
      };
   }

   public uq_3 break_() {
      return switch (this) {
         case HORIZONTAL -> uq_3.RIGHT;
         case VERTICAL -> uq_3.DOWN;
      };
   }
}
