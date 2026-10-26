package celestial;

enum YU {
   GRANT("grant"),
   REVOKE("revoke");

   private final String prefix;

   YU(String var3) {
      this.prefix = "commands.advancement." + var3;
   }

   protected abstract boolean id_class(rhN_2 var1, OT var2);

   protected String id_class() {
      return this.prefix;
   }

   protected abstract boolean id_class(rhN_2 var1, OT var2, String var3);

   public int id_class(rhN_2 var1, Iterable<OT> var2) {
      int var3 = 0;

      for (OT var5 : var2) {
         if (this.id_class(var1, var5)) {
            var3++;
         }
      }

      return var3;
   }
}
