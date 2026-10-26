package celestial;

public enum aO_2 {
   ALL("all", 1, 11),
   FIRE("fire", 10, 8),
   FALL("fall", 5, 6),
   EXPLOSION("explosion", 5, 8),
   PROJECTILE("projectile", 3, 6);

   private final String typeName;
   private final int minEnchantability;
   private final int levelCost;

   private aO_2(String var3, int var4, int var5) {
      this.typeName = var3;
      this.minEnchantability = var4;
      this.levelCost = var5;
   }

   public int class_() {
      return this.minEnchantability;
   }

   public int break_() {
      return this.levelCost;
   }
}
