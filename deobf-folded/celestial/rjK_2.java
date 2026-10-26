package celestial;

public class rjK_2 {
   public static final rjK_2 id_class = new rjK_2(0.0F, 0.0F);
   public static final rjK_2 id_break = new rjK_2(1.0F, 1.0F);
   public float id_byte;
   public float id_protected;

   public rjK_2(float var1, float var2) {
      this.id_byte = var1;
      this.id_protected = var2;
   }

   public boolean id_class(rjK_2 var1) {
      return this.id_byte == var1.id_byte && this.id_protected == var1.id_protected;
   }

   public rjK_2 id_class(float var1, float var2) {
      this.id_byte = var1;
      this.id_protected = var2;
      return this;
   }
}
