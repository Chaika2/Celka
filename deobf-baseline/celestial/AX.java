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
   private final Aq_1 id_class;
   private final QY id_break;
   private int id_byte = -1;
   private CompletableFuture<Suggestions> id_protected;

   @Override
   public Collection<String> id_byte() {
      return this.id_class.id_finally().id_package().id_protected();
   }

   public AX(Aq_1 var1, QY var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public boolean id_class(int var1) {
      cb_3 var2 = (cb_3)this.id_break.id_class[57];
      return var2 != null ? var2.id_catch(var1) : var1 == 0;
   }

   @Override
   public CompletableFuture<Suggestions> id_class(CommandContext<gR_2> var1, SuggestionsBuilder var2) {
      if (this.id_protected != null) {
         this.id_protected.cancel(false);
      }

      this.id_protected = new CompletableFuture<>();
      int var3 = ++this.id_byte;
      this.id_class.id_class(new rZL(var3, var1.getInput()));
      return this.id_protected;
   }

   public void id_class(int var1, Suggestions var2) {
      if (var1 == this.id_byte) {
         this.id_protected.complete(var2);
         this.id_protected = null;
         this.id_byte = -1;
      }
   }

   private static String id_class(double var0) {
      return String.format(Locale.ROOT, "%.2f", var0);
   }

   @Override
   public Collection<String> id_class() {
      ArrayList var1 = Lists.newArrayList();

      for (Aw_1 var3 : this.id_class.id_throws()) {
         var1.add(var3.id_class().getName());
      }

      return var1;
   }

   private static String id_break(int var0) {
      return Integer.toString(var0);
   }

   @Override
   public Collection<String> id_break() {
      return (Collection<String>)((rjG_2)this.id_break.id_class[64] != null && ((rjG_2)this.id_break.id_class[64]).id_byte() == rjM_2.ENTITY
         ? Collections.singleton(((rfo_3)((rjG_2)this.id_break.id_class[64])).id_class().rz())
         : Collections.emptyList());
   }

   @Override
   public Stream<rqO_2> id_throws() {
      return this.id_class.id_protected().id_byte();
   }

   @Override
   public Collection<gY_2> id_catch() {
      rjG_2 var1 = (rjG_2)this.id_break.id_class[64];
      if (var1 != null && var1.id_byte() == rjM_2.BLOCK) {
         rjU_2 var2 = var1.id_case();
         return Collections.singleton(new gY_2(id_class(var2.id_break), id_class(var2.id_byte), id_class(var2.id_protected)));
      } else {
         return gR_2.super.id_catch();
      }
   }

   @Override
   public Collection<gY_2> id_case() {
      rjG_2 var1 = (rjG_2)this.id_break.id_class[64];
      if (var1 != null && var1.id_byte() == rjM_2.BLOCK) {
         rfH_2 var2 = ((rff_3)var1).id_class();
         return Collections.singleton(new gY_2(id_break(var2.b_()), id_break(var2.c_()), id_break(var2.d_())));
      } else {
         return gR_2.super.id_case();
      }
   }

   @Override
   public rVm_1 id_implements() {
      return this.id_class.id_package();
   }

   @Override
   public Collection<rqO_2> id_protected() {
      return this.id_break.c().id_class();
   }

   @Override
   public Set<rqM_2<rYB>> id_private() {
      return this.id_class.id_final();
   }
}
