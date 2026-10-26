package celestial;

public enum uy_3 {
   HORIZONTAL,
   VERTICAL;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public uq_3 id_byte() {
      return switch (this) {
         case HORIZONTAL -> uq_3.LEFT;
         case VERTICAL -> uq_3.UP;
      };
   }

   public uq_3 id_class(boolean var1) {
      return var1 ? this.id_break() : this.id_byte();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public uy_3 id_class() {
      return switch (this) {
         case HORIZONTAL -> VERTICAL;
         case VERTICAL -> HORIZONTAL;
      };
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public uq_3 id_break() {
      return switch (this) {
         case HORIZONTAL -> uq_3.RIGHT;
         case VERTICAL -> uq_3.DOWN;
      };
   }
}
