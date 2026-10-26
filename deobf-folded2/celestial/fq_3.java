package celestial;

import java.util.stream.Stream;

public abstract class fq_3 extends jY_2<fx_3> implements AutoCloseable {
   private final fJ_2 id_class;
   private final String id_break;

   public fq_3(fY_2 var1, rqO_2 var2, String var3) {
      this.id_break = var3;
      this.id_class = new fJ_2(var2);
      var1.id_class(this.id_class.id_protected(), this.id_class);
   }

   protected fx_3 id_class(rAL var1) {
      return this.id_class.id_class(var1, this.id_break().map(this::id_break), 0);
   }

   protected void id_class(fx_3 var1, rAL var2) {
      this.id_class.id_class(var1);
   }

   protected fj_3 id_class(rqO_2 var1) {
      return this.id_class.id_break(this.id_break(var1));
   }

   @Override
   public void close() {
      this.id_class.id_byte();
   }

   protected abstract Stream<rqO_2> id_break();

   private rqO_2 id_break(rqO_2 var1) {
      return new rqO_2(var1.id_byte(), this.id_break + "/" + var1.id_break());
   }
}
