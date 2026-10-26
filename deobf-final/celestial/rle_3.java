package celestial;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2LongMap.Entry;
import java.util.Collection;

public class rle_3 {
   private final rlj_3 class_;
   private rfH_2 break_;
   private final rrEm_1 byte_;
   private final Collection<rlC_2> protected_ = Lists.newArrayList();
   private final int throws_;
   private final Collection<rlV_2> case_ = Lists.newCopyOnWriteArrayList();
   private Object2LongMap<Runnable> catch_ = new Object2LongOpenHashMap();
   private long private_;
   private long implements_;
   private boolean finally_ = false;
   private final Stopwatch extends_ = Stopwatch.createUnstarted();
   private boolean native_ = false;
   private final rqd_3 volatile_;
   private Throwable final_;

   public String byte_() {
      return this.class_.class_();
   }

   private void int_() {
      if (this.finally_) {
         throw new IllegalStateException("Test already started");
      } else {
         this.finally_ = true;

         try {
            this.class_.class_(new rla_3(this));
         } catch (Exception var2) {
            this.class_(var2);
         }
      }
   }

   public rle_3(rlj_3 var1, rqd_3 var2, rrEm_1 var3) {
      this.class_ = var1;
      this.byte_ = var3;
      this.throws_ = var1.byte_();
      this.volatile_ = var1.catch_().class_(var2);
   }

   @Override
   public String toString() {
      return this.byte_();
   }

   public void class_(Throwable var1) {
      this.new_();
      this.final_ = var1;
      this.protected_.forEach(var1x -> var1x.break_(this));
   }

   public void class_(rlC_2 var1) {
      this.protected_.add(var1);
   }

   public void class_(rfH_2 var1, int var2) {
      ryG_2 var3 = rlH_2.class_(this.volatile_(), var1, this.final_(), var2, this.byte_, false);
      this.class_(var3.char_());
      var3.class_(this.byte_());
      rlH_2.class_(this.break_, new rfH_2(1, 0, -1), this.final_(), this.byte_);
      this.protected_.forEach(var1x -> var1x.class_(this));
   }

   void class_() {
      this.private_ = this.byte_.r() + 1L + this.class_.case_();
      this.extends_.start();
   }

   void class_(rfH_2 var1) {
      this.break_ = var1;
   }

   public void break_() {
      if (!this.implements_()) {
         this.implements_ = this.byte_.r() - this.private_;
         if (this.implements_ >= 0L) {
            if (this.implements_ == 0L) {
               this.int_();
            }

            ObjectIterator var1 = this.catch_.object2LongEntrySet().iterator();

            while (var1.hasNext()) {
               Entry var2 = (Entry)var1.next();
               if (var2.getLongValue() <= this.implements_) {
                  try {
                     ((Runnable)var2.getKey()).run();
                  } catch (Exception var4) {
                     this.class_(var4);
                  }

                  var1.remove();
               }
            }

            if (this.implements_ > (long)this.throws_) {
               if (this.case_.isEmpty()) {
                  this.class_(new rlU_2("Didn't succeed or fail within " + this.class_.byte_() + " ticks"));
               } else {
                  this.case_.forEach(var1x -> var1x.break_(this.implements_));
                  if (this.final_ == null) {
                     this.class_(new rlU_2("No sequences finished"));
                  }
               }
            } else {
               this.case_.forEach(var1x -> var1x.class_(this.implements_));
            }
         }
      }
   }

   public rrEm_1 throws_() {
      return this.byte_;
   }

   public Throwable finally_() {
      return this.final_;
   }

   public boolean catch_() {
      return this.final_ != null;
   }

   public boolean extends_() {
      return this.class_.protected_();
   }

   public boolean case_() {
      return this.native_ && this.final_ == null;
   }

   public boolean implements_() {
      return this.native_;
   }

   private void new_() {
      if (!this.native_) {
         this.native_ = true;
         this.extends_.stop();
      }
   }

   public rlj_3 package_() {
      return this.class_;
   }

   public rfH_2 protected_() {
      return this.break_;
   }

   public boolean private_() {
      return this.finally_;
   }

   public rqd_3 final_() {
      return this.volatile_;
   }

   public String volatile_() {
      return this.class_.break_();
   }

   public boolean native_() {
      return !this.class_.protected_();
   }
}
