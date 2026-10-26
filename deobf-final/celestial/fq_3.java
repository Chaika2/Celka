package celestial;

import java.util.stream.Stream;

public abstract class fq_3 extends jY_2<fx_3> implements AutoCloseable {
   private final fJ_2 class_;
   private final String break_;

   public fq_3(fY_2 var1, rqO_2 var2, String var3) {
      this.break_ = var3;
      this.class_ = new fJ_2(var2);
      var1.class_(this.class_.protected_(), this.class_);
   }

   protected fx_3 class_(rAL var1) {
      return this.class_.class_(var1, this.break_().map(this::break_), 0);
   }

   protected void class_(fx_3 var1, rAL var2) {
      this.class_.class_(var1);
   }

   protected fj_3 class_(rqO_2 var1) {
      return this.class_.break_(this.break_(var1));
   }

   @Override
   public void close() {
      this.class_.byte_();
   }

   protected abstract Stream<rqO_2> break_();

   private rqO_2 break_(rqO_2 var1) {
      return new rqO_2(var1.byte_(), this.break_ + "/" + var1.break_());
   }
}
