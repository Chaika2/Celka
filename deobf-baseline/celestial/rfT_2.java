package celestial;

import com.google.common.collect.AbstractIterator;

class rfT_2 extends AbstractIterator<rfw_3> {
   private final rpr_3[] id_throws;
   private final rfw_3 id_case;
   private final int id_catch;
   private int id_private;
   private int id_implements;
   private int id_finally;
   private int id_extends;
   private int id_native;
   private int id_volatile;

   rfT_2(rpr_3 var1, rpr_3 var2, rfH_2 var3, int var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = new rpr_3[]{this.id_class, this.id_break, this.id_class.id_case(), this.id_break.id_case()};
      this.id_case = this.id_byte.id_new().id_class(this.id_break);
      this.id_catch = 4 * this.id_protected;
      this.id_private = -1;
      this.id_extends = this.id_case.b_();
      this.id_native = this.id_case.c_();
      this.id_volatile = this.id_case.d_();
   }

   protected rfw_3 id_class() {
      this.id_case.id_class(this.id_extends, this.id_native, this.id_volatile).id_class(this.id_throws[(this.id_private + 4) % 4]);
      this.id_extends = this.id_case.b_();
      this.id_native = this.id_case.c_();
      this.id_volatile = this.id_case.d_();
      if (this.id_finally >= this.id_implements) {
         if (this.id_private >= this.id_catch) {
            return (rfw_3)this.endOfData();
         }

         this.id_private++;
         this.id_finally = 0;
         this.id_implements = this.id_private / 2 + 1;
      }

      this.id_finally++;
      return this.id_case;
   }
}
