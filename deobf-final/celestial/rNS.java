package celestial;

public enum rNS {
   THIS("this", rzQ_2.class_),
   KILLER("killer", rzQ_2.protected_),
   KILLER_PLAYER("killer_player", rzQ_2.break_),
   BLOCK_ENTITY("block_entity", rzQ_2.private_);

   public final String name;
   public final rzd_3<?> parameter;

   private rNS(String var3, rzd_3<?> var4) {
      this.name = var3;
      this.parameter = var4;
   }

   public static rNS class_(String var0) {
      for (rNS var4 : values()) {
         if (var4.name.equals(var0)) {
            return var4;
         }
      }

      throw new IllegalArgumentException("Invalid name source " + var0);
   }
}
