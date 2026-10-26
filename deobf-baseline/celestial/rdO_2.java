package celestial;

public class rdO_2 {
   int id_class = 64;
   int id_break;
   rdb_3 id_byte;
   rdX_2 id_protected;
   rde_3 id_throws = rde_3.COMMON;
   rxK_2 id_case;
   boolean id_catch;
   boolean id_private;

   public rdO_2 id_byte(int var1) {
      this.id_break = var1;
      this.id_class = 1;
      return this;
   }

   public rdO_2 id_class(rdb_3 var1) {
      this.id_byte = var1;
      return this;
   }

   public rdO_2 id_class(rdX_2 var1) {
      this.id_protected = var1;
      return this;
   }

   public rdO_2 id_class(rde_3 var1) {
      this.id_throws = var1;
      return this;
   }

   public rdO_2 id_class() {
      this.id_catch = true;
      return this;
   }

   public rdO_2 id_class(boolean var1) {
      this.id_private = var1;
      return this;
   }

   public rdO_2 id_class(int var1) {
      if (this.id_break > 0) {
         throw new RuntimeException("Unable to have damage AND stack.");
      } else {
         this.id_class = var1;
         return this;
      }
   }

   public rdO_2 id_class(rxK_2 var1) {
      this.id_case = var1;
      return this;
   }

   public rdO_2 id_break(int var1) {
      return this.id_break == 0 ? this.id_byte(var1) : this;
   }
}
