package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;

public interface rCA<O, S> {
   S create(O var1, ImmutableMap<rCZ<?>, Comparable<?>> var2, MapCodec<S> var3);
}
