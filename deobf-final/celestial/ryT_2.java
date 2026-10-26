package celestial;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringEscapeUtils;

public class ryT_2 {
   private final Writer class_;
   private final int break_;

   ryT_2(Writer var1, List<String> var2) throws IOException {
      this.class_ = var1;
      this.break_ = var2.size();
      this.class_(var2.stream());
   }

   private static String class_(Object var0) {
      return StringEscapeUtils.escapeCsv(var0 != null ? var0.toString() : "[null]");
   }

   private void class_(Stream<?> var1) throws IOException {
      this.class_.write(var1.<CharSequence>map(ryT_2::class_).collect(Collectors.joining(",")) + "\r\n");
   }

   public void class_(Object... var1) throws IOException {
      if (var1.length != this.break_) {
         throw new IllegalArgumentException("Invalid number of columns, expected " + this.break_ + ", but got " + var1.length);
      } else {
         this.class_(Stream.of(var1));
      }
   }

   public static ryt_3 class_() {
      return new ryt_3();
   }
}
