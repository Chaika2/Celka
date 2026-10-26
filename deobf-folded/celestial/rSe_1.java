package celestial;

public enum rSe_1 {
   OAK(xu_3.id_final, "oak"),
   SPRUCE(xu_3.id_package, "spruce"),
   BIRCH(xu_3.id_int, "birch"),
   JUNGLE(xu_3.id_new, "jungle"),
   ACACIA(xu_3.id_continue, "acacia"),
   DARK_OAK(xu_3.id_super, "dark_oak");

   private final String name;
   private final xd_3 block;

   private rSe_1(xd_3 var3, String var4) {
      this.name = var4;
      this.block = var3;
   }

   @Override
   public String toString() {
      return this.name;
   }

   public static rSe_1 id_class(String var0) {
      rSe_1[] var1 = values();

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2].id_class().equals(var0)) {
            return var1[var2];
         }
      }

      return var1[0];
   }

   public static rSe_1 id_class(int var0) {
      rSe_1[] var1 = values();
      if (var0 < 0 || var0 >= var1.length) {
         var0 = 0;
      }

      return var1[var0];
   }

   public String id_class() {
      return this.name;
   }

   public xd_3 id_break() {
      return this.block;
   }
}
