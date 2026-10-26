package celestial;

public class rfR_2 {
   private int id_class;
   private int id_break;
   private int id_byte;
   private int id_protected;
   private int id_throws;
   private int id_case;
   private int id_catch;
   private int id_private;
   private int id_implements;
   private int id_finally;
   private int id_extends;

   public int id_byte() {
      return this.id_break + this.id_finally;
   }

   public rfR_2(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4 - var1 + 1;
      this.id_throws = var5 - var2 + 1;
      this.id_case = var6 - var3 + 1;
      this.id_catch = this.id_protected * this.id_throws * this.id_case;
   }

   public boolean id_class() {
      if (this.id_private == this.id_catch) {
         return false;
      } else {
         this.id_implements = this.id_private % this.id_protected;
         int var1 = this.id_private / this.id_protected;
         this.id_finally = var1 % this.id_throws;
         this.id_extends = var1 / this.id_throws;
         this.id_private++;
         return true;
      }
   }

   public int id_break() {
      return this.id_class + this.id_implements;
   }

   public int id_throws() {
      int var1 = 0;
      if (this.id_implements == 0 || this.id_implements == this.id_protected - 1) {
         var1++;
      }

      if (this.id_finally == 0 || this.id_finally == this.id_throws - 1) {
         var1++;
      }

      if (this.id_extends == 0 || this.id_extends == this.id_case - 1) {
         var1++;
      }

      return var1;
   }

   public int id_protected() {
      return this.id_byte + this.id_extends;
   }
}
