package celestial;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2LongMap.Entry;
import java.util.Collection;

public class rle_3 {
   private final rlj_3 id_class;
   private rfH_2 id_break;
   private final rrEm_1 id_byte;
   private final Collection<rlC_2> id_protected = Lists.newArrayList();
   private final int id_throws;
   private final Collection<rlV_2> id_case = Lists.newCopyOnWriteArrayList();
   private Object2LongMap<Runnable> id_catch = new Object2LongOpenHashMap();
   private long id_private;
   private long id_implements;
   private boolean id_finally = false;
   private final Stopwatch id_extends = Stopwatch.createUnstarted();
   private boolean id_native = false;
   private final rqd_3 id_volatile;
   private Throwable id_final;

   public String id_byte() {
      return this.id_class.id_class();
   }

   private void id_int() {
      if (this.id_finally) {
         throw new IllegalStateException("Test already started");
      } else {
         this.id_finally = true;

         try {
            this.id_class.id_class(new rla_3(this));
         } catch (Exception var2) {
            this.id_class(var2);
         }
      }
   }

   public rle_3(rlj_3 var1, rqd_3 var2, rrEm_1 var3) {
      this.id_class = var1;
      this.id_byte = var3;
      this.id_throws = var1.id_byte();
      this.id_volatile = var1.id_catch().id_class(var2);
   }

   @Override
   public String toString() {
      return this.id_byte();
   }

   public void id_class(Throwable var1) {
      this.id_new();
      this.id_final = var1;
      this.id_protected.forEach(var1x -> var1x.id_break(this));
   }

   public void id_class(rlC_2 var1) {
      this.id_protected.add(var1);
   }

   public void id_class(rfH_2 var1, int var2) {
      ryG_2 var3 = rlH_2.id_class(this.id_volatile(), var1, this.id_final(), var2, this.id_byte, false);
      this.id_class(var3.id_char());
      var3.id_class(this.id_byte());
      rlH_2.id_class(this.id_break, new rfH_2(1, 0, -1), this.id_final(), this.id_byte);
      this.id_protected.forEach(var1x -> var1x.id_class(this));
   }

   void id_class() {
      this.id_private = this.id_byte.r() + 1L + this.id_class.id_case();
      this.id_extends.start();
   }

   void id_class(rfH_2 var1) {
      this.id_break = var1;
   }

   public void id_break() {
      if (!this.id_implements()) {
         this.id_implements = this.id_byte.r() - this.id_private;
         if (this.id_implements >= 0L) {
            if (this.id_implements == 0L) {
               this.id_int();
            }

            ObjectIterator var1 = this.id_catch.object2LongEntrySet().iterator();

            while (var1.hasNext()) {
               Entry var2 = (Entry)var1.next();
               if (var2.getLongValue() <= this.id_implements) {
                  try {
                     ((Runnable)var2.getKey()).run();
                  } catch (Exception var4) {
                     this.id_class(var4);
                  }

                  var1.remove();
               }
            }

            if (this.id_implements > (long)this.id_throws) {
               if (this.id_case.isEmpty()) {
                  this.id_class(new rlU_2("Didn't succeed or fail within " + this.id_class.id_byte() + " ticks"));
               } else {
                  this.id_case.forEach(var1x -> var1x.id_break(this.id_implements));
                  if (this.id_final == null) {
                     this.id_class(new rlU_2("No sequences finished"));
                  }
               }
            } else {
               this.id_case.forEach(var1x -> var1x.id_class(this.id_implements));
            }
         }
      }
   }

   public rrEm_1 id_throws() {
      return this.id_byte;
   }

   public Throwable id_finally() {
      return this.id_final;
   }

   public boolean id_catch() {
      return this.id_final != null;
   }

   public boolean id_extends() {
      return this.id_class.id_protected();
   }

   public boolean id_case() {
      return this.id_native && this.id_final == null;
   }

   public boolean id_implements() {
      return this.id_native;
   }

   private void id_new() {
      if (!this.id_native) {
         this.id_native = true;
         this.id_extends.stop();
      }
   }

   public rlj_3 id_package() {
      return this.id_class;
   }

   public rfH_2 id_protected() {
      return this.id_break;
   }

   public boolean id_private() {
      return this.id_finally;
   }

   public rqd_3 id_final() {
      return this.id_volatile;
   }

   public String id_volatile() {
      return this.id_class.id_break();
   }

   public boolean id_native() {
      return !this.id_class.id_protected();
   }
}
