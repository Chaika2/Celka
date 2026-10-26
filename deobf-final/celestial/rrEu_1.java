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
   protected final Predicate<T> class_;
   private final Function<T, rqO_2> break_;
   private final Set<rRD<T>> byte_ = Sets.newHashSet();
   private final TreeSet<rRD<T>> protected_ = Sets.newTreeSet(rRD.class_());
   private final rrEm_1 throws_;
   private final Queue<rRD<T>> case_ = Queues.newArrayDeque();
   private final List<rRD<T>> catch_ = Lists.newArrayList();
   private final Consumer<rRD<T>> private_;

   public rrEu_1(rrEm_1 var1, Predicate<T> var2, Function<T, rqO_2> var3, Consumer<rRD<T>> var4) {
      this.class_ = var2;
      this.break_ = var3;
      this.throws_ = var1;
      this.private_ = var4;
   }

   private static <T> rcy_3 class_(Function<T, rqO_2> var0, Iterable<rRD<T>> var1, long var2) {
      rcy_3 var4 = new rcy_3();

      for (rRD var6 : var1) {
         rcd_3 var7 = new rcd_3();
         var7.class_("i", ((rqO_2)var0.apply(var6.break_())).toString());
         var7.break_("x", var6.class_.b_());
         var7.break_("y", var6.class_.c_());
         var7.break_("z", var6.class_.d_());
         var7.break_("t", (int)(var6.break_ - var2));
         var7.break_("p", var6.byte_.class_());
         var4.add(var7);
      }

      return var4;
   }

   public rcy_3 class_(rfj_3 var1) {
      List var2 = this.class_(var1, false, true);
      return class_(this.break_, var2, this.throws_.r());
   }

   public void class_(rfi_3 var1, rfH_2 var2) {
      for (rRD var4 : this.class_(var1, false, false)) {
         if (var1.break_(var4.class_)) {
            rfH_2 var5 = var4.class_.break_(var2);
            Object var6 = var4.break_();
            this.class_(new rRD<>(var5, (T)var6, var4.break_, var4.byte_));
         }
      }
   }

   @Override
   public boolean class_(rfH_2 var1, T var2) {
      return this.byte_.contains(new rRD<>(var1, var2));
   }

   @Override
   public void class_(rfH_2 var1, T var2, int var3, rYr_1 var4) {
      if (!this.class_.test((T)var2)) {
         this.class_(new rRD<>(var1, (T)var2, (long)var3 + this.throws_.r(), var4));
      }
   }

   private void class_(rRD<T> var1) {
      if (!this.byte_.contains(var1)) {
         this.byte_.add(var1);
         this.protected_.add(var1);
      }
   }

   public void class_() {
      int var1 = this.protected_.size();
      if (var1 != this.byte_.size()) {
         throw new IllegalStateException("TickNextTick list out of synch");
      } else {
         if (var1 > 65536) {
            var1 = 65536;
         }

         rrEN var2 = this.throws_.else_();
         Iterator var3 = this.protected_.iterator();

         while (var1 > 0 && var3.hasNext()) {
            rRD var4 = (rRD)var3.next();
            if (var4.break_ > this.throws_.r()) {
               break;
            }

            if (var2.class_(var4.class_)) {
               var3.remove();
               this.byte_.remove(var4);
               this.case_.add(var4);
               var1--;
            }
         }

         rRD var9;
         while ((var9 = this.case_.poll()) != null) {
            if (var2.class_(var9.class_)) {
               try {
                  this.catch_.add(var9);
                  this.private_.accept(var9);
               } catch (Throwable var8) {
                  KY var6 = KY.class_(var8, "Exception while ticking");
                  Ko_1 var7 = var6.class_("Block being ticked");
                  Ko_1.class_(var7, var9.class_, (xc_3)null);
                  throw new KU(var6);
               }
            } else {
               this.class_(var9.class_, (T)var9.break_(), 0);
            }
         }

         this.catch_.clear();
         this.case_.clear();
      }
   }

   public List<rRD<T>> class_(rfj_3 var1, boolean var2, boolean var3) {
      int var4 = (var1.break_ << 4) - 2;
      int var5 = var4 + 16 + 2;
      int var6 = (var1.byte_ << 4) - 2;
      int var7 = var6 + 16 + 2;
      return this.class_(new rfi_3(var4, 0, var6, var5, 256, var7), var2, var3);
   }

   public List<rRD<T>> class_(rfi_3 var1, boolean var2, boolean var3) {
      List var4 = this.class_((List<rRD<T>>)null, this.protected_, var1, var2);
      if (var2 && var4 != null) {
         this.byte_.removeAll(var4);
      }

      var4 = this.class_(var4, this.case_, var1, var2);
      if (!var3) {
         var4 = this.class_(var4, this.catch_, var1, var2);
      }

      return var4 == null ? Collections.emptyList() : var4;
   }

   private List<rRD<T>> class_(List<rRD<T>> var1, Collection<rRD<T>> var2, rfi_3 var3, boolean var4) {
      Iterator var5 = var2.iterator();

      while (var5.hasNext()) {
         rRD var6 = (rRD)var5.next();
         rfH_2 var7 = var6.class_;
         if (var7.b_() >= var3.class_ && var7.b_() < var3.protected_ && var7.d_() >= var3.byte_ && var7.d_() < var3.case_) {
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

   public int break_() {
      return this.byte_.size();
   }

   @Override
   public boolean break_(rfH_2 var1, T var2) {
      return this.case_.contains(new rRD<>(var1, var2));
   }
}
