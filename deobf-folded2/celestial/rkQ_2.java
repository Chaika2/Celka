package celestial;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.Set;

public class rkQ_2 extends rkW_2 implements ee_3 {
   private final Set<xd_3> id_class;
   protected final float id_break;
   private final float id_byte;
   private final Multimap<iJ_2, ix_3> id_protected;

   protected rkQ_2(float var1, float var2, rdG_2 var3, Set<xd_3> var4, rdO_2 var5) {
      super(var3, var5);
      this.id_class = var4;
      this.id_break = var3.id_break();
      this.id_byte = var1 + var3.id_byte();
      Builder var6 = ImmutableMultimap.builder();
      var6.put(iQ_2.id_case, new ix_3(id_case, "Tool modifier", (double)this.id_byte, id_3.ADDITION));
      var6.put(iQ_2.id_private, new ix_3(id_catch, "Tool modifier", (double)var2, id_3.ADDITION));
      this.id_protected = var6.build();
   }

   @Override
   public boolean id_class(rdn_3 var1, rYB var2, xc_3 var3, rfH_2 var4, iB_2 var5) {
      if (!var2.id_continue && var3.id_private(var2, var4) != 0.0F) {
         var1.id_class(1, var5, var0 -> var0.id_break(rXQ.MAINHAND));
      }

      return true;
   }

   @Override
   public Multimap<iJ_2, ix_3> id_class(rXQ var1) {
      return var1 == rXQ.MAINHAND ? this.id_protected : super.id_class(var1);
   }

   @Override
   public float id_class(rdn_3 var1, xc_3 var2) {
      return this.id_class.contains(var2.id_break()) ? this.id_break : 1.0F;
   }

   @Override
   public boolean id_class(rdn_3 var1, iB_2 var2, iB_2 var3) {
      var1.id_class(2, var3, var0 -> var0.id_break(rXQ.MAINHAND));
      return true;
   }

   public float id_catch() {
      return this.id_byte;
   }
}
