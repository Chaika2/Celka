package celestial;

public class rrxC_2 {
   private fj_3 id_class;
   private int[] id_break;
   private int[] id_byte;

   public int[] id_byte() {
      return this.id_byte;
   }

   public rrxC_2(fj_3 var1, int[] var2, int[] var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      if (var2.length != var3.length) {
         throw new IllegalArgumentException(var2.length + " != " + var3.length);
      }
   }

   @Override
   public String toString() {
      return this.id_class.id_finally() + ", " + this.id_break.length;
   }

   public fj_3 id_class() {
      return this.id_class;
   }

   public int[] id_break() {
      return this.id_break;
   }
}
