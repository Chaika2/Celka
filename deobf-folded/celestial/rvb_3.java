package celestial;

import java.io.IOException;

public class rvb_3 implements ruS_2<At_1> {
   private rgP_2 id_class;

   public rvb_3() {
   }

   public rvb_3(rgP_2 var1) {
      this.id_class = var1;
   }

   public void id_class(rgP_2 var1) {
      this.id_class = var1;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_throws();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_class(this.id_class);
   }

   public rgP_2 id_break() {
      return this.id_class;
   }
}
