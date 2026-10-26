package celestial;

public abstract class Lj_1<E extends Lj_1<E>> extends Lt_1<E> implements cH_2 {
   private cC_2 class_;
   private boolean break_;

   @Override
   public void class_(cC_2 var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(boolean var1) {
      this.break_ = var1;
   }

   @Override
   public cC_2 catch_() {
      return this.class_;
   }

   @Override
   public boolean case_() {
      return this.break_;
   }
}
