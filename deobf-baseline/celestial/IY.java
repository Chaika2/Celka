package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class IY {
   private final List<wK_2> id_class = Lists.newArrayList();
   private final Map<rpr_3, List<wK_2>> id_break = Maps.newEnumMap(rpr_3.class);
   private final IF id_byte;
   private final boolean id_protected;
   private fj_3 id_throws;
   private final boolean id_case;
   private final boolean id_catch;
   private final Ik_1 id_private;

   public IY(we_3 var1, IF var2, boolean var3) {
      this(var1.id_break(), var1.id_byte().id_class(), var3, var1.id_catch(), var2);
   }

   private IY(boolean var1, boolean var2, boolean var3, Ik_1 var4, IF var5) {
      for (rpr_3 var9 : rpr_3.values()) {
         this.id_break.put(var9, Lists.newArrayList());
      }

      this.id_byte = var5;
      this.id_protected = var1;
      this.id_case = var2;
      this.id_catch = var3;
      this.id_private = var4;
   }

   public IY id_class(fj_3 var1) {
      this.id_throws = var1;
      return this;
   }

   public IJ id_class() {
      if (this.id_throws == null) {
         throw new RuntimeException("Missing particle!");
      } else {
         return new IR(this.id_class, this.id_break, this.id_protected, this.id_case, this.id_catch, this.id_throws, this.id_private, this.id_byte);
      }
   }

   public IY id_class(wK_2 var1) {
      this.id_class.add(var1);
      return this;
   }

   public IY id_class(rpr_3 var1, wK_2 var2) {
      this.id_break.get(var1).add(var2);
      return this;
   }
}
