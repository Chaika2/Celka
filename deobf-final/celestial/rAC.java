package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;

public interface rAC extends AutoCloseable {
   String class_();

   <T> T class_(rAo_1<T> var1) throws IOException;

   Set<String> class_(rAI var1);

   InputStream class_(rAI var1, rqO_2 var2) throws IOException;

   Collection<rqO_2> class_(rAI var1, String var2, String var3, int var4, Predicate<String> var5);

   InputStream class_(String var1) throws IOException;

   @Override
   void close();

   boolean break_(rAI var1, rqO_2 var2);
}
