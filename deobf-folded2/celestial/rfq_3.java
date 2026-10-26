package celestial;

import com.google.common.collect.AbstractIterator;

class rfq_3 extends AbstractIterator<rfH_2> {
   private final rfw_3 id_catch;
   private int id_private;

   rfq_3(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = new rfw_3();
   }

   protected rfH_2 id_class() {
      if (this.id_private == this.id_class) {
         return (rfH_2)this.endOfData();
      } else {
         int var1 = this.id_private % this.id_break;
         int var2 = this.id_private / this.id_break;
         int var3 = var2 % this.id_byte;
         int var4 = var2 / this.id_byte;
         this.id_private++;
         return this.id_catch.id_class(this.id_protected + var1, this.id_throws + var3, this.id_case + var4);
      }
   }
}
