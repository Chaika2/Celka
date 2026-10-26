package celestial;

import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class hz_3 extends hG_2<hQ_2> {
   static final rqO_2 class_ = new rqO_2("channeled_lightning");

   @Override
   public rqO_2 class_() {
      return class_;
   }

   public void class_(rhN_2 var1, Collection<? extends an_3> var2) {
      List var3 = var2.stream().map(var1x -> hY_2.break_(var1, var1x)).collect(Collectors.toList());
      this.class_(var1, var1x -> var1x.class_(var3));
   }

   public hQ_2 break_(JsonObject var1, ho_3 var2, rWl_1 var3) {
      ho_3[] var4 = ho_3.break_(var1, "victims", var3);
      return new hQ_2(var2, var4);
   }
}
