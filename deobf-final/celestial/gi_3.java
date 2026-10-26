package celestial;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.primitives.UnsignedLong;
import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class gi_3<T> {
   private static final Logger class_ = LogManager.getLogger();
   private final RP<T> break_;
   private final Queue<Rr_1<T>> byte_ = new PriorityQueue<>(byte_());
   private UnsignedLong protected_ = UnsignedLong.ZERO;
   private final Table<String, Long, Rr_1<T>> throws_ = HashBasedTable.create();

   private static <T> Comparator<Rr_1<T>> byte_() {
      return Comparator.<Rr_1<T>>comparingLong(var0 -> var0.class_).thenComparing(var0 -> var0.break_);
   }

   public gi_3(RP<T> var1) {
      this.break_ = var1;
   }

   public gi_3(RP<T> var1, Stream<Dynamic<rcZ_2>> var2) {
      this(var1);
      this.byte_.clear();
      this.throws_.clear();
      this.protected_ = UnsignedLong.ZERO;
      var2.forEach(var1x -> {
         if (!(var1x.getValue() instanceof rcd_3)) {
            class_.warn("Invalid format of events: {}", var1x);
         } else {
            this.class_((rcd_3)var1x.getValue());
         }
      });
   }

   private rcd_3 class_(Rr_1<T> var1) {
      rcd_3 var2 = new rcd_3();
      var2.class_("Name", var1.byte_);
      var2.class_("TriggerTime", var1.class_);
      var2.class_("Callback", this.break_.class_(var1.protected_));
      return var2;
   }

   private void class_(rcd_3 var1) {
      rcd_3 var2 = var1.int_("Callback");
      go_3 var3 = this.break_.class_(var2);
      if (var3 != null) {
         String var4 = var1.native_("Name");
         long var5 = var1.implements_("TriggerTime");
         this.class_(var4, var5, var3);
      }
   }

   public void class_(T var1, long var2) {
      while (true) {
         Rr_1 var4 = this.byte_.peek();
         if (var4 == null || var4.class_ > var2) {
            return;
         }

         this.byte_.remove();
         this.throws_.remove(var4.byte_, var2);
         var4.protected_.class_((T)var1, this, var2);
      }
   }

   public int class_(String var1) {
      Collection var2 = this.throws_.row(var1).values();
      var2.forEach(this.byte_::remove);
      int var3 = var2.size();
      var2.clear();
      return var3;
   }

   public Set<String> class_() {
      return Collections.unmodifiableSet(this.throws_.rowKeySet());
   }

   public void class_(String var1, long var2, go_3<T> var4) {
      if (!this.throws_.contains(var1, var2)) {
         this.protected_ = this.protected_.plus(UnsignedLong.ONE);
         Rr_1 var5 = new Rr_1(var2, this.protected_, var1, var4);
         this.throws_.put(var1, var2, var5);
         this.byte_.add(var5);
      }
   }

   public rcy_3 break_() {
      rcy_3 var1 = new rcy_3();
      this.byte_.stream().sorted(byte_()).map(this::class_).forEach(var1::add);
      return var1;
   }
}
