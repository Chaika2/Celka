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

   public int id_byte() {
      return this.slotIndex;
   }

   private rXQ(rXN var3, int var4, int var5, String var6) {
      this.slotType = var3;
      this.index = var4;
      this.slotIndex = var5;
      this.name = var6;
   }

   public rXN id_class() {
      return this.slotType;
   }

   public static rXQ id_class(rXN var0, int var1) {
      for (rXQ var5 : values()) {
         if (var5.id_class() == var0 && var5.id_break() == var1) {
            return var5;
         }
      }

      throw new IllegalArgumentException("Invalid slot '" + var0 + "': " + var1);
   }

   public static rXQ id_class(String var0) {
      for (rXQ var4 : values()) {
         if (var4.id_protected().equals(var0)) {
            return var4;
         }
      }

      throw new IllegalArgumentException("Invalid slot '" + var0 + "'");
   }

   public int id_break() {
      return this.index;
   }

   public String id_protected() {
      return this.name;
   }
}
