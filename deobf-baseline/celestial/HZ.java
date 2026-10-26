package celestial;

public class HZ {
   private int id_class;
   private int id_break;
   private int id_byte;
   private int id_protected;

   public int id_byte() {
      return this.id_byte;
   }

   public HZ(int var1, int var2, int var3, int var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   public boolean id_class(int var1, int var2) {
      return var1 >= this.id_class && var1 <= this.id_class + this.id_byte && var2 >= this.id_break && var2 <= this.id_break + this.id_protected;
   }

   public int id_class() {
      return this.id_class;
   }

   public int id_break() {
      return this.id_break;
   }

   public int id_protected() {
      return this.id_protected;
   }
}
