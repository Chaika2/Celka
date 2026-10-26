package celestial;

public final class ryx_3<S> implements ryJ_2<S> {
   private final S id_class;
   private final S id_break;

   public ryx_3(S var1, S var2) {
      this.id_class = (S)var1;
      this.id_break = (S)var2;
   }

   @Override
   public <T> T apply(ryX_2<? super S, T> var1) {
      return (T)var1.id_class(this.id_class, this.id_break);
   }
}
