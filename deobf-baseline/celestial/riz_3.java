package celestial;

class riz_3 {
   final int id_class;
   final riz_3[] id_break = new riz_3[6];
   final boolean[] id_byte = new boolean[6];
   boolean id_protected;
   boolean id_throws;
   private int id_case;

   public int id_byte() {
      int var1 = 0;

      for (int var2 = 0; var2 < 6; var2++) {
         if (this.id_byte[var2]) {
            var1++;
         }
      }

      return var1;
   }

   public riz_3(int var1) {
      this.id_class = var1;
   }

   public boolean id_class(int var1) {
      if (this.id_throws) {
         return true;
      } else {
         this.id_case = var1;

         for (int var2 = 0; var2 < 6; var2++) {
            if (this.id_break[var2] != null && this.id_byte[var2] && this.id_break[var2].id_case != var1 && this.id_break[var2].id_class(var1)) {
               return true;
            }
         }

         return false;
      }
   }

   public void id_class(rpr_3 var1, riz_3 var2) {
      this.id_break[var1.id_byte()] = var2;
      var2.id_break[var1.id_case().id_byte()] = this;
   }

   public void id_class() {
      for (int var1 = 0; var1 < 6; var1++) {
         this.id_byte[var1] = this.id_break[var1] != null;
      }
   }

   public boolean id_break() {
      return this.id_class >= 75;
   }
}
