package celestial;

public class rrWd_1 {
   private int id_class;
   private int id_break;

   public int id_byte() {
      return this.id_break;
   }

   public rrWd_1(int var1) {
      this.id_class = var1;
      this.id_break = var1;
   }

   public synchronized int id_class() {
      return this.id_break++;
   }

   public synchronized void id_break() {
      this.id_break = this.id_class;
   }
}
