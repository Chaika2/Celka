package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class OT {
   private final OT id_class;
   private final OU id_break;
   private final Og_1 id_byte;
   private final rqO_2 id_protected;
   private final Map<String, OK> id_throws;
   private final String[][] id_case;
   private final Set<OT> id_catch = Sets.newLinkedHashSet();
   private final rgP_2 id_private;

   public OU id_byte() {
      return this.id_break;
   }

   public OT(rqO_2 var1, OT var2, OU var3, Og_1 var4, Map<String, OK> var5, String[][] var6) {
      this.id_protected = var1;
      this.id_break = var3;
      this.id_throws = ImmutableMap.copyOf(var5);
      this.id_class = var2;
      this.id_byte = var4;
      this.id_case = var6;
      if (var2 != null) {
         var2.id_class(this);
      }

      if (var3 == null) {
         this.id_private = new rgN_2(var1.toString());
      } else {
         rgP_2 var7 = var3.id_class();
         rgF_2 var8 = var3.id_throws().id_byte();
         rVi_1 var9 = rgv_3.id_class(var7.id_case(), rgc_3.id_class.id_class(var8)).id_break("\n").id_class(var3.id_break());
         rVi_1 var10 = var7.id_case().id_class(var1x -> var1x.id_class(new rgy_3(rgp_3.id_class, var9)));
         this.id_private = rgv_3.id_class((rgP_2)var10).id_class(var8);
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof OT var2) ? false : this.id_protected.equals(var2.id_protected);
      }
   }

   @Override
   public String toString() {
      return "SimpleAdvancement{id="
         + this.id_private()
         + ", parent="
         + (this.id_class == null ? "null" : this.id_class.id_private())
         + ", display="
         + this.id_break
         + ", rewards="
         + this.id_byte
         + ", criteria="
         + this.id_throws
         + ", requirements="
         + Arrays.deepToString(this.id_case)
         + "}";
   }

   @Override
   public int hashCode() {
      return this.id_protected.hashCode();
   }

   public void id_class(OT var1) {
      this.id_catch.add(var1);
   }

   public Ot_1 id_class() {
      return new Ot_1(this.id_class == null ? null : this.id_class.id_private(), this.id_break, this.id_byte, this.id_throws, this.id_case);
   }

   public OT id_break() {
      return this.id_class;
   }

   public Iterable<OT> id_throws() {
      return this.id_catch;
   }

   public rgP_2 id_finally() {
      return this.id_private;
   }

   public int id_catch() {
      return this.id_case.length;
   }

   public Map<String, OK> id_case() {
      return this.id_throws;
   }

   public String[][] id_implements() {
      return this.id_case;
   }

   public Og_1 id_protected() {
      return this.id_byte;
   }

   public rqO_2 id_private() {
      return this.id_protected;
   }
}
