package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.UserApiService;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class FU {
   private final QY class_;
   private final Set<UUID> break_ = Sets.newHashSet();
   private final UserApiService byte_;
   private final Map<String, UUID> protected_ = Maps.newHashMap();

   public boolean byte_(UUID var1) {
      return this.protected_(var1) || this.throws_(var1);
   }

   public FU(QY var1, UserApiService var2) {
      this.class_ = var1;
      this.byte_ = var2;
   }

   public UUID class_(String var1) {
      return this.protected_.getOrDefault(var1, rqR_2.break_);
   }

   public Set<UUID> class_() {
      return this.break_;
   }

   public void class_(UUID var1) {
      this.break_.add(var1);
   }

   public void class_(Aw_1 var1) {
      GameProfile var2 = var1.class_();
      if (var2.isComplete()) {
         this.protected_.put(var2.getName(), var2.getId());
      }

      vm_3 var3 = (vm_3)this.class_.class_[73];
      if (var3 instanceof Fe_1 var4) {
         var4.class_(var1);
      }
   }

   public void break_(UUID var1) {
      this.break_.remove(var1);
   }

   public boolean throws_(UUID var1) {
      return this.byte_.isBlockedPlayer(var1);
   }

   public void case_(UUID var1) {
      vm_3 var2 = (vm_3)this.class_.class_[73];
      if (var2 instanceof Fe_1 var3) {
         var3.class_(var1);
      }
   }

   public boolean protected_(UUID var1) {
      return this.break_.contains(var1);
   }
}
