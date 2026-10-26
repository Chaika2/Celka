package celestial;

import com.google.common.collect.AbstractIterator;
import java.util.Random;

class rfy_3 extends AbstractIterator<rfH_2> {
   final rfw_3 id_class;
   int id_break;

   rfy_3(int var1, int var2, Random var3, int var4, int var5, int var6, int var7, int var8) {
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = var3;
      this.id_case = var4;
      this.id_catch = var5;
      this.id_private = var6;
      this.id_implements = var7;
      this.id_finally = var8;
      this.id_class = new rfw_3();
      this.id_break = this.id_byte;
   }

   protected rfH_2 id_class() {
      if (this.id_break <= 0) {
         return (rfH_2)this.endOfData();
      } else {
         rfw_3 var1 = this.id_class
            .id_class(
               this.id_protected + this.id_throws.nextInt(this.id_case),
               this.id_catch + this.id_throws.nextInt(this.id_private),
               this.id_implements + this.id_throws.nextInt(this.id_finally)
            );
         this.id_break--;
         return var1;
      }
   }
}
