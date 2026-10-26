package celestial;

public class rrWH {
   private int[] id_class = null;
   private int id_break = 0;
   private int id_byte = 0;

   public int id_byte(int var1) {
      return this.id_class[var1];
   }

   public int id_byte() {
      return this.id_byte;
   }

   public rrWH(int var1) {
      this.id_class = new int[var1];
   }

   @Override
   public String toString() {
      return "position: " + this.id_break + ", limit: " + this.id_byte + ", capacity: " + this.id_class.length;
   }

   public void id_class(int var1, int var2) {
      this.id_protected(var2);
      this.id_class[var1] = var2;
      if (this.id_byte < var1) {
         this.id_byte = var1;
      }
   }

   public int[] id_class() {
      return this.id_class;
   }

   public void id_class(int var1) {
      this.id_protected(this.id_break);
      this.id_class[this.id_break] = var1;
      this.id_break++;
      if (this.id_byte < this.id_break) {
         this.id_byte = this.id_break;
      }
   }

   public void id_class(int[] var1) {
      this.id_protected(this.id_break + var1.length - 1);
      int var2 = var1.length;

      for (int var3 = 0; var3 < var2; var3++) {
         this.id_class[this.id_break] = var1[var3];
         this.id_break++;
      }

      if (this.id_byte < this.id_break) {
         this.id_byte = this.id_break;
      }
   }

   public void id_break(int var1) {
      this.id_break = var1;
   }

   public void id_break() {
      this.id_break = 0;
      this.id_byte = 0;
   }

   public int[] id_throws() {
      int[] var1 = new int[this.id_byte];
      System.arraycopy(this.id_class, 0, var1, 0, var1.length);
      return var1;
   }

   public int id_protected() {
      return this.id_break;
   }

   private void id_protected(int var1) {
      if (var1 >= this.id_class.length) {
         int var2 = rfU_2.id_byte(var1 + 1);
         int[] var3 = new int[var2];
         System.arraycopy(this.id_class, 0, var3, 0, this.id_class.length);
         this.id_class = var3;
      }
   }
}
