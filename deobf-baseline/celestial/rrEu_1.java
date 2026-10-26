package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class rrEu_1<T> implements rRV<T> {
   protected final Predicate<T> id_class;
   private final Function<T, rqO_2> id_break;
   private final Set<rRD<T>> id_byte = Sets.newHashSet();
   private final TreeSet<rRD<T>> id_protected = Sets.newTreeSet(rRD.id_class());
   private final rrEm_1 id_throws;
   private final Queue<rRD<T>> id_case = Queues.newArrayDeque();
   private final List<rRD<T>> id_catch = Lists.newArrayList();
   private final Consumer<rRD<T>> id_private;

   public rrEu_1(rrEm_1 var1, Predicate<T> var2, Function<T, rqO_2> var3, Consumer<rRD<T>> var4) {
      this.id_class = var2;
      this.id_break = var3;
      this.id_throws = var1;
      this.id_private = var4;
   }

   private static <T> rcy_3 id_class(Function<T, rqO_2> var0, Iterable<rRD<T>> var1, long var2) {
      rcy_3 var4 = new rcy_3();

      for (rRD var6 : var1) {
         rcd_3 var7 = new rcd_3();
         var7.id_class("i", ((rqO_2)var0.apply(var6.id_break())).toString());
         var7.id_break("x", var6.id_class.b_());
         var7.id_break("y", var6.id_class.c_());
         var7.id_break("z", var6.id_class.d_());
         var7.id_break("t", (int)(var6.id_break - var2));
         var7.id_break("p", var6.id_byte.id_class());
         var4.add(var7);
      }

      return var4;
   }

   public rcy_3 id_class(rfj_3 var1) {
      List var2 = this.id_class(var1, false, true);
      return id_class(this.id_break, var2, this.id_throws.r());
   }

   public void id_class(rfi_3 var1, rfH_2 var2) {
      for (rRD var4 : this.id_class(var1, false, false)) {
         if (var1.id_break(var4.id_class)) {
            rfH_2 var5 = var4.id_class.id_break(var2);
            Object var6 = var4.id_break();
            this.id_class(new rRD<>(var5, (T)var6, var4.id_break, var4.id_byte));
         }
      }
   }

   @Override
   public boolean id_class(rfH_2 var1, T var2) {
      return this.id_byte.contains(new rRD<>(var1, var2));
   }

   @Override
   public void id_class(rfH_2 var1, T var2, int var3, rYr_1 var4) {
      if (!this.id_class.test((T)var2)) {
         this.id_class(new rRD<>(var1, (T)var2, (long)var3 + this.id_throws.r(), var4));
      }
   }

   private void id_class(rRD<T> var1) {
      if (!this.id_byte.contains(var1)) {
         this.id_byte.add(var1);
         this.id_protected.add(var1);
      }
   }

   public void id_class() {
      int var1 = this.id_protected.size();
      if (var1 != this.id_byte.size()) {
         throw new IllegalStateException("TickNextTick list out of synch");
      } else {
         if (var1 > 65536) {
            var1 = 65536;
         }

         rrEN var2 = this.id_throws.id_else();
         Iterator var3 = this.id_protected.iterator();

         while (var1 > 0 && var3.hasNext()) {
            rRD var4 = (rRD)var3.next();
            if (var4.id_break > this.id_throws.r()) {
               break;
            }

            if (var2.id_class(var4.id_class)) {
               var3.remove();
               this.id_byte.remove(var4);
               this.id_case.add(var4);
               var1--;
            }
         }

         rRD var9;
         while ((var9 = this.id_case.poll()) != null) {
            if (var2.id_class(var9.id_class)) {
               try {
                  this.id_catch.add(var9);
                  this.id_private.accept(var9);
               } catch (Throwable var8) {
                  KY var6 = KY.id_class(var8, "Exception while ticking");
                  Ko_1 var7 = var6.id_class("Block being ticked");
                  Ko_1.id_class(var7, var9.id_class, (xc_3)null);
                  throw new KU(var6);
               }
            } else {
               this.id_class(var9.id_class, (T)var9.id_break(), 0);
            }
         }

         this.id_catch.clear();
         this.id_case.clear();
      }
   }

   public List<rRD<T>> id_class(rfj_3 var1, boolean var2, boolean var3) {
      int var4 = (var1.id_break << 4) - 2;
      int var5 = var4 + 16 + 2;
      int var6 = (var1.id_byte << 4) - 2;
      int var7 = var6 + 16 + 2;
      return this.id_class(new rfi_3(var4, 0, var6, var5, 256, var7), var2, var3);
   }

   public List<rRD<T>> id_class(rfi_3 var1, boolean var2, boolean var3) {
      List var4 = this.id_class((List<rRD<T>>)null, this.id_protected, var1, var2);
      if (var2 && var4 != null) {
         this.id_byte.removeAll(var4);
      }

      var4 = this.id_class(var4, this.id_case, var1, var2);
      if (!var3) {
         var4 = this.id_class(var4, this.id_catch, var1, var2);
      }

      return var4 == null ? Collections.emptyList() : var4;
   }

   private List<rRD<T>> id_class(List<rRD<T>> var1, Collection<rRD<T>> var2, rfi_3 var3, boolean var4) {
      Iterator var5 = var2.iterator();

      while (var5.hasNext()) {
         rRD var6 = (rRD)var5.next();
         rfH_2 var7 = var6.id_class;
         if (var7.b_() >= var3.id_class && var7.b_() < var3.id_protected && var7.d_() >= var3.id_byte && var7.d_() < var3.id_case) {
            if (var4) {
               var5.remove();
            }

            if (var1 == null) {
               var1 = Lists.newArrayList();
            }

            var1.add(var6);
         }
      }

      return (List<rRD<T>>)var1;
   }

   public int id_break() {
      return this.id_byte.size();
   }

   @Override
   public boolean id_break(rfH_2 var1, T var2) {
      return this.id_case.contains(new rRD<>(var1, var2));
   }
}
