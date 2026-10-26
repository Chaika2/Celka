package celestial;

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
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rnT_2 extends JComponent {
   private static final Font class_ = new Font("Monospaced", 0, 12);
   private static final Logger break_ = LogManager.getLogger();
   private final rnv_3 byte_;
   private Thread protected_;
   private final Collection<Runnable> throws_ = Lists.newArrayList();
   final AtomicBoolean case_ = new AtomicBoolean();

   private JComponent byte_() {
      JPanel var1 = new JPanel(new BorderLayout());
      rnf_3 var2 = new rnf_3(this.byte_);
      this.throws_.add(var2::class_);
      var1.add(var2, "North");
      var1.add(this.protected_(), "Center");
      var1.setBorder(new TitledBorder(new EtchedBorder(), "Stats"));
      return var1;
   }

   private rnT_2(rnv_3 var1) {
      this.byte_ = var1;
      this.setPreferredSize(new Dimension(854, 480));
      this.setLayout(new BorderLayout());

      try {
         this.add(this.throws_(), "Center");
         this.add(this.byte_(), "West");
      } catch (Exception var3) {
         break_.error("Couldn't build server GUI", var3);
      }
   }

   public static rnT_2 class_(rnv_3 var0) {
      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Exception var3) {
      }

      JFrame var1 = new JFrame("Minecraft server");
      rnT_2 var2 = new rnT_2(var0);
      var1.setDefaultCloseOperation(2);
      var1.add(var2);
      var1.pack();
      var1.setLocationRelativeTo((Component)null);
      var1.setVisible(true);
      var1.addWindowListener(new rnt_3(var2, var1, var0));
      var2.class_(var1::dispose);
      var2.class_();
      return var2;
   }

   public void class_(JTextArea var1, JScrollPane var2, String var3) {
      if (!SwingUtilities.isEventDispatchThread()) {
         SwingUtilities.invokeLater(() -> this.class_(var1, var2, var3));
      } else {
         Document var4 = var1.getDocument();
         JScrollBar var5 = var2.getVerticalScrollBar();
         boolean var6 = false;
         if (var2.getViewport().getView() == var1) {
            var6 = (double)var5.getValue() + var5.getSize().getHeight() + (double)(class_.getSize() * 4) > (double)var5.getMaximum();
         }

         try {
            var4.insertString(var4.getLength(), var3, (AttributeSet)null);
         } catch (BadLocationException var8) {
         }

         if (var6) {
            var5.setValue(Integer.MAX_VALUE);
         }
      }
   }

   public void class_(Runnable var1) {
      this.throws_.add(var1);
   }

   public void class_() {
      this.protected_.start();
   }

   public void break_() {
      if (!this.case_.getAndSet(true)) {
         this.case_();
      }
   }

   private JComponent throws_() {
      JPanel var1 = new JPanel(new BorderLayout());
      JTextArea var2 = new JTextArea();
      JScrollPane var3 = new JScrollPane(var2, 22, 30);
      var2.setEditable(false);
      var2.setFont(class_);
      JTextField var4 = new JTextField();
      var4.addActionListener(var2x -> {
         String var3x = var4.getText().trim();
         if (!var3x.isEmpty()) {
            this.byte_.class_(var3x, this.byte_.j());
         }

         var4.setText("");
      });
      var2.addFocusListener(new rnw_3(this));
      var1.add(var3, "Center");
      var1.add(var4, "South");
      var1.setBorder(new TitledBorder(new EtchedBorder(), "Log and chat"));
      this.protected_ = new Thread(() -> {
         String var3x;
         while ((var3x = QueueLogAppender.getNextLogEvent("ServerGuiConsole")) != null) {
            this.class_(var2, var3, var3x);
         }
      });
      this.protected_.setUncaughtExceptionHandler(new rya_3(break_));
      this.protected_.setDaemon(true);
      return var1;
   }

   void case_() {
      this.throws_.forEach(Runnable::run);
   }

   private JComponent protected_() {
      rnI_2 var1 = new rnI_2(this.byte_);
      JScrollPane var2 = new JScrollPane(var1, 22, 30);
      var2.setBorder(new TitledBorder(new EtchedBorder(), "Players"));
      return var2;
   }
}
