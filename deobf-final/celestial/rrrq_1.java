package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;

public class rrrq_1 extends rrrZ<rUt_1> {
   private static final List<rYf_1> else_ = ImmutableList.of(new rYf_1(aI_2.a, 1, 1, 1));
   private static final List<rYf_1> synchronized_ = ImmutableList.of(new rYf_1(aI_2.private_, 1, 1, 1));

   @Override
   public List<rYf_1> byte_() {
      return else_;
   }

   public rrrq_1(Codec<rUt_1> var1) {
      super(var1);
   }

   @Override
   public rrrv_1<rUt_1> class_() {
      return rrrT::new;
   }

   @Override
   public List<rYf_1> private_() {
      return synchronized_;
   }
}
