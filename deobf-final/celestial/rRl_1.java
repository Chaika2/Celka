package celestial;

public enum rRl_1 {
   NOT_SET(-1, ""),
   SURVIVAL(0, "survival"),
   CREATIVE(1, "creative"),
   ADVENTURE(2, "adventure"),
   SPECTATOR(3, "spectator");

   private final int id;
   private final String name;

   public rgP_2 byte_() {
      return new rgn_3("gameMode." + this.name);
   }

   private rRl_1(int var3, String var4) {
      this.id = var3;
      this.name = var4;
   }

   public static rRl_1 class_(String var0, rRl_1 var1) {
      for (rRl_1 var5 : values()) {
         if (var5.name.equals(var0)) {
            return var5;
         }
      }

      return var1;
   }

   public static rRl_1 class_(int var0, rRl_1 var1) {
      for (rRl_1 var5 : values()) {
         if (var5.id == var0) {
            return var5;
         }
      }

      return var1;
   }

   public static rRl_1 class_(String var0) {
      return class_(var0, SURVIVAL);
   }

   public void class_(rhx_3 var1) {
      if (this == CREATIVE) {
         var1.byte_ = true;
         var1.protected_ = true;
         var1.class_ = true;
      } else if (this == SPECTATOR) {
         var1.byte_ = true;
         var1.protected_ = false;
         var1.class_ = true;
         var1.break_ = true;
      } else {
         var1.byte_ = false;
         var1.protected_ = false;
         var1.class_ = false;
         var1.break_ = false;
      }

      var1.throws_ = !this.protected_();
   }

   public int class_() {
      return this.id;
   }

   public static rRl_1 class_(int var0) {
      return class_(var0, SURVIVAL);
   }

   public String break_() {
      return this.name;
   }

   public boolean throws_() {
      return this == CREATIVE;
   }

   public boolean case_() {
      return this == SURVIVAL || this == ADVENTURE;
   }

   public boolean protected_() {
      return this == ADVENTURE || this == SPECTATOR;
   }
}
