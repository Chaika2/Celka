package celestial;

public enum uy_3 {
   HORIZONTAL,
   VERTICAL;

   public uq_3 id_byte() {
      return switch (this) {
         case HORIZONTAL -> uq_3.LEFT;
         case VERTICAL -> uq_3.UP;
      };
   }

   public uq_3 id_class(boolean var1) {
      return var1 ? this.id_break() : this.id_byte();
   }

   public uy_3 id_class() {
      return switch (this) {
         case HORIZONTAL -> VERTICAL;
         case VERTICAL -> HORIZONTAL;
      };
   }

   public uq_3 id_break() {
      return switch (this) {
         case HORIZONTAL -> uq_3.RIGHT;
         case VERTICAL -> uq_3.DOWN;
      };
   }
}
