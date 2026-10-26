package celestial;

public enum rXa_1 {
   PICKUP(false),
   QUICK_MOVE(false),
   SWAP(true),
   CLONE(false),
   THROW(true),
   QUICK_CRAFT(false),
   PICKUP_ALL(false);

   private final boolean isReturningAirItem;

   private rXa_1(boolean var3) {
      this.isReturningAirItem = var3;
   }

   public boolean id_class() {
      return this.isReturningAirItem;
   }
}
