package celestial;

enum oM_2 {
   FORCE(true),
   MOVE(true),
   NORMAL(false);

   private final boolean allowOverlap;

   private oM_2(boolean var3) {
      this.allowOverlap = var3;
   }

   public boolean class_() {
      return this.allowOverlap;
   }
}
