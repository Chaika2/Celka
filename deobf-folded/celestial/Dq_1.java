package celestial;

import java.nio.file.Path;

public class Dq_1 extends Ux_1<rXs_1> {
   public Dq_1(DA var1) {
      super(var1, rVL.id_default);
   }

   @Override
   public String id_class() {
      return "Fluid Tags";
   }

   @Override
   protected Path id_class(rqO_2 var1) {
      return this.id_break.id_break().resolve("data/" + var1.id_byte() + "/tags/fluids/" + var1.id_break() + ".json");
   }

   @Override
   protected void id_break() {
      this.id_class(rlG_2.id_break).id_class(rXG.id_byte, rXG.id_break);
      this.id_class(rlG_2.id_byte).id_class(rXG.id_throws, rXG.id_protected);
   }
}
