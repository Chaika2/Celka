package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.authlib.GameProfile;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

class rgj_3 implements rgV_2 {
   private final GameProfile break_;
   private final Executor byte_;

   rgj_3(rgw_3 var1, GameProfile var2) {
      this.class_ = var1;
      this.break_ = var2;
      rTh_1 var3 = rTh_1.class_(var1.extends_, "chat stream for " + var2.getName());
      this.byte_ = var3::class_;
   }

   @Override
   public CompletableFuture<Optional<String>> class_(String var1) {
      return this.class_.class_(this.break_, var1, this.class_.finally_, this.byte_);
   }

   @Override
   public CompletableFuture<Optional<List<String>>> class_(List<String> var1) {
      List var2 = var1.stream().map(var1x -> this.class_.class_(this.break_, var1x, this.class_.finally_, this.byte_)).collect(ImmutableList.toImmutableList());
      return rqR_2.break_(var2)
         .thenApply(var0 -> Optional.of(var0.stream().map(var0x -> var0x.orElse("")).collect(ImmutableList.toImmutableList())))
         .exceptionally(var0 -> Optional.empty());
   }

   @Override
   public void class_() {
      this.class_.class_(this.break_, this.class_.throws_, this.byte_);
   }

   @Override
   public void break_() {
      this.class_.class_(this.break_, this.class_.case_, this.byte_);
   }
}
