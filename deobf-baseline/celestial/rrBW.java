package celestial;

public enum rrBW implements rrBC, rrBq_1 {
   INSTANCE;

   @Override
   public int id_class(rKC var1, rKj_1 var2, rKj_1 var3, int var4, int var5) {
      int var6 = var2.id_class(this.id_class(var4), this.id_break(var5));
      int var7 = var3.id_class(this.id_class(var4), this.id_break(var5));
      if (rrBx_1.id_class(var6)) {
         return var6;
      } else if (var7 == 7) {
         if (var6 == 12) {
            return 11;
         } else {
            return var6 != 14 && var6 != 15 ? var7 & 0xFF : 15;
         }
      } else {
         return var6;
      }
   }
}
