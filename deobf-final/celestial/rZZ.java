package celestial;

import java.io.IOException;

public class rZZ implements ruS_2<rmH_2> {
   private rRO class_;

   public rZZ() {
   }

   public rZZ(rRO var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = rRO.class_(var1.readUnsignedByte());
   }

   public void class_(rmH_2 var1) {
      var1.class_(this);
   }

   public rRO break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeByte(this.class_.class_());
   }
}
