package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.authlib.GameProfile;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

class rgj_3 implements rgV_2 {
   private final GameProfile id_break;
   private final Executor id_byte;

   rgj_3(rgw_3 var1, GameProfile var2) {
      this.id_class = var1;
      this.id_break = var2;
      rTh_1 var3 = rTh_1.id_class(var1.id_extends, "chat stream for " + var2.getName());
      this.id_byte = var3::id_class;
   }

   @Override
   public CompletableFuture<Optional<String>> id_class(String var1) {
      return this.id_class.id_class(this.id_break, var1, this.id_class.id_finally, this.id_byte);
   }

   @Override
   public CompletableFuture<Optional<List<String>>> id_class(List<String> var1) {
      List var2 = var1.stream()
         .map(var1x -> this.id_class.id_class(this.id_break, var1x, this.id_class.id_finally, this.id_byte))
         .collect(ImmutableList.toImmutableList());
      return rqR_2.id_break(var2)
         .thenApply(var0 -> Optional.of(var0.stream().map(var0x -> var0x.orElse("")).collect(ImmutableList.toImmutableList())))
         .exceptionally(var0 -> Optional.empty());
   }

   @Override
   public void id_class() {
      this.id_class.id_class(this.id_break, this.id_class.id_throws, this.id_byte);
   }

   @Override
   public void id_break() {
      this.id_class.id_class(this.id_break, this.id_class.id_case, this.id_byte);
   }
}
