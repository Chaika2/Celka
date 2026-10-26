package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class rZI implements ruS_2<At_1> {
   private boolean id_class;
   private Map<rqO_2, Ot_1> id_break;
   private Set<rqO_2> id_byte;
   private Map<rqO_2, Oj_1> id_protected;

   public Set<rqO_2> id_byte() {
      return this.id_byte;
   }

   public rZI() {
   }

   public rZI(boolean var1, Collection<OT> var2, Set<rqO_2> var3, Map<rqO_2, Oj_1> var4) {
      this.id_class = var1;
      this.id_break = Maps.newHashMap();

      for (OT var6 : var2) {
         this.id_break.put(var6.id_private(), var6.id_class());
      }

      this.id_byte = var3;
      this.id_protected = Maps.newHashMap(var4);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.readBoolean();
      this.id_break = Maps.newHashMap();
      this.id_byte = Sets.newLinkedHashSet();
      this.id_protected = Maps.newHashMap();
      int var2 = var1.id_case();

      for (int var3 = 0; var3 < var2; var3++) {
         rqO_2 var4 = var1.id_volatile();
         Ot_1 var5 = Ot_1.id_break(var1);
         this.id_break.put(var4, var5);
      }

      var2 = var1.id_case();

      for (int var8 = 0; var8 < var2; var8++) {
         rqO_2 var10 = var1.id_volatile();
         this.id_byte.add(var10);
      }

      var2 = var1.id_case();

      for (int var9 = 0; var9 < var2; var9++) {
         rqO_2 var11 = var1.id_volatile();
         this.id_protected.put(var11, Oj_1.id_break(var1));
      }
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   public Map<rqO_2, Ot_1> id_break() {
      return this.id_break;
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.writeBoolean(this.id_class);
      var1.id_protected(this.id_break.size());

      for (Entry var3 : this.id_break.entrySet()) {
         rqO_2 var4 = (rqO_2)var3.getKey();
         Ot_1 var5 = (Ot_1)var3.getValue();
         var1.id_class(var4);
         var5.id_class(var1);
      }

      var1.id_protected(this.id_byte.size());

      for (rqO_2 var8 : this.id_byte) {
         var1.id_class(var8);
      }

      var1.id_protected(this.id_protected.size());

      for (Entry var9 : this.id_protected.entrySet()) {
         var1.id_class((rqO_2)var9.getKey());
         ((Oj_1)var9.getValue()).id_class(var1);
      }
   }

   public boolean id_throws() {
      return this.id_class;
   }

   public Map<rqO_2, Oj_1> id_protected() {
      return this.id_protected;
   }
}
