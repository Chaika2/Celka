package celestial;

import java.util.Locale;
import java.util.Random;

class rsf_3 implements rsR_2 {
   private final int id_class;
   private final rrrZ<?> id_break;
   private final rrGh_1 id_byte;
   private final int id_protected;
   private final int id_throws;

   public rsf_3(int var1, rrrZ<?> var2, rrGh_1 var3, int var4, int var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
   }

   @Override
   public rdI_2 id_class(an_3 var1, Random var2) {
      if (!((rYB)var1.id_throws[7] instanceof rrEm_1 var3)) {
         return null;
      } else {
         rfH_2 var4 = var3.id_class(this.id_break, var1.Bs(), 100, true);
         if (var4 != null) {
            rdn_3 var5 = rxI_2.id_class(var3, var4.b_(), var4.d_(), (byte)2, true, true);
            rxI_2.id_class(var3, var5);
            rrGb_1.id_class(var5, var4, "+", this.id_byte);
            var5.id_class(new rgn_3("filled_map." + this.id_break.id_catch().toLowerCase(Locale.ROOT)));
            return new rdI_2(new rdn_3(rdy_3.dP, this.id_class), new rdn_3(rdy_3.Xx), var5, this.id_protected, this.id_throws, 0.2F);
         } else {
            return null;
         }
      }
   }
}
