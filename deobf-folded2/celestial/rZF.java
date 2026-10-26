package celestial;

import java.io.IOException;

public class rZF implements ruS_2<rmH_2> {
   private boolean id_class;
   private boolean id_break;

   public boolean id_byte() {
      return this.id_break;
   }

   public rZF() {
   }

   public rZF(boolean var1, boolean var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(rmH_2 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readBoolean();
      this.id_break = var1.readBoolean();
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeBoolean(this.id_class);
      var1.writeBoolean(this.id_break);
   }

   public boolean id_break() {
      return this.id_class;
   }
}
