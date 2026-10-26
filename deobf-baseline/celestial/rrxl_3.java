package celestial;

public class rrxl_3 {
   private int id_class = -1;
   private int id_break = 0;
   private rrWo_1<rrxl_3> id_byte = new rrWo_1<>(this);

   public int id_byte() {
      return this.id_class + this.id_break;
   }

   @Override
   public String toString() {
      return this.id_class + "/" + this.id_break + "/" + (this.id_class + this.id_break);
   }

   public void id_class(int var1) {
      this.id_class = var1;
   }

   public int id_class() {
      return this.id_class;
   }

   public void id_break(int var1) {
      this.id_break = var1;
   }

   public int id_break() {
      return this.id_break;
   }

   public rrxl_3 id_throws() {
      rrWo_1 var1 = this.id_byte.id_break();
      return var1 == null ? null : (rrxl_3)var1.id_class();
   }

   public rrxl_3 id_case() {
      rrWo_1 var1 = this.id_byte.id_byte();
      return var1 == null ? null : (rrxl_3)var1.id_class();
   }

   public rrWo_1<rrxl_3> id_protected() {
      return this.id_byte;
   }
}
