package celestial;

import java.io.IOException;

public class rFS implements ruS_2<At_1> {
   private rqO_2 id_class;

   public rFS() {
   }

   public rFS(rqO_2 var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      if (var1.readBoolean()) {
         this.id_class = var1.id_volatile();
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   public rqO_2 id_break() {
      return this.id_class;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeBoolean(this.id_class != null);
      if (this.id_class != null) {
         var1.id_class(this.id_class);
      }
   }
}
