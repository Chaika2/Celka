package celestial;

class Zh_1 {
   static final Zh_1 id_class = new Zh_1("", new ZX(0, 0), true, new int[]{0}, new ZO[]{new ZO(rgc_3.id_class, "", 0, 0)}, new HZ[0]);
   private final String id_break;
   final ZX id_byte;
   final boolean id_protected;
   private final int[] id_throws;
   final ZO[] id_case;
   final HZ[] id_catch;

   public Zh_1(String var1, ZX var2, boolean var3, int[] var4, ZO[] var5, HZ[] var6) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
      this.id_catch = var6;
   }

   public int id_class(int var1) {
      int var2 = ZM.id_class(this.id_throws, var1);
      return this.id_throws[var2];
   }

   public int id_class(cm_3 var1, ZX var2) {
      int var3 = var2.id_break / 9;
      if (var3 < 0) {
         return 0;
      } else if (var3 >= this.id_case.length) {
         return this.id_break.length();
      } else {
         ZO var4 = this.id_case[var3];
         return this.id_throws[var3] + var1.id_break().id_class(var4.id_break, var2.id_class, var4.id_class);
      }
   }

   public int id_class(int var1, int var2) {
      int var3 = ZM.id_class(this.id_throws, var1);
      int var4 = var3 + var2;
      int var5;
      if (0 <= var4 && var4 < this.id_throws.length) {
         int var6 = var1 - this.id_throws[var3];
         int var7 = this.id_case[var4].id_break.length();
         var5 = this.id_throws[var4] + Math.min(var6, var7);
      } else {
         var5 = var1;
      }

      return var5;
   }

   public int id_break(int var1) {
      int var2 = ZM.id_class(this.id_throws, var1);
      return this.id_throws[var2] + this.id_case[var2].id_break.length();
   }
}
