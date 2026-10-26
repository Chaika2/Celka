package celestial;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Map;

public class XR {
   private XF id_class = XF.id_throws;
   private rRl_1 id_break = rRl_1.NOT_SET;
   private final Map<rCi_1<?>, XF> id_byte = Maps.newHashMap();
   private final Object2BooleanMap<rqO_2> id_protected = new Object2BooleanOpenHashMap();
   private final Map<rqO_2, XY> id_throws = Maps.newHashMap();

   public Xj_1 id_class() {
      return new Xj_1(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws);
   }
}
