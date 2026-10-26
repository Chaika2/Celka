package celestial;

import java.io.IOException;

@FunctionalInterface
interface rKB<O> {
   O wrap(O var1) throws IOException;
}
