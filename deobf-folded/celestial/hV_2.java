package celestial;

public class hV_2 {
   private Boolean id_class;
   private Boolean id_break;
   private Boolean id_byte;
   private Boolean id_protected;
   private Boolean id_throws;

   public hV_2 id_class(Boolean var1) {
      this.id_class = var1;
      return this;
   }

   public static hV_2 id_class() {
      return new hV_2();
   }

   public hV_2 id_break(Boolean var1) {
      this.id_throws = var1;
      return this;
   }

   public hj_3 id_break() {
      return new hj_3(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws);
   }
}
