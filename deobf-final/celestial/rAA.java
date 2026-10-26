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
   public List<rAF> byte_(rqO_2 var1) {
      return ImmutableList.of();
   }

   @Override
   public rAF class_(rqO_2 var1) throws IOException {
      throw new FileNotFoundException(var1.toString());
   }

   @Override
   public Collection<rqO_2> class_(String var1, Predicate<String> var2) {
      return ImmutableSet.of();
   }

   @Override
   public Set<String> class_() {
      return ImmutableSet.of();
   }

   @Override
   public boolean break_(rqO_2 var1) {
      return false;
   }

   @Override
   public Stream<rAC> break_() {
      return Stream.of();
   }
}
