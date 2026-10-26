package celestial;

import java.util.List;
import java.util.function.Function;

class rlL_2<T> implements rlO_2<T> {
   private rlb_3<T> break_;
   protected final rqO_2 class_;

   private rlb_3<T> byte_() {
      if (this.break_ == null) {
         throw new IllegalStateException("Tag " + this.class_ + " used before it was bound");
      } else {
         return this.break_;
      }
   }

   rlL_2(rqO_2 var1) {
      this.class_ = var1;
   }

   @Override
   public List<T> class_() {
      return this.byte_().class_();
   }

   @Override
   public boolean class_(T var1) {
      return this.byte_().class_((T)var1);
   }

   void class_(Function<rqO_2, rlb_3<T>> var1) {
      this.break_ = (rlb_3<T>)var1.apply(this.class_);
   }

   @Override
   public rqO_2 break_() {
      return this.class_;
   }
}
