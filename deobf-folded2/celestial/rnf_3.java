package celestial;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JComponent;

public class rnf_3 extends JComponent {
   private static final DecimalFormat id_class = rqR_2.id_class(
      new DecimalFormat("########0.000"), var0 -> var0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT))
   );
   private final int[] id_break = new int[256];
   private int id_byte;
   private final String[] id_protected = new String[11];
   private final rnW_2 id_throws;
   private final javax.swing.Timer id_case;

   public rnf_3(rnW_2 var1) {
      this.id_throws = var1;
      this.setPreferredSize(new Dimension(456, 246));
      this.setMinimumSize(new Dimension(456, 246));
      this.setMaximumSize(new Dimension(456, 246));
      this.id_case = new javax.swing.Timer(500, var1x -> this.id_break());
      this.id_case.start();
      this.setBackground(Color.BLACK);
   }

   public void id_class() {
      this.id_case.stop();
   }

   private double id_class(long[] var1) {
      long var2 = 0L;

      for (long var7 : var1) {
         var2 += var7;
      }

      return (double)var2 / (double)var1.length;
   }

   private void id_break() {
      long var1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
      this.id_protected[0] = "Memory use: "
         + var1 / 1024L / 1024L
         + " mb ("
         + Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory()
         + "% free)";
      this.id_protected[1] = "Avg tick: " + id_class.format(this.id_class(this.id_throws.id_private) * 1.0E-6) + " ms";
      this.id_break[this.id_byte++ & 0xFF] = (int)(var1 * 100L / Runtime.getRuntime().maxMemory());
      this.repaint();
   }

   @Override
   public void paint(Graphics var1) {
      var1.setColor(new Color(16777215));
      var1.fillRect(0, 0, 456, 246);

      for (int var2 = 0; var2 < 256; var2++) {
         int var3 = this.id_break[var2 + this.id_byte & 0xFF];
         var1.setColor(new Color(var3 + 28 << 16));
         var1.fillRect(var2, 100 - var3, 1, var3);
      }

      var1.setColor(Color.BLACK);

      for (int var4 = 0; var4 < this.id_protected.length; var4++) {
         String var5 = this.id_protected[var4];
         if (var5 != null) {
            var1.drawString(var5, 32, 116 + var4 * 16);
         }
      }
   }
}
