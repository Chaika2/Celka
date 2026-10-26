package celestial;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public interface rCe_1 {
   DecimalFormat class_ = rqR_2.class_(new DecimalFormat("########0.00"), var0 -> var0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
   rCe_1 break_ = NumberFormat.getIntegerInstance(Locale.US)::format;
   rCe_1 byte_ = var0 -> class_.format((double)var0 * 0.1);
   rCe_1 protected_ = var0 -> {
      double var1 = (double)var0 / 100.0;
      double var3 = var1 / 1000.0;
      if (var3 > 0.5) {
         return class_.format(var3) + " km";
      } else {
         return var1 > 0.5 ? class_.format(var1) + " m" : var0 + " cm";
      }
   };
   rCe_1 throws_ = var0 -> {
      double var1 = (double)var0 / 20.0;
      double var3 = var1 / 60.0;
      double var5 = var3 / 60.0;
      double var7 = var5 / 24.0;
      double var9 = var7 / 365.0;
      if (var9 > 0.5) {
         return class_.format(var9) + " y";
      } else if (var7 > 0.5) {
         return class_.format(var7) + " d";
      } else if (var5 > 0.5) {
         return class_.format(var5) + " h";
      } else {
         return var3 > 0.5 ? class_.format(var3) + " m" : var1 + " s";
      }
   };

   String format(int var1);
}
