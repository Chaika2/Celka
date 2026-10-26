package celestial;

enum oZ_2 {
   REPLACE((var0, var1, var2, var3) -> var2),
   OUTLINE(
      (var0, var1, var2, var3) -> var1.b_() != var0.class_
               && var1.b_() != var0.protected_
               && var1.c_() != var0.break_
               && var1.c_() != var0.throws_
               && var1.d_() != var0.byte_
               && var1.d_() != var0.case_
            ? null
            : var2
   ),
   HOLLOW(
      (var0, var1, var2, var3) -> var1.b_() != var0.class_
               && var1.b_() != var0.protected_
               && var1.c_() != var0.break_
               && var1.c_() != var0.throws_
               && var1.d_() != var0.byte_
               && var1.d_() != var0.case_
            ? om_3.break_
            : var2
   ),
   DESTROY((var0, var1, var2, var3) -> {
      var3.break_(var1, true);
      return var2;
   });

   public final Kb_1 filter;

   private oZ_2(Kb_1 var3) {
      this.filter = var3;
   }
}
