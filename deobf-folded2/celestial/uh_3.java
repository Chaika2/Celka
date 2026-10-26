package celestial;

class uh_3 {
   final int id_class;
   final int id_break;
   private final int id_byte;
   private final int id_protected;
   private uh_3 id_throws;
   private uh_3 id_case;
   private boolean id_catch;

   uh_3(int var1, int var2, int var3, int var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   uh_3 id_class(uJ_2 var1) {
      if (this.id_throws != null && this.id_case != null) {
         uh_3 var6 = this.id_throws.id_class(var1);
         if (var6 == null) {
            var6 = this.id_case.id_class(var1);
         }

         return var6;
      } else if (this.id_catch) {
         return null;
      } else {
         int var2 = var1.id_class();
         int var3 = var1.id_break();
         if (var2 > this.id_byte || var3 > this.id_protected) {
            return null;
         } else if (var2 == this.id_byte && var3 == this.id_protected) {
            this.id_catch = true;
            return this;
         } else {
            int var4 = this.id_byte - var2;
            int var5 = this.id_protected - var3;
            if (var4 > var5) {
               this.id_throws = new uh_3(this.id_class, this.id_break, var2, this.id_protected);
               this.id_case = new uh_3(this.id_class + var2 + 1, this.id_break, this.id_byte - var2 - 1, this.id_protected);
            } else {
               this.id_throws = new uh_3(this.id_class, this.id_break, this.id_byte, var3);
               this.id_case = new uh_3(this.id_class, this.id_break + var3 + 1, this.id_byte, this.id_protected - var3 - 1);
            }

            return this.id_throws.id_class(var1);
         }
      }
   }
}
