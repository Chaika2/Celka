package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class AX implements gR_2 {
   private final Aq_1 class_;
   private final QY break_;
   private int byte_ = -1;
   private CompletableFuture<Suggestions> protected_;

   @Override
   public Collection<String> byte_() {
      return this.class_.finally_().package_().protected_();
   }

   public AX(Aq_1 var1, QY var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public boolean class_(int var1) {
      cb_3 var2 = (cb_3)this.break_.class_[57];
      return var2 != null ? var2.catch_(var1) : var1 == 0;
   }

   @Override
   public CompletableFuture<Suggestions> class_(CommandContext<gR_2> var1, SuggestionsBuilder var2) {
      if (this.protected_ != null) {
         this.protected_.cancel(false);
      }

      this.protected_ = new CompletableFuture<>();
      int var3 = ++this.byte_;
      this.class_.class_(new rZL(var3, var1.getInput()));
      return this.protected_;
   }

   public void class_(int var1, Suggestions var2) {
      if (var1 == this.byte_) {
         this.protected_.complete(var2);
         this.protected_ = null;
         this.byte_ = -1;
      }
   }

   private static String class_(double var0) {
      return String.format(Locale.ROOT, "%.2f", var0);
   }

   @Override
   public Collection<String> class_() {
      ArrayList var1 = Lists.newArrayList();

      for (Aw_1 var3 : this.class_.throws_()) {
         var1.add(var3.class_().getName());
      }

      return var1;
   }

   private static String break_(int var0) {
      return Integer.toString(var0);
   }

   @Override
   public Collection<String> break_() {
      return (Collection<String>)((rjG_2)this.break_.class_[64] != null && ((rjG_2)this.break_.class_[64]).byte_() == rjM_2.ENTITY
         ? Collections.singleton(((rfo_3)((rjG_2)this.break_.class_[64])).class_().rz())
         : Collections.emptyList());
   }

   @Override
   public Stream<rqO_2> throws_() {
      return this.class_.protected_().byte_();
   }

   @Override
   public Collection<gY_2> catch_() {
      rjG_2 var1 = (rjG_2)this.break_.class_[64];
      if (var1 != null && var1.byte_() == rjM_2.BLOCK) {
         rjU_2 var2 = var1.case_();
         return Collections.singleton(new gY_2(class_(var2.break_), class_(var2.byte_), class_(var2.protected_)));
      } else {
         return gR_2.super.catch_();
      }
   }

   @Override
   public Collection<gY_2> case_() {
      rjG_2 var1 = (rjG_2)this.break_.class_[64];
      if (var1 != null && var1.byte_() == rjM_2.BLOCK) {
         rfH_2 var2 = ((rff_3)var1).class_();
         return Collections.singleton(new gY_2(break_(var2.b_()), break_(var2.c_()), break_(var2.d_())));
      } else {
         return gR_2.super.case_();
      }
   }

   @Override
   public rVm_1 implements_() {
      return this.class_.package_();
   }

   @Override
   public Collection<rqO_2> protected_() {
      return this.break_.c().class_();
   }

   @Override
   public Set<rqM_2<rYB>> private_() {
      return this.class_.final_();
   }
}
