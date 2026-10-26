package celestial;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JComponent;

public class rnf_3 extends JComponent {
   private static final DecimalFormat class_ = rqR_2.class_(
      new DecimalFormat("########0.000"), var0 -> var0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT))
   );
   private final int[] break_ = new int[256];
   private int byte_;
   private final String[] protected_ = new String[11];
   private final rnW_2 throws_;
   private final javax.swing.Timer case_;

   public rnf_3(rnW_2 var1) {
      this.throws_ = var1;
      this.setPreferredSize(new Dimension(456, 246));
      this.setMinimumSize(new Dimension(456, 246));
      this.setMaximumSize(new Dimension(456, 246));
      this.case_ = new javax.swing.Timer(500, var1x -> this.break_());
      this.case_.start();
      this.setBackground(Color.BLACK);
   }

   public void class_() {
      this.case_.stop();
   }

   private double class_(long[] var1) {
      long var2 = 0L;

      for (long var7 : var1) {
         var2 += var7;
      }

      return (double)var2 / (double)var1.length;
   }

   private void break_() {
      long var1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
      this.protected_[0] = "Memory use: "
         + var1 / 1024L / 1024L
         + " mb ("
         + Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory()
         + "% free)";
      this.protected_[1] = "Avg tick: " + class_.format(this.class_(this.throws_.private_) * 1.0E-6) + " ms";
      this.break_[this.byte_++ & 0xFF] = (int)(var1 * 100L / Runtime.getRuntime().maxMemory());
      this.repaint();
   }

   @Override
   public void paint(Graphics var1) {
      var1.setColor(new Color(16777215));
      var1.fillRect(0, 0, 456, 246);

      for (int var2 = 0; var2 < 256; var2++) {
         int var3 = this.break_[var2 + this.byte_ & 0xFF];
         var1.setColor(new Color(var3 + 28 << 16));
         var1.fillRect(var2, 100 - var3, 1, var3);
      }

      var1.setColor(Color.BLACK);

      for (int var4 = 0; var4 < this.protected_.length; var4++) {
         String var5 = this.protected_[var4];
         if (var5 != null) {
            var1.drawString(var5, 32, 116 + var4 * 16);
         }
      }
   }
}
