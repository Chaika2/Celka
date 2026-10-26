package celestial;

import java.util.Optional;

public class gw_3 {
   public static final gw_3 id_class = new gw_3((rqO_2)null);
   private final rqO_2 id_break;
   private boolean id_byte;
   private Optional<gt_3> id_protected = Optional.empty();

   public gw_3(rqO_2 var1) {
      this.id_break = var1;
   }

   public gw_3(gt_3 var1) {
      this.id_byte = true;
      this.id_break = null;
      this.id_protected = Optional.of(var1);
   }

   public Optional<gt_3> id_class(Oa_1 var1) {
      if (!this.id_byte) {
         if (this.id_break != null) {
            this.id_protected = var1.id_class(this.id_break);
         }

         this.id_byte = true;
      }

      return this.id_protected;
   }

   public rqO_2 id_class() {
      return this.id_protected.<rqO_2>map(var0 -> var0.id_break).orElse(this.id_break);
   }
}
