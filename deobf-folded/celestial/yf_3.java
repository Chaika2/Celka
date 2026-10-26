package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class yf_3 {
   public final UUID id_class;
   public final int id_break;
   public final eX_2 id_byte;
   public final rLC id_protected;
   public final rfH_2 id_throws;
   public final rfH_2 id_case;
   public final int id_catch;
   public final List<String> id_private = Lists.newArrayList();
   public final Set<rfH_2> id_implements = Sets.newHashSet();

   public boolean id_byte() {
      return this.id_case != null;
   }

   public yf_3(UUID var1, int var2, eX_2 var3, rLC var4, rfH_2 var5, rfH_2 var6, int var7) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
   }

   @Override
   public String toString() {
      return this.id_break();
   }

   public UUID id_class() {
      return this.id_class;
   }

   public boolean id_class(rfH_2 var1) {
      return this.id_throws != null && this.id_throws.equals(var1);
   }

   public String id_break() {
      return rqG_2.id_class(this.id_class);
   }
}
