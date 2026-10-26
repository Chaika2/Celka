package celestial;

public enum rpG_2 {
   POSITIVE(1, "Towards positive"),
   NEGATIVE(-1, "Towards negative");

   private final int offset;
   private final String description;

   private rpG_2(int var3, String var4) {
      this.offset = var3;
      this.description = var4;
   }

   @Override
   public String toString() {
      return this.description;
   }

   public int class_() {
      return this.offset;
   }

   public rpG_2 break_() {
      return this == POSITIVE ? NEGATIVE : POSITIVE;
   }
}
