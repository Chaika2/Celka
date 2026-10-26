package celestial;

public enum rRb_1 {
   PINK("pink", rgF_2.RED),
   BLUE("blue", rgF_2.BLUE),
   RED("red", rgF_2.DARK_RED),
   GREEN("green", rgF_2.GREEN),
   YELLOW("yellow", rgF_2.YELLOW),
   PURPLE("purple", rgF_2.DARK_BLUE),
   WHITE("white", rgF_2.WHITE);

   private final String name;
   private final rgF_2 formatting;
   private static final rRb_1[] VALUES = values();

   private rRb_1(String var3, rgF_2 var4) {
      this.name = var3;
      this.formatting = var4;
   }

   public static rRb_1 id_class(rgF_2 var0) {
      for (rRb_1 var4 : VALUES) {
         if (var4.formatting == var0) {
            return var4;
         }
      }

      return WHITE;
   }

   public static rRb_1 id_class(String var0) {
      for (rRb_1 var4 : VALUES) {
         if (var4.name.equals(var0)) {
            return var4;
         }
      }

      return WHITE;
   }

   public rgF_2 id_class() {
      return this.formatting;
   }

   public String id_break() {
      return this.name;
   }
}
