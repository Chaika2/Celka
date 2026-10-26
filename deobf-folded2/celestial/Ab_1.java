package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ab_1 {
   private static final Logger id_class = LogManager.getLogger();
   private final QY id_break;
   private final Ow_1 id_byte = new Ow_1();
   private final Map<OT, Oj_1> id_protected = Maps.newHashMap();
   private AM id_throws;
   private OT id_case;

   public Ab_1(QY var1) {
      this.id_break = var1;
   }

   public void id_class(OT var1, boolean var2) {
      Aq_1 var3 = this.id_break.id_void();
      if (var3 != null && var1 != null && var2) {
         var3.id_class(rZc_1.id_class(var1));
      }

      if (this.id_case != var1) {
         this.id_case = var1;
         if (this.id_throws != null) {
            this.id_throws.id_throws(var1);
         }
      }
   }

   public void id_class(AM var1) {
      this.id_throws = var1;
      this.id_byte.id_class(var1);
      if (var1 != null) {
         for (Entry var3 : this.id_protected.entrySet()) {
            var1.id_class((OT)var3.getKey(), (Oj_1)var3.getValue());
         }

         var1.id_throws(this.id_case);
      }
   }

   public void id_class(rZI var1) {
      if (var1.id_throws()) {
         this.id_byte.id_class();
         this.id_protected.clear();
      }

      this.id_byte.id_class(var1.id_byte());
      this.id_byte.id_class(var1.id_break());

      for (Entry var3 : var1.id_protected().entrySet()) {
         OT var4 = this.id_byte.id_class((rqO_2)var3.getKey());
         if (var4 != null) {
            Oj_1 var5 = (Oj_1)var3.getValue();
            var5.id_class(var4.id_case(), var4.id_implements());
            this.id_protected.put(var4, var5);
            if (this.id_throws != null) {
               this.id_throws.id_class(var4, var5);
            }
         } else {
            id_class.warn("Server informed client about progress for unknown advancement {}", var3.getKey());
         }
      }
   }

   public Ow_1 id_class() {
      return this.id_byte;
   }
}
