package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;

public class rrrq_1 extends rrrZ<rUt_1> {
   private static final List<rYf_1> id_else = ImmutableList.of(new rYf_1(aI_2.a, 1, 1, 1));
   private static final List<rYf_1> id_synchronized = ImmutableList.of(new rYf_1(aI_2.id_private, 1, 1, 1));

   @Override
   public List<rYf_1> id_byte() {
      return id_else;
   }

   public rrrq_1(Codec<rUt_1> var1) {
      super(var1);
   }

   @Override
   public rrrv_1<rUt_1> id_class() {
      return rrrT::new;
   }

   @Override
   public List<rYf_1> id_private() {
      return id_synchronized;
   }
}
