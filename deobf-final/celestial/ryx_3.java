package celestial;

public final class ryx_3<S> implements ryJ_2<S> {
   private final S class_;
   private final S break_;

   public ryx_3(S var1, S var2) {
      this.class_ = (S)var1;
      this.break_ = (S)var2;
   }

   @Override
   public <T> T apply(ryX_2<? super S, T> var1) {
      return (T)var1.class_(this.class_, this.break_);
   }
}
