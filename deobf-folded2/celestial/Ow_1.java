package celestial;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ow_1 {
   private static final Logger id_class = LogManager.getLogger();
   private final Map<rqO_2, OT> id_break = Maps.newHashMap();
   private final Set<OT> id_byte = Sets.newLinkedHashSet();
   private final Set<OT> id_protected = Sets.newLinkedHashSet();
   private OI id_throws;

   public Collection<OT> id_byte() {
      return this.id_break.values();
   }

   public void id_class(OI var1) {
      this.id_throws = var1;
      if (var1 != null) {
         for (OT var3 : this.id_byte) {
            var1.id_class(var3);
         }

         for (OT var5 : this.id_protected) {
            var1.id_byte(var5);
         }
      }
   }

   public OT id_class(rqO_2 var1) {
      return this.id_break.get(var1);
   }

   private void id_class(OT var1) {
      for (OT var3 : var1.id_throws()) {
         this.id_class(var3);
      }

      id_class.info("Forgot about advancement {}", var1.id_private());
      this.id_break.remove(var1.id_private());
      if (var1.id_break() == null) {
         this.id_byte.remove(var1);
         if (this.id_throws != null) {
            this.id_throws.id_break(var1);
         }
      } else {
         this.id_protected.remove(var1);
         if (this.id_throws != null) {
            this.id_throws.id_protected(var1);
         }
      }
   }

   public void id_class(Map<rqO_2, Ot_1> var1) {
      Function var2 = Functions.forMap(this.id_break, (OT)null);

      while (!var1.isEmpty()) {
         boolean var3 = false;
         Iterator var4 = var1.entrySet().iterator();

         while (var4.hasNext()) {
            Entry var5 = (Entry)var4.next();
            rqO_2 var6 = (rqO_2)var5.getKey();
            Ot_1 var7 = (Ot_1)var5.getValue();
            if (var7.id_class(var2)) {
               OT var8 = var7.id_break(var6);
               this.id_break.put(var6, var8);
               var3 = true;
               var4.remove();
               if (var8.id_break() == null) {
                  this.id_byte.add(var8);
                  if (this.id_throws != null) {
                     this.id_throws.id_class(var8);
                  }
               } else {
                  this.id_protected.add(var8);
                  if (this.id_throws != null) {
                     this.id_throws.id_byte(var8);
                  }
               }
            }
         }

         if (!var3) {
            for (Entry var10 : var1.entrySet()) {
               id_class.error("Couldn't load advancement {}: {}", var10.getKey(), var10.getValue());
            }
            break;
         }
      }

      id_class.info("Loaded {} advancements", this.id_break.size());
   }

   public void id_class() {
      this.id_break.clear();
      this.id_byte.clear();
      this.id_protected.clear();
      if (this.id_throws != null) {
         this.id_throws.id_class();
      }
   }

   public void id_class(Set<rqO_2> var1) {
      for (rqO_2 var3 : var1) {
         OT var4 = this.id_break.get(var3);
         if (var4 == null) {
            id_class.warn("Told to remove advancement {} but I don't know what that is", var3);
         } else {
            this.id_class(var4);
         }
      }
   }

   public Iterable<OT> id_break() {
      return this.id_byte;
   }
}
