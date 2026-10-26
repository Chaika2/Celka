package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class rLi_1 {
   private final String class_;
   private final ImmutableList<rLY> break_;

   public rLi_1(String var1, rLY... var2) {
      this.class_ = var1;
      this.break_ = ImmutableList.copyOf(var2);
   }

   public rLi_1(rLY... var1) {
      this((String)null, var1);
   }

   public List<rLY> class_() {
      return this.break_;
   }

   public static rLi_1 class_(String var0) {
      return rVL.double_.class_(rqO_2.break_(var0));
   }

   public boolean break_() {
      if (!this.break_.isEmpty()) {
         UnmodifiableIterator var1 = this.break_.iterator();

         while (var1.hasNext()) {
            rLY var2 = (rLY)var1.next();
            if (var2.class_().class_()) {
               return true;
            }
         }
      }

      return false;
   }

   public String break_(String var1) {
      return var1 + (this.class_ == null ? rVL.double_.break_(this).break_() : this.class_);
   }
}
