package celestial;

import java.util.EnumSet;

class rEf_1 extends rBk_1 {
   private final rEI id_class;
   private int id_break;
   private final boolean id_byte;

   @Override
   public void id_byte() {
      this.id_break = -10;
      this.id_class.id_public().id_final();
      this.id_class.id_continue().id_class(this.id_class.I_(), 90.0F, 90.0F);
      rEI var10000 = this.id_class;
      Boolean var5 = true;
      var10000.id_throws[57] = var5;
   }

   public rEf_1(rEI var1) {
      this.id_class = var1;
      this.id_byte = var1 instanceof rEc_1;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   @Override
   public boolean id_class() {
      iB_2 var1 = this.id_class.I_();
      return var1 != null && var1.BM();
   }

   @Override
   public boolean id_break() {
      return super.id_break() && (this.id_byte || this.id_class.id_int(this.id_class.I_()) > 9.0);
   }

   @Override
   public void id_throws() {
      iB_2 var1 = this.id_class.I_();
      this.id_class.id_public().id_final();
      this.id_class.id_continue().id_class(var1, 90.0F, 90.0F);
      if (!this.id_class.id_while(var1)) {
         this.id_class.id_byte((iB_2)null);
      } else {
         this.id_break++;
         if (this.id_break == 0) {
            this.id_class.id_class(this.id_class.I_().V());
            if (!this.id_class.BF()) {
               ((rYB)this.id_class.id_throws[7]).id_class(this.id_class, (byte)21);
            }
         } else if (this.id_break >= this.id_class.L()) {
            float var2 = 1.0F;
            if (((rYB)this.id_class.id_throws[7]).id_abstract() == rRO.HARD) {
               var2 += 2.0F;
            }

            if (this.id_byte) {
               var2 += 2.0F;
            }

            var1.id_break(rye_3.id_byte(this.id_class, this.id_class), var2);
            var1.id_break(rye_3.id_byte(this.id_class), (float)this.id_class.id_class(iQ_2.id_case));
            this.id_class.id_byte((iB_2)null);
         }

         super.id_throws();
      }
   }

   @Override
   public void id_protected() {
      this.id_class.id_class(0);
      this.id_class.id_byte((iB_2)null);
      this.id_class.id_break.id_private();
   }
}
