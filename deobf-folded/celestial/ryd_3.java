package celestial;

public final class ryd_3<S> implements ryJ_2<S> {
   private final S id_class;

   public ryd_3(S var1) {
      this.id_class = (S)var1;
   }

   @Override
   public <T> T apply(ryX_2<? super S, T> var1) {
      return (T)var1.id_class(this.id_class);
   }
}
