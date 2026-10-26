package celestial;

public class rrWJ {
   private int[] id_class;
   private int id_break = 0;

   public rrWJ(int var1, int var2, int var3, int var4) {
      this(new int[]{var1, var2, var3, var4});
   }

   public rrWJ(int var1, int var2, int var3) {
      this(new int[]{var1, var2, var3});
   }

   public rrWJ(int var1, int var2) {
      this(new int[]{var1, var2});
   }

   public rrWJ(int[] var1) {
      this.id_class = (int[])var1.clone();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 == this) {
         return true;
      } else if (!(var1 instanceof rrWJ var2)) {
         return false;
      } else {
         int[] var3 = var2.id_break();
         if (var3.length != this.id_class.length) {
            return false;
         } else {
            for (int var4 = 0; var4 < this.id_class.length; var4++) {
               if (this.id_class[var4] != var3[var4]) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   @Override
   public String toString() {
      return "[" + rrbb_3.id_class(this.id_class) + "]";
   }

   @Override
   public int hashCode() {
      if (this.id_break == 0) {
         this.id_break = 7;

         for (int var1 = 0; var1 < this.id_class.length; var1++) {
            int var2 = this.id_class[var1];
            this.id_break = 31 * this.id_break + var2;
         }
      }

      return this.id_break;
   }

   public int[] id_class() {
      return (int[])this.id_class.clone();
   }

   private int[] id_break() {
      return this.id_class;
   }
}
