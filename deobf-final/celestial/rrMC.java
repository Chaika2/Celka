package celestial;

public class rrMC {
   private rsT_2 class_;
   private int[] break_;

   public rrMC(rsT_2 var1, int[] var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public rrMC(rsT_2 var1, int var2) {
      this(var1, new int[]{var2});
   }

   public rrMC(rsT_2 var1) {
      this(var1, (int[])null);
   }

   @Override
   public String toString() {
      return this.break_ == null ? this.class_ + "" : this.class_ + ":" + rrbb_3.class_(this.break_);
   }

   public static boolean class_(rsT_2 var0, int var1, rrMC[] var2) {
      if (var2 == null) {
         return false;
      } else {
         for (int var3 = 0; var3 < var2.length; var3++) {
            rrMC var4 = var2[var3];
            if (var4.class_(var0, var1)) {
               return true;
            }
         }

         return false;
      }
   }

   public rsT_2 class_() {
      return this.class_;
   }

   public boolean class_(rsT_2 var1, int var2) {
      return this.class_ != var1 ? false : this.break_ == null || rrbb_3.class_(var2, this.break_);
   }

   public boolean class_(int var1) {
      if (this.break_ == null) {
         this.break_ = new int[]{var1};
         return true;
      } else if (this.break_(var1)) {
         return false;
      } else {
         this.break_ = rrbb_3.class_(this.break_, var1);
         return true;
      }
   }

   private boolean break_(int var1) {
      return this.break_ == null ? false : rrbb_3.class_(var1, this.break_);
   }

   public int[] break_() {
      return this.break_;
   }
}
