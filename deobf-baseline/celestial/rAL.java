package celestial;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface rAL {
   List<rAF> id_byte(rqO_2 var1) throws IOException;

   Collection<rqO_2> id_class(String var1, Predicate<String> var2);

   Set<String> id_class();

   rAF id_class(rqO_2 var1) throws IOException;

   boolean id_break(rqO_2 var1);

   Stream<rAC> id_break();
}
