package celestial;

import java.util.stream.Stream;

public class fv_3 extends fq_3 {
   private static final rqO_2 id_class = new rqO_2("back");

   public fj_3 id_byte() {
      return this.id_class(id_class);
   }

   public fv_3(fY_2 var1) {
      super(var1, new rqO_2("textures/atlas/paintings.png"), "painting");
   }

   public fj_3 id_class(rsh_3 var1) {
      return this.id_class(rVL.P.id_break(var1));
   }

   @Override
   protected Stream<rqO_2> id_break() {
      return Stream.concat(rVL.P.id_protected().stream(), Stream.of(id_class));
   }
}
