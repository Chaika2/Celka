package celestial;

public class rrXx_1 {
   private rrXz_1[] class_;

   public rrXx_1(rrXz_1[] var1) {
      this.class_ = var1;
   }

   public void class_() {
      for (int var1 = 0; var1 < this.class_.length; var1++) {
         rrXz_1 var2 = this.class_[var1];
         var2.class_();
      }
   }

   public boolean class_(rrXh_1 var1) {
      for (int var2 = 0; var2 < this.class_.length; var2++) {
         rrXz_1 var3 = this.class_[var2];
         if (!var3.class_(var1)) {
            return false;
         }
      }

      return true;
   }
}
