package celestial;

public class rrMC {
   private rsT_2 id_class;
   private int[] id_break;

   public rrMC(rsT_2 var1, int[] var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public rrMC(rsT_2 var1, int var2) {
      this(var1, new int[]{var2});
   }

   public rrMC(rsT_2 var1) {
      this(var1, (int[])null);
   }

   @Override
   public String toString() {
      return this.id_break == null ? this.id_class + "" : this.id_class + ":" + rrbb_3.id_class(this.id_break);
   }

   public static boolean id_class(rsT_2 var0, int var1, rrMC[] var2) {
      if (var2 == null) {
         return false;
      } else {
         for (int var3 = 0; var3 < var2.length; var3++) {
            rrMC var4 = var2[var3];
            if (var4.id_class(var0, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   public rsT_2 id_class() {
      return this.id_class;
   }

   public boolean id_class(rsT_2 var1, int var2) {
      return this.id_class != var1 ? false : this.id_break == null || rrbb_3.id_class(var2, this.id_break);
   }

   public boolean id_class(int var1) {
      if (this.id_break == null) {
         this.id_break = new int[]{var1};
         return true;
      } else if (this.id_break(var1)) {
         return false;
      } else {
         this.id_break = rrbb_3.id_class(this.id_break, var1);
         return true;
      }
   }

   private boolean id_break(int var1) {
      return this.id_break == null ? false : rrbb_3.id_class(var1, this.id_break);
   }

   public int[] id_break() {
      return this.id_break;
   }
}
