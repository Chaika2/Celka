package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class rrSg_1 extends rrsM_2 {
   private static final xc_3 id_class = xu_3.PK.id_continue();
   private static final xc_3 id_break = xu_3.Ju.id_continue();
   private static final xc_3 id_byte = xu_3.id_char.id_continue();
   private static final ImmutableList<xc_3> id_protected = ImmutableList.of(id_class, id_break);
   private static final ImmutableList<xc_3> id_throws = ImmutableList.of(id_class);

   @Override
   protected xc_3 id_byte() {
      return id_byte;
   }

   public rrSg_1(Codec<rrsG_2> var1) {
      super(var1);
   }

   @Override
   protected ImmutableList<xc_3> id_class() {
      return id_protected;
   }

   @Override
   protected ImmutableList<xc_3> id_break() {
      return id_throws;
   }
}
