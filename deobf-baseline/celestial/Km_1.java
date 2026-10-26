package celestial;

class Km_1 {
   private final rjU_2 id_class;
   private final an_3 id_break;
   private final Rm_1 id_byte;

   public Km_1(an_3 var1, Rm_1 var2) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_class = var2.id_class(var1);
   }

   public Km_1(rjU_2 var1) {
      this.id_break = null;
      this.id_class = var1;
      this.id_byte = null;
   }

   public void id_class(gy_3 var1, an_3 var2) {
      if (this.id_break != null) {
         if (var2 instanceof rhN_2) {
            ((rhN_2)var2).id_class(var1.id_this(), this.id_break, this.id_byte);
         } else {
            var2.id_class(var1.id_this(), this.id_class);
         }
      } else {
         var2.id_class(var1.id_this(), this.id_class);
      }
   }
}
