package celestial;

public class rrMq_1 {
   private rrMp_1[] id_class = new rrMp_1[0];

   public rrMq_1() {
   }

   public rrMq_1(rrMp_1 var1) {
      this.id_class(var1);
   }

   @Override
   public String toString() {
      StringBuffer var1 = new StringBuffer();
      var1.append("[");

      for (int var2 = 0; var2 < this.id_class.length; var2++) {
         rrMp_1 var3 = this.id_class[var2];
         if (var2 > 0) {
            var1.append(", ");
         }

         var1.append(var3.toString());
      }

      var1.append("]");
      return var1.toString();
   }

   public boolean id_class(int var1) {
      for (int var2 = 0; var2 < this.id_class.length; var2++) {
         rrMp_1 var3 = this.id_class[var2];
         if (var3.id_class(var1)) {
            return true;
         }
      }

      return false;
   }

   public int id_class() {
      return this.id_class.length;
   }

   public void id_class(rrMp_1 var1) {
      this.id_class = (rrMp_1[])rrbb_3.id_class(this.id_class, var1);
   }

   public rrMp_1 id_break(int var1) {
      return this.id_class[var1];
   }
}
