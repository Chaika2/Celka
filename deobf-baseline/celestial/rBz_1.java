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
   private static final Logger id_class = LogManager.getLogger();
   private static final rBK id_break = new rBN(Integer.MAX_VALUE, new rBQ());
   private final Map<rBW, rBK> id_byte = new EnumMap<>(rBW.class);
   private final Set<rBK> id_protected = Sets.newLinkedHashSet();
   private final EnumSet<rBW> id_throws = EnumSet.noneOf(rBW.class);

   public void id_class(int var1, rBk_1 var2) {
      this.id_protected.add(new rBK(var1, var2));
   }

   public void id_class(rBW var1) {
      this.id_throws.add(var1);
   }

   public void id_class(rBW var1, boolean var2) {
      if (var2) {
         this.id_break(var1);
      } else {
         this.id_class(var1);
      }
   }

   public void id_class(rBk_1 var1) {
      this.id_protected.stream().filter(var1x -> var1x.id_finally() == var1).filter(rBK::id_catch).forEach(rBK::id_protected);
      this.id_protected.removeIf(var1x -> var1x.id_finally() == var1);
   }

   private static boolean id_class(rBK var0, EnumSet<rBW> var1, Map<rBW, rBK> var2) {
      if (var1.isEmpty()) {
         return true;
      } else {
         for (rBW var4 : var1) {
            rBK var5 = var2.getOrDefault(var4, id_break);
            if (!var5.id_class(var0)) {
               return false;
            }
         }

         return true;
      }
   }

   public void id_class() {
      if (this.id_protected.size() > 0) {
         for (rBK var2 : this.id_protected) {
            if (var2.id_catch() && (!var2.id_catch() || rrWO.id_break(var2.id_implements(), this.id_throws) || !var2.id_break())) {
               var2.id_protected();
            }
         }
      }

      if (this.id_byte.size() > 0) {
         this.id_byte.forEach((var1, var2x) -> {
            if (!var2x.id_catch()) {
               this.id_byte.remove(var1);
            }
         });
      }

      if (this.id_protected.size() > 0) {
         for (rBK var5 : this.id_protected) {
            if (!var5.id_catch()
               && rrWO.id_class(var5.id_implements(), this.id_throws)
               && id_class(var5, var5.id_implements(), this.id_byte)
               && var5.id_class()) {
               id_break(var5, var5.id_implements(), this.id_byte);
               var5.id_byte();
            }
         }
      }

      if (this.id_protected.size() > 0) {
         for (rBK var6 : this.id_protected) {
            if (var6.id_catch()) {
               var6.id_throws();
            }
         }
      }
   }

   public void id_break(rBW var1) {
      this.id_throws.remove(var1);
   }

   public Stream<rBK> id_break() {
      return this.id_protected.stream().filter(rBK::id_catch);
   }

   private static void id_break(rBK var0, EnumSet<rBW> var1, Map<rBW, rBK> var2) {
      if (!var1.isEmpty()) {
         for (rBW var4 : var1) {
            rBK var5 = var2.getOrDefault(var4, id_break);
            var5.id_protected();
            var2.put(var4, var0);
         }
      }
   }
}
