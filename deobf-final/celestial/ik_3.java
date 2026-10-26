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
   private static final Logger class_ = LogManager.getLogger();
   private final Map<iJ_2, ic_3> break_ = Maps.newHashMap();
   private final Set<ic_3> byte_ = Sets.newHashSet();
   private final iW_2 protected_;

   public double byte_(iJ_2 var1) {
      ic_3 var2 = this.break_.get(var1);
      return var2 != null ? var2.case_() : this.protected_.class_(var1);
   }

   public rcy_3 byte_() {
      rcy_3 var1 = new rcy_3();

      for (ic_3 var3 : this.break_.values()) {
         var1.add(var3.catch_());
      }

      return var1;
   }

   public ik_3(iW_2 var1) {
      this.protected_ = var1;
   }

   public void class_(ik_3 var1) {
      var1.break_.values().forEach(var1x -> {
         ic_3 var2 = this.class_(var1x.class_());
         if (var2 != null) {
            var2.class_(var1x);
         }
      });
   }

   public Set<ic_3> class_() {
      return this.byte_;
   }

   public void class_(rcy_3 var1) {
      for (int var2 = 0; var2 < var1.size(); var2++) {
         rcd_3 var3 = var1.class_(var2);
         String var4 = var3.native_("Name");
         rqR_2.class_(rVL.O.break_(rqO_2.break_(var4)), var2x -> {
            ic_3 var3x = this.class_(var2x);
            if (var3x != null) {
               var3x.class_(var3);
            }
         }, () -> class_.warn("Ignoring unknown attribute '{}'", var4));
      }
   }

   public boolean class_(iJ_2 var1, UUID var2) {
      ic_3 var3 = this.break_.get(var1);
      return var3 != null ? var3.class_(var2) != null : this.protected_.break_(var1, var2);
   }

   public ic_3 class_(iJ_2 var1) {
      return this.break_.computeIfAbsent(var1, var1x -> this.protected_.class_(this::class_, var1x));
   }

   public void class_(Multimap<iJ_2, ix_3> var1) {
      var1.asMap().forEach((var1x, var2) -> {
         ic_3 var3 = this.break_.get(var1x);
         if (var3 != null) {
            var2.forEach(var3::protected_);
         }
      });
   }

   private void class_(ic_3 var1) {
      if (var1.class_().break_()) {
         this.byte_.add(var1);
      }
   }

   public void break_(Multimap<iJ_2, ix_3> var1) {
      var1.forEach((var1x, var2) -> {
         ic_3 var3 = this.class_(var1x);
         if (var3 != null) {
            var3.protected_(var2);
            var3.break_(var2);
         }
      });
   }

   public boolean break_(iJ_2 var1) {
      return this.break_.get(var1) != null || this.protected_.byte_(var1);
   }

   public Collection<ic_3> break_() {
      return this.break_.values().stream().filter(var0 -> var0.class_().break_()).collect(Collectors.toList());
   }

   public double break_(iJ_2 var1, UUID var2) {
      ic_3 var3 = this.break_.get(var1);
      return var3 != null ? var3.class_(var2).protected_() : this.protected_.class_(var1, var2);
   }

   public double protected_(iJ_2 var1) {
      ic_3 var2 = this.break_.get(var1);
      return var2 != null ? var2.break_() : this.protected_.break_(var1);
   }
}
