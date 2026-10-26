package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum rAA implements rAL {
   INSTANCE;

   @Override
   public List<rAF> id_byte(rqO_2 var1) {
      return ImmutableList.of();
   }

   @Override
   public rAF id_class(rqO_2 var1) throws IOException {
      throw new FileNotFoundException(var1.toString());
   }

   @Override
   public Collection<rqO_2> id_class(String var1, Predicate<String> var2) {
      return ImmutableSet.of();
   }

   @Override
   public Set<String> id_class() {
      return ImmutableSet.of();
   }

   @Override
   public boolean id_break(rqO_2 var1) {
      return false;
   }

   @Override
   public Stream<rAC> id_break() {
      return Stream.of();
   }
}
