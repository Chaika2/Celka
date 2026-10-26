package celestial;

public class rVr_1 {
   private int id_class;
   private int id_break;
   private int id_byte;
   private int id_protected;

   public void id_byte(int var1) {
      this.id_byte = var1;
   }

   public int id_byte() {
      return this.id_byte;
   }

   public rVr_1() {
   }

   public rVr_1(int var1, int var2, int var3, int var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rVr_1 var2 = (rVr_1)var1;
         if (var2.id_class != this.id_class) {
            return false;
         } else if (var2.id_break != this.id_break) {
            return false;
         } else {
            return var2.id_byte != this.id_byte ? false : var2.id_protected == this.id_protected;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "[" + this.id_class + ", " + this.id_break + ", " + this.id_byte + ", " + this.id_protected + "]";
   }

   @Override
   public int hashCode() {
      int var1 = this.id_class;
      var1 = 31 * var1 + this.id_break;
      var1 = 31 * var1 + this.id_byte;
      return 31 * var1 + this.id_protected;
   }

   public int id_class() {
      return this.id_class;
   }

   public void id_class(int var1) {
      this.id_class = var1;
   }

   public int id_break() {
      return this.id_break;
   }

   public void id_break(int var1) {
      this.id_break = var1;
   }

   public int id_protected() {
      return this.id_protected;
   }

   public void id_protected(int var1) {
      this.id_protected = var1;
   }
}
