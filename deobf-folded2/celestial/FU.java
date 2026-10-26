package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.UserApiService;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class FU {
   private final QY id_class;
   private final Set<UUID> id_break = Sets.newHashSet();
   private final UserApiService id_byte;
   private final Map<String, UUID> id_protected = Maps.newHashMap();

   public boolean id_byte(UUID var1) {
      return this.id_protected(var1) || this.id_throws(var1);
   }

   public FU(QY var1, UserApiService var2) {
      this.id_class = var1;
      this.id_byte = var2;
   }

   public UUID id_class(String var1) {
      return this.id_protected.getOrDefault(var1, rqR_2.id_break);
   }

   public Set<UUID> id_class() {
      return this.id_break;
   }

   public void id_class(UUID var1) {
      this.id_break.add(var1);
   }

   public void id_class(Aw_1 var1) {
      GameProfile var2 = var1.id_class();
      if (var2.isComplete()) {
         this.id_protected.put(var2.getName(), var2.getId());
      }

      vm_3 var3 = (vm_3)this.id_class.id_class[73];
      if (var3 instanceof Fe_1 var4) {
         var4.id_class(var1);
      }
   }

   public void id_break(UUID var1) {
      this.id_break.remove(var1);
   }

   public boolean id_throws(UUID var1) {
      return this.id_byte.isBlockedPlayer(var1);
   }

   public void id_case(UUID var1) {
      vm_3 var2 = (vm_3)this.id_class.id_class[73];
      if (var2 instanceof Fe_1 var3) {
         var3.id_class(var1);
      }
   }

   public boolean id_protected(UUID var1) {
      return this.id_break.contains(var1);
   }
}
