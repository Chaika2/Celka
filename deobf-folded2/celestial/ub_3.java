package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ub_3 implements AutoCloseable {
   static final Logger id_break = LogManager.getLogger();
   public static final rqO_2 id_class = new rqO_2("minecraft", "missing");
   private final uG_2 id_byte;
   final Map<rqO_2, uG_2> id_protected = Maps.newHashMap();
   final fY_2 id_throws;
   private Map<rqO_2, rqO_2> id_case = ImmutableMap.of();
   private final rAc_1 id_catch = new uM_2(this);

   public ub_3(fY_2 var1) {
      this.id_throws = var1;
      this.id_byte = rqR_2.id_class(new uG_2(var1, id_class), var0 -> var0.id_class(Lists.newArrayList(new uc_3[]{new uQ_2()})));
   }

   public void id_class(Map<rqO_2, rqO_2> var1) {
      this.id_case = var1;
   }

   public cm_3 id_class() {
      return new cm_3(var1 -> this.id_protected.getOrDefault(this.id_case.getOrDefault(var1, var1), this.id_byte));
   }

   @Override
   public void close() {
      this.id_protected.values().forEach(uG_2::close);
      this.id_byte.close();
   }

   public rAc_1 id_break() {
      return this.id_catch;
   }
}
