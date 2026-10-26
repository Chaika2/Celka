package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ik_3 {
   private static final Logger id_class = LogManager.getLogger();
   private final Map<iJ_2, ic_3> id_break = Maps.newHashMap();
   private final Set<ic_3> id_byte = Sets.newHashSet();
   private final iW_2 id_protected;

   public double id_byte(iJ_2 var1) {
      ic_3 var2 = this.id_break.get(var1);
      return var2 != null ? var2.id_case() : this.id_protected.id_class(var1);
   }

   public rcy_3 id_byte() {
      rcy_3 var1 = new rcy_3();

      for (ic_3 var3 : this.id_break.values()) {
         var1.add(var3.id_catch());
      }

      return var1;
   }

   public ik_3(iW_2 var1) {
      this.id_protected = var1;
   }

   public void id_class(ik_3 var1) {
      var1.id_break.values().forEach(var1x -> {
         ic_3 var2 = this.id_class(var1x.id_class());
         if (var2 != null) {
            var2.id_class(var1x);
         }
      });
   }

   public Set<ic_3> id_class() {
      return this.id_byte;
   }

   public void id_class(rcy_3 var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         rcd_3 var3 = var1.id_class(var2);
         String var4 = var3.id_native("Name");
         rqR_2.id_class(rVL.O.id_break(rqO_2.id_break(var4)), var2x -> {
            ic_3 var3x = this.id_class(var2x);
            if (var3x != null) {
               var3x.id_class(var3);
            }
         }, () -> id_class.warn("Ignoring unknown attribute '{}'", var4));
      }
   }

   public boolean id_class(iJ_2 var1, UUID var2) {
      ic_3 var3 = this.id_break.get(var1);
      return var3 != null ? var3.id_class(var2) != null : this.id_protected.id_break(var1, var2);
   }

   public ic_3 id_class(iJ_2 var1) {
      return this.id_break.computeIfAbsent(var1, var1x -> this.id_protected.id_class(this::id_class, var1x));
   }

   public void id_class(Multimap<iJ_2, ix_3> var1) {
      var1.asMap().forEach((var1x, var2) -> {
         ic_3 var3 = this.id_break.get(var1x);
         if (var3 != null) {
            var2.forEach(var3::id_protected);
         }
      });
   }

   private void id_class(ic_3 var1) {
      if (var1.id_class().id_break()) {
         this.id_byte.add(var1);
      }
   }

   public void id_break(Multimap<iJ_2, ix_3> var1) {
      var1.forEach((var1x, var2) -> {
         ic_3 var3 = this.id_class(var1x);
         if (var3 != null) {
            var3.id_protected(var2);
            var3.id_break(var2);
         }
      });
   }

   public boolean id_break(iJ_2 var1) {
      return this.id_break.get(var1) != null || this.id_protected.id_byte(var1);
   }

   public Collection<ic_3> id_break() {
      return this.id_break.values().stream().filter(var0 -> var0.id_class().id_break()).collect(Collectors.toList());
   }

   public double id_break(iJ_2 var1, UUID var2) {
      ic_3 var3 = this.id_break.get(var1);
      return var3 != null ? var3.id_class(var2).id_protected() : this.id_protected.id_class(var1, var2);
   }

   public double id_protected(iJ_2 var1) {
      ic_3 var2 = this.id_break.get(var1);
      return var2 != null ? var2.id_break() : this.id_protected.id_break(var1);
   }
}
