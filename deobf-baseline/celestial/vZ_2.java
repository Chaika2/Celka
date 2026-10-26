package celestial;

public class vZ_2 {
   private final float id_class;
   private final float id_break;
   private final float id_byte;
   private final float id_protected;

   public float id_byte() {
      return this.id_byte;
   }

   public vZ_2(float var1, float var2, float var3, float var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   public boolean id_class(float var1, float var2) {
      return var1 >= this.id_class && var1 <= this.id_byte && var2 >= this.id_break && var2 <= this.id_protected;
   }

   public float id_class() {
      return this.id_class;
   }

   public float id_break() {
      return this.id_break;
   }

   public float id_protected() {
      return this.id_protected;
   }
}
