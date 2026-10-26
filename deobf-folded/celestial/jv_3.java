package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class jv_3 {
   private static final Logger id_class = LogManager.getLogger();
   private final jF_2 id_break;
   private final jL_2 id_byte;
   private final int id_protected;
   private final int id_throws;
   private final int id_case;
   private String id_catch;

   public final int id_byte() {
      return this.id_protected;
   }

   public jv_3(int var1, jF_2 var2, jL_2 var3, int var4) {
      if (this.id_class(var1, var3)) {
         this.id_byte = var3;
      } else {
         id_class.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
         this.id_byte = jL_2.UV;
      }

      this.id_break = var2;
      this.id_protected = var1;
      this.id_throws = var4;
      this.id_case = var2.id_class() * this.id_throws;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         jv_3 var2 = (jv_3)var1;
         if (this.id_throws != var2.id_throws) {
            return false;
         } else if (this.id_protected != var2.id_protected) {
            return false;
         } else {
            return this.id_break != var2.id_break ? false : this.id_byte == var2.id_byte;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.id_catch != null ? this.id_catch : this.id_throws + "," + this.id_byte.id_class() + "," + this.id_break.id_break();
   }

   @Override
   public int hashCode() {
      int var1 = this.id_break.hashCode();
      var1 = 31 * var1 + this.id_byte.hashCode();
      var1 = 31 * var1 + this.id_protected;
      return 31 * var1 + this.id_throws;
   }

   public void id_class(long var1, int var3) {
      this.id_byte.id_class(this.id_throws, this.id_break.id_byte(), var3, var1, this.id_protected);
   }

   public void id_class(String var1) {
      this.id_catch = var1;
   }

   private boolean id_class(int var1, jL_2 var2) {
      return var1 == 0 || var2 == jL_2.UV;
   }

   public final jF_2 id_class() {
      return this.id_break;
   }

   public final jL_2 id_break() {
      return this.id_byte;
   }

   public void id_throws() {
      this.id_byte.id_class(this.id_protected);
   }

   public String id_catch() {
      return this.id_catch;
   }

   public final int id_case() {
      return this.id_throws;
   }

   public final int id_protected() {
      return this.id_case;
   }
}
