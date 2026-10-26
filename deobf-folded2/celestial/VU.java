package celestial;

public enum VU implements VD {
   NORMAL(false),
   ADVANCED(true);

   private final boolean isAdvanced;

   private VU(boolean var3) {
      this.isAdvanced = var3;
   }

   @Override
   public boolean id_class() {
      return this.isAdvanced;
   }
}
