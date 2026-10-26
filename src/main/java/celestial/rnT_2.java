/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.util.QueueLogAppender
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rnI_2;
import celestial.rnf_3;
import celestial.rnt_3;
import celestial.rnv_3;
import celestial.rnw_3;
import celestial.rya_3;
import com.google.common.collect.Lists;
import com.mojang.util.QueueLogAppender;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rnT_2
extends JComponent {
    private static final Font id_class = new Font("Monospaced", 0, 12);
    private static final Logger id_break = LogManager.getLogger();
    private final rnv_3 id_byte;
    private Thread id_protected;
    private final Collection<Runnable> id_throws = Lists.newArrayList();
    public final AtomicBoolean id_case = new AtomicBoolean();

    private JComponent id_byte() {
        JPanel jPanel = new JPanel(new BorderLayout());
        rnf_3 rnf_32 = new rnf_3(this.id_byte);
        this.id_throws.add(rnf_32::id_class);
        jPanel.add((Component)rnf_32, "North");
        jPanel.add((Component)this.id_protected(), "Center");
        jPanel.setBorder(new TitledBorder(new EtchedBorder(), "Stats"));
        return jPanel;
    }

    private rnT_2(rnv_3 rnv_32) {
        this.id_byte = rnv_32;
        this.setPreferredSize(new Dimension(854, 480));
        this.setLayout(new BorderLayout());
        try {
            this.add((Component)this.id_throws(), "Center");
            this.add((Component)this.id_byte(), "West");
        }
        catch (Exception exception) {
            id_break.error("Couldn't build server GUI", (Throwable)exception);
        }
    }

    public static rnT_2 id_class(rnv_3 rnv_32) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception exception) {
            // empty catch block
        }
        JFrame jFrame = new JFrame("Minecraft server");
        rnT_2 rnT_22 = new rnT_2(rnv_32);
        jFrame.setDefaultCloseOperation(2);
        jFrame.add(rnT_22);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.addWindowListener(new rnt_3(rnT_22, jFrame, rnv_32));
        rnT_22.id_class(jFrame::dispose);
        rnT_22.id_class();
        return rnT_22;
    }

    public void id_class(JTextArea jTextArea, JScrollPane jScrollPane, String string) {
        if (!SwingUtilities.isEventDispatchThread()) {
            SwingUtilities.invokeLater(() -> this.id_class(jTextArea, jScrollPane, string));
        } else {
            Document document = jTextArea.getDocument();
            JScrollBar jScrollBar = jScrollPane.getVerticalScrollBar();
            boolean bl = false;
            if (jScrollPane.getViewport().getView() == jTextArea) {
                bl = (double)jScrollBar.getValue() + jScrollBar.getSize().getHeight() + (double)(id_class.getSize() * 4) > (double)jScrollBar.getMaximum();
            }
            try {
                document.insertString(document.getLength(), string, null);
            }
            catch (BadLocationException badLocationException) {
                // empty catch block
            }
            if (bl) {
                jScrollBar.setValue(Integer.MAX_VALUE);
            }
        }
    }

    public void id_class(Runnable runnable) {
        this.id_throws.add(runnable);
    }

    public void id_class() {
        this.id_protected.start();
    }

    public void id_break() {
        if (!this.id_case.getAndSet(true)) {
            this.id_case();
        }
    }

    private JComponent id_throws() {
        JPanel jPanel = new JPanel(new BorderLayout());
        JTextArea jTextArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jTextArea, 22, 30);
        jTextArea.setEditable(false);
        jTextArea.setFont(id_class);
        JTextField jTextField = new JTextField();
        jTextField.addActionListener(actionEvent -> {
            String string = jTextField.getText().trim();
            if (!string.isEmpty()) {
                this.id_byte.id_class(string, this.id_byte.j());
            }
            jTextField.setText("");
        });
        jTextArea.addFocusListener(new rnw_3(this));
        jPanel.add((Component)jScrollPane, "Center");
        jPanel.add((Component)jTextField, "South");
        jPanel.setBorder(new TitledBorder(new EtchedBorder(), "Log and chat"));
        this.id_protected = new Thread(() -> {
            String string;
            while ((string = QueueLogAppender.getNextLogEvent((String)"ServerGuiConsole")) != null) {
                this.id_class(jTextArea, jScrollPane, string);
            }
        });
        this.id_protected.setUncaughtExceptionHandler(new rya_3(id_break));
        this.id_protected.setDaemon(true);
        return jPanel;
    }

    public void id_case() {
        this.id_throws.forEach(Runnable::run);
    }

    private JComponent id_protected() {
        rnI_2 rnI_22 = new rnI_2(this.id_byte);
        JScrollPane jScrollPane = new JScrollPane(rnI_22, 22, 30);
        jScrollPane.setBorder(new TitledBorder(new EtchedBorder(), "Players"));
        return jScrollPane;
    }
}

