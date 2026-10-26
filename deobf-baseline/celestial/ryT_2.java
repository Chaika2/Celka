package celestial;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringEscapeUtils;

public class ryT_2 {
   private final Writer id_class;
   private final int id_break;

   ryT_2(Writer var1, List<String> var2) throws IOException {
      this.id_class = var1;
      this.id_break = var2.size();
      this.id_class(var2.stream());
   }

   private static String id_class(Object var0) {
      return StringEscapeUtils.escapeCsv(var0 != null ? var0.toString() : "[null]");
   }

   private void id_class(Stream<?> var1) throws IOException {
      this.id_class.write(var1.<CharSequence>map(ryT_2::id_class).collect(Collectors.joining(",")) + "\r\n");
   }

   public void id_class(Object... var1) throws IOException {
      if (var1.length != this.id_break) {
         throw new IllegalArgumentException("Invalid number of columns, expected " + this.id_break + ", but got " + var1.length);
      } else {
         this.id_class(Stream.of(var1));
      }
   }

   public static ryt_3 id_class() {
      return new ryt_3();
   }
}
