package celestial;

import java.io.IOException;

public class rFS implements ruS_2<At_1> {
   private rqO_2 class_;

   public rFS() {
   }

   public rFS(rqO_2 var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      if (var1.readBoolean()) {
         this.class_ = var1.volatile_();
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   public rqO_2 break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeBoolean(this.class_ != null);
      if (this.class_ != null) {
         var1.class_(this.class_);
      }
   }
}
