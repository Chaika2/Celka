package celestial;

import java.util.Objects;

public class IK implements Ix_1 {
   private final rqO_2 id_class;
   private final rjo_3 id_break;
   private final boolean id_byte;
   private final int id_protected;

   public rqO_2 id_byte() {
      return this.id_class;
   }

   public IK(rqO_2 var1, rjo_3 var2, boolean var3, int var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof IK var2)
            ? false
            : this.id_class.equals(var2.id_class)
               && Objects.equals(this.id_break, var2.id_break)
               && this.id_byte == var2.id_byte
               && this.id_protected == var2.id_protected;
      }
   }

   @Override
   public String toString() {
      return "Variant{modelLocation=" + this.id_class + ", rotation=" + this.id_break + ", uvLock=" + this.id_byte + ", weight=" + this.id_protected + "}";
   }

   @Override
   public int hashCode() {
      int var1 = this.id_class.hashCode();
      var1 = 31 * var1 + this.id_break.hashCode();
      var1 = 31 * var1 + Boolean.valueOf(this.id_byte).hashCode();
      return 31 * var1 + this.id_protected;
   }

   @Override
   public rjo_3 id_class() {
      return this.id_break;
   }

   @Override
   public boolean id_break() {
      return this.id_byte;
   }

   public int id_protected() {
      return this.id_protected;
   }
}
