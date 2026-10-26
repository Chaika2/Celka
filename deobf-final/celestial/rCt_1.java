package celestial;

public enum rCt_1 implements rpH_2 {
   SINGLE("single", 0),
   LEFT("left", 2),
   RIGHT("right", 1);

   public static final rCt_1[] VALUES = values();
   private final String name;
   private final int opposite;

   private rCt_1(String var3, int var4) {
      this.name = var3;
      this.opposite = var4;
   }

   @Override
   public String class_() {
      return this.name;
   }

   public rCt_1 break_() {
      return VALUES[this.opposite];
   }
}
