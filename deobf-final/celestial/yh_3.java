package celestial;

public final class yh_3 implements AutoCloseable {
   private final QY class_;
   private final HN break_;

   public yh_3(QY var1) {
      this.class_ = var1;
      this.break_ = new HN(Qa_1::new);
   }

   public Qg_1 class_(ys_3 var1, String var2, String var3) {
      return new Qg_1(this.class_, this.break_, var1, var2, var3);
   }

   @Override
   public void close() {
      this.break_.class_();
   }
}
