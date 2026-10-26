package celestial;

public class rrJt_1 {
   private float id_class = Float.MAX_VALUE;
   private float id_break = Float.MAX_VALUE;
   private float id_byte = Float.MAX_VALUE;
   private float id_protected = -Float.MAX_VALUE;
   private float id_throws = -Float.MAX_VALUE;
   private float id_case = -Float.MAX_VALUE;

   public float id_byte() {
      return this.id_byte;
   }

   public rrJt_1(int[] var1) {
      int var2 = var1.length / 4;

      for (int var3 = 0; var3 < 4; var3++) {
         int var4 = var3 * var2;
         float var5 = Float.intBitsToFloat(var1[var4 + 0]);
         float var6 = Float.intBitsToFloat(var1[var4 + 1]);
         float var7 = Float.intBitsToFloat(var1[var4 + 2]);
         if (this.id_class > var5) {
            this.id_class = var5;
         }

         if (this.id_break > var6) {
            this.id_break = var6;
         }

         if (this.id_byte > var7) {
            this.id_byte = var7;
         }

         if (this.id_protected < var5) {
            this.id_protected = var5;
         }

         if (this.id_throws < var6) {
            this.id_throws = var6;
         }

         if (this.id_case < var7) {
            this.id_case = var7;
         }
      }
   }

   public boolean id_class(rpr_3 var1) {
      float var2;
      float var3;
      float var4;
      switch (var1) {
         case DOWN:
            var2 = this.id_break();
            var3 = this.id_throws();
            var4 = 0.0F;
            break;
         case UP:
            var2 = this.id_break();
            var3 = this.id_throws();
            var4 = 1.0F;
            break;
         case NORTH:
            var2 = this.id_byte();
            var3 = this.id_case();
            var4 = 0.0F;
            break;
         case SOUTH:
            var2 = this.id_byte();
            var3 = this.id_case();
            var4 = 1.0F;
            break;
         case WEST:
            var2 = this.id_class();
            var3 = this.id_protected();
            var4 = 0.0F;
            break;
         case EAST:
            var2 = this.id_class();
            var3 = this.id_protected();
            var4 = 1.0F;
            break;
         default:
            return false;
      }

      return var2 == var4 && var3 == var4;
   }

   public float id_class() {
      return this.id_class;
   }

   public boolean id_break(rpr_3 var1) {
      float var2;
      float var3;
      float var4;
      float var5;
      switch (var1) {
         case DOWN:
         case UP:
            var2 = this.id_class();
            var3 = this.id_protected();
            var4 = this.id_byte();
            var5 = this.id_case();
            break;
         case NORTH:
         case SOUTH:
            var2 = this.id_class();
            var3 = this.id_protected();
            var4 = this.id_break();
            var5 = this.id_throws();
            break;
         case WEST:
         case EAST:
            var2 = this.id_break();
            var3 = this.id_throws();
            var4 = this.id_byte();
            var5 = this.id_case();
            break;
         default:
            return false;
      }

      return var2 == 0.0F && var3 == 1.0F && var4 == 0.0F && var5 == 1.0F;
   }

   public float id_break() {
      return this.id_break;
   }

   public float id_throws() {
      return this.id_throws;
   }

   public float id_case() {
      return this.id_case;
   }

   public float id_protected() {
      return this.id_protected;
   }
}
