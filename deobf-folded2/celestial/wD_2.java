package celestial;

public class wD_2 {
   public float[] id_class;
   public final int id_break;

   public int id_byte(int var1) {
      return (var1 + 4 - this.id_break / 90) % 4;
   }

   public wD_2(float[] var1, int var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(float[] var1) {
      if (this.id_class == null) {
         this.id_class = var1;
      }
   }

   public float id_class(int var1) {
      if (this.id_class == null) {
         throw new NullPointerException("uvs");
      } else {
         int var2 = this.id_protected(var1);
         return this.id_class[var2 != 0 && var2 != 1 ? 2 : 0];
      }
   }

   public float id_break(int var1) {
      if (this.id_class == null) {
         throw new NullPointerException("uvs");
      } else {
         int var2 = this.id_protected(var1);
         return this.id_class[var2 != 0 && var2 != 3 ? 3 : 1];
      }
   }

   private int id_protected(int var1) {
      return (var1 + this.id_break / 90) % 4;
   }
}
