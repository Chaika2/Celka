package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;

public interface rAC extends AutoCloseable {
   String id_class();

   <T> T id_class(rAo_1<T> var1) throws IOException;

   Set<String> id_class(rAI var1);

   InputStream id_class(rAI var1, rqO_2 var2) throws IOException;

   Collection<rqO_2> id_class(rAI var1, String var2, String var3, int var4, Predicate<String> var5);

   InputStream id_class(String var1) throws IOException;

   @Override
   void close();

   boolean id_break(rAI var1, rqO_2 var2);
}
