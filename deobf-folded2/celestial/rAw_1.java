package celestial;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public final class rAw_1 {
   public static final Comparator<Ar_1> id_class = (var0, var1) -> String.CASE_INSENSITIVE_ORDER.compare(id_class(var0, false), id_class(var1, false));
   public static final Comparator<Ar_1> id_break = (var0, var1) -> -String.CASE_INSENSITIVE_ORDER.compare(id_class(var0, true), id_class(var1, true));
   private final Runnable id_byte;
   private int id_protected;
   private Comparator<Ar_1> id_throws;
   private Pattern id_case;
   private String id_catch;

   private void id_byte() {
      if (this.id_protected == 0) {
         this.id_byte.run();
      }
   }

   public rAw_1(Runnable var1) {
      this.id_byte = var1;
   }

   public void id_class(Comparator<Ar_1> var1) {
      this.id_throws = var1;
      this.id_byte();
   }

   public void id_class(String var1) {
      var1 = StringUtils.trimToNull(var1);
      if (!Objects.equals(var1, this.id_catch)) {
         this.id_case = (this.id_catch = var1) == null ? null : Pattern.compile("\\Q" + var1.replace("*", "\\E.*\\Q") + "\\E", 2);
         this.id_byte();
      }
   }

   public void id_class(List<Ar_1> var1, List<Ar_1> var2) {
      var2.clear();
      this.id_break(var1, var2);
      if (this.id_throws != null) {
         var2.sort(this.id_throws);
      }
   }

   private static String id_class(Ar_1 var0) {
      return var0 == null ? "<INVALID>" : var0.id_class().id_throws().id_byte();
   }

   private static String id_class(Ar_1 var0, boolean var1) {
      String var2 = var1 ? "a" : "x";
      return var2 + id_class(var0);
   }

   public void id_class() {
      this.id_protected++;
   }

   private static String id_break(Ar_1 var0) {
      return var0 == null ? "<INVALID>" : var0.id_class().id_case().id_byte();
   }

   private boolean id_break(String var1) {
      return this.id_case == null || var1.equals("..") || this.id_case.matcher(var1.toLowerCase()).find();
   }

   private void id_break(List<Ar_1> var1, List<Ar_1> var2) {
      for (Ar_1 var4 : var1) {
         if (this.id_break(id_class(var4)) || this.id_break(id_break(var4))) {
            var2.add(var4);
         }
      }
   }

   public void id_break() {
      if (this.id_protected > 0) {
         this.id_protected--;
         this.id_byte();
      }
   }
}
