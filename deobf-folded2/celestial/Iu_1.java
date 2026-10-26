package celestial;

class Iu_1 {
   private final Im_1 id_class;
   private int id_break;
   private int id_byte;
   private final int id_protected;

   public int id_byte() {
      return this.id_byte;
   }

   public Iu_1(Im_1 var1, int var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var2;
      this.id_protected = var3;
   }

   public void id_class(int var1) {
      if (var1 < this.id_break) {
         this.id_break = var1;
      } else if (var1 > this.id_byte) {
         this.id_byte = var1;
      }
   }

   public Im_1 id_class() {
      return this.id_class;
   }

   public int id_break() {
      return this.id_break;
   }

   public int id_protected() {
      return this.id_protected;
   }
}
