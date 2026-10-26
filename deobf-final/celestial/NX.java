package celestial;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class NX {
   private final Set<NJ> class_ = Sets.newIdentityHashSet();
   final ND break_;
   final Executor byte_;

   public NX(ND var1, Executor var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public CompletableFuture<NJ> class_(Ni_1 var1) {
      CompletableFuture var2 = new CompletableFuture();
      this.byte_.execute(() -> {
         NK var3 = this.break_.class_(var1);
         if (var3 != null) {
            NJ var4 = new NJ(this, var3);
            this.class_.add(var4);
            var2.complete(var4);
         } else {
            var2.complete((NJ)null);
         }
      });
      return var2;
   }

   public void class_(Consumer<Stream<NK>> var1) {
      this.byte_.execute(() -> var1.accept(this.class_.stream().map(var0 -> var0.break_).filter(Objects::nonNull)));
   }

   public void class_() {
      this.byte_.execute(() -> {
         Iterator var1 = this.class_.iterator();

         while (var1.hasNext()) {
            NJ var2 = (NJ)var1.next();
            var2.break_.implements_();
            if (var2.break_.catch_()) {
               var2.break_();
               var1.remove();
            }
         }
      });
   }

   public void break_() {
      this.class_.forEach(NJ::break_);
      this.class_.clear();
   }
}
