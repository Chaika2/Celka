package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;

public class rPt_1 extends rPm_1<rsq_3> {
   private final il_3<List<rfK_2>> id_class;
   private final il_3<rfK_2> id_byte;
   private final float id_protected;
   private final int id_throws;
   private final int id_case;
   private long id_catch;
   private rfK_2 id_private;

   public rPt_1(il_3<List<rfK_2>> var1, float var2, int var3, int var4, il_3<rfK_2> var5) {
      super(ImmutableMap.of(il_3.id_volatile, iC_2.REGISTERED, var1, iC_2.VALUE_PRESENT, var5, iC_2.VALUE_PRESENT));
      this.id_class = var1;
      this.id_protected = var2;
      this.id_throws = var3;
      this.id_case = var4;
      this.id_byte = var5;
   }

   protected void id_class(rrEm_1 var1, rsq_3 var2, long var3) {
      if (var3 > this.id_catch && this.id_private != null) {
         var2.SF().id_class(il_3.id_volatile, new iH_2(this.id_private.id_break(), this.id_protected, this.id_throws));
         this.id_catch = var3 + 100L;
      }
   }

   protected boolean id_class(rrEm_1 var1, rsq_3 var2) {
      Optional var3 = var2.SF().id_byte(this.id_class);
      Optional var4 = var2.SF().id_byte(this.id_byte);
      if (var3.isPresent() && var4.isPresent()) {
         List var5 = (List)var3.get();
         if (!var5.isEmpty()) {
            this.id_private = (rfK_2)var5.get(var1.id_long().nextInt(var5.size()));
            return this.id_private != null
               && var1.E() == this.id_private.id_class()
               && ((rfK_2)var4.get()).id_break().id_class(var2.Ps(), (double)this.id_case);
         }
      }

      return false;
   }
}
