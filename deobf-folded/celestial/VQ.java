package celestial;

import com.google.common.collect.ForwardingList;
import java.util.List;

public class VQ extends ForwardingList<rdn_3> {
   private final rqs_3<rdn_3> id_class = rqs_3.id_class(rhz_3.id_protected(), rdn_3.id_break);

   public boolean isEmpty() {
      for (rdn_3 var2 : this.delegate()) {
         if (!var2.id_class()) {
            return false;
         }
      }

      return true;
   }

   public void id_class(rcy_3 var1) {
      List var2 = this.delegate();

      for (int var3 = 0; var3 < var2.size(); var3++) {
         var2.set(var3, rdn_3.id_class(var1.id_class(var3)));
      }
   }

   public rcy_3 id_class() {
      rcy_3 var1 = new rcy_3();

      for (rdn_3 var3 : this.delegate()) {
         var1.add(var3.id_break(new rcd_3()));
      }

      return var1;
   }

   protected List<rdn_3> delegate() {
      return this.id_class;
   }
}
