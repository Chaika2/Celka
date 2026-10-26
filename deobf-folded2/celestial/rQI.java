package celestial;

public class rQI implements rQz_1 {
   final Long id_class;
   final rzV_2 id_break;

   rQI(Long var1, rzV_2 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public boolean id_class(rzr_3 var1) {
      rrEm_1 var2 = var1.id_byte();
      long var3 = var2.P();
      if (this.id_class != null) {
         var3 %= this.id_class;
      }

      return this.id_break.id_class((int)var3);
   }

   @Override
   public rWi_1 id_break() {
      return rQF.id_int;
   }
}
