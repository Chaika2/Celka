package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class pG_2 {
   public final UUID id_class;
   public final int id_break;
   public final String id_byte;
   public final String id_protected;
   public final int id_throws;
   public final float id_case;
   public final float id_catch;
   public final eX_2 id_private;
   public final String id_implements;
   public final rLC id_finally;
   public final boolean id_extends;
   public final List<String> id_native = Lists.newArrayList();
   public final List<String> id_volatile = Lists.newArrayList();
   public final List<String> id_final = Lists.newArrayList();
   public final List<String> id_package = Lists.newArrayList();
   public final Set<rfH_2> id_int = Sets.newHashSet();
   public final Set<rfH_2> id_new = Sets.newHashSet();

   public pG_2(UUID var1, int var2, String var3, String var4, int var5, float var6, float var7, eX_2 var8, String var9, rLC var10, boolean var11) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_private = var8;
      this.id_implements = var9;
      this.id_finally = var10;
      this.id_extends = var11;
   }

   public UUID id_class() {
      return this.id_class;
   }

   boolean id_class(rfH_2 var1) {
      return this.id_int.stream().anyMatch(var1::equals);
   }

   boolean id_break(rfH_2 var1) {
      return this.id_new.contains(var1);
   }
}
