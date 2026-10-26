package celestial;

public class rrdj_1 {
   private float id_class = 1.0F;
   private float id_break = 0.0F;
   private float id_byte = 0.0F;

   public float id_byte() {
      return this.id_byte;
   }

   public rrdj_1(float var1, float var2, float var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public String toString() {
      return this.id_class + ", " + this.id_break + ", " + this.id_byte;
   }

   public float id_class() {
      return this.id_class;
   }

   public float id_break() {
      return this.id_break;
   }
}
