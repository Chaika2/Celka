package celestial;

public class rrMq_1 {
   private rrMp_1[] class_ = new rrMp_1[0];

   public rrMq_1() {
   }

   public rrMq_1(rrMp_1 var1) {
      this.class_(var1);
   }

   @Override
   public String toString() {
      StringBuffer var1 = new StringBuffer();
      var1.append("[");

      for (int var2 = 0; var2 < this.class_.length; var2++) {
         rrMp_1 var3 = this.class_[var2];
         if (var2 > 0) {
            var1.append(", ");
         }

         var1.append(var3.toString());
      }

      var1.append("]");
      return var1.toString();
   }

   public boolean class_(int var1) {
      for (int var2 = 0; var2 < this.class_.length; var2++) {
         rrMp_1 var3 = this.class_[var2];
         if (var3.class_(var1)) {
            return true;
         }
      }

      return false;
   }

   public int class_() {
      return this.class_.length;
   }

   public void class_(rrMp_1 var1) {
      this.class_ = (rrMp_1[])rrbb_3.class_(this.class_, var1);
   }

   public rrMp_1 break_(int var1) {
      return this.class_[var1];
   }
}
