package celestial;

import java.util.Objects;

public class rrGO {
   private final rrGh_1 id_class;
   private byte id_break;
   private byte id_byte;
   private byte id_protected;
   private final rgP_2 id_throws;

   public byte id_byte() {
      return this.id_break;
   }

   public rrGO(rrGh_1 var1, byte var2, byte var3, byte var4, rgP_2 var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof rrGO var2)) {
         return false;
      } else if (this.id_class != var2.id_class) {
         return false;
      } else if (this.id_protected != var2.id_protected) {
         return false;
      } else if (this.id_break != var2.id_break) {
         return false;
      } else {
         return this.id_byte != var2.id_byte ? false : Objects.equals(this.id_throws, var2.id_throws);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.id_class.id_class();
      var1 = 31 * var1 + this.id_break;
      var1 = 31 * var1 + this.id_byte;
      var1 = 31 * var1 + this.id_protected;
      return 31 * var1 + Objects.hashCode(this.id_throws);
   }

   public byte id_class() {
      return this.id_class.id_class();
   }

   public rrGh_1 id_break() {
      return this.id_class;
   }

   public byte id_throws() {
      return this.id_protected;
   }

   public rgP_2 id_catch() {
      return this.id_throws;
   }

   public boolean id_case() {
      return this.id_class.id_break();
   }

   public byte id_protected() {
      return this.id_byte;
   }
}
