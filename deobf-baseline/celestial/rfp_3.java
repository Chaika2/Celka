package celestial;

import com.google.common.collect.AbstractIterator;

class rfp_3 extends AbstractIterator<rfH_2> {
   private final rfw_3 id_private;
   private int id_implements;
   private int id_finally;
   private int id_extends;
   private int id_native;
   private int id_volatile;
   private boolean id_final;

   rfp_3(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_private = new rfw_3();
   }

   protected rfH_2 id_class() {
      if (this.id_final) {
         this.id_final = false;
         this.id_private.c_(this.id_class - (this.id_private.d_() - this.id_class));
         return this.id_private;
      } else {
         rfw_3 var1;
         for (var1 = null; var1 == null; this.id_volatile++) {
            if (this.id_volatile > this.id_extends) {
               this.id_native++;
               if (this.id_native > this.id_finally) {
                  this.id_implements++;
                  if (this.id_implements > this.id_break) {
                     return (rfH_2)this.endOfData();
                  }

                  this.id_finally = Math.min(this.id_byte, this.id_implements);
                  this.id_native = -this.id_finally;
               }

               this.id_extends = Math.min(this.id_protected, this.id_implements - Math.abs(this.id_native));
               this.id_volatile = -this.id_extends;
            }

            int var2 = this.id_native;
            int var3 = this.id_volatile;
            int var4 = this.id_implements - Math.abs(var2) - Math.abs(var3);
            if (var4 <= this.id_throws) {
               this.id_final = var4 != 0;
               var1 = this.id_private.id_class(this.id_case + var2, this.id_catch + var3, this.id_class + var4);
            }
         }

         return var1;
      }
   }
}
