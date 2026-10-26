package celestial;

public class rpN_2 {
   private final long[] id_class = new long[240];
   private int id_break;
   private int id_byte;
   private int id_protected;

   public long[] id_byte() {
      return this.id_class;
   }

   public int id_class(int var1) {
      return var1 % 240;
   }

   public int id_class() {
      return this.id_break;
   }

   public void id_class(long var1) {
      this.id_class[this.id_protected] = var1;
      this.id_protected++;
      if (this.id_protected == 240) {
         this.id_protected = 0;
      }

      if (this.id_byte < 240) {
         this.id_break = 0;
         this.id_byte++;
      } else {
         this.id_break = this.id_class(this.id_protected + 1);
      }
   }

   public int id_class(long var1, int var3, int var4) {
      double var5 = (double)var1 / (double)(1000000000L / (long)var4);
      return (int)(var5 * (double)var3);
   }

   public int id_break() {
      return this.id_protected;
   }
}
