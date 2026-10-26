package celestial;

public class rrMk_1 {
   private final rqO_2 id_class;
   private gm_3 id_break;
   private rYG id_byte;
   private static QY id_protected = QY.id_instanceof();

   private void id_byte() {
      this.id_byte = null;
      rVL var1 = rrWr_1.id_break(this.id_break);
      if (var1.id_byte(this.id_class)) {
         this.id_byte = (rYG)var1.id_class(this.id_class);
      }
   }

   private rrMk_1(rqO_2 var1) {
      this.id_class = var1;
      this.id_break = (gm_3)id_protected.id_class[56];
      this.id_byte();
   }

   @Override
   public String toString() {
      return this.id_class + "";
   }

   public static rrMk_1 id_class(rqO_2 var0) {
      rrMk_1 var1 = new rrMk_1(var0);
      return var1.id_byte == null ? null : var1;
   }

   public rYG id_class() {
      if (this.id_break != (gm_3)id_protected.id_class[56]) {
         this.id_break = (gm_3)id_protected.id_class[56];
         this.id_byte();
      }

      return this.id_byte;
   }

   public rqO_2 id_break() {
      return this.id_class;
   }
}
