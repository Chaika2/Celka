package celestial;

public class rKs_1<T extends Throwable> {
   private T id_class;

   public void id_class(T var1) {
      if (this.id_class == null) {
         this.id_class = (T)var1;
      } else {
         this.id_class.addSuppressed(var1);
      }
   }

   public void id_class() throws T {
      if (this.id_class != null) {
         throw this.id_class;
      }
   }
}
