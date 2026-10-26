package celestial;

import com.google.common.collect.Sets;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rBz_1 {
   private static final Logger class_ = LogManager.getLogger();
   private static final rBK break_ = new rBN(Integer.MAX_VALUE, new rBQ());
   private final Map<rBW, rBK> byte_ = new EnumMap<>(rBW.class);
   private final Set<rBK> protected_ = Sets.newLinkedHashSet();
   private final EnumSet<rBW> throws_ = EnumSet.noneOf(rBW.class);

   public void class_(int var1, rBk_1 var2) {
      this.protected_.add(new rBK(var1, var2));
   }

   public void class_(rBW var1) {
      this.throws_.add(var1);
   }

   public void class_(rBW var1, boolean var2) {
      if (var2) {
         this.break_(var1);
      } else {
         this.class_(var1);
      }
   }

   public void class_(rBk_1 var1) {
      this.protected_.stream().filter(var1x -> var1x.finally_() == var1).filter(rBK::catch_).forEach(rBK::protected_);
      this.protected_.removeIf(var1x -> var1x.finally_() == var1);
   }

   private static boolean class_(rBK var0, EnumSet<rBW> var1, Map<rBW, rBK> var2) {
      if (var1.isEmpty()) {
         return true;
      } else {
         for (rBW var4 : var1) {
            rBK var5 = var2.getOrDefault(var4, break_);
            if (!var5.class_(var0)) {
               return false;
            }
         }

         return true;
      }
   }

   public void class_() {
      if (this.protected_.size() > 0) {
         for (rBK var2 : this.protected_) {
            if (var2.catch_() && (!var2.catch_() || rrWO.break_(var2.implements_(), this.throws_) || !var2.break_())) {
               var2.protected_();
            }
         }
      }

      if (this.byte_.size() > 0) {
         this.byte_.forEach((var1, var2x) -> {
            if (!var2x.catch_()) {
               this.byte_.remove(var1);
            }
         });
      }

      if (this.protected_.size() > 0) {
         for (rBK var5 : this.protected_) {
            if (!var5.catch_() && rrWO.class_(var5.implements_(), this.throws_) && class_(var5, var5.implements_(), this.byte_) && var5.class_()) {
               break_(var5, var5.implements_(), this.byte_);
               var5.byte_();
            }
         }
      }

      if (this.protected_.size() > 0) {
         for (rBK var6 : this.protected_) {
            if (var6.catch_()) {
               var6.throws_();
            }
         }
      }
   }

   public void break_(rBW var1) {
      this.throws_.remove(var1);
   }

   public Stream<rBK> break_() {
      return this.protected_.stream().filter(rBK::catch_);
   }

   private static void break_(rBK var0, EnumSet<rBW> var1, Map<rBW, rBK> var2) {
      if (!var1.isEmpty()) {
         for (rBW var4 : var1) {
            rBK var5 = var2.getOrDefault(var4, break_);
            var5.protected_();
            var2.put(var4, var0);
         }
      }
   }
}
