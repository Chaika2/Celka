package celestial;

public class xQ_2 {
   private final rfH_2 id_class;
   private final xd_3 id_break;
   private final int id_byte;
   private final int id_protected;

   public int id_byte() {
      return this.id_byte;
   }

   public xQ_2(rfH_2 var1, xd_3 var2, int var3, int var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof xQ_2 var2)
         ? false
         : this.id_class.equals(var2.id_class) && this.id_byte == var2.id_byte && this.id_protected == var2.id_protected && this.id_break == var2.id_break;
   }

   @Override
   public String toString() {
      return "TE(" + this.id_class + ")," + this.id_byte + "," + this.id_protected + "," + this.id_break;
   }

   @Override
   public int hashCode() {
      int var1 = this.id_class.hashCode();
      var1 = 31 * var1 + this.id_break.hashCode();
      var1 = 31 * var1 + this.id_byte;
      return 31 * var1 + this.id_protected;
   }

   public rfH_2 id_class() {
      return this.id_class;
   }

   public xd_3 id_break() {
      return this.id_break;
   }

   public int id_protected() {
      return this.id_protected;
   }
}
