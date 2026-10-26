package celestial;

import java.io.IOException;

public class rZP implements ruS_2<rmH_2> {
   private boolean id_class;

   public rZP() {
   }

   public rZP(boolean var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readBoolean();
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   public boolean id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeBoolean(this.id_class);
   }
}
