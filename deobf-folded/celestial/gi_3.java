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
   private static final Logger id_class = LogManager.getLogger();
   private final RP<T> id_break;
   private final Queue<Rr_1<T>> id_byte = new PriorityQueue<>(id_byte());
   private UnsignedLong id_protected = UnsignedLong.ZERO;
   private final Table<String, Long, Rr_1<T>> id_throws = HashBasedTable.create();

   private static <T> Comparator<Rr_1<T>> id_byte() {
      return Comparator.<Rr_1<T>>comparingLong(var0 -> var0.id_class).thenComparing(var0 -> var0.id_break);
   }

   public gi_3(RP<T> var1) {
      this.id_break = var1;
   }

   public gi_3(RP<T> var1, Stream<Dynamic<rcZ_2>> var2) {
      this(var1);
      this.id_byte.clear();
      this.id_throws.clear();
      this.id_protected = UnsignedLong.ZERO;
      var2.forEach(var1x -> {
         if (!(var1x.getValue() instanceof rcd_3)) {
            id_class.warn("Invalid format of events: {}", var1x);
         } else {
            this.id_class((rcd_3)var1x.getValue());
         }
      });
   }

   private rcd_3 id_class(Rr_1<T> var1) {
      rcd_3 var2 = new rcd_3();
      var2.id_class("Name", var1.id_byte);
      var2.id_class("TriggerTime", var1.id_class);
      var2.id_class("Callback", this.id_break.id_class(var1.id_protected));
      return var2;
   }

   private void id_class(rcd_3 var1) {
      rcd_3 var2 = var1.id_int("Callback");
      go_3 var3 = this.id_break.id_class(var2);
      if (var3 != null) {
         String var4 = var1.id_native("Name");
         long var5 = var1.id_implements("TriggerTime");
         this.id_class(var4, var5, var3);
      }
   }

   public void id_class(T var1, long var2) {
      while (true) {
         Rr_1 var4 = this.id_byte.peek();
         if (var4 == null || var4.id_class > var2) {
            return;
         }

         this.id_byte.remove();
         this.id_throws.remove(var4.id_byte, var2);
         var4.id_protected.id_class((T)var1, this, var2);
      }
   }

   public int id_class(String var1) {
      Collection var2 = this.id_throws.row(var1).values();
      var2.forEach(this.id_byte::remove);
      int var3 = var2.size();
      var2.clear();
      return var3;
   }

   public Set<String> id_class() {
      return Collections.unmodifiableSet(this.id_throws.rowKeySet());
   }

   public void id_class(String var1, long var2, go_3<T> var4) {
      if (!this.id_throws.contains(var1, var2)) {
         this.id_protected = this.id_protected.plus(UnsignedLong.ONE);
         Rr_1 var5 = new Rr_1(var2, this.id_protected, var1, var4);
         this.id_throws.put(var1, var2, var5);
         this.id_byte.add(var5);
      }
   }

   public rcy_3 id_break() {
      rcy_3 var1 = new rcy_3();
      this.id_byte.stream().sorted(id_byte()).map(this::id_class).forEach(var1::add);
      return var1;
   }
}
