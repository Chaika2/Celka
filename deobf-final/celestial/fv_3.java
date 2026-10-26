package celestial;

import java.util.stream.Stream;

public class fv_3 extends fq_3 {
   private static final rqO_2 class_ = new rqO_2("back");

   public fj_3 byte_() {
      return this.class_(class_);
   }

   public fv_3(fY_2 var1) {
      super(var1, new rqO_2("textures/atlas/paintings.png"), "painting");
   }

   public fj_3 class_(rsh_3 var1) {
      return this.class_(rVL.P.break_(var1));
   }

   @Override
   protected Stream<rqO_2> break_() {
      return Stream.concat(rVL.P.protected_().stream(), Stream.of(class_));
   }
}
