package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Oa_1 {
   private static final rqO_2 class_ = new rqO_2("tick");
   private static final rqO_2 break_ = new rqO_2("load");
   private final rnW_2 byte_;
   private boolean protected_;
   private final ArrayDeque<Oi_1> throws_ = new ArrayDeque<>();
   private final List<Oi_1> case_ = Lists.newArrayList();
   private final List<gt_3> catch_ = Lists.newArrayList();
   private boolean private_;
   private rAQ implements_;

   public void byte_() {
      this.class_(this.catch_, class_);
      if (this.private_) {
         this.private_ = false;
         List var1 = this.implements_.byte_().break_(break_).class_();
         this.class_(var1, break_);
      }
   }

   public Oa_1(rnW_2 var1, rAQ var2) {
      this.byte_ = var1;
      this.implements_ = var2;
      this.break_(var2);
   }

   public int class_() {
      return this.byte_.D().byte_(rRu_1.synchronized_);
   }

   public Optional<gt_3> class_(rqO_2 var1) {
      return this.implements_.class_(var1);
   }

   public int class_(gt_3 var1, gy_3 var2) {
      int var3 = this.class_();
      if (this.protected_) {
         if (this.throws_.size() + this.case_.size() < var3) {
            this.case_.add(new Oi_1(this, var2, new gf_3(var1)));
         }

         return 0;
      } else {
         int var7;
         try {
            this.protected_ = true;
            int var4 = 0;
            gj_3[] var5 = var1.break_();

            for (int var6 = var5.length - 1; var6 >= 0; var6--) {
               this.throws_.push(new Oi_1(this, var2, var5[var6]));
            }

            do {
               if (this.throws_.isEmpty()) {
                  return var4;
               }

               Oi_1 var11 = this.throws_.removeFirst();
               var11.class_(this.throws_, var3);
               if (!this.case_.isEmpty()) {
                  Lists.reverse(this.case_).forEach(this.throws_::addFirst);
                  this.case_.clear();
               }
            } while (++var4 < var3);

            var7 = var4;
         } finally {
            this.throws_.clear();
            this.case_.clear();
            this.protected_ = false;
         }

         return var7;
      }
   }

   private void class_(Collection<gt_3> var1, rqO_2 var2) {
      for (gt_3 var4 : var1) {
         this.class_(var4, this.protected_());
      }
   }

   public void class_(rAQ var1) {
      this.implements_ = var1;
      this.break_(var1);
   }

   public rlb_3<gt_3> break_(rqO_2 var1) {
      return this.implements_.break_(var1);
   }

   private void break_(rAQ var1) {
      this.catch_.clear();
      this.catch_.addAll(var1.byte_().break_(class_).class_());
      this.private_ = true;
   }

   public CommandDispatcher<gy_3> break_() {
      return this.byte_.f().class_();
   }

   public Iterable<rqO_2> throws_() {
      return this.implements_.break_().keySet();
   }

   public Iterable<rqO_2> case_() {
      return this.implements_.byte_().break_();
   }

   public gy_3 protected_() {
      return this.byte_.j().break_(2).finally_();
   }
}
