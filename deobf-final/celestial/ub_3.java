package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ub_3 implements AutoCloseable {
   static final Logger break_ = LogManager.getLogger();
   public static final rqO_2 class_ = new rqO_2("minecraft", "missing");
   private final uG_2 byte_;
   final Map<rqO_2, uG_2> protected_ = Maps.newHashMap();
   final fY_2 throws_;
   private Map<rqO_2, rqO_2> case_ = ImmutableMap.of();
   private final rAc_1 catch_ = new uM_2(this);

   public ub_3(fY_2 var1) {
      this.throws_ = var1;
      this.byte_ = rqR_2.class_(new uG_2(var1, class_), var0 -> var0.class_(Lists.newArrayList(new uc_3[]{new uQ_2()})));
   }

   public void class_(Map<rqO_2, rqO_2> var1) {
      this.case_ = var1;
   }

   public cm_3 class_() {
      return new cm_3(var1 -> this.protected_.getOrDefault(this.case_.getOrDefault(var1, var1), this.byte_));
   }

   @Override
   public void close() {
      this.protected_.values().forEach(uG_2::close);
      this.byte_.close();
   }

   public rAc_1 break_() {
      return this.catch_;
   }
}
