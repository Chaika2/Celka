package celestial;

enum oZ_2 {
   REPLACE((var0, var1, var2, var3) -> var2),
   OUTLINE(
      (var0, var1, var2, var3) -> var1.b_() != var0.id_class
               && var1.b_() != var0.id_protected
               && var1.c_() != var0.id_break
               && var1.c_() != var0.id_throws
               && var1.d_() != var0.id_byte
               && var1.d_() != var0.id_case
            ? null
            : var2
   ),
   HOLLOW(
      (var0, var1, var2, var3) -> var1.b_() != var0.id_class
               && var1.b_() != var0.id_protected
               && var1.c_() != var0.id_break
               && var1.c_() != var0.id_throws
               && var1.d_() != var0.id_byte
               && var1.d_() != var0.id_case
            ? om_3.id_break
            : var2
   ),
   DESTROY((var0, var1, var2, var3) -> {
      var3.id_break(var1, true);
      return var2;
   });

   public final Kb_1 filter;

   private oZ_2(Kb_1 var3) {
      this.filter = var3;
   }
}
