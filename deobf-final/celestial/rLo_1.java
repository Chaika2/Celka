package celestial;

public enum rLo_1 {
   BENEFICIAL(rgF_2.BLUE),
   HARMFUL(rgF_2.RED),
   NEUTRAL(rgF_2.BLUE);

   private final rgF_2 color;

   private rLo_1(rgF_2 var3) {
      this.color = var3;
   }

   public rgF_2 class_() {
      return this.color;
   }
}
