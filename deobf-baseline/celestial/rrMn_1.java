package celestial;

public class rrMn_1 {
   private int id_class = -1;
   private int[] id_break = null;

   public rrMn_1(int var1, int[] var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public rrMn_1(int var1, int var2) {
      this.id_class = var1;
      if (var2 >= 0) {
         this.id_break = new int[]{var2};
      }
   }

   public rrMn_1(int var1) {
      this.id_class = var1;
   }

   @Override
   public String toString() {
      return this.id_class + ":" + rrbb_3.id_class(this.id_break);
   }

   public void id_class(int[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         int var3 = var1[var2];
         this.id_class(var3);
      }
   }

   public boolean id_class(xc_3 var1) {
      return var1.id_continue() != this.id_class ? false : rrMl_1.id_class(var1.id_super(), this.id_break);
   }

   public boolean id_class(int var1, int var2) {
      return var1 != this.id_class ? false : rrMl_1.id_class(var2, this.id_break);
   }

   public int id_class() {
      return this.id_class;
   }

   public void id_class(int var1) {
      if (this.id_break != null && var1 >= 0) {
         for (int var2 = 0; var2 < this.id_break.length; var2++) {
            if (this.id_break[var2] == var1) {
               return;
            }
         }

         this.id_break = rrbb_3.id_class(this.id_break, var1);
      }
   }

   public int[] id_break() {
      return this.id_break;
   }
}
