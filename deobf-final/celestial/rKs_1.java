package celestial;

public class rKs_1<T extends Throwable> {
   private T class_;

   public void class_(T var1) {
      if (this.class_ == null) {
         this.class_ = (T)var1;
      } else {
         this.class_.addSuppressed(var1);
      }
   }

   public void class_() throws T {
      if (this.class_ != null) {
         throw this.class_;
      }
   }
}
