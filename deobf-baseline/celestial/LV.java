package celestial;

public abstract class LV<E extends Lt_1<E>> extends LT<E> {
   private boolean id_class;

   public LV(QY var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean id_break(boolean var1) {
      if (!this.id_class && this.id_volatile() == 0) {
         return false;
      } else {
         this.id_class = !this.id_class;
         if (this.id_class && this.id_finally() == null && this.id_volatile() > 0) {
            this.id_class(Lw_1.DOWN);
         } else if (this.id_class && this.id_finally() != null) {
            this.id_new();
         }

         return this.id_class;
      }
   }
}
