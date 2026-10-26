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
   private final Set<NJ> id_class = Sets.newIdentityHashSet();
   final ND id_break;
   final Executor id_byte;

   public NX(ND var1, Executor var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public CompletableFuture<NJ> id_class(Ni_1 var1) {
      CompletableFuture var2 = new CompletableFuture();
      this.id_byte.execute(() -> {
         NK var3 = this.id_break.id_class(var1);
         if (var3 != null) {
            NJ var4 = new NJ(this, var3);
            this.id_class.add(var4);
            var2.complete(var4);
         } else {
            var2.complete((NJ)null);
         }
      });
      return var2;
   }

   public void id_class(Consumer<Stream<NK>> var1) {
      this.id_byte.execute(() -> var1.accept(this.id_class.stream().map(var0 -> var0.id_break).filter(Objects::nonNull)));
   }

   public void id_class() {
      this.id_byte.execute(() -> {
         Iterator var1 = this.id_class.iterator();

         while (var1.hasNext()) {
            NJ var2 = (NJ)var1.next();
            var2.id_break.id_implements();
            if (var2.id_break.id_catch()) {
               var2.id_break();
               var1.remove();
            }
         }
      });
   }

   public void id_break() {
      this.id_class.forEach(NJ::id_break);
      this.id_class.clear();
   }
}
