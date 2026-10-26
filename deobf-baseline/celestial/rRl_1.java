package celestial;

public enum rRl_1 {
   NOT_SET(-1, ""),
   SURVIVAL(0, "survival"),
   CREATIVE(1, "creative"),
   ADVENTURE(2, "adventure"),
   SPECTATOR(3, "spectator");

   private final int id;
   private final String name;

   public rgP_2 id_byte() {
      return new rgn_3("gameMode." + this.name);
   }

   private rRl_1(int var3, String var4) {
      this.id = var3;
      this.name = var4;
   }

   public static rRl_1 id_class(String var0, rRl_1 var1) {
      for (rRl_1 var5 : values()) {
         if (var5.name.equals(var0)) {
            return var5;
         }
      }

      return var1;
   }

   public static rRl_1 id_class(int var0, rRl_1 var1) {
      for (rRl_1 var5 : values()) {
         if (var5.id == var0) {
            return var5;
         }
      }

      return var1;
   }

   public static rRl_1 id_class(String var0) {
      return id_class(var0, SURVIVAL);
   }

   public void id_class(rhx_3 var1) {
      if (this == CREATIVE) {
         var1.id_byte = true;
         var1.id_protected = true;
         var1.id_class = true;
      } else if (this == SPECTATOR) {
         var1.id_byte = true;
         var1.id_protected = false;
         var1.id_class = true;
         var1.id_break = true;
      } else {
         var1.id_byte = false;
         var1.id_protected = false;
         var1.id_class = false;
         var1.id_break = false;
      }

      var1.id_throws = !this.id_protected();
   }

   public int id_class() {
      return this.id;
   }

   public static rRl_1 id_class(int var0) {
      return id_class(var0, SURVIVAL);
   }

   public String id_break() {
      return this.name;
   }

   public boolean id_throws() {
      return this == CREATIVE;
   }

   public boolean id_case() {
      return this == SURVIVAL || this == ADVENTURE;
   }

   public boolean id_protected() {
      return this == ADVENTURE || this == SPECTATOR;
   }
}
