package celestial;

public enum rrEJ {
   INACCESSIBLE,
   BORDER,
   TICKING,
   ENTITY_TICKING;

   public boolean class_(rrEJ var1) {
      return this.ordinal() >= var1.ordinal();
   }
}
