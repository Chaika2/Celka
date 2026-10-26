package celestial;

public abstract class Lj_1<E extends Lj_1<E>> extends Lt_1<E> implements cH_2 {
   private cC_2 id_class;
   private boolean id_break;

   @Override
   public void id_class(cC_2 var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(boolean var1) {
      this.id_break = var1;
   }

   @Override
   public cC_2 id_catch() {
      return this.id_class;
   }

   @Override
   public boolean id_case() {
      return this.id_break;
   }
}
