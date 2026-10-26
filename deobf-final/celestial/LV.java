package celestial;

public abstract class LV<E extends Lt_1<E>> extends LT<E> {
   private boolean class_;

   public LV(QY var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean break_(boolean var1) {
      if (!this.class_ && this.volatile_() == 0) {
         return false;
      } else {
         this.class_ = !this.class_;
         if (this.class_ && this.finally_() == null && this.volatile_() > 0) {
            this.class_(Lw_1.DOWN);
         } else if (this.class_ && this.finally_() != null) {
            this.new_();
         }

         return this.class_;
      }
   }
}
