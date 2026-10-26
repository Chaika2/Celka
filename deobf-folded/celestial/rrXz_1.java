package celestial;

public class rrXz_1 {
   private String id_class;
   private String id_break;
   private rrXd_1 id_byte;
   private rrXf_1 id_protected;

   public rrXz_1(String var1, String var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public boolean id_class(rrXh_1 var1) {
      this.id_byte = var1.id_break(this.id_class);
      if (this.id_byte == null) {
         rrbb_3.id_protected("Model variable not found: " + this.id_class);
         return false;
      } else {
         try {
            rrXA var2 = new rrXA(var1);
            this.id_protected = var2.id_class(this.id_break);
            return true;
         } catch (rrXo_1 var3) {
            rrbb_3.id_protected("Error parsing expression: " + this.id_break);
            rrbb_3.id_protected(var3.getClass().getName() + ": " + var3.getMessage());
            return false;
         }
      }
   }

   public void id_class() {
      float var1 = this.id_protected.id_class();
      this.id_byte.id_class(var1);
   }
}
