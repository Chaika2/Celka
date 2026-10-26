package celestial;

class rrre_1 {
   private final int[][] id_class;
   final int id_break;
   final int id_byte;
   private final int id_protected;

   public rrre_1(int var1, int var2, int var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_class = new int[var1][var2];
   }

   public void id_class(int var1, int var2, int var3, int var4) {
      if (this.id_class(var1, var2) == var3) {
         this.id_class(var1, var2, var4);
      }
   }

   public int id_class(int var1, int var2) {
      return var1 >= 0 && var1 < this.id_break && var2 >= 0 && var2 < this.id_byte ? this.id_class[var1][var2] : this.id_protected;
   }

   public void id_class(int var1, int var2, int var3, int var4, int var5) {
      for (int var6 = var2; var6 <= var4; var6++) {
         for (int var7 = var1; var7 <= var3; var7++) {
            this.id_class(var7, var6, var5);
         }
      }
   }

   public void id_class(int var1, int var2, int var3) {
      if (var1 >= 0 && var1 < this.id_break && var2 >= 0 && var2 < this.id_byte) {
         this.id_class[var1][var2] = var3;
      }
   }

   public boolean id_break(int var1, int var2, int var3) {
      return this.id_class(var1 - 1, var2) == var3
         || this.id_class(var1 + 1, var2) == var3
         || this.id_class(var1, var2 + 1) == var3
         || this.id_class(var1, var2 - 1) == var3;
   }
}
