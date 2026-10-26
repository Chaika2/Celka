package celestial;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public final class rAw_1 {
   public static final Comparator<Ar_1> class_ = (var0, var1) -> String.CASE_INSENSITIVE_ORDER.compare(class_(var0, false), class_(var1, false));
   public static final Comparator<Ar_1> break_ = (var0, var1) -> -String.CASE_INSENSITIVE_ORDER.compare(class_(var0, true), class_(var1, true));
   private final Runnable byte_;
   private int protected_;
   private Comparator<Ar_1> throws_;
   private Pattern case_;
   private String catch_;

   private void byte_() {
      if (this.protected_ == 0) {
         this.byte_.run();
      }
   }

   public rAw_1(Runnable var1) {
      this.byte_ = var1;
   }

   public void class_(Comparator<Ar_1> var1) {
      this.throws_ = var1;
      this.byte_();
   }

   public void class_(String var1) {
      var1 = StringUtils.trimToNull(var1);
      if (!Objects.equals(var1, this.catch_)) {
         this.case_ = (this.catch_ = var1) == null ? null : Pattern.compile("\\Q" + var1.replace("*", "\\E.*\\Q") + "\\E", 2);
         this.byte_();
      }
   }

   public void class_(List<Ar_1> var1, List<Ar_1> var2) {
      var2.clear();
      this.break_(var1, var2);
      if (this.throws_ != null) {
         var2.sort(this.throws_);
      }
   }

   private static String class_(Ar_1 var0) {
      return var0 == null ? "<INVALID>" : var0.class_().throws_().byte_();
   }

   private static String class_(Ar_1 var0, boolean var1) {
      String var2 = var1 ? "a" : "x";
      return var2 + class_(var0);
   }

   public void class_() {
      this.protected_++;
   }

   private static String break_(Ar_1 var0) {
      return var0 == null ? "<INVALID>" : var0.class_().case_().byte_();
   }

   private boolean break_(String var1) {
      return this.case_ == null || var1.equals("..") || this.case_.matcher(var1.toLowerCase()).find();
   }

   private void break_(List<Ar_1> var1, List<Ar_1> var2) {
      for (Ar_1 var4 : var1) {
         if (this.break_(class_(var4)) || this.break_(break_(var4))) {
            var2.add(var4);
         }
      }
   }

   public void break_() {
      if (this.protected_ > 0) {
         this.protected_--;
         this.byte_();
      }
   }
}
