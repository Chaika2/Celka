package celestial;

enum Ly_1 {
   LOCKED(0, 146),
   LOCKED_HOVER(0, 166),
   LOCKED_DISABLED(0, 186),
   UNLOCKED(20, 146),
   UNLOCKED_HOVER(20, 166),
   UNLOCKED_DISABLED(20, 186);

   private final int x;
   private final int y;

   private Ly_1(int var3, int var4) {
      this.x = var3;
      this.y = var4;
   }

   public int class_() {
      return this.x;
   }

   public int break_() {
      return this.y;
   }
}
