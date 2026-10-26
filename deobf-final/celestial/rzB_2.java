package celestial;

public enum rzB_2 {
   THIS("this", rzQ_2.class_),
   KILLER("killer", rzQ_2.protected_),
   DIRECT_KILLER("direct_killer", rzQ_2.throws_),
   KILLER_PLAYER("killer_player", rzQ_2.break_);

   final String targetType;
   private final rzd_3<? extends an_3> parameter;

   private rzB_2(String var3, rzd_3<? extends an_3> var4) {
      this.targetType = var3;
      this.parameter = var4;
   }

   public rzd_3<? extends an_3> class_() {
      return this.parameter;
   }

   public static rzB_2 class_(String var0) {
      for (rzB_2 var4 : values()) {
         if (var4.targetType.equals(var0)) {
            return var4;
         }
      }

      throw new IllegalArgumentException("Invalid entity target " + var0);
   }
}
