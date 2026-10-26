package celestial;

import java.io.IOException;

public class rvl_3 implements ruS_2<At_1> {
   private rpm_3 id_class;

   public rvl_3() {
   }

   public rvl_3(rpm_3 var1) {
      this.id_class = var1;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_class(rpm_3.class);
   }

   public rpm_3 id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
   }
}
