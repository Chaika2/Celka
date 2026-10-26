package celestial;

import com.google.common.collect.ForwardingList;
import java.util.List;

public class VQ extends ForwardingList<rdn_3> {
   private final rqs_3<rdn_3> class_ = rqs_3.class_(rhz_3.protected_(), rdn_3.break_);

   public boolean isEmpty() {
      for (rdn_3 var2 : this.delegate()) {
         if (!var2.class_()) {
            return false;
         }
      }

      return true;
   }

   public void class_(rcy_3 var1) {
      List var2 = this.delegate();

      for (int var3 = 0; var3 < var2.size(); var3++) {
         var2.set(var3, rdn_3.class_(var1.class_(var3)));
      }
   }

   public rcy_3 class_() {
      rcy_3 var1 = new rcy_3();

      for (rdn_3 var3 : this.delegate()) {
         var1.add(var3.break_(new rcd_3()));
      }

      return var1;
   }

   protected List<rdn_3> delegate() {
      return this.class_;
   }
}
