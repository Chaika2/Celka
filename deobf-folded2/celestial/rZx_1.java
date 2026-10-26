package celestial;

import java.io.IOException;

public class rZx_1 implements ruS_2<rmH_2> {
   private rff_3 id_class;
   private rpm_3 id_break;

   public rff_3 id_byte() {
      return this.id_class;
   }

   public rZx_1() {
   }

   public rZx_1(rpm_3 var1, rff_3 var2) {
      this.id_break = var1;
      this.id_class = var2;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_break = var1.id_class(rpm_3.class);
      this.id_class = var1.id_package();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_break);
      var1.id_class(this.id_class);
   }

   public rpm_3 id_break() {
      return this.id_break;
   }
}
