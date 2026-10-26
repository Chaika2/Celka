package celestial;

public enum rrEJ {
   INACCESSIBLE,
   BORDER,
   TICKING,
   ENTITY_TICKING;

   public boolean id_class(rrEJ var1) {
      return this.ordinal() >= var1.ordinal();
   }
}
