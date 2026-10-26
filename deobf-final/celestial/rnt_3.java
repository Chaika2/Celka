package celestial;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

class rnt_3 extends WindowAdapter {
   rnt_3(rnT_2 var1, JFrame var2, rnv_3 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public void windowClosing(WindowEvent var1) {
      if (!this.class_.case_.getAndSet(true)) {
         this.break_.setTitle("Minecraft server - shutting down!");
         this.byte_.class_(true);
         this.class_.case_();
      }
   }
}
