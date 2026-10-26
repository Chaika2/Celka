package celestial;

public enum rXQ {
   MAINHAND(rXN.HAND, 0, 0, "mainhand"),
   OFFHAND(rXN.HAND, 1, 5, "offhand"),
   FEET(rXN.ARMOR, 0, 1, "feet"),
   LEGS(rXN.ARMOR, 1, 2, "legs"),
   CHEST(rXN.ARMOR, 2, 3, "chest"),
   HEAD(rXN.ARMOR, 3, 4, "head");

   private final rXN slotType;
   private final int index;
   private final int slotIndex;
   private final String name;

   public int byte_() {
      return this.slotIndex;
   }

   private rXQ(rXN var3, int var4, int var5, String var6) {
      this.slotType = var3;
      this.index = var4;
      this.slotIndex = var5;
      this.name = var6;
   }

   public rXN class_() {
      return this.slotType;
   }

   public static rXQ class_(rXN var0, int var1) {
      for (rXQ var5 : values()) {
         if (var5.class_() == var0 && var5.break_() == var1) {
            return var5;
         }
      }

      throw new IllegalArgumentException("Invalid slot '" + var0 + "': " + var1);
   }

   public static rXQ class_(String var0) {
      for (rXQ var4 : values()) {
         if (var4.protected_().equals(var0)) {
            return var4;
         }
      }

      throw new IllegalArgumentException("Invalid slot '" + var0 + "'");
   }

   public int break_() {
      return this.index;
   }

   public String protected_() {
      return this.name;
   }
}
