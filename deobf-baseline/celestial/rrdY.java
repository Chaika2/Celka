package celestial;

public class rrdY {
   private String id_class;
   private String id_break;

   public String id_byte() {
      return "#define " + this.id_class + " " + this.id_break;
   }

   public rrdY(String var1, String var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public String toString() {
      return this.id_byte();
   }

   public String id_class() {
      return this.id_class;
   }

   public String id_break() {
      return this.id_break;
   }
}
