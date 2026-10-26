package celestial;

public class rrXx_1 {
   private rrXz_1[] id_class;

   public rrXx_1(rrXz_1[] var1) {
      this.id_class = var1;
   }

   public void id_class() {
      for (int var1 = 0; var1 < this.id_class.length; var1++) {
         rrXz_1 var2 = this.id_class[var1];
         var2.id_class();
      }
   }

   public boolean id_class(rrXh_1 var1) {
      for (int var2 = 0; var2 < this.id_class.length; var2++) {
         rrXz_1 var3 = this.id_class[var2];
         if (!var3.id_class(var1)) {
            return false;
         }
      }

      return true;
   }
}
