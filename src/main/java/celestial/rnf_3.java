/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rnW_2;
import celestial.rqR_2;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JComponent;
import javax.swing.Timer;

public class rnf_3
extends JComponent {
    private static final DecimalFormat id_class = rqR_2.id_class(new DecimalFormat("########0.000"), decimalFormat -> decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT)));
    private final int[] id_break = new int[256];
    private int id_byte;
    private final String[] id_protected = new String[11];
    private final rnW_2 id_throws;
    private final Timer id_case;

    public rnf_3(rnW_2 rnW_22) {
        this.id_throws = rnW_22;
        this.setPreferredSize(new Dimension(456, 246));
        this.setMinimumSize(new Dimension(456, 246));
        this.setMaximumSize(new Dimension(456, 246));
        this.id_case = new Timer(500, actionEvent -> this.id_break());
        this.id_case.start();
        this.setBackground(Color.BLACK);
    }

    public void id_class() {
        this.id_case.stop();
    }

    private double id_class(long[] lArray) {
        long l = 0L;
        for (long l2 : lArray) {
            l += l2;
        }
        return (double)l / (double)lArray.length;
    }

    private void id_break() {
        long l = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        this.id_protected[0] = "Memory use: " + l / 1024L / 1024L + " mb (" + Runtime.getRuntime().freeMemory() * 100L / Runtime.getRuntime().maxMemory() + "% free)";
        this.id_protected[1] = "Avg tick: " + id_class.format(this.id_class(this.id_throws.id_private) * 1.0E-6) + " ms";
        this.id_break[this.id_byte++ & 0xFF] = (int)(l * 100L / Runtime.getRuntime().maxMemory());
        this.repaint();
    }

    @Override
    public void paint(Graphics graphics) {
        int n;
        graphics.setColor(new Color(0xFFFFFF));
        graphics.fillRect(0, 0, 456, 246);
        for (n = 0; n < 256; ++n) {
            int n2 = this.id_break[n + this.id_byte & 0xFF];
            graphics.setColor(new Color(n2 + 28 << 16));
            graphics.fillRect(n, 100 - n2, 1, n2);
        }
        graphics.setColor(Color.BLACK);
        for (n = 0; n < this.id_protected.length; ++n) {
            String string = this.id_protected[n];
            if (string == null) continue;
            graphics.drawString(string, 32, 116 + n * 16);
        }
    }
}

