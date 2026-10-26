package celestial;

import java.io.IOException;

public class rZc_1 implements ruS_2<rmH_2> {
   private rZu_1 id_class;
   private rqO_2 id_break;

   public rZu_1 id_byte() {
      return this.id_class;
   }

   public rZc_1() {
   }

   public rZc_1(rZu_1 var1, rqO_2 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   public static rZc_1 id_class(OT var0) {
      return new rZc_1(rZu_1.OPENED_TAB, var0.id_private());
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_class(rZu_1.class);
      if (this.id_class == rZu_1.OPENED_TAB) {
         this.id_break = var1.id_volatile();
      }
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
      if (this.id_class == rZu_1.OPENED_TAB) {
         var1.id_class(this.id_break);
      }
   }

   public static rZc_1 id_break() {
      return new rZc_1(rZu_1.CLOSED_SCREEN, (rqO_2)null);
   }

   public rqO_2 id_protected() {
      return this.id_break;
   }
}
