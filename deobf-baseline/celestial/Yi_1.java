package celestial;

enum Yi_1 {
   ONLY(false, false),
   THROUGH(true, true),
   FROM(false, true),
   UNTIL(true, false),
   EVERYTHING(true, true);

   final boolean includesParents;
   final boolean includesChildren;

   private Yi_1(boolean var3, boolean var4) {
      this.includesParents = var3;
      this.includesChildren = var4;
   }
}
