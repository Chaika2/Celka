package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class rrss_3 extends rrsM_2 {
   private static final xc_3 id_class = xu_3.PY.id_continue();
   private static final xc_3 id_break = xu_3.Po.id_continue();
   private static final xc_3 id_byte = xu_3.id_char.id_continue();
   private static final ImmutableList<xc_3> id_protected = ImmutableList.of(id_class, id_break);

   @Override
   protected xc_3 id_byte() {
      return id_byte;
   }

   public rrss_3(Codec<rrsG_2> var1) {
      super(var1);
   }

   @Override
   protected ImmutableList<xc_3> id_class() {
      return id_protected;
   }

   @Override
   protected ImmutableList<xc_3> id_break() {
      return id_protected;
   }
}
