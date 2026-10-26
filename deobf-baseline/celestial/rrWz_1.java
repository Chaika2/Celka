package celestial;

import java.awt.Dimension;

public class rrWz_1 {
   private boolean id_class = false;
   private float id_break;
   private float id_byte;

   public float id_byte() {
      return this.id_byte;
   }

   public rrWz_1(boolean var1, float var2, float var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof rrWz_1 var2)) {
         return false;
      } else if (this.id_class != var2.id_class) {
         return false;
      } else {
         return this.id_break != var2.id_break ? false : this.id_byte == var2.id_byte;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.id_class ? 1 : 0;
      var1 = var1 * 37 + (int)this.id_break;
      return var1 * 37 + (int)this.id_byte;
   }

   public Dimension id_class(int var1, int var2) {
      return this.id_class
         ? new Dimension((int)(this.id_break * (float)var1), (int)(this.id_byte * (float)var2))
         : new Dimension((int)this.id_break, (int)this.id_byte);
   }

   public boolean id_class() {
      return this.id_class;
   }

   public float id_break() {
      return this.id_break;
   }
}
